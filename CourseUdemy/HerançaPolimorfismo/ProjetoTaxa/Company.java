package CourseUdemy.HerançaPolimorfismo.ProjetoTaxa;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company() {
    }
    public Company(String name, double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if(getNumberOfEmployees() > 10){
            return getAnualIncome() * 0.14;
        } else{
            return getAnualIncome() * 0.16;
        }
    }
}
