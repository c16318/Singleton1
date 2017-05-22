
package kadai;

/**
 *
 * アイスクリームを作るためのミキサーのコントローラー
 * 製造上の問題が起きないように、
 * Singletonに書き換える。
 * @author c16318
 */
public class IceCreamMixer {
    private boolean empty;  //ミキサーが空
    private boolean mixed;  //攪拌完了
    
    private IceCreamMixer(){
        empty = true;   //空
        mixed = false;  //未完了
    }
    
    //ミキサーを材料で満たす
    public void fill(){
        //空ならば材料で満たす
        if(empty){
            System.out.println("材料を入れる。");
        }
        
    }
    
    //ミキサーから攪拌したものを取り出す
    public void drain(){
        //空じゃなくて、攪拌済みなら取り出す
        if(!empty && mixed){
            System.out.println("取り出す。");
        }
    }
    
    //攪拌する
    public void mixer(){
        //空じゃなくて、未攪拌なら攪拌
        if(!empty && !mixed){
            System.out.println("攪拌する。");
        }
    }
    
    public boolean isEmpty(){
        return empty;
    }
    public boolean isMixed(){
        return mixed;
    }
    
    
}
