package org.example._168ExcelSheetColumnTitle;

public class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            int c;
            if(columnNumber % 26 == 0){
                c = 64+26;
                columnNumber = columnNumber/26 - 1;
            } else {
                c = columnNumber % 26 + 64;
                columnNumber = columnNumber/26;
            }
            char a = (char) c;
            stringBuilder.append(a);
        }
        return stringBuilder.reverse().toString();
    }
}
