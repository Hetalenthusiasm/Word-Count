public class Test {
    int i ;
    void setValue( int i){
        i=i;
    }
    void show(){
      this.i=i;
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.setValue(40);
       t.show();
    }
}
