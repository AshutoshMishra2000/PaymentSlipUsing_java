



public class TestEmployee1 {
    private int id;
    private double basicSalary;
    private String empName;
    private double hra;
    private double da;
    private double ta;
    private double ma;
    private double pf;
    private double gs;
    private double tax;
    private final String company_Name="Ehaulage";

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getHra() {
        return this.hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getDa() {
        return this.da;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public double getTa() {
        return this.ta;
    }

    public void setTa(double ta) {
        this.ta = ta;
    }

    public double getMa() {
        return this.ma;
    }

    public void setMa(double ma) {
        this.ma = ma;
    }

    public double getPf() {
        return this.pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    public double getGs() {
        return this.gs;
    }

    public void setGs(double gs) {
        this.gs = gs;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getCompany_Name() {
        return this.company_Name;
    }


    public TestEmployee1(int id, double basicSalary, String empName) {

        if (id < 0 || basicSalary < 0) {
            System.out.println("Invalid input");
            
        } else {
            this.id = id;
            this.basicSalary = basicSalary;
            this.empName = empName;

        }

    }


    public double HRA(){
        hra=basicSalary*0.50;
        return hra;
    }
    public double DA(){
        da=basicSalary*0.15;
        return da;
    }
    public double TA(){
       ta=basicSalary*0.20;
       return ta;
    }
    public double MA(){
        ma=basicSalary*0.20;
       return ma;
    }
    public double PF(){
        pf=basicSalary*0.05;
        return pf;
    }
    public double GS(){
       gs=basicSalary+HRA()+DA()+TA()+MA();
       return gs;
    }

    public double tax()
     {
        double gross = GS();
        if (gross >= 900000) {
            return 0.30;
        } else if (gross < 900000 && gross >= 700000) {
            return 0.20;
        } else if (gross < 700000 && gross >= 500000) {
            return 0.10;
        } else {
            return 0.0;
        }
    }
    
    /*public void print(){
        System.out.println("Name :"+empName);
        System.out.println("Emp Id :"+id);
        System.out.println("GROSS SALARY: "+GS());
        System.out.println("HRA :"+HRA());
        System.out.println("DA :"+DA());
        System.out.println("TA :"+TA());
        System.out.println("MA :"+MA());
        System.out.println("PF :"+PF());
        System.out.println("tax :"+tax());

    }*/

    
    

}

/*
 * Salary Slip of Employee
 * 
 * Input :
 * 
 * Id - 1001
 * 
 * name- amit srivastava - output : Amit Srivastava
 * 
 * basic salary - 10000
 * 
 * HRA - House Rent Allowance - 50% of Basic Salary
 * 
 * DA - Dearness Allowance - 15% of BS
 * 
 * TA - Travelling Allowance - 20% of BS
 * 
 * MA - Medical Allowance - 20% of MA
 * 
 * PF - 5% of the BS (Employee) + 5% Employer
 * 
 * GS - BS + HRA + DA + TA + MA
 * 
 * TAX - >5L (Annual Salary) 10% Tax
 * 
 * >7L 20% Tax
 * 
 * >9L 30% Tax
 * 
 * 
 * 
 * Print Salary Slip
 * 
 * 
 * 
 * Amount - Rs Symbol 50,000
 * 
 * 
 * 
 * 
 * 
 * Hint:
 * 
 * Date : Current Date
 * 
 * Locale class
 * 
 * 
 * 
 * Follow : SRP, DRY , Pascal Case, camelCase, Encapsulation , Abstraction, Data
 * Hiding
 * 
 */
