package uno;
/**
 *
 * @author hayam
 */
public class UnoCard {
   
  enum Color{
    Red,Blue,Green,Yellow,Wild;
    private static final Color[] colors = Color.values();
    public Color getColor(int i){
      return colors[i];
    }
  
  }
  enum Value{
    Zero,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Draw_Two,Skip,Reverse,Wild_Four,Wild;
    private static final Value[] values = Value.values();
    public static Value getValue(int i){
      return values[i];
    }
  
  }
  
  private final Color colors;
  private final Value values;
  
  
  
  public UnoCard(final Color colors, final Value values){
    this.colors=colors;
    this.values=values;
  }
  
  public Color getColor(){
    return colors;
  }
  public Value getValue(){
    return values;
  }
  
  public String toString(){
    return colors+"_"+values;
  }
  
  
  
}
