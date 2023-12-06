package adresCheloveka;

import java.util.ArrayList;
import java.util.List;

public class FindUser{
    static void byBirthDate(List<Human> objects, int birthDate) {
        for (Human obj : objects) {
            if(obj.getBirthDate() == birthDate){
                System.out.println("самый старший: " + obj.toString());
            }
        }
    }
}
