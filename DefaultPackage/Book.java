/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefaultPackage;

/**
 *
 * @author baile
 */
public class Book extends Product{
    
    private int pageNumbers = 0;
    private String bookName = "";
    private String author = "";
    private String genre = "";
    private double price = 0.0;
    private int stock = 0;
    
    /**
     * Book Constructor
     * @param pageNumbers int
     * @param bookName String
     * @param author String
     * @param genre String
     * @param price double
     * @param stock int
     */
    public Book(int pageNumbers, String bookName, String author, String genre, double price, int stock){
        this.pageNumbers = pageNumbers;
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }
    
    /**
     * Getter for Book Length
     * @return pageNumbers int
     */
    public int getBookLength(){
        return pageNumbers;
    }
    
    /**
     * Getter for Book Name
     * @return bookName String
     */
    @Override
    public String getName(){
        return bookName;
    }
    
    /**
     * Getter for Book Genre
     * @return genre String
     */
    public String getBookGenre(){
        return genre;
    }
    
    /**
     * Getter for Book author
     * @return author String
     */
    public String getBookAuthor(){
        return author;
    }
    
    /**
     * Getter for Book Price
     * @return price double
     */
    public double getBookPrice(){
        return price;
    }
    
    @Override
    public int getStock(){
        return stock;
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
     * Book Details Method
     */
    
    @Override
    public void details(){
        System.out.println("Book Name: " + bookName + " Written by: " + author +" Pages: " + pageNumbers + " Genre: " + genre + " Price: $" + price + "    Stock:" + stock);              
    }
    
}
