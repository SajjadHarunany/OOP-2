abstract public class Account {
//initialize variables
    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData){
        myData = _myData;
        myData.execute();
    }
}


 class Admin extends Account{

// A private string accessible only to the Admin

    private String AuthPassword;
//authentication for safety
     public Admin(int _id, String _name, String _password){

        id = _id;

        name = _name;

        AuthPassword = _password;

    }

}


 interface DataSource {

    public void execute();

}



 class Delete implements DataSource{


    @Override

    public void execute() {

        System.out.println("Data has been deleted from database.");

    }

}



 class MainApplication {

    public static void main(String[] args) {

        Admin curAdmin = new Admin(192222, "Sajjad Saleem", "keysmash@2");

        User curUser = new User(78698, "Johnny");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.


    }

}


 class Update implements DataSource{

    @Override

    public void execute() {

        System.out.println("Excellent. Database has been Updated Successfully!");

    }

}


 class User extends Account {

    public User(int _id, String _name){

        id = _id;

        name = _name;

    }

}


 class View implements DataSource {

    @Override

    public void execute() {

        System.out.println("Some data is yet to be displayed.");

    }

}