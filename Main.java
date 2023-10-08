public class Main{
    public static void main(String[] args) {
        for(int r = 1; r <= 3; r++){
            Runner RunNum = new Runner("Thread #: "+ r);
            System.out.println("Thread made!");
            RunNum.start();
        }

    }
}
