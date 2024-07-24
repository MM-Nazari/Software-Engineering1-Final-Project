package com.company;

//Library
import java.util.*;

/**
 * @author Mohammad Mehdi Nazari (github.com/MMNazari1380) & Armin Ebrahimi Saba (github.com/AESTheProgrammer)
 * @version 1.0
 * @since 2022-12-19
 */
public class Instructor {

    //Fields
    private BasicExam[] builtExams;
    private BasicExam  currentExam;
    public Boolean isLoggedin;
    private final String username;
    private final String password;

    //Constructor
    public Instructor() {
        // password farzi "password" va username farzi "username" ast
        this.username = "username";
        this.password = "password";
    }

    //Methods
    public BasicExam initiateExam() {
        return (BasicExam) null;
    }

    public Boolean login(String password, String username) {
        if (this.password.equals(password) && this.username.equals(username)) {
            System.out.println("Login was Successful");
            return Boolean.TRUE;
        }
        else if (!this.password.equals(password) && this.username.equals(username)) {
            System.out.println("Password is Incorrect");
            return Boolean.FALSE;
        }
        else if (this.password.equals(password) && !this.username.equals(username)) {
            System.out.println("Username is Incorrect");
            return Boolean.FALSE;
        }
        else {
            System.out.println("Username and Password are Incorrect");
            return Boolean.FALSE;
        }
    }

    public void saveExamFile(BasicExam exam, String address) {}

}
