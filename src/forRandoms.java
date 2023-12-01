public class forRandoms {
    public static void main(String[]args){
        for (int x = 1; x <=100 ; x++) {
            System.out.print((int)(500 * Math.random() + 1) + "\t");
            if (x % 10 == 0) {
            System.out.println();
            }
        }
    }
}
