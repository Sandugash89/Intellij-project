package class23.abstraction;

public abstract class File {
    /*
    Create  a  class  File  that  will  have  the
following behaviors: open, edit, close. Edit  and close are implemented method while open  is  an  abstract.
Create  3  subclasses: JavaFile, WordFile, PdfFile that will provide specific  implementation  of  open
behaviour: Example: to open .java file we
need notepad++ or sublime text, to open .doc  file  we  need  Microsoft  word  to  be
installed etc
     */

    String Doc;
    abstract void open();
    void edit(String Doc){
        this.Doc=Doc;

        System.out.println("Edit the "+ Doc);
    }
    void close(String Doc) {
        this.Doc=Doc;
        System.out.println("Close the "+ Doc);

    }

}
class JavaFile extends File {

    @Override
    void open() {
        System.out.println("To open java file we need Eclipse");
    }

    void close() {
        System.out.println("Close  the JavaFile");
    }
}
class WordFile extends File{
        void open() {
        System.out.println("To open WordFile we need Microsoft Word");
    }
        void edit(String Doc) {
        System.out.println("To edit WordFile we need Microsoft Word");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("To open PdfFile we need AbodeReader");
    }
}