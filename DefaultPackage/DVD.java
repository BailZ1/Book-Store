/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefaultPackage;

/**
 *
 * @author baile
 */
public class DVD extends Product{
    
    private int DVDLength = 0;
    private String DVDName = "";
    private String Director = "";
    private String genre = "";
    private double price = 0.0;
    private int stock = 0;
    
    /**
     * DVD Constructor
     * @param DVDLength int
     * @param DVDName String
     * @param Director String
     * @param genre String
     * @param price double
     */
    public DVD(int DVDLength, String DVDName, String Director, String genre, double price, int stock){
        this.DVDLength = DVDLength;
        this.DVDName = DVDName;
        this.Director = Director;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }
    
    /**
     * Getter for DVD Length
     * @return DVDLength int
     */
    public int getDVDLength(){
        return DVDLength;
    }
    
    /**
     * Getter for DVD Name
     * @return DVDName String
     */
    @Override
    public String getName(){
        return DVDName;
    }
    
    /**
     * Getter for DVD Genre
     * @return genre String
     */
    public String getDVDGenre(){
        return genre;
    }
    
    /**
     * Getter for DVD Director
     * @return 
     */
    public String getDVDdirector(){
        return Director;
    }
    
    /**
     * Getter for DVD Price
     * @return price double
     */
    public double getDVDPrice(){
        return price;
    }
    
    @Override
    public int getStock(){
        return this.stock;
    }
    
    @Override
    public void decrementStock(){
        this.stock = stock - 1;
    }
    
    @Override
    public void incrementStock(){
        this.stock = stock + 1;
    }

    public void setStock(int newStock){
        this.stock = newStock;
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    
    /**
     * DVD Details Method
     */
    @Override
    public void details(){
        System.out.println("DVD Name: " + DVDName + " Directed by: " + Director +" Movie Length: " + DVDLength + " min(s)" +  " Genre: " + genre + " Price: $" + price +"    Stock: " + stock); 
                          
                         
                         
                         
                         
    }
}
