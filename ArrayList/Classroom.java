import java.util.ArrayList;

public class Classroom {

    public static void arrlist(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(" ");
        for(int i=0 ; i<list1.size();i++){
            System.out.println(list1.get(i));
           
        }


    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get opertaion O(1)

        int element = list.get(3);
        System.out.println(element);

        // remove element
        // list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(2, 10);
        System.out.println(list);

        // contain a elements

        System.out.println(list.contains(3));
        System.out.println(list.contains(11));

        System.out.println(list.size());




        arrlist();
    }
}