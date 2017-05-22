/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        /*System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("obj1とobj2は同じインスタンスです");
        }
        else{
            System.out.println("obj1とobj2は同じインスタンスではありません");
        }
        System.out.println("End.");
        */
        
        //ticket
       /* TiketMaker maker = TiketMaker.getTiketMaker();
        
        for(int i = 0;i < 10;i++){
            System.out.println(maker.getNextTicketNumber());
        }
*/  
       
       for(int i = 0;i < 3;i++){
           Triple triple = Triple.getInstance(i);
           
           System.out.println(i +";" + triple);
       }
        
       
    }
}
