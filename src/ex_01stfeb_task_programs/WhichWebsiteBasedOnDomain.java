package ex_01stfeb_task_programs;

import java.util.Scanner;

public class WhichWebsiteBasedOnDomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website");
        String website = sc.next();
        if(website.equals("example.com"))
        {
            System.out.println("The website type is: Commerial Website");
        }
        else if (website.equals("example.org"))
        {
                System.out.println("The website type is: Non Profit Organization");
            }
        else if (website.equals("example.edu"))
        {
            System.out.println("The website type is: Educational institution");
        }
        else if (website.equals("example.gov"))
        {
            System.out.println("The website type is: Government website");
        }
        else if (website.equals("example.net"))
        {
            System.out.println("The website type is: Network related website");
        }
        else if (website.equals("example.info"))
        {
            System.out.println("The website type is: Information website");
        }
        else
        {
            System.out.println("The website type is: Unknown or Other type of websites");
        }
        }
    }
