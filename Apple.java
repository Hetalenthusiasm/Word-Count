public class Apple {
    int a,b,c;
    void add(){
        a = 10 ; b = 50 ;
        c = a + b;
        System.out.println("the addition of two number is:" + c);
    }
    void subs(){
        a = 90 ; b = 50 ;
        c = a - b;
        System.out.println("the substraction of two number is :" + c);
    }
}
class B extends Apple{
    int a , b,c;
    void mul() {
        a = 20;
        b = 40;
        c = a * b;
        System.out.println("the multiplication of two number is :" + c);
    }

    void div(){
        a = 50; b = 25;
        c = a/b;
        System.out.println("the division opf two number is: " +c);
    }
}
class C extends B{
    void remender(){
        a = 20; b = 4;
        c = a%b;
        System.out.println("the remender od teo number is: " + c);
    }
}
class Test{
    public static void main(String[] args) {
        C root = new C();
        root.add(); root.div(); root.subs(); root.remender();root.mul();
    }
}
