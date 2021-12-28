package class19.HW;

public class userClass{
    /*
    1) Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable
and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method.
Test your code.
     */
    String name;
    int mobile_number;
    userClass(String name, int mobile_number){
        this.name=name;
        this.mobile_number=mobile_number;

    }
}

class userInfo extends userClass {
    String address;
    userInfo(String name, int mobile_number){
        super(name,mobile_number);
        this.address=address;

    }


    void userDetail(){
        System.out.println("Name is "+ name+"."+" The address is "+address+"."+" The mobile number is "+mobile_number);
    }
}
class Tester{
    public static void main(String[] args) {
        userInfo info =new userInfo("Sandugash", 704414);
        info.address="elk avenue";
        info.userDetail();
    }
}