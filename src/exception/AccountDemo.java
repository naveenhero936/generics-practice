package exception;
public class AccountDemo {
    public static void show2() {
        Account account = new Account();
        try {
            account.withDraw(10);
        } catch (AccountException e) {
            Throwable cause = e.getCause();
            System.out.println(cause);
            //e.printStackTrace();

        }
    }
//    public static void show() throws IOException {
//        Exception.Account account=new Exception.Account();
//        try {
//            account.deposit(-1);
//            System.out.println("success");
//        } catch (IOException e) {
//            System.out.println("logging");
//            throw e;
//        }

    //}
}
