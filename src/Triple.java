
/**
 *
 * @author c16318
 */
public class Triple {
    private static Triple[] triple = new Triple[]{
        new Triple(0),
        new Triple(1),
        new Triple(2)
    };
    private int id;
    
    
    
    private Triple(int id){
       System.out.println();
        System.out.println("インスタンスを生成しました:" + id);
        this.id = id;
    }
    
    public static Triple getInstance(int id){
        return triple[id];
    }
    
    public String toString(){
        return "[triple id = " + id + "]";
    }
    
}
