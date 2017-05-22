

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
