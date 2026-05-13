public class OshoFree{
    public static double calculateFinalPrice(double cartTotal, String promoCode){
    double discount = 0.0;
    double finalPrice = 0.0;
    
    if(cartTotal >= 5000 && cartTotal <= 14999 && promoCode.equals("STARTER10")){
    discount = cartTotal * 0.1;
    finalPrice = cartTotal - discount;
    }
    else if(cartTotal >= 15000 && cartTotal <= 29999 && promoCode.equals("BIGBOY20") ){
    discount = cartTotal * 0.2;
    finalPrice = cartTotal - discount;
    }    
    
    else if(cartTotal >= 30000 && promoCode.equals("OSHOFREE35")){
    discount = cartTotal * 0.35;
    finalPrice = cartTotal - discount;
    }
    
    else if(cartTotal < 0){
    throw new IllegalArgumentException("Invalid Amount! Cart total cannot be negative");
    }
    
    else{
    // cartotal < 5000

    return cartTotal;
    }
    
    return finalPrice;
}

}
