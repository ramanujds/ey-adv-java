public class Looping {

    public static void main(String[] args) {

        // while loop

        // int i = 10;
        // while (i <= 5) {
        //     System.out.println("Iteration: " + i);
        //     i++;
        // }

        // do-while loop

        // int i = 10;
        // do{
        //     System.out.println("Iteration: " + i);
        //     i++;
        // }while(i <= 5);

        // for loop

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Iteration: " + i);
        // }

        // for-each loop

        int[] numbers = {1, 2, -3, 4, 5};
        for (int num : numbers) {
            if(num < 0){
                continue;
            }
            System.out.println("Number: " + num);
        }

    }

}
