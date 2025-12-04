package Exercices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Digit {
    public static void main(String[] args) {
        String dataset = "0907797840385217406101574076283484960983135875697568950891095214071518456665250901267535902714" +
                "2004527990566898256481829854250341432652009353864765378617264845695225424705033644029390856143938739424" +
                "7442429447246004826913927529966062956535809000202813539895970423766179033499203965832394830298995549918" +
                "3569888905906621806628999425998760345373577367069160323917885238085011305189102012829673957829698714665" +
                "1806428046612302648536089217366903004805534047104517867031635573623363479425819700783368651518565654342" +
                "1043880698741668521245309175018278959125327675980555155762545976306417721421581445525805338632902970334" +
                "6619903587330554630295536471529842534404833111015253540047917048487875329656471694274844973631033518012" +
                "0750758218329113639077598268110594802006473863927279667675295767979763706298847283057912933826640209732" +
                "1219748604322955554640727444427936046995370821588500587750394740183435052125702572229074326312173644391" +
                "7621297583814428278350678195066937711870365052676784876086086098082157822120286273";

        // Compter combien de fois chaque chiffre apparaît
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : dataset.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Mettre les chiffres dans une liste pour les trier
        List<Character> digits = new ArrayList<>(counts.keySet());

        // Trier par fréquence décroissante, puis chiffre décroissant si égal
        digits.sort(new Comparator<Character>() {
            public int compare(Character a, Character b) {
                int freqCompare = counts.get(b) - counts.get(a); // fréquence décroissante
                if (freqCompare != 0) return freqCompare;
                return b - a; // chiffre plus grand d'abord en cas d'égalité
            }
        });

        // Construire le code avec les 4 premiers chiffres
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 4 && i < digits.size(); i++) {
            code.append(digits.get(i));
        }

        // Afficher le code final
        System.out.println(code.toString());
    }
}
