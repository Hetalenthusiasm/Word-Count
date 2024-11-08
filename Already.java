public class Already {
    private int value ;
    public void setvalue(int x)
    {
        value=x;
    }
    public int getvalue(){
        return value;
    }
}
class b{
    public static void main(String[] args) {
        Already a = new  Already();
       a.setvalue(200);
       a.getvalue();
       System.out.println(a.getvalue());

    }
}
