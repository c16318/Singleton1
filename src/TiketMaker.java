/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class TiketMaker {
    private static TiketMaker maker;
    private int tiketNumber = 1000;
    
    private TiketMaker(){
        System.out.println("ticketMakerを生成しました");
    }
    public static TiketMaker getTiketMaker(){
        if(maker == null){
            maker = new TiketMaker();
        }
        return maker;
    }
    
    public synchronized int getNextTicketNumber(){
        return tiketNumber++;
    }
}
