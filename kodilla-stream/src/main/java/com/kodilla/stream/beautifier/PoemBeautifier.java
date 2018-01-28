package com.kodilla.stream.beautifier;

public class PoemBeautifier {
   // public String textToBeautify;

    public void beautify(String textToBeautify, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(textToBeautify);
        System.out.println("Beautified text: " + result);
    }
}
