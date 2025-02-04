package ex_25thjan_programs;

public class Palindrome {
    public static void main(String[] args) {
        String name = "naman";
//        name = name.toLowerCase();
        String strrev ="";
        for(int i=name.length()-1;i>=0;i--)
        {
           strrev = strrev + name.charAt(i);
        }
        System.out.println("Reverse String " +strrev );
        if(name.equals(strrev))
        {
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }
}
