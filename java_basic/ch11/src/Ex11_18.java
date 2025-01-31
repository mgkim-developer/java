import java.util.*;

class Ex11_18 {
    public static void main(String[] args) {
        String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

        HashMap map = new HashMap();

        for(int i = 0; i < data.length; i = i + 1) {
            if(map.containsKey(data[i])) {
                int value = (int)map.get(data[i]);
                map.put(data[i], value+1);  // 기존에 존재하는 키면 기존 값을 1증가
            }
            else {
                map.put(data[i], 1);
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for(int i = 0; i < bar.length; i = i + 1)
            bar[i] = ch;

        return new String(bar); // String(char[] chArr)
    }
}