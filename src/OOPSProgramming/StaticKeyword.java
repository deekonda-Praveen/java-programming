package OOPSProgramming;

public class StaticKeyword {
    static int a=10;//this is static variable
    int b=39; //this is non-static variable
    static  void m1(){  //this is static method
        System.out.println("i am static method..");
    }
    void m2(){
        System.out.println("this is non-static method");
    }
    void m3(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
       // m3();
//we can access everything from the non-tatic method
    }

    public static void main(String[] args) {
        //we can access static stuff directly without any object creation
        System.out.println(a);
        m1();  //see non-static method is directly called without any object from the static method
            StaticKeyword st=new StaticKeyword();
            st.m2();
        System.out.println("now see the below stemnts");
            st.m3();



    }


}
