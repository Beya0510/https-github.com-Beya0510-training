package Exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

    public class UniqueAnagram {
        public static void main(String[] args) {
            try {
                // Étape 1 — lire le contenu du fichier dataset.txt
                String data = Files.readString(Paths.get("src/dataset.txt"));

                // Étape 2 — séparer en mots
                String[] words = data.split("\\s+");

                // Étape 3 — créer les signatures (lettres triées)
                List<String> signatures = new ArrayList<>();
                for (String word : words) {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    signatures.add(new String(chars));
                }

                // Étape 4 — compter chaque signature
                Map<String, Integer> counts = new HashMap<>();
                for (String sig : signatures) {
                    counts.put(sig, counts.getOrDefault(sig, 0) + 1);
                }

                // Étape 5 — trouver le mot dont la signature apparaît une seule fois
                for (int i = 0; i < words.length; i++) {
                    String sig = signatures.get(i);
                    if (counts.get(sig) == 1) {
                        System.out.println(words[i]);
                        break;
                    }
                }

            } catch (IOException e) {
                System.out.println("Erreur de lecture du fichier : " + e.getMessage());
            }
        }
    }


