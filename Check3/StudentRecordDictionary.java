package Lab08.Check3;

import java.util.Dictionary;
import java.util.Hashtable;

public class StudentRecordDictionary {
    public static void main(String[] args) {
        Dictionary<Integer , String> studentRecords = new Hashtable<>() ;
        studentRecords.put(123, "Alice") ;
        String name = studentRecords.get(123) ;
        System.out.println("Student with ID 123 is " + name ) ;
    }
    
}
