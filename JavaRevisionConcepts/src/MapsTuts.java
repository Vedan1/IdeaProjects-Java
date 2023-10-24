import java.util.HashMap;
import java.util.Map;

public class MapsTuts {

    public static void main(String[] args) {
        Map<String,Integer> Student = new HashMap<>();

        Student.put("vedant",100);
        Student.put("saani",88);
        Student.put("tanuja",12);
        Student.put("aarti",1);

        System.out.println(Student.keySet());

        for(String key : Student.keySet()){
            System.out.println("Name: " + key + "\tMarks: "+ Student.get(key));
        }
    }


}
