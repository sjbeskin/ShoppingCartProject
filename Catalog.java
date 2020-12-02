import java.util.*;

public class Catalog{
  private String name;
  private ArrayList<Item> myCatalog = new ArrayList<Item>();
  
  public Catalog(String name){
    this.name = name;
  }
  
  public void add(Item toAdd){
    myCatalog.add(toAdd);
  }
  
  public Item get(int index){
    return myCatalog.get(index);
  }
  
  public int size(){
    return myCatalog.size();
  }
  
  public String getName(){
    return name;
  }
}
