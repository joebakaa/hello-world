
package stock;


public class Stock {

    public static void main(String[] args) {
        // TODO code application logic here
        int shares= 0;
        shares = 1000;
        int pricepershare = 0;
        pricepershare = (int) 32.87;
        double commrate = 0;
        commrate = .02;
        
        double commprice = 0;
        double buyprice = 0;
     
        buyprice = pricepershare * shares;
        commprice = (commrate * buyprice);

        double sellpricepershare = 0;
        sellpricepershare = 33.92;

        
        double sellprice = 0;
        sellprice = sellpricepershare * 1000;
        double total1 = 0;
        total1 = buyprice + commprice;
        double commprice2 = 0;
        commprice2 = (sellprice * commrate);
        double total2 = 0;
        total2 = sellprice - commprice2;
        double total3 = total2 - total1;
        double roundOff= Math.round(total3 * 100) / 100;
        

        System.out.println("Joe bought the shares for " + buyprice + "$"+ " The price per share was 32.87");
        System.out.println("The amount of commision Joe paid his stock broker when he bought the stock: " +commprice + "$");
        System.out.println("The total amount of money Joe paid was " + total1 + "$");
        System.out.println();
        System.out.println("Joe sold his 1000 shares for " + sellprice + "$"+ " The price per share was 33.92");
        System.out.println("Another 2% commision was added to the sell price and it was: " + commprice2 +"$");
        System.out.println("The total was "  + String.format("%,.2f",total2) + "$, so all in all joe made a profit of " + String.format("%.2f",total3) + " doll hairs");
        System.out.println();
        System.out.println();
    }
    
}
