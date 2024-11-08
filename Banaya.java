public class Banaya {
    int add(){
        int a = 10 , b = 50 , c ;
        c = a + b ;
        return c;
    }
    void add(int x , int y){
        int c;
        c = x + y ;
        System.out.println(c);
    }
    void add(int x , double y){
        double c ;
        c = x + y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Banaya r = new Banaya();
       int add= r.add();
        r.add(56, 67.89);
        r.add(6, 9);
        System.out.println(add);
    }
}
