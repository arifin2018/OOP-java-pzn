public class Main {
    public static void main(String[] args) {
//        Person Person = new Person("arifin", "a");
//        Person Person2 = new Person("Azriel");
//
//
//        Person.sayHello("azriel");
//        System.out.println();
//        System.out.println("=====================================================================================");
//        Person2.sayHello("Arifin");

        /*
        inheritance
         */
        Manager manager = new Manager();
        manager.name = "Nur Arifin";
        manager.sayHello("MJ");

        VicePresident VP = new VicePresident();
        System.out.println(VP.trueFalse(false));





    }
}