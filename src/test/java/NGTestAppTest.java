import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NGTestAppTest {

    NGTestApp NGApp = new NGTestApp();

    @BeforeSuite
    public void starUp(){
        System.out.println("This is a simple calculator" );
        System.out.println("Where the input totals 20 and is respectively 10 for A and B");
    }



    @Test (priority = 1, groups = "Basic Math")
    void plus(){

        NGApp.plus();
        System.out.println(NGApp.plus());



                // assertEquals(3, calculator.add(2, 1),  "2 + 1 should equal 3");
    }


    @Test (priority = 2, groups = "Basic Math")
    void minus(){

        NGApp.minus();
        System.out.println(NGApp.minus());

    }
    @Test (priority = 3, groups = "More advanced Math")
    void times(){

        NGApp.times();
        System.out.println(NGApp.times());


    }
    @Test (priority = 4, groups = "More advanced Math")
    void devide(){
    NGApp.devide();
        System.out.println(NGApp.devide());
    }


    }


