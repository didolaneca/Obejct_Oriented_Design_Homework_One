public interface Diagnosticable {
    double getTemperature();
/* TODO
Declare a hasFever method that returns true if the temperature
is greater than 100.4 */
    default boolean hasFever(){
        return getTemperature() > 100.4;
    }
    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
/* TODO
Declare two setters. One for systolic and one for diastolic.
Check the getters to infer the parameter types.
 */
    void setSystolic(int systolic);
    void setDiastolic(int diastolic);

}
