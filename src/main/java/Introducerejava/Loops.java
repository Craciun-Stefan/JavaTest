package Introducerejava;

public class Loops {
    public static void main(String[] args) {
        /* Loops:
            - For loop
            - While loops
            - Do While loops
            - For-Each loops
        */

        //1. For loop:
       /* for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //using break:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }*/
        //using continue:
        int n1= 2;
        for (int i2 = 1; i2 <= 20; i2++){
            if(i2 == n1) {
                n1 +=2;
                continue;
            }
            System.out.println(i2);

        }
        // 2. While loop:
        int wl = 0;

        while(wl < 5) {
            System.out.println(wl);
            wl++;
        }
        /*
        When to use a WHILE loop:
            - Use a while loop when you need to execute the loop body repeatedly until a condition is met.
            - Use a while loop when you need to check the condition before executing the loop body.
        */
        //3. Do While loop: body-ul buclei se executa cel putin odata pana la verificarea conditiei
        /*
        When to use a DO WHILE loop:
            - Use a do while loop when you need to execute the loop body at least once.
            - Use a do while loop when you need to check the condition after executing the loop body.
       int i = 0;
        do {
            System.out.println("Value of i is " + i);
            i++;
        }
        while (i < 5);  */
        String [] progLang = {"C++", "Java", "Python"};
       // for(int i2 = 0; i2 < progLang.length; i2++)
         //   System.out.println(progLang[i2]);
        for (String prog : progLang){
            System.out.println(prog);
        }
        //5. Print a multi-dimensional array - nested loop ex
        char[][] matrix1 = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        /*
        for (int i3 = 0; i3 < matrix1.length; i3++){
            System.out.println(matrix1[i3][i3]); printeaza doar diagonala
        }*/
        for (int i4 = 0; i4 < matrix1.length; i4++) {
            for( int j1 = 0; j1 < matrix1.length; j1++){
                System.out.println(matrix1[i4][j1]);
            }
        }
    }

}
