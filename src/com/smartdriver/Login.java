package com.smartdriver;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Alucard on 8/10/2015.
 */
@ManagedBean
@SessionScoped
public class Login {

    boolean loggedIn;

    public Login(){    }

    public String doLogin(){
        setLoggedIn(true);
        return "index";
    }
    public void doLogout(){
        setLoggedIn(false);
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

}
