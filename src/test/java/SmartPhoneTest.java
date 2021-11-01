import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartPhoneTest {
    @Test
    public void testPhoneNamePos() {
        // Test data:
        String testPhoneName = "iPhone";
        int testPhoneModel = 10;
        String testPhoneVendor = "Apple";

        // Expected result:
        //boolean expHasFaceId = true;
        //String expPhoneVendor = "aPPle";
        String expPhoneName = "iPhone";

        SmartPhone phoneOne = new SmartPhone(testPhoneName, testPhoneModel, testPhoneVendor);

        System.out.println(phoneOne.getPhoneVendor() + ": " + phoneOne.getPhoneName() + " " + phoneOne.getPhoneModel());
        phoneOne.hasFaceIdPrint();
        phoneOne.canMakeCall();

        //boolean isNameCorrect = phoneOne.getPhoneName().equals(expPhoneName);
        //System.out.println(isNameCorrect);

        //isNameCorrect =  phoneOne.getPhoneName().contentEquals(expPhoneName);
        //System.out.println(isNameCorrect);

        Assert.assertEquals(phoneOne.getPhoneName(), expPhoneName);
    }

    @Test
    public void testPhoneNameNeg() {
        // Test data:
        String testPhoneName = "Android";
        int testPhoneModel = 10;
        String testPhoneVendor = "Google";

        // Expected result
        String expPhoneName = "anDROID";

        SmartPhone phoneOne = new SmartPhone(testPhoneName, testPhoneModel, testPhoneVendor);

        System.out.println(phoneOne.getPhoneVendor() + ": " + phoneOne.getPhoneName() + " " + phoneOne.getPhoneModel());
        phoneOne.hasFaceIdPrint();
        phoneOne.canMakeCall();

        Assert.assertEquals(phoneOne.getPhoneName(), expPhoneName);
    }

    @Test
    public void testPhoneFaceIdPos() {
        // Test data:
        String testPhoneName = "iPhone";
        int testPhoneModel = 12;
        String testPhoneVendor = "Apple";

        // Expected result:
        boolean expHasFaceId = true;
        String expPhoneName = "iPhone";

        SmartPhone phoneOne = new SmartPhone(testPhoneName, testPhoneModel, testPhoneVendor);

        System.out.println(phoneOne.getPhoneVendor() + ": " + phoneOne.getPhoneName() + " " + phoneOne.getPhoneModel());
        phoneOne.hasFaceIdPrint();
        phoneOne.canMakeCall();

        Assert.assertEquals(phoneOne.hasFaceId(), expHasFaceId);
    }
}
