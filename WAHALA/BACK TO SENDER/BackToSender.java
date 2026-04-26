public class BackToSender{
    public static int calculateWage(int delivery){
        int basePay = 5000;
        int amountPerParcel = 0;

        if(delivery < 50) {
            amountPerParcel = 160;
        } 
        else if (delivery <= 59) {
            amountPerParcel = 200;
        }
        else if (delivery <= 69) {
            amountPerParcel = 250;
        }
        else{
            amountPerParcel = 500;
        }

        return (delivery * amountPerParcel) + basePay;
    }
}
