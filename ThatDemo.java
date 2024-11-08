public class ThatDemo {
    ThatDemo(){
        System.out.println("no arguments constructor");
    }
    ThatDemo(int a){
        System.out.println("args cunstructor");
    
    }
    public static void main(String[] args) {
        ThatDemo td = new ThatDemo(6);
        
    }
}
