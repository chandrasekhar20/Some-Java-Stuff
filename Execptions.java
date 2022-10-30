public class Execptions {
    public static void main(String[] args) {
//        try {
//            int a[] = new int[2];
//            System.out.println(a[5]);
//        }catch (Exception e){
//            System.out.println("Index range is out of bound");
//        }
        int c = div(6,0);
        System.out.println(c);
    }
    public static int div(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Number cant be divide by ZERO");
        }else return a/b;
    }
}
