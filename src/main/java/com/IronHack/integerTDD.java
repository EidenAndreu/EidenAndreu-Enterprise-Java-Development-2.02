package com.IronHack;

import jdk.jfr.StackTrace;

import java.sql.Array;
import java.util.Arrays;
    public class integerTDD {
        public static int[] oddNumbers(int n) {

            int[] odds = new int[n/2 + 1];

            for(int i = 0; i <= n; i++) {
                if(i % 2 != 0) odds[i / 2] = i;
            }
            return odds;
        }
    }

