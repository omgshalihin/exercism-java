package org.example.proteinTranslator;

import java.util.*;

public class ProteinTranslator {
    private static final Map<String, String> proteinMap = new HashMap<>(Map.ofEntries(
            Map.entry("AUG", "Methionine"),
            Map.entry("UUU", "Phenylalanine"),
            Map.entry("UUC", "Phenylalanine"),
            Map.entry("UUA", "Leucine"),
            Map.entry("UUG", "Leucine"),
            Map.entry("UCU", "Serine"),
            Map.entry("UCC", "Serine"),
            Map.entry("UCA", "Serine"),
            Map.entry("UCG", "Serine"),
            Map.entry("UAU", "Tyrosine"),
            Map.entry("UAC", "Tyrosine"),
            Map.entry("UGU", "Cysteine"),
            Map.entry("UGC", "Cysteine"),
            Map.entry("UGG", "Tryptophan"),
            Map.entry("UAA", "STOP"),
            Map.entry("UAG", "STOP"),
            Map.entry("UGA", "STOP")
    ));

    List<String> translate(String rnaSequence) {
        String[] codons = rnaSequence.split("(?<=\\G.{3})");
        List<String> translatedProtein = new ArrayList<>();
        Arrays.stream(codons)
                .takeWhile(codon -> !proteinMap.get(codon).equals("STOP"))
                .forEach(codon -> {
            String protein = proteinMap.get(codon);
            translatedProtein.add(protein);
        });
        return translatedProtein;
    }
}
