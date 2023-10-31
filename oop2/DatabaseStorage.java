package rs.ac.ni.pmf.oop2;

public class DatabaseStorage implements Storage {
    @Override
    public void store(String encoded) {
        System.out.println("Storing " + encoded + " in database ");
    }
}
