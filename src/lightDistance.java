//program liczy ile kilometrów przebędzie światło przez określoną ilość dni..
//aaa generalnie mam sie nauczyć korzystania z longa
public class lightDistance {
    public static void main(String args[])
    {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed=299792; // przyblizona prędkość światła w km/s
        days=1000;  //jakas liczba dni
        seconds=days*24*60*60; //zamieniamy dni na sekundy
        distance=lightspeed * seconds;

        System.out.print("W "+ days);
        System.out.println(" dni światło przebędzie: ");
        System.out.println(distance + " kilometrów");
    }
}
