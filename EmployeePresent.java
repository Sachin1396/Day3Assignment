public class EmployeePresent{
    public static void main(String[] args){
        System.out.println("Welcome to employee wage program on master branch");
        int full_time = 1 ;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == full_time ){
            System.out.println("employee is present");
        }
        else
            System.out.println("Employee is absent");
    }
}

