package com.loose.coupling;

public class NewDatabse implements UserDataProvider{
    @Override
    public String getDetails() {
        return "fetched details from MongoDatabase";
    }
}
