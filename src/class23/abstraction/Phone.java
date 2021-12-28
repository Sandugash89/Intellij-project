package class23.abstraction;

public abstract class Phone {
    void makePhoneCalls(){
        System.out.println("Making a call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPicture();
    abstract void unlockPhone();
}
class Iphone extends Phone{
    @Override
    void displayPicture() {
        System.out.println("Iphone uses Photos app to display the picture");
    }

    @Override
    void unlockPhone() {
        System.out.println("Use FaceId to unlockthe phone");
    }
    }
    class Samsung extends Phone{
        @Override
        void unlockPhone() {
            System.out.println("Use Fingerprint to unlock the phone");
        }

        @Override
        void displayPicture() {
            System.out.println("Use gallery app to view pictures");
        }
    }
