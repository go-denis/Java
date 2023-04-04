package Semi3;

public class Generic{

    public static void main(String[] args){

        GenericDef<Integer> test = (n,m)->(n % m == 0);

        if(test.gen(10, 5)){
            System.out.println("sdfjsdfhsj");
        }

    }

}
