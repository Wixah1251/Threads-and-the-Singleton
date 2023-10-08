public class Runner extends Thread {
    public String ThreadNum;

    public Runner(String ThreadName) {
        super(ThreadName);
        ThreadNum = getName();
    }

    public void run() {
        try {
            System.out.println(ThreadNum.hashCode());

        } catch (Exception e) {
            System.out.println("This doesn't work!");
        }
    }
}
