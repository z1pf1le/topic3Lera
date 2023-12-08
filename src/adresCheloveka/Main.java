package adresCheloveka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Adress adress1 = new Adress(1, "Vladimir", "Lenina", 3);
        Adress adress2 = new Adress(2, "Suzdal", "Pushkina", 3);
        Adress adress3 = new Adress(3, "Pokrov", "Lermontova", 42);
        Adress adress4 = new Adress(4, "Moscow", "Shevchenko", 24);
        Adress adress5 = new Adress(1, "Vladimir", "Lenina", 5);

        Human human1 = new Human("Ivan", "Petrov", 1979, adress1);
        Human human2 = new Human("Petr", "Ivanov", 1978, adress2);
        Human human3 = new Human("Maria", "Petrenko", 1990, adress3);
        Human human4 = new Human("Ad", "Gain", 1991, adress4);
        Human human5 = new Human("Vladimir", "Lenin", 1850, adress5);

        ArrayList<Human> list = new ArrayList<>(Arrays.asList(human1, human2, human3, human4, human5));

        //поиск человека по фамилии
        for (Human element : list)
            if(element.getSecondName()=="Petrenko")
                System.out.print(element.toString());

        //поиск человека по атрибуту адреса
        for (Human element : list)
            if(element.getAdress().flat==3)
                System.out.print(element.toString());

        //вывести людей, родившихся между определенными датами
        for (Human element : list)
            if((element.getBirthDate()>1970)&(element.getBirthDate()<1980))
                System.out.print(element.toString());

        //необходимо создать сет объектов, для поиска одного значения

//        //найти дату рождения самого старого
        System.out.println("самый старший: ");
        int eldersAge = FindElderOrYounger.findMaxNObject(list);
//        //поиск самого старого по д/р
        FindUser.byBirthDate(list, eldersAge);
//
//        //найти дату рождения самого старого
        System.out.println("самый молодой: ");
        int youngersAge = FindElderOrYounger.findMaxFieldValue(list);
//        //поиск самого старого по д/р
        FindUser.byBirthDate(list, youngersAge);

        //нахожу соселей
        System.out.println("соседи по улице: ");
        //метод находит совпадение улиц
        FindNeighbours.findObjectsWithSameN(list);

    }
}
