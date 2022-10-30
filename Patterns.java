package allClasses;

public class Patterns {
    public static void main(String[] args) {
       // pattern1();
       // pattern2();
       // pattern3(4);
       // pattern4();
        pattern5(5);
    }

    public static void pattern1(){
        for(int i = 0; i < 5; i++){         // * * * * *
            for(int j = 0; j < 4; j++){     // * * * * *
                System.out.print("* ");     // * * * * *
            }                               // * * * * *
            System.out.println("*");        // * * * * *
        }
    }

    public static void pattern2(){
        for(int i = 0; i < 5; i++){          // *
            for(int j = 0; j < i; j++){      // * *
                System.out.print("* ");      // * * *
            }                                // * * * *
            System.out.println("*");         // * * * * *
        }
    }

    public static void pattern3(int n){
        for (int i = 0; i < 5; i++){         // * * * * *
            for(int j = 0; j < n; j++){      // * * * *
                System.out.print("* ");      // * * *
            }                                // * *
            n = n - 1;                       // *
            System.out.println("*");
        }
    }
    public static void pattern4(){
        for(int i = 1; i <= 5; i++){         // 1
            for (int j = 1; j < i; j++){     // 1 2
                System.out.print(j + " ");   // 1 2 3
            }                                // 1 2 3 4
            System.out.println(i);           // 1 2 3 4 5
        }
    }

    public static void pattern5(int size){
        for(int i = 0; i < size; i++){             //     *
            for (int j = 0; j < size-i-1; j++){    //    ***
                System.out.print(" ");             //   *****
            }                                      //  *******
            for (int k = 0; k < 2*i+ 1; k++){      // *********
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
