package smyk;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
GenericClass<ArrayList<Object>> group1= new GenericClass<>(list1);
        // добавляем в первую группу
        group1.add(1);//пример добавления
        group1.add(2);
        group1.add(8);
        group1.remove(2);//пример удаления
        group1.add(6);
        group1.add(3);
        System.out.println("Индекс 3 Элемента:" + group1.get(3));
        List<Object> group2 = parity(group1.getGroup());
        System.out.println(group2);
    }
    public static ArrayList<Object> parity(ArrayList<Object> list){
        for(int i = 0; i< list.size();i++)
            //начинаем перебирать элементы первого массива
                if(i %2!=0)
                    list.remove(i);
        return list;
        }
}
