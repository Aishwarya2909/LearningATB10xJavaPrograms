package ex_oops_concept;

public class ExOfAbAndOverideFunc {

    public static void main(String[] args) {

        Book mybook = new PrintByBook("Harry Potter", "J.k.Rowling", "120");
        System.out.println(mybook.getDetails());

    }
}

   abstract class Book
    {
        String name;
        String author;
        String price;

        public abstract String getDetails();

        Book(String nam , String  auth, String pr)
        {
            this.name = nam;
            this.author= auth;
            this.price = pr;
        }


    }

    class PrintByBook extends Book {

        @Override
        public String getDetails() {
            return name + ", " + author + ", " + price ;
        }

        PrintByBook(String nam, String auth, String pr) {
            super(nam, auth, pr);
        }
    }
