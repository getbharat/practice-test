package com.hacker.rank.practice;

import java.util.List;
import java.util.stream.IntStream;

public class DictionaryProblem {

	public static void main(String[] args) {

        List<String> dictionary = List.of("i", "like", "paper", "team", "sam", "sung", "fan", "mobile", "samsung", "goal", "past");
        
        String sentence = "ilikesamsungmobile";
        
        char[] arr = sentence.toCharArray();
        
        StringBuilder actualSentence = new StringBuilder();
        StringBuilder word = new StringBuilder();

        
        IntStream.range(0, arr.length).forEach(index->{
        	word.append(arr[index]);
        	if(dictionary.contains(word.toString())) {
        		actualSentence.append(word+" ");
        		word.setLength(0);
        	}
       
        });
        
        System.out.print(actualSentence);
	}

}
