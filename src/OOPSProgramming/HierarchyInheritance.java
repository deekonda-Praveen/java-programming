package OOPSProgramming;
class Parent{
    void display(int a){
        System.out.println(a);
    }
}
class child1 extends Parent{
    void print(int b){
        System.out.println(b);
    }
}
class child2 extends Parent{
    void show(int c){
        System.out.println(c);
    }
}
public class HierarchyInheritance {
    public static void main(String[] args) {
//here if we create object for child1 then we can access both child1 and parent
        child1 c1=new child1();
        c1.print(19);
        c1.display(33);

        child2 c2=new child2();
        c2.show(33);
        c2.display(44);  //here display is comman because in this hierarchy we have many childs
    }
}
