import java.util.HashMap;
import java.util.Map;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    public Person(String paramsName, String paramsAddress){
        name = paramsName;
        address = paramsAddress;
    }

    public Person(String ParamsName){
        this(ParamsName, null);
    }

    public static Map Permission(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "demo");
        map.put("fname", "fdemo");
        return map;
    }

    public void sayHello(String paramsName){
        System.out.println("Hello "+paramsName+", My name is "+ name);
        System.out.printf(name + " address code at " + address);
    }

    public void bitwise(){
        System.out.println("1 & 1 => " + (1 & 1));
        System.out.println("1 & 2 => " + (1 & 2));
        System.out.println("1 & 3 => " + (1 & 3));
        System.out.println("1 & 4 => " + (1 & 4));
        System.out.println("1 & 5 => " + (1 & 5));
        System.out.println("1 & 6 => " + (1 & 6));
        System.out.println("1 & 7 => " + (1 & 7));
        System.out.println("===========================================================");

        System.out.println("2 & 1 => " + (2 & 1));
        System.out.println("2 & 2 => " + (2 & 2));
        System.out.println("2 & 3 => " + (2 & 3));
        System.out.println("2 & 4 => " + (2 & 4));
        System.out.println("2 & 5 => " + (2 & 5));
        System.out.println("2 & 6 => " + (2 & 6));
        System.out.println("2 & 7 => " + (2 & 7));
        System.out.println("===========================================================");

        System.out.println("4 & 1 => " + (4 & 1));
        System.out.println("4 & 2 => " + (4 & 2));
        System.out.println("4 & 3 => " + (4 & 3));
        System.out.println("4 & 4 => " + (4 & 4));
        System.out.println("4 & 5 => " + (4 & 5));
        System.out.println("4 & 6 => " + (4 & 6));
        System.out.println("4 & 7 => " + (4 & 7));
    }
}
