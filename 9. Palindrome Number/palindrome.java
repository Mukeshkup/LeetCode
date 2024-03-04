import java.util.Scanner;
class palindrome {
    public static boolean isPalindrome(int x) {
        int rem,n=x,rev=0;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if (rev==n){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(isPalindrome(n)==true){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
