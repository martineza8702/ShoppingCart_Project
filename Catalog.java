import java.util.ArrayList;

public class Catalog
{
String catalog_name;
ArrayList<Item> list;
Catalog(String cs_Gift_Catalog) {

list=new ArrayList<Item>();
catalog_name=cs_Gift_Catalog;
}

String getName() {
  
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
return catalog_name;}

int size() {
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return list.size();
  
}

Item get(int i) {
  
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return list.get(i);
}

void add(Item item) {
list.add(item);
}
}