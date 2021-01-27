import java.util.ArrayList;
// TODO
// Implement the class Adult Patient.
// An adult patient is a Person that is Diagnosticable
// and that is Employable.
public class AdultPatient extends Person implements Diagnosticable, Employable{

    private int systolic, diastolic;
    private double temperature;
    private ArrayList<String> previousJobs = new ArrayList<>();
    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public int getSystolic() {
        return this.systolic;
    }

    @Override
    public int getDiastolic() {
        return this.diastolic;
    }


    @Override
    public void setTemperature(double t) {
        this.temperature = t;
    }

    @Override
    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    @Override
    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    @Override
    public ArrayList<String> getPreviousJobs() {
        return this.previousJobs;
    }

    @Override
    public void addJob(String job) {
        this.previousJobs.add(job);
    }
}