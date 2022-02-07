package package0118;

abstract class superteams {
    abstract void wieght();

    public void clothes_color(){
        System.out.println("衣服紅色");
    }

}
class Dad extends superteams{
    @Override
    public void wieght(){
        System.out.println("64KG");
    }
}
class Mom extends superteams{
    @Override
    void wieght() {
        System.out.println("48kg");
    }
}
public class superteam{
    public static void main(String[] args) {
        Dad Bob = new Dad();
        Mom Merry = new Mom();
        Bob.wieght();
        Bob.clothes_color();
        System.out.println("====================");
        Merry.wieght();
        Merry.clothes_color();
    }
}