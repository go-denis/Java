package Main;
//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Main {
    public static void main(String[] args){
        int[] arr = {234,5345,33,445,234,1,555,4533};

        int maxNum = 0;
        int minNum = 0;

        for (int i: arr) {
            if(i > maxNum || maxNum == 0){
                maxNum = i;
            }
            if (i < minNum || minNum == 0){
                minNum = i;
            }
        }

        System.out.println("Максимальное число в массиве = "+ maxNum + "; Минимальный элемент = "+minNum);

    }
}
