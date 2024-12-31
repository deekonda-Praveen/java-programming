package methods;

public class constructor {
    int id;
    String name;
    Character grade;
    void printData(){
        System.out.println(id+" "+name+" "+ grade);
    }
    void setData(int ids,String nam,Character c){
        int id=ids;
        String name=nam;
        Character grade=c;
        System.out.println(id+" "+name+" "+" "+grade);
    }
  constructor(int ids,String na,Character cc){
    this.id =ids;
       this.  name=na;
        this. grade=cc;
  }
}
