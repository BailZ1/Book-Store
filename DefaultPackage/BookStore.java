package DefaultPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author baile
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Member> currentMembers = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Product> cart = new ArrayList<>();
    
    
    
    public static void main(String[] args) {
        
            
        //Welcome Message
        
            System.out.println("""
                           *                                 *
                           *     Welcome to my BookStore!    *
                           *                                 *
                                                                """);
        //set up stock
        
            setUpStock();
            
        //Create the menu page
        
            menu();
        
    }
    
    public static void menu(){

        boolean loop = true;
        
        while (loop){
            System.out.println("""
                           What would you like to see?
                           1. Browse the Store
                           2. Show Cart
                           3. Remove From Cart
                           4. Complete Purchase
                           5. Members List
                           6. Edit Member List
                           7. Leave the Store
                                                             """);
            
            int ans = sc.nextInt();

            switch (ans){
             case 1:
                    addItemToCart();
                    break;
             case 2:
                    checkCart();
                    break;
             case 3:
                    removeCart();
                    break;
             case 4:
                    //completePurchase();
                    break;
             case 5:
                    //checkMembers();
                    break;
             case 6:
                    //editMembers();
                    break;
             case 7:
                    System.out.println("Hope to see you again!");
                    loop = false;
                    break;
             default:
                    System.out.print("Invalid Response, Try again:");
            }
        }
    }
    
    public static void setUpStock(){
        
        //CDs
        products.add(new CD(4, "Rest Up", "Indie Pop", "Boy Pablo", 4.99, 5));
        products.add(new CD(3, "Hot Rod", "Indie", "Dayglow", 3.99, 5));
        products.add(new CD(5, "Vices", "Rock", "Sarah and The Sundays", 5.99, 5));
        products.add(new CD(2, "Call me what you like", "Indie Rock", "Lovejoy", 6.99, 5));
        products.add(new CD(6, "Jubilee Line", "Soul", "Wilbur Soot", 2.99, 5));
        
        //Books
        products.add(new Book(224, "Beautiful You", "Chuck Palaniuk", "Thriller Fiction", 10.99, 5));
        products.add(new Book(278, "Chaos Theory", "Nic Stone", "Romance Fiction", 15.99, 5));
        products.add(new Book(279, "The Villa", "Rachel Hawkins", "Gothic Fiction", 16.99, 5));
        products.add(new Book(294, "A Rovers Story", "Jasmine Warga", "Science Fiction", 17.99, 5));
        products.add(new Book(215, "The Sunshine Mind", "Tanya Rad", "Romance Fiction", 14.99, 5));
        
        //DVDS
        products.add(new DVD(161, "Black Panther: Wakanda Forever", "Ryan Coogler","Superhero Fiction",20.99, 5));
        products.add(new DVD(112, "SUPER 8", "J.J. Abrams","Drama",21.99, 5));
        products.add(new DVD(103, "The Good House", "Wallace Wolodarsky","Drama Fiction",19.99, 5));
        products.add(new DVD(130, "The Big Short", "Adam McKay","Historical Drama",15.99, 5));
        products.add(new DVD(126, "Bullet Train", "David Leitch","Action, Adventure, Comedy",22.99, 5));
    }
    
    
    
    public static void addItemToCart(){
        
        
        int ans = 0;
            System.out.println("""
                               
                           Here is a list of our Prodcuts:
                               
                                        """);
            
            //Display Stock
            showProducts();

            System.out.println("\nWould you like to purchase anything?");

            //Grab User Input
            ans = sc.nextInt();
            if(ans >= products.size() + 1){
                System.out.println("\nBack to the Menu!");
            }
            else{
                if(products.get(ans - 1).getStock() > 0){
                    //Add Item to Cart
                    cart.add( products.get(ans - 1) );
                    System.out.println("Added Item : " + products.get(ans-1).getName() );
                    System.out.println("");

                    //Get rid of Item from Stock
                    products.get(ans - 1).decrementStock();
                }
                else{
                    System.out.print("This Item is out of stock!");
                }
                
            }
            
            
            
    }//End addItemToCart Method
    
    
    public static void showProducts(){
        for(int i = 0; i < products.size(); i++){
            System.out.print( (i + 1) + ". ");
            products.get(i).details();
        }
        System.out.println( (products.size() + 1) + ". Leave Browsing");
    }
    
    
    
    public static void checkCart(){
        System.out.println("Cart:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println( (i + 1) + ". " + cart.get(i).getName() + "  " + cart.get(i).getPrice());
        }
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getPrice();
        }
        System.out.println("Total: " + total);
        System.out.println("");
    }
    
    public static void removeCart(){
        checkCart();
        System.out.println( (cart.size() + 1) + ". Leave Cart");
        
        System.out.println("What would you like to remove?");
        
        int ans = sc.nextInt();
        
        if(ans >= cart.size()){
            System.out.println("Leaving Cart");
        }
        else{
            System.out.println("Removing: " + cart.get(ans - 1).getName());
            cart.remove(ans - 1);
            products.get(ans + 1).incrementStock();
        }
        
    }
    
    public static void completePurchase(){
        
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getPrice();
        }
    }

//    public static ArrayList<Member> createMembers(){
//        
//    }
//    
//    public static void checkMembers(){   
//        
//    }
//    
//    public static void editMembers(){
//        
//    }
//    
//    public static double modBookList(int itemId){
//        
//    }
//    
//    public static double modCdList(int itemId){
//        
//    }
//    
//    public static double modDvdList(int itemId){
//        
//    }

} // end class
