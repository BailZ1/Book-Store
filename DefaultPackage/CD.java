/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefaultPackage;

/**
 *
 * @author baile
 */
public class CD extends Product{
    
    private int cdLength = 0;
    private String cdName = "";
    private String artist = "";
    private String genre = "";
    private double price = 0.0;
    private int stock = 0;
    
    /**
     * CD Constructor
     * @param cdLength int
     * @param cdName String
     * @param genre String
     * @param artist String
     * @param price double
     * @param stock int
     */
    public CD(int cdLength, String cdName, String genre, String artist, double price, int stock){
        this.cdLength = cdLength;
        this.cdName = cdName;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }
    
    /**
     * Getter for CD Length
     * @return cdLength int
     */
    public int getCDLength(){
        return cdLength;
    }
    
    /**
     * Getter for CD Name
     * @return cdName String
     */
    @Override
    public String getName(){
        return cdName;
    }
    
    /**
     * Getter for CD Genre
     * @return genre String
     */
    public String getCDGenre(){
        return genre;
    }
    
    /**
     * Getter for CD Artist
     * @return artist String
     */
    public String getCDArtist(){
        return artist;
    }
    
    /**
     * Getter for CD Price
     * @return price double
     */
    public double getCDPrice(){
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
     * CD Details Method
     */
    @Override
    public void details(){
        System.out.println("CD Name: " + cdName + " Written by: " + artist +" Song Length: " + cdLength + " min(s)" + " Genre: " + genre +" Price: $" + price + "    Stock: " + stock);                 
    }
    
    
    
}
