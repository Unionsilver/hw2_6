import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<> (List.of("я", "я", "ты", "мы", "они"));

    public static void main(String[] args) {

        task1(); // убрать нечетные числа
        System.out.println();
        task2(); // убрать четные числа и не допустить повторяющиеся числа
        System.out.println();
        task3(); // вывести неповторяющиеся уникальные слова
        System.out.println();
        task4(); // выводит в консоль количество дублей для каждого уникального слова


    }

    public static void task1() {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i));
            }
        }
    }

    public static void task2() {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) % 2 != 1) {
                if (nums.get(i).equals(nums.get(i + 1))) {
                    nums.remove(i);
                }
                System.out.print(nums.get(i));
            }
        }
    }

    public static void task3() {
        Set<String> words1 = new HashSet<>(words);
        System.out.println(words1);
    }


    public static void task4() {
        Map<String,Integer> getNum = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            getNum.put(words.get(i),Collections.frequency(words, words.get(i)));
        }
        System.out.println(getNum);

    }
}

