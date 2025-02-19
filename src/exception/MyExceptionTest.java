package exception;

public class MyExceptionTest {

    public String testMethod(){
        try{
            int a = 12;
            if( a>=10) {
                throw new Exception();
            }
            return "hello1";
        }catch (Exception e){
            return "hello2";
        }
        finally {
          //return "vinod";
        }
        //return "naveen";
    }
}
