package exceptionHandling;

class NotEligibleException extends RuntimeException
{
    NotEligibleException(String msg)
    {
        super(msg);
    }
}

public class ExceptionExample3 {
    public static void main(String[] args) {

        ExceptionExample3 ee = new ExceptionExample3();
    }

    public int validateAge(int age) {


        if(age<18){
            throw new NotEligibleException("Your age is less than 18");
        }
        else{
            System.out.println("You are eligible for getting license");
        }

        return age;
    }
}
