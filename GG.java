package ASD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GG {
     static Map<String,House> map=new HashMap<>();

    public static void main(String[] args) {
        boolean heh=true;
         Scanner in=new Scanner(System.in);
        while (heh) {
            System.out.println("for Add operation - a ");
            System.out.println("for Delete operation - d ");
            System.out.println("for Search operation - s ");
            System.out.println("for Show all operation - sa ");
            System.out.println("for End session - e ");
            String app = in.next();
            switch (app){
                case "a":
                    System.out.println(" write name of House:");
                    String name = in.next();
                    System.out.println("write sigil of house:");
                    String sigil = in.next();
                    map.put(name, new House(name, sigil));
                    System.out.println("House " + name + " added ");
                    break;
                case "d":
                    System.out.println("write name of House to remove from Database:");
                    String ntr = in.next();
                    if (map.containsKey(ntr)) {
                        map.remove(ntr);
                        System.out.println("House " + ntr + " removed from our Database.");
                    } else {
                        System.out.println("House " + ntr + " was not in our Database.");
                    }
                    break;
                case "s":
                    System.out.println("write name of House for searching:");
                    String find = in.next();
                    if (map.containsKey(find)) {
                        System.out.println("Sigil of House " + find + ": " + map.get(find).getSigil());
                    } else {
                        System.out.println("House " + find + " was not in our Database.");
                    }
                    break;
                case "sa":
                    for (House house : map.values()) {
                        System.out.println(house.getName() + ": " + house.getSigil());
                    }
                    break;
                case "e": heh=false;
            }


        }
    }
    public static void All(){

        System.out.println("All houses of Vesteros"+map);
    }



}
class House{
     String name;
     String sigil;

    public House(String name, String sigil) {
        this.name = name;
        this.sigil = sigil;
    }

    public String getName() {
        return name;
    }

    public String getSigil() {
        return sigil;
    }

}