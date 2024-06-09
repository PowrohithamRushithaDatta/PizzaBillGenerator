public class Pizza {
           private int price;
           private boolean veg;
           private int extraCheeseprice = 100;
           private int extraToppings = 150;
           private int backpack = 20;
           private int basepizzaprice ;
           private boolean isExtracheese  = false;
           private boolean istoppled = false;
           private boolean istakeaway = false;
           public Pizza(boolean veg){
               this.veg = veg;
               if(this.veg){
                   this.price = 300;
               }else{
                   this.price = 400;
               }
               this.basepizzaprice = this.price;
           }
           public void addExtraCheese(){
              isExtracheese = true;
               this.price += extraCheeseprice;

           }
            public void addExtraTopping(){
                istoppled = true;
                this.price += extraToppings;
            }
            public void takeAway(){
                istakeaway = true;
                this.price += backpack;
            }
            public void getBill(){
               String Bill = "";
                Bill += "Pizza: " + basepizzaprice +"\n";
               if(isExtracheese){
                   Bill += "Extracheese: "+ extraCheeseprice + "\n";
               }
               if(istoppled){
                   Bill += "Toppings: "+ extraToppings + "\n";
               }
               if(istakeaway){
                   Bill += "takeaway: "+ backpack + "\n";
               }
               Bill += "Bill: " + this.price;
               System.out.println(Bill);
            }
}
