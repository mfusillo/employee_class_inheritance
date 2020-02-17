package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, int salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public String getNINumber() {
        return this.nINumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(int raisePercentage){
        if(raisePercentage > 0) {
            double raise = (double) raisePercentage / 100;
            double raiseAmount = this.salary * raise;
            this.salary += raiseAmount;
        }
    }

    public void raiseSalary(Double raisePercentage){
        if(raisePercentage > 0) {
            raisePercentage /= 100;
            double raiseAmount = this.salary * raisePercentage;
            this.salary += raiseAmount;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
