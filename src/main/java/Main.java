/*
 * Copyright 2020 Trendyol. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Trendyol.
 * Any reproduction of this material must contain this notice.
 */

import java.util.*;
import javax.sql.*;

public class Main {

    public static final String INVALID_constant_NAME = "Constant names should be uppercase";
    public final static String WRONG_MODIFIER_ORDER = "static should be before final";

    public static void main(String[] args) {
        oneLineCannotExceedOneHundredTwentyCharacters();
        thereMustBeOneWhiteSpaceAfterIfAndClosingParanthesesCondition();
        avoidUsingStarImport();
        avoidMoreThanThreeReturnStatement();
        avoidMoreThanThreeOperatorsForBoolean();
    }

    private static void oneLineCannotExceedOneHundredTwentyCharacters() {
        System.out.println("something something something something something something something something something something");
    }

    private static void thereMustBeOneWhiteSpaceAfterIfAndClosingParanthesesCondition() {
        boolean isPrint = true;
        if(isPrint){
            System.out.println("There Must Be A WhiteSpace After If And Closing Parantheses");
        }
    }

    private static void avoidUsingStarImport() {
        new ArrayList<>();
        new HashMap<>();
        new HashSet<>();
    }

    private static int avoidMoreThanThreeReturnStatement() {
        String word = "something";

        if (word.equals("somethingg")) {
            return 0;
        } else if (word.equals("somehinggg")) {
            return 1;
        } else if (word.equals("somehingggg")) {
            return 2;
        }

        return 3;
    }

    private static boolean avoidMoreThanThreeOperatorsForBoolean() {
        String word = "something";

        if (word.startsWith("s") && word.length() == 9 && word.endsWith("g")
                && word.charAt(1) == 'o' && word.substring(0,4).equals("some")) {
            return true;
        }

        return false;
    }

}
