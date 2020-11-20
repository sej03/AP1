import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Zotato {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int total_delivery=0;
        float net_company=0;
        ArrayList<Restaurant> restaurants=new ArrayList<>();
        ArrayList<customer> customers=new ArrayList<>();
        HashMap <Restaurant,ArrayList<Food_item>> menu=new HashMap<>();
        HashMap<customer,ArrayList<Food_item>> recent_orders= new HashMap<>();
        Restaurant r1=new Restaurant("Shah","City Mall","Authentic");
        Restaurant r2=new Restaurant("Ravi's","South extension");
        Restaurant r3=new Restaurant("The Chinese","Nehru Place","Authentic");
        Restaurant r4=new Restaurant("Wang's","Kalkaji Mandir","Fast Food");
        Restaurant r5=new Restaurant("Paradise","Lajpat Nagar");
        restaurants.add(r1); menu.put(r1,new ArrayList<Food_item>());
        restaurants.add(r2); menu.put(r2,new ArrayList<Food_item>());
        restaurants.add(r3); menu.put(r3,new ArrayList<Food_item>());
        restaurants.add(r4); menu.put(r4,new ArrayList<Food_item>());
        restaurants.add(r5); menu.put(r5,new ArrayList<Food_item>());
        customer c1=new customer("Ram","Flat 100, Signature Villas, Noida", "Elite");
        customer c2=new customer("Sam","Flat 200, Green Villas, Noida","Elite");
        customer c3=new customer("Tim","H.no 1, Star Villas, Noida","Special");
        customer c4= new customer("Kim","Flat 107, Signature Villas, Noida");
        customer c5=new customer("Jim","109, sky flats, Noida");
        customers.add(c1); recent_orders.put(c1, new ArrayList<Food_item>());
        customers.add(c2); recent_orders.put(c2, new ArrayList<Food_item>());
        customers.add(c3); recent_orders.put(c3, new ArrayList<Food_item>());
        customers.add(c4); recent_orders.put(c4, new ArrayList<Food_item>());
        customers.add(c5); recent_orders.put(c5, new ArrayList<Food_item>());
        parentmenu();
        int home=Integer.parseInt(s.nextLine());
        int c=0;
        int x8=0;
        end:while(home!=5){
            switch (home){
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 1:
                    rest_screen(restaurants);
                    int option=Integer.parseInt(s.nextLine());//for restaurant
                    owner_screen(restaurants.get(option-1).getName());
                    int i=Integer.parseInt(s.nextLine());
                    while(i!=5){
                         switch (i) {
                             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                             case 1:
                                 System.out.println("Enter food item details");
                                 System.out.println("Food name:");
                                 String x1 = s.nextLine();
                                 System.out.println("Item price:");
                                 int x2 = Integer.parseInt(s.nextLine());
                                 System.out.println("Item quantity:");
                                 int x3 = Integer.parseInt(s.nextLine());
                                 System.out.println("Item category:");
                                 String x4 = s.nextLine();
                                 System.out.println("Offer:");
                                 int x5 = Integer.parseInt(s.nextLine());
                                 Food_item f = new Food_item(x1, x2, x3, x4, x5);
                                 menu.get(restaurants.get(option - 1)).add(f);
                                 System.out.print(menu.get(restaurants.get(option - 1)).indexOf(f) + 1);
                                 f.print();
                                 owner_screen(restaurants.get(option - 1).getName());
                                 i = Integer.parseInt(s.nextLine());
                                 if (i == 5) {
                                     parentmenu();
                                     home = Integer.parseInt(s.nextLine());
                                     // break end;
                                 }
                                 break;
                             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                             case 2:
                                 System.out.println("Choose item by code");
                                 for (int i1 = 0; i1 < menu.get(restaurants.get(option - 1)).size(); i1++) {
                                     System.out.print((i1 + 1) + " " + restaurants.get(option - 1).getName() + " - ");
                                     menu.get(restaurants.get(option - 1)).get(i1).print();
                                 }
                                 int x7 = Integer.parseInt(s.nextLine());
                                 attribute();
                                 int x6 = Integer.parseInt(s.nextLine());
                                 switch (x6) {
                                     case 1:
                                         System.out.println("Enter the new name - ");
                                         String s1 = s.nextLine();
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).setFood_name(s1);
                                         System.out.print(option + " " + restaurants.get(option - 1).getName() + " - ");
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).print();
                                         owner_screen(restaurants.get(option - 1).getName());
                                         i = Integer.parseInt(s.nextLine());
                                         if (i == 5) {
                                             parentmenu();
                                             home = Integer.parseInt(s.nextLine());
                                         }
                                         break;
                                     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                     case 2:
                                         System.out.println("Enter the new price - ");
                                         int s2 = Integer.parseInt(s.nextLine());
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).setItem_price(s2);
                                         System.out.print(option + " " + restaurants.get(option - 1).getName() + " - ");
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).print();
                                         owner_screen(restaurants.get(option - 1).getName());
                                         i = Integer.parseInt(s.nextLine());
                                         if (i == 5) {
                                             parentmenu();
                                             home = Integer.parseInt(s.nextLine());
                                         }
                                         break;
                                     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                     case 3:
                                         System.out.println("Enter the new quantity - ");
                                         s2 = Integer.parseInt(s.nextLine());
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).setQuantity(s2);
                                         System.out.print(option + " " + restaurants.get(option - 1).getName() + " - ");
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).print();
                                         owner_screen(restaurants.get(option - 1).getName());
                                         i = Integer.parseInt(s.nextLine());
                                         if (i == 5) {
                                             parentmenu();
                                             home = Integer.parseInt(s.nextLine());
                                         }
                                         break;
                                     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                     case 4:
                                         System.out.println("Enter the new Category - ");
                                         s1 = s.nextLine();
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).setCategory(s1);
                                         System.out.print(option + " " + restaurants.get(option - 1).getName() + " - ");
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).print();
                                         owner_screen(restaurants.get(option - 1).getName());
                                         i = Integer.parseInt(s.nextLine());
                                         if (i == 5) {
                                             parentmenu();
                                             home = Integer.parseInt(s.nextLine());
                                         }
                                         break;
                                     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                     case 5:
                                         System.out.println("Enter the new Offer - ");
                                         s2 = Integer.parseInt(s.nextLine());
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).setOffer(s2);
                                         System.out.print(option + " " + restaurants.get(option - 1).getName() + " - ");
                                         menu.get(restaurants.get(option - 1)).get(x7 - 1).print();
                                         owner_screen(restaurants.get(option - 1).getName());
                                         i = Integer.parseInt(s.nextLine());
                                         if (i == 5) {
                                             parentmenu();
                                             home = Integer.parseInt(s.nextLine());
                                         }

                                         break;
                                 }
                                 break;

                             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                             case 3:
                                 System.out.println("Reward points: " + restaurants.get(option - 1).getReward());
                                 owner_screen(restaurants.get(option - 1).getName());
                                 i = Integer.parseInt(s.nextLine());
                                 if (i == 5) {
                                     parentmenu();
                                     home = Integer.parseInt(s.nextLine());
                                 }
                                 break;
                             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                             case 4:
                                 System.out.println("Offer on bill value - ");
                                 int j = Integer.parseInt(s.nextLine());
                                 if(restaurants.get(option - 1).getCategory()!=null){
                                 if (restaurants.get(option - 1).getCategory().equals("Fast Food") || restaurants.get(option - 1).getCategory().equals("Authentic")) {
                                     restaurants.get(option - 1).setBill_discount(j);
                                 } }
                                 else{
                                     System.out.println("Offer can't be applied for this Restaurant.");
                                 }
                                 owner_screen(restaurants.get(option - 1).getName());
                                 i = Integer.parseInt(s.nextLine());
                                 if (i == 5) {
                                     parentmenu();
                                     home = Integer.parseInt(s.nextLine());
                                 }
                                 break;
                         }
                    }
                     break;
                case 2:
                    customer_screen(customers);
                    int n_option=Integer.parseInt(s.nextLine());
                    screen(customers.get(n_option-1).getName());
                    int j=Integer.parseInt(s.nextLine());
                    int k=0;
                    int f=0;
                    int p=0;
                    while(j!=5){
                        switch(j){
                            case 1:
                                rest_screen(restaurants);
                                k=Integer.parseInt(s.nextLine());
                                System.out.println("Choose item by code:");
                                for (int i1=0;i1<menu.get(restaurants.get(k-1)).size();i1++){
                                    System.out.print(i1+1+" "+restaurants.get(k-1).getName()+" - ");
                                    menu.get(restaurants.get(k-1)).get(i1).print();
                                }
                                f=Integer.parseInt(s.nextLine()); //food_item code
                                System.out.println("Enter Item Quantity -");
                                x8=Integer.parseInt(s.nextLine()); //item quantity
                                System.out.println("Items added to cart");
                                after_order(customers.get(n_option-1).getName());
                                j=Integer.parseInt(s.nextLine());
                                if (j==5){
                                    parentmenu();
                                    home=Integer.parseInt(s.nextLine());
                                }break;

                            case 2:
                                float initial= customers.get(n_option-1).getBalance();
                                System.out.println("Items in Cart -");
                                int start=recent_orders.get(customers.get(n_option-1)).size();
                                if (menu.get(restaurants.get(k-1)).get(f-1).getQuantity()>0) {
                                    if (menu.get(restaurants.get(k-1)).get(f-1).getQuantity()>=x8){
                                    Food_item temp = new Food_item(menu.get(restaurants.get(k - 1)).get(f - 1).getFood_name(), menu.get(restaurants.get(k - 1)).get(f - 1).getItem_price(), x8, menu.get(restaurants.get(k - 1)).get(f - 1).getCategory(), menu.get(restaurants.get(k - 1)).get(f - 1).getOffer());
                                    recent_orders.get(customers.get(n_option - 1)).add(temp);
                                    menu.get(restaurants.get(k-1)).get(f-1).setQuantity(menu.get(restaurants.get(k-1)).get(f-1).getQuantity()-x8);
                                }
                                    else{
                                        menu.get(restaurants.get(k-1)).get(f-1).setQuantity(menu.get(restaurants.get(k-1)).get(f-1).getQuantity());
                                    }
                                }
                                else{
                                    System.out.println("No more of this food is left");
                                }

                                for(int y=start;y<recent_orders.get(customers.get(n_option-1)).size();y++){
                                    System.out.print(x8+" "+restaurants.get(k-1).getName()+" - ");
                                    System.out.println(recent_orders.get(customers.get(n_option-1)).get(y).getFood_name()+" - "+recent_orders.get(customers.get(n_option-1)).get(y).getItem_price()+" - "+recent_orders.get(customers.get(n_option-1)).get(y).getQuantity()+" - "+recent_orders.get(customers.get(n_option-1)).get(y).getOffer()+"% off");
                                }
                                int d=40;
                                System.out.print("Delivery charge - ");
                                if (customers.get(n_option-1).getCategory()!=null && customers.get(n_option-1).getCategory().equals("Elite")){
                                    d=0;
                                }
                                if(customers.get(n_option-1).getCategory()!=null && customers.get(n_option-1).getCategory().equals("Special")){
                                   d=20;
                                }
                                total_delivery=total_delivery+d;
                                System.out.println(d+"/-");
                                float bill=x8*menu.get(restaurants.get(k - 1)).get(f - 1).getItem_price();
                                int off=menu.get(restaurants.get(k-1)).get(f-1).getOffer();
             
                                if(off>0){
                                    bill=(bill*(100-off))/100;
                                }
                                System.out.print("Total order value - INR ");
                                if (restaurants.get(k-1).getBill_discount()>0 && restaurants.get(k-1).getCategory().equals("Fast Food")){
                                    bill=(bill*(100-restaurants.get(k-1).getBill_discount()))/100;
                                }
                                if (restaurants.get(k-1).getBill_discount()>0 && restaurants.get(k-1).getCategory().equals("Authentic")){
                                    bill=(bill*(100-restaurants.get(k-1).getBill_discount()))/100;
                                    if(bill>100){
                                        bill=bill-50;
                                    }
                                }

                                if (customers.get(n_option-1).getCategory()!=null && customers.get(n_option-1).getCategory().equals("Elite") && bill>200){
                                    bill=bill-50;
                                }
                                else if(customers.get(n_option-1).getCategory()!=null &&customers.get(n_option-1).getCategory().equals("Special") && bill>200){
                                    bill-=25;
                                }
                                bill=bill+d;
                                System.out.println(bill+"/-");
                                net_company= (float) (net_company+bill*(0.01));
                                int rewards_before=customers.get(n_option-1).getReward();
                                System.out.println("   1) Proceed to checkout");
                                int check=Integer.parseInt(s.nextLine());
                                if (check==1){
                                    System.out.println(x8+" items successfully bought for INR "+bill+"/-");
                                }
                                if(rewards_before==0){
                                customers.get(n_option-1).setBalance(initial-bill);}
                                else{
                                    if(customers.get(n_option-1).getReward()==bill){
                                        customers.get(n_option-1).reward_points(0);

                                    }
                                    else if(customers.get(n_option-1).getReward()<bill){
                                        customers.get(n_option-1).setBalance(initial-(bill-customers.get(n_option-1).getReward()));
                                        customers.get(n_option-1).reward_points(0);
                                    }
                                    else{
                                        customers.get(n_option-1).reward_points((int) (customers.get(n_option-1).getReward()-bill));
                                    }
                                }
                                if(restaurants.get(k-1).getCategory()!=null &&restaurants.get(k-1).getCategory().equals("Fast Food")){
                                    p= ((int)bill/150)*10;
                                    customers.get(n_option-1).reward_points(p);
                                }
                                else if(restaurants.get(k-1).getCategory()!=null &&restaurants.get(k-1).getCategory().equals("Authentic")){
                                    p=((int)bill/200)*25;
                                    customers.get(n_option-1).reward_points(p);
                                }
                                else{
                                    p=((int)bill/100)*5;
                                    customers.get(n_option-1).reward_points(p);
                                }
                                restaurants.get(k-1).setOrders(restaurants.get(k-1).getOrders()+1);
                                customers.get(n_option-1).getPast_rest().add(restaurants.get(k-1));
                                customers.get(n_option-1).getDelivery_charge().add(d);
                                customers.get(n_option-1).getPast_order().add(new Food_item(menu.get(restaurants.get(k - 1)).get(f - 1).getFood_name(), menu.get(restaurants.get(k - 1)).get(f - 1).getItem_price(), x8, menu.get(restaurants.get(k - 1)).get(f - 1).getCategory(), menu.get(restaurants.get(k - 1)).get(f - 1).getOffer()));
                                after_order(customers.get(n_option-1).getName());
                                j=Integer.parseInt(s.nextLine());
                                if (j==5){
                                    parentmenu();
                                    home=Integer.parseInt(s.nextLine());
                                }break;

                            case 3:
                                System.out.println("Reward won: "+p);
                                after_order(customers.get(n_option-1).getName());
                                j=Integer.parseInt(s.nextLine());
                                if (j==5){
                                    parentmenu();
                                    home=Integer.parseInt(s.nextLine());
                                }break;

                            case 4:
                                int l=0;
                                if (customers.get(n_option-1).getPast_order().size()>10){
                                    l=customers.get(n_option-1).getPast_order().size()-10;
                                }
                                for (int h=l;h<customers.get(n_option-1).getPast_order().size();h++){
                                    System.out.print("Bought item : ");
                                    System.out.print(customers.get(n_option-1).getPast_order().get(h).getFood_name());
                                    System.out.print(", quantity: "+customers.get(n_option-1).getPast_order().get(h).getQuantity());
                                    System.out.println(", for price "+customers.get(n_option-1).getPast_order().get(h).getItem_price()+" from Restaurant "+customers.get(n_option-1).getPast_rest().get(h).getName()+" and Deliver Charge: "+customers.get(n_option-1).getDelivery_charge().get(h));
                                }
                                after_order(customers.get(n_option-1).getName());
                                j=Integer.parseInt(s.nextLine());
                                if (j==5){
                                    parentmenu();
                                    home=Integer.parseInt(s.nextLine());
                                }break;
                        }
                    }
                    break;
                    case 3:
                        System.out.println("   1) Customer List");
                        System.out.println("   2) Restaurant List");
                        int u=Integer.parseInt(s.nextLine());
                        if (u==1){
                            for (int i1=0;i1<customers.size();i1++){
                                System.out.println((i1+1)+ ". "+customers.get(i1).getName());
                            }
                            int u2=Integer.parseInt(s.nextLine());
                            if(customers.get(u2-1).getCategory()!=null){
                                System.out.println(customers.get(u2-1).getName()+"("+customers.get(u2-1).getCategory()+"), "+customers.get(u2-1).getAddress()+", "+customers.get(u2-1).getBalance()+"/-");}
                            else{
                                System.out.println(customers.get(u2-1).getName()+", "+customers.get(u2-1).getAddress()+", "+customers.get(u2-1).getBalance());}
                        }
                        else{
                                for(int i1=0;i1<restaurants.size();i1++){
                                    System.out.println(i1+1+" "+restaurants.get(i1).getName());
                                }
                                int x=Integer.parseInt(s.nextLine());
                            System.out.println(restaurants.get(x-1).getName()+" - "+restaurants.get(x-1).getAddress()+" - "+restaurants.get(x-1).getOrders()+" Order(s) - "+restaurants.get(x-1).getCategory());
                        }
                        parentmenu();
                        home=Integer.parseInt(s.nextLine());
                        if(home==5){
                            break end;
                        }
                        break;

                case 4:
                    System.out.println("Total Company balance - INR "+ net_company+"/-");
                    System.out.println("Total Delivery Charges Collected - INR "+total_delivery+"/-");
                    parentmenu();
                    home=Integer.parseInt(s.nextLine());
                    if(home==5){
                        break end;
                    }
                    break;
            }
        }

        }
        public static void customer_screen(ArrayList<customer> c){
            for (int i=0;i<c.size();i++){
                if (c.get(i).getCategory()!=null){
                    System.out.println("   "+(i+1)+") "+c.get(i).getName()+" ("+c.get(i).getCategory() +")");
                }
                else{
                    System.out.println("   "+(i+1)+") "+c.get(i).getName());
                }
            }
        }
        public static void screen(String name){
            System.out.println("Welcome "+name);
            System.out.println("Customer Menu");
            System.out.println("   1) Select Restaurant");
            System.out.println("   2) Checkout cart");
            System.out.println("   3) Reward won");
            System.out.println("   4) Print the recent orders");
            System.out.println("   5) Exit");
        }

    public static void parentmenu(){
        System.out.println("Welcome to Zotato:");
        System.out.println("   1) Enter as Restaurant Owner");
        System.out.println("   2) Enter as Customer");
        System.out.println("   3) Check User Details");
        System.out.println("   4) Company Account Details");
        System.out.println("   5) Exit");
    }
    public static void rest_screen(ArrayList<Restaurant> c){
        System.out.println("Choose Restaurant");
        for (int i=0;i<c.size();i++){
            if (c.get(i).getCategory()!=null){
                System.out.println("   "+(i+1)+") "+ c.get(i).getName()+" ("+ c.get(i).getCategory()+")");
            }
            else{
                System.out.println("   "+(i+1)+") "+ c.get(i).getName());
            }
        }
   }
   public static void owner_screen(String s){
       System.out.println("Welcome "+s);
       System.out.println("    1) Add item");
       System.out.println("    2) Edit item");
       System.out.println("    3) Print Rewards");
       System.out.println("    4) Discount on bill value");
       System.out.println("    5) Exit");
   }
   public static void attribute(){
       System.out.println("Choose an attribute to edit:");
       System.out.println("    1) Name");
       System.out.println("    2) Price");
       System.out.println("    3) Quantity");
       System.out.println("    4) Category");
       System.out.println("    5) Offer");
   }
   public static void after_order(String s){
       System.out.println("Welcome "+s);
       System.out.println("Customer Menu");
       System.out.println("   1) Search item");
       System.out.println("   2) Checkout cart");
       System.out.println("   3) Reward won");
       System.out.println("   4) Print the recent orders");
       System.out.println("   5) Exit");
   }
}
class Food_item{
    private String food_name;
    private int item_price;
    private int quantity;
    private String category;
    private int offer;

    Food_item(String food_name, int item_price,int quantity, String category, int offer){
        this.food_name=food_name;
        this.category=category;
        this.offer=offer;
        this.item_price=item_price;
        this.quantity=quantity;
    }

    public void print(){
        System.out.println(" "+ this.food_name+" "+this.item_price+" "+this.quantity+" "+this.offer+"% off "+this.category);
    }

    public int getItem_price() {
        return item_price;
    }

    public String getFood_name() {
        return food_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOffer() {
        return offer;
    }

    public String getCategory() {
        return category;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public void setItem_price(int item_price) {
        if (item_price>=0){
        this.item_price = item_price;}
    }

    public void setCategory(String category) {
        if(category.equals("Starter") || category.equals("MainCourse")|| category.equals("Dessert")||category.equals("Beverage")){
        this.category = category;}
    }

    public void setOffer(int offer) {
        if(offer>=0){
        this.offer = offer;}
    }

    public void setQuantity(int quantity) {
        if(quantity>=0){
        this.quantity = quantity;}
    }
}

class user{
    private String name;
    private String address;

    user(String name, String address){
        this.address=address;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
interface Rewards{
    void reward_points(int n);
}
class customer extends user implements Rewards{
    private String category;
    private float balance;
    private int reward;
   private ArrayList<Restaurant> past_rest;
   private ArrayList<Food_item> past_order;
   private ArrayList<Integer> delivery_charge;

   customer(String name, String address, String category){
        super(name, address);
        this.category=category;
        balance=1000;
        past_order=new ArrayList<Food_item>();
        past_rest=new ArrayList<Restaurant>();
        delivery_charge=new ArrayList<Integer>();
    }
    customer(String name, String address){
        super(name, address);
        balance=1000;
        past_order=new ArrayList<Food_item>();
        past_rest=new ArrayList<Restaurant>();
        delivery_charge=new ArrayList<Integer>();
    }

    public void setBalance(float balance) {
        if (balance>=0) this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public ArrayList<Food_item> getPast_order() {
        return past_order;
    }

    public ArrayList<Restaurant> getPast_rest() {
        return past_rest;
    }

    public ArrayList<Integer> getDelivery_charge() {
        return delivery_charge;
    }

    @Override
    public void reward_points(int n) {
        this.reward=n;
    }

    public int getReward() {
        return reward;
    }

    public String getCategory() {
        return category;
    }
}
class Restaurant extends user implements Rewards{
    private String name;
    private String category;
    private int bill_discount;
    private int reward;
    private int orders;

    Restaurant(String name, String address, String category){
        super(name,address);
        this.category=category;
        this.name=name;
        orders=0;
    }
    Restaurant(String name,String address){
        super(name, address);
        this.name=name;
        orders=0;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    @Override
    public void reward_points(int n) {
        this.reward=n;
    }

    public int getReward() {
        return reward;
    }

    public void setBill_discount(int bill_discount) {
        this.bill_discount = bill_discount;
    }

    public int getBill_discount() {
        return bill_discount;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public int getOrders() {
        return orders;
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }
}
