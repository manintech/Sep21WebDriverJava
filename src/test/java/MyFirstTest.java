import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void testHello() {
        System.out.println("Hello World!");
    }

    @Test
    public void testNamber() {
        int myNamber;
        myNamber = 5;
        System.out.println(myNamber);
    }

    @Test
    public void testConcatenation() {
        String s1 = "Dogs are!";
        String s2 = "Who! Who! Who!";
        System.out.println(s1 + ' ' + s2);
    }

    @Test
    public void testClicks() {
        String messgPrefix ="I clicked ";
        String messgSuffix = " times!";
        int numberOfClicks = 5;
        System.out.println(messgPrefix + numberOfClicks + messgSuffix);
    }
}



