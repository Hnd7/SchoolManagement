package School;

import java.time.LocalTime;
import java.time.LocalDate;

public class Guest extends Person{
    public LocalDate checkinDate;
    public LocalTime checkinTime;
    public LocalDate checkoutDate;
    public LocalTime checkoutTime;

    public Guest(String name, String surname, String personalId) {
        super(name, surname, personalId);
        setCheckinTime();
    }
    public LocalDate compileDate() {
        LocalDate currentdate = LocalDate.now();
        return currentdate;
    }
    public LocalTime compileTime() {
        LocalTime currenttime = LocalTime.now();
        return currenttime;

    }
    public void setCheckinTime() {
        this.checkinDate = compileDate();
        this.checkinTime = compileTime();
    }
    public LocalDate getCheckinDate() {
        return this.checkinDate;
    }
    public LocalTime getCheckinTime() {
        return this.checkinTime;
    }
    public void setCheckoutTime() {
        this.checkoutDate = compileDate();
        this.checkoutTime = compileTime();
    }
    public LocalDate getCheckoutDate() {
        return this.checkoutDate;
    }
    public LocalTime getCheckoutTime() {
        return this.checkoutTime;
    }
}