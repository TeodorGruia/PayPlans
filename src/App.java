public class App {
    public static void main(String[] args) throws Exception {
       //a script to calculate payment plans for verizon
        Integer count = 0;
       double planA = 60.00;
       //double planB = 50.00;

       double planDecrement = 15.00;

       for (int i = 0; i < 4; i ++) {
            planA = planA - planDecrement;
            System.out.println("Month " + i + ": " + planA);
            count += 1;
            i += i;
       }
       System.out.println("The Cost after " + count + " months is: "  + planA);
    }
}
