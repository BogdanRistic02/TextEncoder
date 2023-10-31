package rs.ac.ni.pmf.oop2;

public class FileStorage implements Storage {
    @Override
    public void store(String encoded) {
        System.out.println("Storing " + encoded + " in file");
    }
}