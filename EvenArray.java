//Olivia Mirly
//HW 12
//This program uses a for loop to populate an array and then display it in the console

public class EvenArray {
    public static void main(String[] args) {

        int[] nums = new int[12];

        for(int i = 1; i <= 12; i++) {
            nums[i - 1] = i * 2;
        }

        System.out.println("The contents of the array are:");
        System.out.println("Index          Value");

        for(int i = 0; i < 12; i++) {
            System.out.printf("%-17d%d\n", i, nums[i]);
        }

    }
}
