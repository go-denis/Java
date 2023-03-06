package ArrayPush;
/*
3. Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class Main {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;

        int []mass = moveElement(nums, val);
        for (int i: mass
             ) {
            System.out.print(i + " ");
        }

    }
    static int[] swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    static int[] moveElement(int []arr, int toMove){

        int i = 0;

        int j = arr.length - 1;

        while (i < j)
        {
            while (i < j && arr[j] == toMove)

                j--;

            if (arr[i] == toMove)

                swap(arr, i, j);

            i++;
        }

        return arr;
    }


}
