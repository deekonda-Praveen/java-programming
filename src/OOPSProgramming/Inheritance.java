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
//upto here one parent acquiring one child then single inheritance
//now i am adding new child class as class C then this will be called as multi level inheritance
class C extends B{
    //here class B is having both A and B stuff and now if we extends B then that
    //will be there inside the class C
    int c;
    void print(){
        System.out.println(c);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //just  create object for class B then use all the variable from both the classes
      /*  B bobj=new B();
        bobj.a=23;
        bobj.b=33;
        bobj.display();
        bobj.show();
        */
       C cobj=new C();
       cobj.a=100;
       cobj.b=200;
       cobj.c=300;
       cobj.display();
       cobj.show();
       cobj.print();
    }
}
