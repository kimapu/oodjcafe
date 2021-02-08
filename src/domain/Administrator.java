package domain;

/**
 *
 * associate to the Login class
 *  type: aggregation
 */
public class Administrator {
    
    private String uid, name, addr;
            
    private Login login;
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
    }
    
    //user operation
    public boolean performLogin(){
        if (login == null ) {
            //throw an exception
            return false;
        }
        return login.verify();
    }
    
    public void addDrinks( Drinks newDrinks ){
        newDrinks.addNew();
    }
    
    public void modifyDrinks( Drinks newDrinks ){
        newDrinks.edit();
    }
    
}
