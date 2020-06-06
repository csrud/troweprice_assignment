# Sentence Assignment
Get longest and shortest word with their lengths in a sentence

## Software Required
1. JDK 8 or higher
2. Maven

## Assumptions
1. Sentence can contain only english language characters
2. Apostrophe and hyphen are considered as part of a word. Other punctuations are ignored
3. Numbers are neither words nor part of a word
4. Characters not used in english language are not part of a word

## Usage
1. Download or clone the repo.
2. To execute tests: **mvn test**
3. Add additional JUnit tests in src/test/java/SentenceTest.java to test additional sentences
4. Copy Sentence class and use getLongestWordAndLength("String param") and getShortestWordAndLength("String param") methods in your program 

## Examples
Input: "The cow jumped over the moon."<br>
Output: jumped, 6

Input: ""<br>
Output: Empty Sentence

Input: "@#$%^&*+{}"<br>
Output: Invalid Sentence
