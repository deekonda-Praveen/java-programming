package methods;

public class OverLoad {
    //conecpt is polymorphism can be achieved
    // through method or constructor overloading
    //see the method overloading
    int a=1,b=2;
    void add(){
        System.out.println(a+" ,"+b);
    }
    void add(int a,int b){
     int  c=a+b;
        System.out.println(c);
    }
//one same method in many forms-called polymorphism
}
