package study.study0225;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	String[] words = {"leaf", "banana", "orange", "strawberry", "pear", "cat"};
        List<String> wordsList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            wordsList.add(words[i]);
        }

        //메서드 호출 및 출력문
        List<String> filteredWords = getFilteredWords(wordsList);
		
        System.out.println("5글자 이상인 단어들의 리스트:");

        //메서드로 필터링한 글자들을 for문을 통해 프린트
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }//main메소드 끝


    public static List<String> getFilteredWords(List<String> wordsList) {
        
	List<String> filteredWords = new ArrayList<>();
        //1. 여기에 5글자 이상인 단어들만 filteredWords 리스트에 추가하도록 구현()
        for(int i=0; i<wordsList.size(); i++) {
            if (wordsList.get(i).length() >= 5){
                filteredWords.add(wordsList.get(i));
            }
        }
        return filteredWords;
    }
}
