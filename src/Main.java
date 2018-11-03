public class Main {

    public static boolean checkPrime(int num){
        boolean check = false;
        for (int i = 2; i<num; i++){
            if (num%i == 0){
                check = false;
                break;
            }else check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.print("The prime number are: 2, ");
        for (int i = 3; i<101;i++){
            if (checkPrime(i)){
                System.out.print(i + ", ");
            }
        }

    }
}
