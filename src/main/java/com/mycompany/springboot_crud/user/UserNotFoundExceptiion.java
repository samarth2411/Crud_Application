package com.mycompany.springboot_crud.user;

public class UserNotFoundExceptiion extends Throwable {
    public UserNotFoundExceptiion(String message) {
        super(message);
    }
}
