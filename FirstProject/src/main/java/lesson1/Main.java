package lesson1;

//import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int count = 0;
        int maxOne = 0;

        for(int i : arr){
            if(arr[i] == 1){
                count++;
                if(maxOne < count)
                {
                    maxOne = count;
                }

            } else{
                count = 0;
            }


        }
        System.out.println(maxOne);
    }

    /*
    private static void printHelloWorld() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово: ");
        String aa = sc.nextLine();

        System.out.println("Hello world! " + aa);
    }

     */



}
