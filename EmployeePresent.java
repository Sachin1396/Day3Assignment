public class EmployeePresent {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program on master branch");

        int rate_per_hour = 20;
        int empHour = 0;
        int empWage = 0;
        int number_days = 20;
        for(int i=0;i<number_days;i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    empHour = 4;
                    break;
                case 2:
                    empHour = 8;
                    break;
                case 3:
                    empHour = 0;
                    break;
                default:
                    System.out.println("error");
            }
            empWage = empWage + empHour * rate_per_hour;
        }
        System.out.println("Employee wage" + empWage);

    }
}

