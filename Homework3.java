/**
 * Java 1. Homework 3
 *
 * @author A. Dalakov
 * @version 24.01.22
 */
class Homework3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // task 1
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // task 3
       
        System.out.println("Task 1: ");
        doTask1(arr1); // Task 1 check
        System.out.println("\nTask 2: ");
        doTask2(100); // Task 2 check
        System.out.println("\nTask 3: ");
        doTask3(arr3); // Task 3 check
        System.out.println("\nTask 4: ");
        doTask4(); // Task 4 check
        System.out.println("\nTask 5: ");
        doTask5(5, 1); // Task 5 check
        
       }

        static void doTask1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

       static void doTask2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    //Задать массив, пройти по нему циклом, и числа меньшие 6 умножить на 2
    static void doTask3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    static void doTask4() {
        int[][] arr = {
             {1, 2, 3},
             {4, 5, 6},
             {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

   
        static void doTask5(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }
    }
