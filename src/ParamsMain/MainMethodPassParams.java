package ParamsMain;

public class MainMethodPassParams {


   public  static void main(){
       System.out.println(" i am also a main method-main method overloading");
   }
    //we can pass the values to the main method also but on run rime
    //here main method is accepting the values of string array
    public static void main(String[] args) {
        for(String s:args){
            System.out.print(s+" ");
           // System.out.print(" ");
        }System.out.println();
        System.out.println("length of the string="+args.length);

        MainMethodPassParams par=new MainMethodPassParams();
        par.main();
    }
}
