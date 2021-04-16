package com.ilkDenemeler;
import java.time.LocalTime;
import java.time.LocalDate;

public class Guest extends Person{
    private LocalDate entranceDate;
    private LocalTime entranceTime;
    private LocalDate exitDate;
    private LocalTime exitTime;

    public String checkinDates;
    public String checkinTimes;
    public String checkoutDates;
    public String checkoutTimes;
    public int guestId;


    public Guest(String name, String surname, String pesonalId) {
        super(name, surname, pesonalId);
        //LocalDate entranceDate = LocalDate.now();
        //LocalTime entranceTime = LocalTime.now();
        this.entranceDate = getDate();
        this.entranceTime = getTime();
    }

    public Guest() {
        super();
    }

    public LocalDate getDate(){
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }
    public LocalTime getTime(){
        LocalTime currentTime = LocalTime.now();
        return currentTime;
    }

    public LocalDate getCheckinDate() {
        System.out.println( entranceDate);
        return entranceDate;
    }


    public LocalTime getCheckinTime() {
        System.out.println(entranceTime);
        return entranceTime;
    }

    public LocalDate getCheckoutDate() {
        System.out.println(this.exitDate);
        return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate=getDate();
    }

    public LocalTime getCheckoutTime() {
        System.out.println(this.exitTime);
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime) {
        this.exitTime = getTime();
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public void setEntranceDate(LocalDate entranceDate) {
        this.entranceDate = entranceDate;
    }

    public void setEntranceTime(LocalTime entranceTime) {
        this.entranceTime = entranceTime;
    }

    public String getCheckinDates() {
        return checkinDates;
    }

    public void setCheckinDates(String checkinDates) {
        this.checkinDates = checkinDates;
    }

    public String getCheckinTimes() {
        return checkinTimes;
    }

    public void setCheckinTimes(String checkinTimes) {
        this.checkinTimes = checkinTimes;
    }

    public String getCheckoutDates() {
        return checkoutDates;
    }

    public void setCheckoutDates(String checkoutDates) {
        this.checkoutDates = checkoutDates;
    }

    public String getCheckoutTimes() {
        return checkoutTimes;
    }

    public void setCheckoutTimes(String checkoutTimes) {
        this.checkoutTimes = checkoutTimes;
    }
}
