//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int []numbers = new int[5];
//
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;

        int []numbers = {10,20,30,40,50};

        for(int index=0; index<numbers.length ; index++){
            numbers[index] = numbers[index] * 2;
        }


        for(int value : numbers){
            System.out.println(value);
        }



    }
}