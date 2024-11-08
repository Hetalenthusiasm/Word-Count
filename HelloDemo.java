public class HelloDemo {
    void m1(){
        System.out.println("hello guys");
    }
    void m2(){
        m1();
    }
    public static void main(String[] args) {
        HelloDemo use = new HelloDemo();
        use.m2();
    }
}
