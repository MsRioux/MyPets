public class MyPetsDriver
{
    public static void main(String [] args)
    {
        Dog rex = new Dog("Rex", "German Shepherd", 2, 160.2);
        Lizard mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2);
        Bird donald = new Bird("Duck", "Donald", 85, 1.13, "white", 5000);
        //Pet secret = new Pet("Secret", 7, 40.2); Pet is an abstract class and cannot be instantiated.
        
        System.out.println(rex);
        System.out.println(mochi);
        System.out.println(donald);
    }
}
