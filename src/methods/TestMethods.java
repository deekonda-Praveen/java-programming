package methods;

public class TestMethods {

        int a=22,b=44;
        int sum;//without return type and without argument
        void m1(){
            System.out.println(sum=a+b);
        }
        //with return type and without argument
     int m2() {
            return sum=a+b;
     }
     //with argument without return
    void m3(String name){
        System.out.println(name);

    }
   // with argument and retrun type
  String m4(){
            return "ke";
  }




}
