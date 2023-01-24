public class driver {

    public static void main(String[] args) {
        Author author1 = new Author("John Stones", "john.s@gmail.com", 'M');
        Author author2 = new Author("Mary Elizabeth", "m111.sss@gmail.com", 'F');

        author1.SetEmail("john.stones2011@gmail.com");
        System.out.println(author1.GetName());
        System.out.println(author1.GetGender());
        System.out.println(author1.GetEmail());

        author2.GetName();
        author2.GetGender();

        System.out.println(author1.toString());
        System.out.println(author2.toString());
    }
}