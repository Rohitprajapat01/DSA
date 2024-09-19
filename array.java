// public class array {
//     public static void main (String[] args){
//             int a[] = {1,2,3,4,5};
        
//             findMax(a);
//             }
// }


// Program to find minumum number in an array ...?
// public class array {
// int findMin(int arr[]){
//     int MIN = 100;
//     for(int i=0;i<arr.length;i++) {
//            int temp = arr[i];
//            if(temp<MIN){
//             MIN = temp;
//            }
//     }
//     return MIN;
// }

// public static void main(String[] args){
//     int arr[] = {12,43,54,1,77,65,78,65,34,90};
//     array a =  new array();
//     int min = a.findMin(arr);
//     System.out.println("min =" +min);
// }}


// Program to find maximum number in an array ...?
// public class array {
//     int findMax(int arr[]){
//         int MAX = 0;
//         for(int i=0;i<arr.length;i++) {
//                int temp = arr[i];
//                if(temp>MAX){
//                 MAX = temp;
//                }
//         }
//         return MAX;
//     }
    
//     public static void main(String[] args){
//         int arr[] = {12,43,54,1,77,65,78,65,34,90};
//         array a =  new array();
//         int max = a.findMax(arr);
//         System.out.println("min =" +max);
//     }}


//Program to find the sum of all elements in an array..?
// public class array {  
//     public static void main(String[] args) {  
//         int [] arr = new int [] {1, 2, 3, 4, 5};  
//         int sum = 0;    
//         for (int i = 0; i < arr.length; i++) {  
//            sum = sum + arr[i];  
//         }  
//         System.out.println("Sum of all the elements of an array: " + sum);  
//     }  
// }


//Program to find the reverse of an array...?
// public class array {  
//     public static void main(String[] args) {  
//         int [] arr = new int [] {1, 24, 30, 40, 58};  
//         System.out.println("Original array: ");  
//         for (int i = 0; i < arr.length; i++) {  
//             System.out.print(arr[i] + " ");  
//         }  
//         System.out.println();  
//         System.out.println("Array in reverse order: ");  
//         for (int i = arr.length-1; i >= 0; i--) {  
//             System.out.print(arr[i] + " ");  
//         }  
//     }  
// }


//Progrm to find the sum of array elements taking input by user...?
// import java.util.Arrays;
// import java.util.Scanner;
// public class array {
//    public static void main(String args[]){
//       System.out.println("Enter the size of the array : ");
//       Scanner s = new Scanner(System.in);
//       int size = s.nextInt();
//       int myArray[] = new int [size];
//       int sum = 0;
//       System.out.println("Enter the elements of the array ");

//       for(int i=0; i<size; i++){
//          myArray[i] = s.nextInt();
//          sum = sum + myArray[i];
//       }
//       System.out.println("Elements of the array are: "+Arrays.toString(myArray));
//       System.out.println("Sum of the elements of the array :"+sum);
//    }
// }


//Program
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}




