public class ThrowingException {

    public boolean checkEven(int num) throws NegativeNumberException{
        if(num<0){
            throw new NegativeNumberException("Negative numbers not allowed");
        }
        return num%2==0;
    }

    public static void main(String[] args) {

        ThrowingException obj = new ThrowingException();
        try {
            boolean output = obj.checkEven(-11);
            System.out.println(output);
        }
        catch (NegativeNumberException ex){
            System.err.println(ex.getMessage());
        }
        catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }


}
