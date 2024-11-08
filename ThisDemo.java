public class ThisDemo {
    void display(){
        System.out.println("hello");
    } 
    void show(){
       this.display();
    }
    public static void main(String[] args) {
        ThisDemo use = new ThisDemo();
       use.show();
    }
}
