public class TestDog {
    public static void main(String[] args)
    {
        Dog d1 = new Dog ("Michael",4);
        Dog d2 = new Dog ("Sonny",6);
        Dog d3 = new Dog ("Vito", 9);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("\n");
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
