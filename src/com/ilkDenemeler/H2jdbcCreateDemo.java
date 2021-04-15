package com.ilkDenemeler;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class H2jdbcCreateDemo {
    // JDBC driver name and database URL
    //static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    private Connection conn = null;
    private Statement stmt = null;

    public void connection() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //STEP 2: Open a connection
        System.out.println("Connecting to database...");
        try {
            this.conn = DriverManager.getConnection(this.DB_URL, this.USER, this.PASS);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insertPersonal(String name, String surname, String personalId, Role role, String shiftStartTime, String shiftEndTime, int salary) throws SQLException {
        String sorgu = "INSERT INTO PERSONALS(NAME,SURNAME,PERSONALID,ROLEID,SHIFTSTARTTIME,SHIFTENDTIME,SALARY) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        String kontrol = "SELECT * FROM PERSONALS WHERE PERSONALID=?";
        PreparedStatement kontrolet;
        kontrolet = this.conn.prepareStatement(kontrol);
        kontrolet.setString(1, personalId);
        ResultSet rs = kontrolet.executeQuery();
        if (!rs.next()) {
            stmt = this.conn.prepareStatement(sorgu);
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, personalId);
            stmt.setInt(4, role.getRoleID());
            stmt.setString(5, shiftStartTime);
            stmt.setString(6, shiftEndTime);
            stmt.setInt(7, salary);
            int i = stmt.executeUpdate();
            System.out.println(i + " personel eklendi.");
            conn.close();
        } else {
            System.out.println("Ekli kişi");
        }
    }

    public void insertSTUDENT(Student student) throws SQLException {
        String IDCheck = "SELECT * FROM STUDENT WHERE PERSONALID=?";
        String capacityCheck = "SELECT COUNT(STUDENTNUMBER) FROM STUDENT WHERE CLASSID=?";
        String insertStudent = "INSERT INTO STUDENT(NAME, SURNAME, PERSONALID, CLASSID,ROLEID) VALUES(?,?,?,?,?)";
        PreparedStatement stmt;
        stmt = this.conn.prepareStatement(capacityCheck);
        stmt.setInt(1, student.getClassID());
        ResultSet rs = stmt.executeQuery();
        int count = 0;
        if (rs.next()) {
            count = rs.getInt("COUNT(STUDENTNUMBER)");
        }
        if (count < 30) {
            PreparedStatement kontrolet;
            kontrolet = this.conn.prepareStatement(IDCheck);
            kontrolet.setString(1, student.getPersonalId());
            rs = kontrolet.executeQuery();
            if (!rs.next()) {
                stmt = this.conn.prepareStatement(insertStudent);
                stmt.setString(1, student.getName());
                stmt.setString(2, student.getSurname());
                stmt.setString(3, student.getPersonalId());
                stmt.setInt(4, student.getClassID());
                stmt.setInt(5, student.getRole().getRoleID());
                int i = stmt.executeUpdate();
                System.out.println(i + " öğrenci kaydı girildi.");
                conn.close();
            } else System.out.println("Yeni kayıt yapılamadı! Sistemde aynı kimlik numarasıyla öğrenci bulunmakta.");
        } else System.out.println("Sınıf kapasitesi dolu.");
    }

    public void graduatingStudent(String personalId) throws SQLException {
        Role r = Role.Mezun;
        int mezun = r.getRoleID();
        String sorgu = "UPDATE STUDENT SET ROLEID=? WHERE PERSONALID=?";
        PreparedStatement stmt = this.conn.prepareStatement(sorgu);
        stmt.setInt(1, mezun);
        stmt.setString(2, personalId);
        int i = stmt.executeUpdate();
        System.out.println(i + " records updated");
        conn.close();
    }

    public void deleteStudent(String personalId) throws SQLException {
        Role r = Role.Silindi;
        int silindi = r.getRoleID();
        String sorgu = "UPDATE STUDENT SET ROLEID=? WHERE PERSONALID=?";
        PreparedStatement stmt = this.conn.prepareStatement(sorgu);
        stmt.setInt(1, silindi);
        stmt.setString(2, personalId);
        int i = stmt.executeUpdate();
        System.out.println(i + " Öğrenci Silindi");
        conn.close();
    }

    public void changeRole(String personalId, int roleId) throws SQLException {
        String sorgu = "UPDATE PERSONALS SET ROLEID=? WHERE PERSONALID=?";
        PreparedStatement stmt = this.conn.prepareStatement(sorgu);
        stmt.setInt(1, roleId);
        stmt.setString(2, personalId);
        int i = stmt.executeUpdate();
        System.out.println(i + " records updated");
        conn.close();
    }

    public void insertGuest(String personalId, String name, String surname, String entranceDate, String entranceTime) {
        String sorgu = "INSERT INTO GUEST(PERSONALID,NAME,SURNAME,ENTRANCEDATE,ENTRANCETIME) VALUES(?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sorgu);
            stmt.setString(1, personalId);
            stmt.setString(2, name);
            stmt.setString(3, surname);
            stmt.setString(4, entranceDate);
            stmt.setString(5, entranceTime);
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void exitGuest(String personalId, String exitDate, String exitTime) throws SQLException {
        String sorgu = "UPDATE GUEST SET EXITDATE=?, EXITTIME=? WHERE GUESTID = (SELECT MAX(GUESTID) FROM GUEST WHERE PERSONALID=?)";

        PreparedStatement stmt = this.conn.prepareStatement(sorgu);
        stmt.setString(1, exitDate);
        stmt.setString(2, exitTime);
        stmt.setString(3, personalId);
        int i = stmt.executeUpdate();
        System.out.println(i + " Ziyaretçi çıkış yaptı.");
        conn.close();
    }

    public void insertLessonToSchedule(int LessonID, int teacherID, int classID, int dayID, int LessonNumber) throws SQLException {
        String insertLesson = "INSERT INTO LESSONSCHEDULE ( LESSONID, TEACHERID, CLASSID, DAYID, LESSONNUMBER) VALUES(?,?,?,?,?)";
        PreparedStatement stmt;
        stmt = this.conn.prepareStatement(insertLesson);
        stmt.setInt(1, LessonID);
        stmt.setInt(2, teacherID);
        stmt.setInt(3, classID);
        stmt.setInt(4, dayID);
        stmt.setInt(5, LessonNumber);
        int i = stmt.executeUpdate();
        System.out.println(i + " ders kaydı girildi.");
        conn.close();
    }

    public void updateSchedule(int lessonScheduleID, String updateElement, int updateValue) throws SQLException {
        PreparedStatement stmt;
        int i = 0;
        switch (updateElement) {
            case "LESSONID":
                String updateLESSONID = "UPDATE LESSONSCHEDULE SET LESSONID = ? WHERE LESSONSCHEDULEID=?";
                stmt = this.conn.prepareStatement(updateLESSONID);
                stmt.setInt(1, updateValue);
                stmt.setInt(2, lessonScheduleID);
                i = stmt.executeUpdate();
                System.out.println(i + " ders güncellendi.");
                conn.close();
                break;
            case "TEACHERID":
                String updateTEACHERID = "UPDATE LESSONSCHEDULE SET TEACHERID  = ? WHERE LESSONSCHEDULEID=?";
                stmt = this.conn.prepareStatement(updateTEACHERID);
                stmt.setInt(1, updateValue);
                stmt.setInt(2, lessonScheduleID);
                i = stmt.executeUpdate();
                System.out.println(i + " dersin öğretmeni güncellendi.");
                conn.close();
                break;
            case "CLASSID":
                String updateCLASSID = "UPDATE LESSONSCHEDULE SET CLASSID   = ? WHERE LESSONSCHEDULEID=?";
                stmt = this.conn.prepareStatement(updateCLASSID);
                stmt.setInt(1, updateValue);
                stmt.setInt(2, lessonScheduleID);
                i = stmt.executeUpdate();
                System.out.println(i + " dersin sınıfı güncellendi.");
                conn.close();
                break;
            case "DAYID":
                String updateDAYID = "UPDATE LESSONSCHEDULE SET DAYID   = ? WHERE LESSONSCHEDULEID=?";
                stmt = this.conn.prepareStatement(updateDAYID);
                stmt.setInt(1, updateValue);
                stmt.setInt(2, lessonScheduleID);
                i = stmt.executeUpdate();
                System.out.println(i + " dersin günü güncellendi.");
                conn.close();
                break;
            case "LESSONNUMBER":
                String updateLESSONNUMBER = "UPDATE LESSONSCHEDULE SET LESSONNUMBER   = ? WHERE LESSONSCHEDULEID=?";
                stmt = this.conn.prepareStatement(updateLESSONNUMBER);
                stmt.setInt(1, updateValue);
                stmt.setInt(2, lessonScheduleID);
                i = stmt.executeUpdate();
                System.out.println(i + " dersin saati güncellendi.");
                conn.close();
                break;
        }

    }

    public void insertSchool(School school) throws SQLException {
        String sorgu = "INSERT INTO SCHOOL(SCHOOLNAME,ADDRESS,ISACTIVE,AFFILIATEDINSTITUTIONID,SCHOOLTYPEID) VALUES(?,?,?,?,?)";
        PreparedStatement stmt;

        stmt = this.conn.prepareStatement(sorgu);
        stmt.setString(1, school.getName());
        stmt.setString(2, school.getAddress());
        stmt.setInt(3, school.getIsActive());
        stmt.setInt(4, school.getAffiliatedInstitution().getAffiliatedInstitutionID());
        stmt.setInt(5, school.getSchoolType().getSchoolTypeID());
        int i = stmt.executeUpdate();
        System.out.println(i + " records inserted");

        conn.close();

    }

    public void deactivateSchool(School school) throws SQLException {
        String sorgu = "UPDATE SCHOOL SET ISACTIVE=? WHERE SCHOOLNAME=?";
        PreparedStatement stmt = this.conn.prepareStatement(sorgu);
        stmt.setInt(1, 0);
        school.setIsActive(0);
        stmt.setString(2, school.getName());
        int i = stmt.executeUpdate();
        System.out.println(i + " records updated");
        conn.close();
    }


    /*
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String createScheduleTable =  "CREATE TABLE SCHEDULE " +
                    "(id INTEGER not NULL, " +
                    " lessonName VARCHAR(25) not NULL, " +
                    " teacherName VARCHAR(255) not NULL, " +
                    " classNumber VARCHAR(2) not NULL, " +
                    " className VARCHAR(2) not NULL, " +
                    " day VARCHAR(25) not NULL, " +
                    " lessonNumber VARCHAR(2) not NULL, " +
                    " PRIMARY KEY ( id ))";
            //stmt.executeUpdate(createScheduleTable);
            //String addSchedule = "INSERT INTO SCHEDULE VALUES (1,'Fizik','Kadriye','9','A','Pazartesi','1')";
            //stmt.executeUpdate(addSchedule);
            System.out.println("Created table in given database...");


            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
        System.out.println("Goodbye!");
    }*/
}
