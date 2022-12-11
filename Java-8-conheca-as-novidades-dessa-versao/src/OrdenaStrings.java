import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Comparator.comparing;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        palavras.sort((s1,s2) -> {
            if (s1.length()<s2.length()){
                return -1;
            }
            if (s1.length()>s2.length()){
                return 1;
            }
            return 0;
        });

//        palavras.sort((s1, s2) -> {
//            return Integer.compare(s1.length(), s2.length());
//        });
//        palavras.sort(Comparator.comparing(s -> s.length()));
//        palavras.sort(Comparator.comparing(String::length));
//        palavras.sort(comparing(String::length));
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(palavras);


//        Consumer<String> impressor = s -> System.out.println(s);
//        Consumer<String> impressor = System.out::println;
//        palavras.forEach(impressor);

        palavras.forEach(System.out::println);
    }

}