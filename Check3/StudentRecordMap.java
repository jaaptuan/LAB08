package Lab08.Check3;

import java.util.HashMap;
import java.util.Map;

public class StudentRecordMap {
    public static void main(String[] args) {
        Map<Integer , String> StudentRecords = new HashMap<>() ;
        StudentRecords.put(123, "Alice" ) ;

        if(StudentRecords.containsKey(789)) {
            System.out.println("Student with ID 789 exists.") ;
        }
        else {
            System.out.println("Student with ID 789 dose not exists.");
            }
        }
    }
    

