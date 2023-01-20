public class Author {
    String name;
    char gender;
    String email;

    public Author(String N, String B, char G) {
        this.name = N;
        this.email = B;
        this.gender = G;
    }

    public void SetEmail(){ email = "john.stones2013@gmail.com" ; }

    public void GetName (){name = this.name ;
        System.out.println(this.name);
    }
    public void GetGender (){gender = this.gender;
        System.out.println(this.gender);
    }




    public String toString(){
       if (this.gender == 'M')
           return "The name of the author is " + this.name + ", he is male and his email is " + this.email;
       else
           return "The name of the author is " + this.name + ", she is female and her email is " + this.email;

    }
}






