public class SmartPhone {
    private String phoneName;       // define by constructor
    private int phoneModel;      // define by constructor
    private String phoneVendor;      // define by constructor

    // public String phoneOsVersion;       // not define by constructor

    public SmartPhone(String phoneName, int phoneModel, String phoneVendor) {
        this.phoneName = phoneName;
        this.phoneModel = phoneModel;
        this.phoneVendor = phoneVendor;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public int getPhoneModel() {
        return phoneModel;
    }

    public String getPhoneVendor() {
        return phoneVendor;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setPhoneModel(int phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void setPhoneVendor(String phoneVendor) {
        this.phoneVendor = phoneVendor;
    }

    public void hasFaceIdPrint() {
        boolean varHasFaceId = phoneVendor.equals("Apple") && (phoneModel >= 10);
        if (varHasFaceId)
            System.out.println(phoneName + " model " + phoneModel + " has FaceID");
        else System.out.println(phoneName + " model " + phoneModel + " doesn't have FaceID");
    }

    public boolean hasFaceId() {
        boolean varHasFaceId = phoneVendor.equals("Apple") && (phoneModel >= 10);
        return varHasFaceId;
    }

    public void canMakeCall() {
        System.out.println(phoneName + " " + phoneModel + " ables to make calls");
    }

}
