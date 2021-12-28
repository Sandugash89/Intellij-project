package class23.abstraction;

public class FileTester {
    public static void main(String[] args) {
        File[] files ={new JavaFile(), new PdfFile(), new WordFile()};
        for(File f:files){
            f.open();
            f.edit("Abstraction");
            f.close("file");
        }
    }
}
