package adresCheloveka;

import java.util.ArrayList;
import java.util.HashSet;

public class FindNeighbours{
    public static int findObjectsWithSameN(ArrayList<Human> list) {
        for(int i=0; i<list.size(); i++){
            for(int j=1; j<list.size(); j++){
                if(list.get(i).getAdress().getStreet().equals(list.get(j).getAdress().getStreet())){
                    System.out.println(list.get(i));
                    System.out.println(list.get(j));
                    return 0;

                }
            }
        }
        return 0;
    }
}
