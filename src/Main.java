public class Main {
    public static void main(String[] args) {
        oddnum(5);
    }
        static int oddnum(int n){
                if(n==1){
                    System.out.println(n);
                    return 0;
                }
                if(n%2!=0) {
                    System.out.println(n);
                    oddnum(n-2);
                }
                if(n%2==0) {
                    System.out.println(n - 1);
                }
                return 1;
        }
    }

