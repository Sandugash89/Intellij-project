package class23.abstraction;

public class PhoneTester {
    public static void main(String[] args) {
        //Phone phone = new Phone() can not create the object
  Iphone iphone =new Iphone();
  iphone.displayPicture();
  iphone.unlockPhone();
  iphone.sendText();
  iphone.makePhoneCalls();

        System.out.println("-------------------");

  Samsung samsung =new Samsung();
  samsung.displayPicture();
  samsung.unlockPhone();
  samsung.sendText();
  samsung.makePhoneCalls();
        System.out.println("------------------------");

  Phone[] phones= {new Iphone(), new Samsung()};
  for(Phone ph: phones){
      ph.displayPicture();
      ph.makePhoneCalls();
      ph.unlockPhone();
      ph.sendText();
  }

    }
}
