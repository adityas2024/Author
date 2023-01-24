public class Author {
    String name;
    char gender;
    String email;

    public Author(String N, String B, char G) {
        this.name = N;
        this.email = B;
        this.gender = G;
    }

    public void SetEmail(String E){
        this.email = E;
    }

    public String GetEmail(){
        return this.email;
    }

    public String GetName(){
        return this.name;
    }

    public char GetGender(){
        return this.gender;
    }

    public String toString(){
       if (this.gender == 'M')
           return "The name of the author is " + this.name + ", he is male and his email is " + this.email;
       else
           return "The name of the author is " + this.name + ", she is female and her email is " + this.email;

    }
}






