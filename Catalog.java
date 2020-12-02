import java.util.*;

public class Catalog{
  private String name;
  private ArrayList<Item> myCatalog = new ArrayList<Item>();
  
  //constructor
  public Catalog(String name){
    this.name = name;
  }
  
  //add Item to catalog
  public void add(Item toAdd){ 
    myCatalog.add(toAdd);
  }
  
  //return the index of a given item
  public Item get(int index){
    return myCatalog.get(index);
  }
  
  //return catalog size
  public int size(){ 
    return myCatalog.size();
  }
  
  //return catalog name
  public String getName(){
    return name;
  }
}
