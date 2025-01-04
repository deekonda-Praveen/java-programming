package methods;

public class ThisKeyword {
    int x,y;
    void setData( int x, int y){
     this.x=x;
     this.y=y;//this keyword represents the variables to the class not to the method
     System.out.println(x+y);//here this will print local variable data i.e 3+4=7
    }
    void display(){
        System.out.println(x+" and "+y);//this will print class variables data i.e.3,4
    }

    public static void main(String[] args) {
        ThisKeyword thiss =new ThisKeyword();
        thiss.setData(3,4);
        thiss.display();
    }
}
