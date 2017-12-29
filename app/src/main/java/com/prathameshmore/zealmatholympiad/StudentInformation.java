package com.prathameshmore.zealmatholympiad;

/**
 * Created by Prathamesh More on 29-12-2017.
 */

public class StudentInformation {

    public String firstName;
    public String lastName;
    public String mobileNumber;
    public String email;
    public String address;
    public String marksTenth;
    public String marksTwelfth;
    public String interests;


    StudentInformation() {

    }

    public StudentInformation(String firstName, String lastName, String mobileNumber, String email, String address, String marksTenth, String marksTwelfth, String interests) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.marksTenth = marksTenth;
        this.marksTwelfth = marksTwelfth;
        this.interests = interests;
    }
}
