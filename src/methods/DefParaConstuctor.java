package methods;

public class DefParaConstuctor {
    int x,y;
    //default constructor
    DefParaConstuctor(){
         x=23;
         y=44;
    }
    //parameterized constructor
    DefParaConstuctor(int a,int b){
         x=a;
        y=b;
    }
    void sum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
//        DefParaConstuctor def=new DefParaConstuctor();
//        def.sum();
        DefParaConstuctor def1=new DefParaConstuctor(44,55);
        def1.sum();

    }



}
