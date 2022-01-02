package com.company;

public class Main {
    public static void main(String[] args)  {
        try {
            CheckLoginAndPassword.chekLoginAndPassword("Andrii_Tysiak66","Cursor2022","Cursor2022");
            throw new WrongLoginAndPasswordException("Exeption");
        }catch (WrongLoginAndPasswordException e){
            System.out.println("Welcome");
        }


    }
}
