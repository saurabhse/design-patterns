package design.java.solid;

public class DependencyInversionPrinciple {
}


class EmployeeService{

    public void fetchEmployee(MySQLConnection connection){
        // use connection to fetch employee details
        // here mysql is tied to employee service
    }

}

interface DBConnectionInterface{
    // connect method
}

class MySQLConnection implements DBConnectionInterface {
    public String connect() {
        return "Database connection";
    }
}

class EmployeeServiceWithDI implements DBConnectionInterface{

    public void fetchEmployee(DBConnectionInterface connection){

    }

}