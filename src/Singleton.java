/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class Singleton {
    private static Singleton singleton =  new Singleton();
    
    private Singleton(){
        System.out.println("インスタンスを生成しました。");
    }
    
    public static Singleton getInstance(){
        return singleton;
    }
}
