
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
public class operation {
    private ResourceBundle rb;

    public  operation(){
         
        rb = ResourceBundle.getBundle("message", getLocale());
    }
    String properCase(String fullName) {
        String[] list = fullName.split(" ");
        String finalName = "";
        for (String name : list) {
            char singleChar = name.charAt(0);
            String temp = String.valueOf(singleChar).toUpperCase() + name.substring(1).toLowerCase();
            finalName += temp + " ";
        }
        return finalName;
    }

    String readMessageBundle(String key) {

        return rb.getString(key);
    }


    public void printSalarySlip(TestEmployee1 te1){
        System.out.println("Along with the LOCALE class :");
        System.out.println(readMessageBundle("COMPANY_NAME")+" : "+te1.getCompany_Name().toUpperCase());
        System.out.println(readMessageBundle("EMP_NAME")+" : "+properCase( te1.getEmpName()));
        System.out.println(readMessageBundle("EMP_ID")+" : "+te1.getId());
        System.out.println("**********************************Salary Detail************************************");
        System.out.println(readMessageBundle("EMP_SALARY")+" : "+convertCurrencyFormat(te1.getBasicSalary()));
        System.out.println(readMessageBundle("EMP_HRA")+" : "+convertCurrencyFormat(te1.HRA()));
        System.out.println("Daily Allowance :"+" : "+convertCurrencyFormat(te1.DA()));
        System.out.println("Daily Allowance :"+" : "+convertCurrencyFormat(te1.TA()));
        System.out.println("Daily Allowance :"+" : "+convertCurrencyFormat(te1.MA()));
        System.out.println("Daily Allowance :"+" : "+convertCurrencyFormat(te1.PF()));
        System.out.println("Daily Allowance :"+" : "+convertCurrencyFormat(te1.GS()));
        System.out.println("Daily Allowance :"+" : "+convertCurrencyFormat(te1.tax()));

        System.out.println("******************************Without Locale Clsss*******************************");

        
        System.out.println("COMPANY_NAME : "+" : "+te1.getCompany_Name().toUpperCase());
        System.out.println("EMP_NAME : "+" : "+properCase( te1.getEmpName()));
        System.out.println("EMP_ID : "+" : "+te1.getId());
        System.out.println("**********************************Salary Detail************************************");
        System.out.println("EMP_SALARY : "+" : "+te1.getBasicSalary());
        System.out.println("House Rent Allowance: "+" : "+te1.HRA());
        System.out.println("Daily Allowance :"+" : "+te1.DA());
        System.out.println("Travelling allowance:"+" : "+te1.TA());
        System.out.println("Medical Allowance :"+" : "+te1.MA());
        System.out.println("Drovidant Fund :"+" : "+(te1.PF()));
        System.out.println("Gross Salary :"+" : "+(te1.GS()));
        System.out.println("Tax available :"+" : "+(te1.tax()));
    
    }

    //basically used for adding differnet format like hi India
    Locale getLocale() {
        Locale locale = new Locale("hi", "IN");
        return locale;
    }

    String convertDateFormat() {
        Date date = new Date(); // System Date
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, getLocale());
        return dateFormat.format(date);
    }

    String convertCurrencyFormat(double value) {
        // FR - fr
        // US - en

        // Locale locale = new Locale("hi", "IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(getLocale());
        String formattedValue = nf.format(value);
        return formattedValue;
    }


    
}




/*<></>

return(
    <>
    <Layout>
    </Layout>
    <Jumbotron>
    <h1>hello</h1>
    </Jumbotron>
    </>
)*/