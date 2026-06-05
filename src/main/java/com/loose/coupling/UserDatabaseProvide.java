package com.loose.coupling;

public class UserDatabaseProvide implements UserDataProvider {
    @Override
    public String getDetails() {
        return "User Details from database";
    }
}
