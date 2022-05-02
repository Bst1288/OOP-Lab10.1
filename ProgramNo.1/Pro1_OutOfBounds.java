import java.util.Scanner;
public class Pro1_OutOfBounds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = getArray();

        System.out.println("-----------------------------------------");
        System.out.print("Enter index of array : ");
        try{
            System.out.println("the corresponding element value : "+array[input.nextInt()]);
            System.out.println("-----------------------------------------");
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
            System.out.println("-----------------------------------------");
        }
        input.close();
    }

    //returns array with 100 randdom
    public static int[] getArray(){
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }
}
