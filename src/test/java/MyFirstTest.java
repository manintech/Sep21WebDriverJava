import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void testHello() {
        System.out.println("Hello, World!");
    }

    @Test
    public void testNambers() {
        int namberOne = 55;
        int namberTwo = 77;
        System.out.println(namberOne + namberTwo);
        System.out.println(namberOne + " " + namberTwo);
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

    @Test
    public void testMyMethod01() {
        int firstNumber = 5;
        int secondNumber = 6;
        System.out.println("First number: " + firstNumber + "\n" + "Second number: " + secondNumber);
    }

    public void printInputValue(int firstNumber, int secondNumber){
        String messagePrefix = "First number is: ";
        String messagePostfix = "Second number is: ";
        System.out.println(messagePrefix + firstNumber + "\n" + messagePostfix + secondNumber);
    }

    @Test
    public void testMyMethod02() {
        printInputValue(5, 6);
    }

    public void printLoginSteps(String loginValue, String passwordValue){
        System.out.println("I typed login: " + loginValue);
        System.out.println("I typed password: " + passwordValue);
        System.out.println("I clicked login button");
    }

    @Test
    public void testLoginTest() {
        printLoginSteps("joeblack", "SuperSecretPassw123");
    }

    @Test
    public void testArrays() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};
        arrayOfInts[2] = 4;
        System.out.println(arrayOfInts[2]);
    }

    @Test
    public void testForLoop() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};

        for (int i = 1; i < arrayOfInts.length - 1; i++){
            int currentValue = arrayOfInts[i];
            System.out.println(currentValue);
        }
    }
}




