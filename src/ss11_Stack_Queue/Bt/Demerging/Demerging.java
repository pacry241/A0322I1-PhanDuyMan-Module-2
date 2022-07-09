package ss11_Stack_Queue.Bt.Demerging;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Person[] person = new Person[10];
        person[0]= new Person("Nguyen Van A",true,"1/1/2000");
        person[1]= new Person("Nguyen Van B",false,"2/2/2000");
        person[2]= new Person("Nguyen Van C",true,"3/3/2000");
        person[3]= new Person("Nguyen Van D",false,"4/4/2000");
        person[4]= new Person("Nguyen Van E",true,"5/5/2000");
        person[5]= new Person("Nguyen Van F",false,"6/6/2000");
        person[6]= new Person("Nguyen Van G",true,"7/7/2000");
        person[7]= new Person("Nguyen Van H",false,"8/8/2000");
        person[8]= new Person("Nguyen Van I",true,"9/9/2000");
        person[9]= new Person("Nguyen Van K",false,"10/10/2000");


        Queue<Person> Men = new LinkedList<>();
        Queue<Person> Women = new LinkedList<>();
        System.out.println("Before sort: ");


        for (Person value : person){
            System.out.println(value.toString());
            System.out.println("--------");
            if (value.isGioiTinh()){
                Men.add(value);
            }else {
                Women.add(value);
            }
        }
        String output = "";

        while (!Women.isEmpty()){
            output += Women.poll().toString() +"\n";

        }

        while (!Men.isEmpty()){
            output += Men.poll().toString()+"\n";

        }

        System.out.println("After sort: ");
        System.out.println(output);
    }
}
