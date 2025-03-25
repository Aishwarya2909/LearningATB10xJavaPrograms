
package ex_constructors_tasks;

public class ConstructorExample {

    public static void main(String[] args) {

        ConstructorExample c1 = new ConstructorExample();
        ConstructorExample c2 = new ConstructorExample("5000","Aishu's Home");
        System.out.println(c1.display_house());
        System.out.println(c2.display_house());

    }

    String bricks;
    String house_name;

//    Can we call a constructor explicitly inside another constructor?
//   A) Yes, we can use this() to call another constructor within the same class.



    ConstructorExample()
    {
        this("Unknown","Unknown");
        System.out.println("Constructor Overloading");
    }

    //    ConstructorExample()
//    {
//        bricks = "Unknown";
//        house_name ="Unknown";
//        System.out.println("It is a Default Constructor");
//    }

    ConstructorExample(String bric, String hou_name)
    {
        this.bricks = bric;
        this.house_name = hou_name;
    }

    String display_house()
    {
        return "To construct a house need bricks : " + bricks + " ,"  +"House name : " + house_name;
    }
}
