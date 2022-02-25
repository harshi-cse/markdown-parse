// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Stack;

// add a random comment

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
<<<<<<< HEAD
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);

            if (nextOpenBracket < 0 || nextCloseBracket < 0 ||
                openParen < 0 || closeParen < 0
            ) {
                break;
            }
            
            if (nextOpenBracket > 0 &&
                markdown.charAt(nextOpenBracket - 1) == '!' ||
                markdown.charAt(openParen - 1) != ']' ||
                markdown.charAt(closeParen - 1) == '\n'
            ) {
                currentIndex = closeParen + 1;
                continue;
            }

            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
            // System.out.println(currentIndex);
=======

            if (nextOpenBracket == -1 || nextCloseBracket == -1) {
                break;
            }

            if (nextOpenBracket > 0 && markdown.charAt(nextOpenBracket - 1) == '!') {
                currentIndex = nextOpenBracket + 1;
                continue;
            }

            int markdownCheck = nextCloseBracket + 1;

            if (markdownCheck < markdown.length() && markdown.charAt(markdownCheck) == '(') {
                int openParen = markdown.indexOf("(", markdownCheck);
                int closeParen = markdown.indexOf(")", openParen);
                if (openParen == -1 || closeParen == -1) {
                    break;
                }
                String toAdd = markdown.substring(openParen + 1, closeParen);
                if (!toAdd.contains(" ")) {
                    toReturn.add(toAdd);
                    currentIndex = closeParen + 1;
                } else {
                    currentIndex = openParen + 1;
                }
            }
            else {
                currentIndex = markdownCheck;
            }
>>>>>>> fa5c8aacb950e4a5297b99e21a71898ac8296f76
        }

        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}
