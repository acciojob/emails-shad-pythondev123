package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {

       this.password=password;
    }
    public void setEmailId(String email) {

        this.emailId=email;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        boolean lensize=false;
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;

        if(!oldPassword.equals(password))
            return;
        if(newPassword.length()<8)
            return;
        lensize=true;
        for(char c:newPassword.toCharArray()){
            if(c>='A'&&c<='Z'){

                upper=true;
            }
            else if(c>='a'&&c<='z'){

                lower=true;
            }
            else if(c>='0'&&c<='9'){
                digit =true;
            }
            else{
                if(special)continue;
                special=true;
            }

        }
        if(lensize&&upper&&lower&&digit&&special)
            password=newPassword;
    }
}
