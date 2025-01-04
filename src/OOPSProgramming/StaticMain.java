package OOPSProgramming;

public class StaticMain {
    public static void main(String[] args) {
        //if the static stuff is there in any other class then this will class will
        //not recongnize directly
        //so we can access the static variables and methods through class name
        System.out.println(StaticKeyword.a);
        StaticKeyword.m1();
        //anyway if that is not a static variable or method then we can direclty call throgh object


    }
}
