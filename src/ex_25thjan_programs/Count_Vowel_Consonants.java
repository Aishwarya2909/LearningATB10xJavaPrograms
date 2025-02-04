package ex_25thjan_programs;


import java.util.Scanner;

public class Count_Vowel_Consonants {

    public static void main(String[] args) {
        int vowel_count=0,consonant_count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        name= name.toLowerCase();
      for(int i=0;i<name.length();i++)
      {
         if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
         {
             vowel_count++;
         }
         else if (name.charAt(i)>'a'&&name.charAt(i)<='z')
         {
             consonant_count++;
         }
      }
        System.out.println("Vowels Count " +vowel_count);
        System.out.println("Consonants Count " +consonant_count);

    }
}