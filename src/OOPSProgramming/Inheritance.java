package OOPSProgramming;
class A{
    int a;
    void display(){
        System.out.println(a);
    }
}
//i am using extends keywords to acquire variables and methods from parent class to child calss
//from class A to class B
class B extends A{
    int b;
    void show(){
        System.out.println(b);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //just  create object for class B then use all the variable from both the classes
        B bobj=new B();
        bobj.a=23;
        bobj.b=33;
        bobj.display();
        bobj.show();
    }
}
