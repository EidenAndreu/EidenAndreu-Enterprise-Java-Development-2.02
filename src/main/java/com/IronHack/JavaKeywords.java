package com.IronHack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaKeywords {
    private static String str;

        public static boolean containsJavaKeywords(String str){
            Set<String> javaKeywords = new HashSet<>(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"));
            for (String word : str.split("\\W+")) {
                if (javaKeywords.contains(word)) {
                    return true;
                }
            }
            return false;
        }
    }
