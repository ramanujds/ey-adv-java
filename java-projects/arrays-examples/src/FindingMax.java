public class FindingMax {

    public static void main(String[] args) {

        int []arr = {10,4,76,3,8};

        int max = arr[0];

        for(int index = 1; index< arr.length; index++){
            if(arr[index] > max){
                max = arr[index];
            }
        }

        System.out.println("Max : "+max);
    }

}
