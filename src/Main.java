import exception.MyExceptionTest;

public class Main {
    public static void main(String[] args) {
      /*  GenericList<Integer> list = new GenericList<>();
        list.add(1);
        int number=list.get(0)*/
        MyExceptionTest test =new MyExceptionTest();

        System.out.println(test.testMethod());
    }
}