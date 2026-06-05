package com.tight.coupling;


import com.loose.coupling.UserDataProvider;

public class UserManager implements UserDataProvider {

    @Override
    public String getDetails() {
        return "fetched details from Database";
    }

}
