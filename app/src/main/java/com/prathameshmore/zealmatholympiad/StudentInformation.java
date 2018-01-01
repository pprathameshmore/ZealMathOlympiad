package com.prathameshmore.zealmatholympiad;

/**
 * Created by Prathamesh More on 29-12-2017.
 */

public class StudentInformation {

    public String firstName;
    public String lastName;
    public String mobileNumber;
    public String email;
    public String streetNameAddress;
    public String cityNameAddress;
    public String pinCodeAddress;
    public String marksTenth;
    public String marksTwelfth;
    public String interests;


    StudentInformation() {

    }

    public StudentInformation(String firstName, String lastName, String mobileNumber, String email, String streetNameAddress, String cityNameAddress, String pinCodeAddress, String marksTenth, String marksTwelfth, String interests) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.streetNameAddress = streetNameAddress;
        this.cityNameAddress = cityNameAddress;
        this.pinCodeAddress = pinCodeAddress;
        this.marksTenth = marksTenth;
        this.marksTwelfth = marksTwelfth;
        this.interests = interests;
    }
}
