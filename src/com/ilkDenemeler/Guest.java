package com.ilkDenemeler;
import java.time.LocalTime;
import java.time.LocalDate;

public class Guest extends Person{
    private LocalDate entranceDate;
    private LocalTime entranceTime;
    private LocalDate exitDate;
    private LocalTime exitTime;


    public Guest(String name, String surname, String pesonalId) {
        super(name, surname, pesonalId);
        //LocalDate entranceDate = LocalDate.now();
        //LocalTime entranceTime = LocalTime.now();
        this.entranceDate = getDate();
        this.entranceTime = getTime();
    }

    public LocalDate getDate(){
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }
    public LocalTime getTime(){
        LocalTime currentTime = LocalTime.now();
        return currentTime;
    }

    public LocalDate getEntranceDate() {
        System.out.println( entranceDate);
        return entranceDate;
    }


    public LocalTime getEntranceTime() {
        System.out.println(entranceTime);
        return entranceTime;
    }

    public LocalDate getExitDate() {
        System.out.println(this.exitDate);
        return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate=getDate();
    }

    public LocalTime getExitTime() {
        System.out.println(this.exitTime);
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime) {
        this.exitTime = getTime();
    }
}
