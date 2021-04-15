package com.ilkDenemeler;

public class Teacher extends Person {
    private String shiftStartTime="09.00";
    private String shiftEndTime="17.00";
    private int salary;
    private boolean administrativeStaff=false;
    private Lessons lesson;
    private Role mission;
    private boolean isPrincipal = false;

    public Teacher(String name, String surname, String personalId, boolean administrativeStaff, Lessons lesson, Role mission,boolean isPrincipal) {
        super(name,surname,personalId);
        if(administrativeStaff) {
            this.administrativeStaff = true;
            this.lesson = lesson;
            if(isPrincipal) {
                Role principial = Role.Mudur;
                this.mission = principial;
                this.isPrincipal = true;
            }
            else {
                Role viceprincipial = Role.MudurYrd;
                this.mission = viceprincipial;
            }
        }
        else {
            Role teacher = Role.Ogretmen;
            this.mission = teacher;
        }
    }

    public boolean isAdministrativeStaff() {
        return administrativeStaff;
    }

    public void setAdministrativeStaff(boolean administrativeStaff) {
        this.administrativeStaff = administrativeStaff;
    }

    public Lessons getLesson() {
        return lesson;
    }

    public void setLesson(Lessons lesson) {
        this.lesson = lesson;
    }

    public Role getMission() {
        return mission;
    }

    public void setMission(Role mission) {
        this.mission = mission;
    }

    public boolean isPrincipal() {
        return isPrincipal;
    }

    public void setPrincipal(boolean isPrincipal) {
        this.isPrincipal = isPrincipal;
    }
    public void deletePerson(){
        this.mission=Role.Silindi;
    }



}