package _2_Structural_Design_Patterns._1_Adapter_Pattern._1_Daily_Code_Buffer;

import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {
   List<Item> items = new ArrayList<>();
   public void addItems(Item item) {
       items.add(item);
   }
}
