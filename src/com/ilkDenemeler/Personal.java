package com.ilkDenemeler;

import java.time.LocalTime;

public class Personal extends Person{
    private String shiftStartTime="09.00";
    private String shiftEndTime="17.00";
    private int salary;
    private Role role;

    public Personal(String name, String surname, String personalId, int salary, Role role) {
        super(name, surname, personalId);
        this.salary = salary;
        this.role = role;
    }

    public String getShiftStartTime() {
        return shiftStartTime;
    }

    public void setShiftStartTime(String shiftStartTime) {
        this.shiftStartTime = shiftStartTime;
    }

    public String getShiftEndTime() {
        return shiftEndTime;
    }

    public void setShiftEndTime(String shiftEndTime) {
        this.shiftEndTime = shiftEndTime;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
