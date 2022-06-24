public class EmployeePresent{
    public static void main(String[] args){
        System.out.println("Welcome to employee wage program on master branch");
        int part_time = 1 ;
        int full_time = 2 ;
        int rate_per_hour = 20 ;
        int empHour = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck==part_time)
        {
            System.out.println("Employee is part time");
            empHour=4;
        } else if (empCheck == full_time ){
            System.out.println("Employee is present");
            empHour = 8;
        }
        else {
            System.out.println("Employee is absent");
            empHour = 0;
        }
        empWage = empHour * rate_per_hour;
        System.out.println("Employee wage"+empWage);
    }
}

