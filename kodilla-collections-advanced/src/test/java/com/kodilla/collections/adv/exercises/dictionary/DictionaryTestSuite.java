package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");

        dictionary.addWord(polishWord, englishWord);

        assertEquals(1, dictionary.size());
    }

    @Test
    public void testFindEnglishWords() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grac", new EnglishWord(PartOfSpeech.NOUN, "play"));

        List<EnglishWord> result = dictionary.findEnglishWords("gra");


        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);

        assertEquals(2, result.size());

    }
    @Test
    public void testFindingEnglishWords_withPartOfSpeech(){
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("grac", new EnglishWord(PartOfSpeech.VERB, "play"));

        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);

        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        assertEquals(expectedList, result);
    }
}