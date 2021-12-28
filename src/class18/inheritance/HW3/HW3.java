package class18.inheritance.HW3;

public class HW3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
that would have it their own features and behaviour.
     */
    public static void main(String[] args) {
        MathTeacher math = new MathTeacher();
        math.name="Demir";
        math.teachMath();
        ChemistryTeacher chemistry =new ChemistryTeacher();
        chemistry.name="Aysha";
        chemistry.teachChemistry();
        PianoTeacher piano = new PianoTeacher();
        piano.name="Evelin";
        piano.teachPiano();
    }
}
class Teacher{
    String name;
    void teach(){
        System.out.println(name+ " teaches teach subjects");

    }
}
class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println(name+" teaches math");
    }

}
class ChemistryTeacher extends Teacher{
    void teachChemistry(){
        System.out.println(name+" teaches chemistry");
    }

}
class PianoTeacher extends Teacher{
    void teachPiano(){
        System.out.println(name+" eaches piano");
    }
}