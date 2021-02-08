package domain;

import java.util.ArrayList;
import java.util.List;

public class Coke extends CanDrinks {
    
   public static List<String> getAll() {
        List<String> lstAll = Drinks.getAll();
        
        List<String> cokeLst = new ArrayList();
        for (String elem : lstAll) {
            //filter the coke records
            String[] split = elem.split("\\|");
            if ( split[1].equalsIgnoreCase("coke") ) {
                cokeLst.add(elem);
            }
        }
        return cokeLst;
    }
    
    public static void main(String[] args) {
       // System.out.println( new Coke().getAll() );
        Coke newDrinks = new Coke();
//        newDrinks.setId(4);
//        newDrinks.setName("CokeLessSugar");
//        newDrinks.setQuantity("100");
//        newDrinks.setSupplier("APUCompany");
//        newDrinks.setSlogan("low sugar drinks");
//        newDrinks.addNew();

        newDrinks.setId(4);
        newDrinks.setName("CokeMoreSugar");
        newDrinks.setQuantity("200");
        newDrinks.setSupplier("APUCompany");
        newDrinks.setSlogan("More sugar is energized");
        newDrinks.edit();

        
    }
    
}
