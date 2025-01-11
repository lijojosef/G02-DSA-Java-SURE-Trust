package Tharani_Dharan.Workout;

public class Swapping {
    public static void swap1(int[] arr){
        System.out.println("Swapping index element of 0 and 1");
        int firstValue = arr[0];
        int secondValue = arr[1];

        //Using temp
        int temp = 0;
        temp = secondValue;
        secondValue = firstValue;
        firstValue = temp;
        System.out.println("After swap : "+firstValue+" "+secondValue);
        arr[0] = firstValue;
        arr[1] = secondValue;
    }

    public static void swap2(int[] arr){
        System.out.println("Swapping index element of 2 and 3");
        int firstValue = arr[2];
        int secondValue = arr[3];

        //Using ^
        firstValue = firstValue^secondValue;
        secondValue = firstValue^secondValue;
        firstValue = firstValue^secondValue;
        System.out.println("After swap : "+firstValue+" "+secondValue);
        arr[2] = firstValue;
        arr[3] = secondValue;

    }
    public static void swap3(int[] arr){
        System.out.println("Swapping index element of 4 and 5");
        int firstValue = arr[4];
        int secondValue = arr[5];

        //Using + -
        firstValue = firstValue+secondValue;
        secondValue = firstValue-secondValue;
        firstValue = firstValue-secondValue;
        System.out.println("After swap : "+firstValue+" "+secondValue);
        arr[4] = firstValue;
        arr[5] = secondValue;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.print("Before Swapping :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        swap1(arr);
        swap2(arr);
        swap3(arr);

        System.out.print("After Swapping :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

}
