package com.loose.coupling;

public class UserDatabase implements UserDataProvider{

    @Override
    public String getUserData() {
        return "Fetching User Data from User Database.";
    }
}
