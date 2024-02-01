package org.example._929UniqueEmailAddressesEasyTopicsCompanies;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email: emails
             ) {
            emailSet.add(formatEmailString(email));
        }
        return emailSet.size();
    }

    private static String formatEmailString(String email){
        int atPosition = email.indexOf("@");
        String local = email.substring(0, atPosition);
        String atAndDomain = email.substring(atPosition);
        int plusPosition = local.indexOf("+");
        if(plusPosition != -1){
            local = local.substring(0, plusPosition);
        }
        local = local.replace(".", "");
        return local + atAndDomain;
    }
}
