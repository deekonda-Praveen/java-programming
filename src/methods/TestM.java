package methods;

public class TestM {
   public static void main(String[] args) {
        Test test = new Test();
        int number=10;
        test.m1(number);
        test.m2();
        System.out.println(number);
        System.out.println("upto here call by value");
        CallByRef ref=new CallByRef();
        ref.number=39;
        System.out.println(ref.number);
        ref.m1(ref);
        System.out.println(ref.number);
        Test t=new Test();
       System.out.println(t.number);

    }
}