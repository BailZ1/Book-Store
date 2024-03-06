/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefaultPackage;

/**
 *
 * @author baile
 */
public class Member {
    
    String name = "";
    int numPurchase = 0;
    
    public Member(String name){
        this.name = name;
    }
    
    public Member(String name, int numPurchase){
        this.name = name;
        this.numPurchase = numPurchase;
    }
    
    public String getMemName(){
        return this.name;
    }
    
    public void setMemName(String newName){
        this.name = newName;
    }
    
    public int setMemPurchases(){
        return this.numPurchase;
    }
    
    
}
