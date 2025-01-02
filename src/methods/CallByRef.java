package methods;

public class CallByRef {
    int number;
    void m1(CallByRef call){
    call.number=call.number+10;
        System.out.println(call.number);
    }
    void  m2(){
        System.out.println(number);
    }
}
