/*
Create a superclass called cake that has two fields: flavor and price,
and a constructor that accepts the flavor
Create a birthdayCake class which inherits from cake and has candles
its constructor should set the flavor
Create a weddingCake class which inherits from cake and has tiers
its constructor should set the flavor
Create a tasteTester class to test out inheritance by printing the
flavor and price of each of these types of cakes;
 */
package chapter9_Inheritance.exercise;

public class TasteTester {

   public static void main(String[] args){

       Cake cake = new Cake("vanilla");
       System.out.println(cake.getFlavor()+ " cake " + "price: $"+ cake.getPrice());

       BirthdayCake birthdayCake = new BirthdayCake();
       birthdayCake.setCandles(10);
       birthdayCake.setPrice(39.99);
       System.out.println(birthdayCake.getFlavor() + " cake "+"candles:"+ birthdayCake.getCandles()
       + " price: $"+ birthdayCake.getPrice());

       WeddingCake wedding = new WeddingCake();
       wedding.setTiers(4);
       wedding.setPrice(99.99);
       System.out.println(wedding.getFlavor()+ " cake "+"tiers:"+ wedding.getTiers()
       + " price: $"+ wedding.getPrice());
   }
}
