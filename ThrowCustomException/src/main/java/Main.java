public class Main {
    public static void main(String[] args) {
        CustomExceptionThrower calc = new CustomExceptionThrower();
        try {
            int sum = calc.throwCustomException(1,3);
            System.out.println(sum);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        
    }
}
