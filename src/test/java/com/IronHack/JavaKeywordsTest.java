package com.IronHack;

import junit.framework.TestCase;

import static com.IronHack.JavaKeywords.containsJavaKeywords;

public class JavaKeywordsTest extends integerTDD {
    public static class Test {
        public static void main(String[] args) {
            String str1 = "Don't break my heart";
            String str2 = "I love to breakdance";

            System.out.println(containsJavaKeywords(str1)); //true
            System.out.println(containsJavaKeywords(str2)); //false
        }


    }
}