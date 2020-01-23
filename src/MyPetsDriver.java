public class MyPetsDriver
{
    public static void main(String [] args)
    {
        Dog rex = new Dog("Rex", "German Shepherd", 2, 160.2);
        Lizard mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2);

        System.out.println(rex);
        System.out.println(mochi);
    }
}
