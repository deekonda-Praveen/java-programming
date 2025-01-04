package OOPSProgramming;

public class EncapsulationMain {
    public static void main(String[] args) {
        Encapsulation en=new Encapsulation();
        en.setAccno(92936);
        en.setName("praveen");
        en.setBalance(3433.33);
        //by using these methods we are assigning values to the variables
        System.out.println(  en.getAccno());
        System.out.println(en.getName());
        System.out.println(en.getBalance());
        //and retriveing the data from the methods i.e get methods
        //ofcourse we can assign the values direct by object but to provide privacy to the
        //variables we can assign by get and set methods
        //so this is called as encapsulation
    }
}
