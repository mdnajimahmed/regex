package nested.local;

public class LocalClassDemo {
    static String regularExpression = "[^0-9]";
    private int flag = -100;
    public void validatePhoneNumber(String phoneNumber1) {
//        final int numberLength = 10;
        int numberLength = 10;

        class PhoneNumber{
            String formattedNumber = null;

            public PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression,""); // accessing outer class static field.
                if(currentNumber.length() == numberLength){
                    formattedNumber = currentNumber;
                }
            }

            public String getFormattedNumber() {
                return formattedNumber;
            }
            public void accessOutsideThings(){
                System.out.println("Local class and variable at the same level " + numberLength);
                System.out.println("Outside class static " + regularExpression);
                System.out.println("Outside class instance" + LocalClassDemo.this.flag);
                System.out.println("Outside class instance" + flag);
            }
        }
    }
}
