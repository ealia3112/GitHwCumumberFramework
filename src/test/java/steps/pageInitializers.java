package steps;

import pages.AddEmployeePage;
import pages.loginPage;

public class pageInitializers {


    public static AddEmployeePage addEmployeePage;

    public static void initializePageObjects(){

        addEmployeePage = new AddEmployeePage();
    }


}