package List;

import java.util.Arrays;
import java.util.Scanner;

public class Implementation_Using_Array {

    int [] arr = new int[10];
    int size;

    public int Size(int [] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                size++;
            }
        }
        return size;
    }

    public void display(int [] arr){
        /*for (int i : arr){
            System.out.print(i + " ");
        }*/
        System.out.println(Arrays.toString(arr));
    }
    public int [] insertFirst(int [] arr , int value){

        if (size == arr.length){
            int [] arrNew = new int[arr.length * 2];
            System.arraycopy(arr , 0 , arrNew , 0 , arr.length);
            arr = arrNew;
        }
        for (int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
        size++;
        return arr;
    }

    public int [] insertLast(int [] arr , int value){
        if (size == arr.length){
            int [] arrNew = new int[arr.length * 2];
            System.arraycopy(arr , 0 , arrNew , 0 , arr.length);
            arr = arrNew;
        }

        arr[size] = value;
        size++;
        return arr;
    }

    public int[] insertAtPosition(int [] arr , int position , int value){

        if (size == arr.length){
            int [] arrNew = new int[arr.length * 2];
            System.arraycopy(arr , 0 , arrNew , 0 , arr.length);
            arr = arrNew;
        }

        for (int i = arr.length-1; i > position; i--){
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
        size++;
        return arr;
    }

    public int [] deleteFirst(int [] arr){

        if (size == 0){
            return null;
        }
        for (int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
        return arr;
    }

    public int[] deleteLast(int [] arr){

        arr[size] = 0;
        size--;
        return arr;
    }

    public int [] deleteAtPosition(int [] arr , int position){

        if (size == 0){
            return null;
        }

        for (int i = position; i < arr.length-1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
        return arr;
    }

    public boolean search (int [] arr , int key){
        for (int i : arr){
            if (i == key){
                return true;
            }
        }
        return false;
    }

    public void operations(){
        System.out.println("The operations to be performed are:");

        System.out.println("Enter 1 to display List");

        System.out.println("Enter 2 to add element at start in List");
        System.out.println("Enter 3 to add element at end in List");
        System.out.println("Enter 4 to add element at specific position in List");

        System.out.println("Enter 5 to remove element from start in List");
        System.out.println("Enter 6 to remove element from end in List");
        System.out.println("Enter 7 to remove element from specific position in List");

        System.out.println("Enter 8 to display list");

        System.out.println("Enter 9 to exit from List");
    }

    public static void main(String[] args) {

        Implementation_Using_Array i = new Implementation_Using_Array();
        Scanner sc = new Scanner(System.in);

        int [] arrModified = new int[10];
        int num;

        i.operations();

        int op = sc.nextInt();

        while (op != 9){

            switch (op){
                case 1:
                    i.display(i.arr);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 2:
                    System.out.println("Enter the number you want to insert");
                    num = sc.nextInt();

                    i.insertFirst(i.arr , num);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 3:
                    System.out.println("Enter the number you want to insert");
                    num = sc.nextInt();

                    i.insertLast(i.arr , num);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 4:
                    System.out.println("Enter the number you want to insert");
                    num = sc.nextInt();

                    System.out.println("Enter the position at which you want to insert the number");
                    int position = sc.nextInt();

                    i.insertAtPosition(i.arr , position , num);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 5:
                    i.deleteFirst(i.arr);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 6:
                    i.deleteLast(i.arr);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 7:
                    System.out.println("Enter the position at which you want to delete number");
                    position = sc.nextInt();

                    i.deleteAtPosition(i.arr , position);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 8:
                    System.out.println("Enter the number you want to search");
                    int key = sc.nextInt();

                    i.search(i.arr , key);

                    i.operations();
                    op = sc.nextInt();

                    break;

                case 9:
                    break;

                default:
                    System.out.println("Enter valid number to perform operations");
                    System.out.println();

                    i.operations();
                    op = sc.nextInt();

                    break;
            }
        }
    }
}
