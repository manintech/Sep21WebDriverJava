import org.testng.annotations.Test;

public class MySecondTest {

    @Test
    public void testNumbers() {
        int variableOne = 1;
        int variableTwo = 67;
        System.out.println(variableOne + " " + variableTwo);
    }

    public void printTowNumbers(int paramOne, int paramTow) {
        System.out.println(paramOne + " " + paramTow);
    }

    @Test
    public void testNumbers02() {
        int variableOne = 8724;
        int variableTwo = 678724;
        printTowNumbers(variableOne, variableTwo);
    }

    @Test
    public void testFloat() {
        float floatValue = (float) 3.14;
        System.out.println("Pi=" + floatValue);
    }

    @Test
    public void testBooleans() {
       // boolean booleanVariable = true;

        int amountOfLinks = 6;
        int amountOfClicks = 5;

        boolean AreThereStillLinksToClick = amountOfLinks > amountOfClicks; //

        if (AreThereStillLinksToClick) {
            System.out.println("Keep clicking on links");
        }
    }

    public boolean isThereStillSomeTimeToClick(int currentTime, int timeSinceTestStarted) {
        boolean result = false;
        result = (currentTime - timeSinceTestStarted) > 1000;
        return result;
    }

    @Test
    public void testMoreLogical() {
        int amountOfLinks = 5;
        int amountOfClicks = 5;

        boolean elementOneIsVisible = true;

        boolean AreThereStillLinksToClick = amountOfLinks > amountOfClicks;

        int currentTime = 5000;
        int timeSinceTestStarted = 3000;

        boolean isThereStillSomeTime = isThereStillSomeTimeToClick(currentTime, timeSinceTestStarted);

        if (elementOneIsVisible && AreThereStillLinksToClick && isThereStillSomeTime) {
            System.out.println("Keep clicking on links");
        } else {
            System.out.println("Some conditions are not met");
        }
    }

    @Test
    public void testMoreLogicalMore() {
        int amountOfLinks = 5;
        int amountOfClicks = 4;

        boolean elementOneIsVisible = true;

        boolean AreThereStillLinksToClick = amountOfLinks > amountOfClicks;

        int currentTime = 5000;
        int timeSinceTestStarted = 3000;

        boolean isThereStillSomeTime = isThereStillSomeTimeToClick(currentTime, timeSinceTestStarted);

        if (elementOneIsVisible && AreThereStillLinksToClick && isThereStillSomeTime) {
            System.out.println("Keep clicking on links");
        } else {
            System.out.println("Some conditions are not met");
        }
    }

    @Test
    public void testExclMark() {
        boolean yesItsTrue = true;
        System.out.println(!yesItsTrue);
    }

    @Test
    public void testEx4() {
        String a = new String("Wow");
        String b = "Wow";

        boolean b1 = a.equals(b);         // true
        boolean b2 = a.equals(b + "!");   // false
        boolean b3 = !a.equals(a);        // false
        boolean b4 = a == b;              // false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        if (b1 && b2 && b3 || b4) {
            System.out.println("Success!");
        } else System.out.println("Fail!!!");
    }

    @Test
    public void testArrays() {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6};

        String firstCar = "Volvo";
        String secondCar = "Toyota";
        String thirdCar = "Tesla";

        String[] garage = {firstCar, secondCar, thirdCar};

        for (int i = 0; i < garage.length; i++) {
            System.out.println("[" + i + "]= " + garage[i]);
        }

        for (int eachNumber : arrayOfNumbers) {
            System.out.println("Number: " + eachNumber);
        }
    }

    @Test
    public void testWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println("WHILE IS STILL ON");
            i++;
        }
    }

    @Test
    public void testArraysEx() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = numbers[3];
        char[] chars = new char[length];
        chars[chars.length - 1] = 'y';
        chars[0] = 'J';
        chars[1] = 'o';
        chars[2] = 'n';

        for (int i = 0; i < chars.length; i++) {
            System.out.println(numbers[i] + ": " + chars[i]);
        }
    }

}
