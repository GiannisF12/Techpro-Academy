package HR;

public class Contractor extends Employee {
    private double hourlyRate;
    private int hours;
    private static final double tax=0.24;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public Contractor(String name,double rate, int hours){
        //call the constructor of Employee
        super(name);
        this.hourlyRate=rate;
        this.hours = hours;
    }

    public double getPay(){
        return (hourlyRate*hours)+getTaxes();
    }

    public double getTaxes(){
        return hourlyRate*hours*tax;
    }

}
