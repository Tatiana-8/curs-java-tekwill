import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("sport");
        tasks.add("cycling");
        tasks.add("cycling");
        tasks.add("swimming");
        tasks.add("reading");
        tasks.add("reading");

        System.out.println(tasks);
        System.out.println(unic(tasks));

        Map<String, String> dictionar = new HashMap<>();
        dictionar.put("arise", "подниматься");
        dictionar.put("beat", "бить");
        dictionar.put("begin", "начинать");
        dictionar.put("become", "становиться");
        dictionar.put("bend", "наклонять");
        dictionar.put("bite", "кусать");
        dictionar.put("blow", "дуть");
        dictionar.put("breed", "разводить");
        dictionar.put("bring", "приносить");
        dictionar.put("build", "строить");

        System.out.print(dictionar);

    }

    public static List<String> unic(List<String> list){
        for (int i=0; i<list.size();i++)
        {
            for (int j=0; j<list.size()-1;j++){
                if(list.get(i)== list.get(j) && i!=j){
                    list.remove(j);
                }
            }
        }
        return list;
    }

}