package ge.edu.btu;
import java.io.*;


public class FileCounter {

    public static void main(String[] args) {
        File dir = new File("/Users/jababagdoshvili/Desktop/BTU_DOCUMENTS");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
                return name.startsWith("btu");
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("შესაბამისი ფაილი ან დირექტორია არ არსებობს!");
        } else {
            for (int i = 0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(i+1 + "." + "ფაილის დასახელება:" + " " + filename);
            }
        }
    }

}
