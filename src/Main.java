//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println();
        double [] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println();
        int [] array3 = {100, 200, 300, 400, 500};
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        //Task 2
        System.out.println();
        System.out.println("Task 2");
        for (int i = 0; i < array1.length; i++) {
          if(i < array1.length-1) {
              System.out.print(array1[i] + ", ");
          } else System.out.print(array1[i] + "");
          }

        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            if(i < array2.length-1) {
                System.out.print(array2[i] + ", ");
            } else System.out.print(array2[i] + "");
        }

        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            if(i < array3.length-1) {
                System.out.print(array3[i] + ", ");
            } else System.out.print(array3[i] + "");
        }

        //Task 3
        System.out.println();
        System.out.println();
        System.out.println("Task 3");
        for (int i = array1.length - 1; i >=0; i--) {
            if(i != 0) {
                System.out.print(array1[i] + ", ");
            } else System.out.print(array1[i] + "");
        }

        System.out.println();
        for (int i = array2.length - 1; i >=0; i--) {
            if(i != 0) {
                System.out.print(array2[i] + ", ");
            } else System.out.print(array2[i] + "");
        }

        System.out.println();
        for (int i = array3.length - 1; i >=0; i--) {
            if(i != 0) {
                System.out.print(array3[i] + ", ");
            } else System.out.print(array3[i] + "");
        }

        //Task 4
        System.out.println();
        System.out.println();
        System.out.println("Task 4");
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] % 2 != 0){
                array1[i] = array1[i] + 1;
            }
            System.out.println(array1[i]);
        }

    }
}