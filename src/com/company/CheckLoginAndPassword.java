package com.company;


public class CheckLoginAndPassword {

    public static boolean chekLoginAndPassword(String login, String password, String confirmPassword)  {
        final int maxLength = 20;
        final int minLength = 8;
        final String regexLogin = "^.*(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_]).*$";
        final String regexPassword = "^.*(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$";
        try {
            if (login == null || login.length() > maxLength || login.length() < minLength ) {
                System.out.println("Довжина логіна не повинна бути менше 8 та більше 20");
                throw new WrongLoginException("ExceptionLengthLogin");

            }
            else if(!login.matches(regexLogin)){
                System.out.println("Логін повнен складатись з латинських букв(містити хочаб одну велику) та цифр також місти символ _");
                throw new WrongLoginException("ExceptionRegexLogin");

            }
            else if(password == null || password.length() > maxLength|| password.length() < minLength){
                System.out.println("Пароль повинен містити не менше 8-ми символів та не більше 20-ти");
                throw new WrongPasswordException("ExceptionLengthPassword");
            }
            else if(!login.matches(regexPassword)){
                System.out.println("Пароль повнен складатись з латинських букв(містити хочаб одну велику) та цифр");
                throw new WrongPasswordException("ExceptionRegexPassword");
            }else if(password!=confirmPassword){
                System.out.println("Паролі не збігаються");
                throw new WrongPasswordException("Does not mach password");
            }
            else {
                System.out.println("Логін та пароль введено вірно");
                return true;
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Логін або пароль введено не коректно.");
            return false;
        }

    }
}
