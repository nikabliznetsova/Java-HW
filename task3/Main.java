import java.util.*;

public class Main {
    public static String winnerSearch(String[] lst) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, List<Integer>> move_no = new HashMap<>();

        for (String item : lst){
            String[] person = item.split(" ");
            String name = person[0];
            Integer score = Integer.parseInt(person[1]);
            if (map.containsKey(name)){
//                map.replace(name, map.get(name), map.get(name) + score);
                map.put(name, map.get(name) + score);
            }
            else {
                map.put(name, score);
            }
            Integer i = Arrays.asList(lst).indexOf(item);
            if (move_no.containsKey(name)){
                move_no.get(name).add(i);
            }
            else{
                List <Integer> val = new ArrayList();
                val.add(i);
                move_no.put(name, val);
            }

        }
        // если равное количество баллов, то побеждает тот, кто раньше сделал последний ход
        System.out.println("Liderlist:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        System.out.println("\nMove numbers:");
        for (Map.Entry<String, List<Integer>> entry : move_no.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        String winner = "";
        Integer max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>max){
                max = entry.getValue();
                winner = entry.getKey();
            }
            else if (entry.getValue() == max){
//                Integer k = -1;
                Integer leng1 = move_no.get(entry.getKey()).toArray().length;
                Integer leng2 = move_no.get(winner).toArray().length;
                if (move_no.get(entry.getKey()).get(leng1-2) < move_no.get(winner).get(leng2-2)){
                    winner = entry.getKey();
                }
            }
        }
        return winner;
    }

    public static void main(String []args){
        String [] lst = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
        System.out.println("\nwinner: " + winnerSearch(lst));
    }
}