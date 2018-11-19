public class IfSample {
    public static void main(String args[]){

        int x,y;
        x=10;
        y=20;
        if(x<y) System.out.println("x jest mniejsze od y");
        x=x*2;
        if(x==y)System.out.println("teraz x jest równe y");
        x=x*2;
        if(x>y)System.out.println("teraz x jest wieksze od y");

        //poniższy warunek nie będzie spełniony
        if(x==y)System.out.println("to sie nie wyświetli");
    }
}
