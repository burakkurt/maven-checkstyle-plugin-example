/*
 * Copyright 2021 Trendyol. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Trendyol.
 * Any reproduction of this material must contain this notice.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static final String INVALID_CONSTANT_NAME = "Constant names should be uppercase";
    public static final String WRONG_MODIFIER_ORDER = "static should be before final";

    public static void main(final String[] args) {
        oneLineCannotExceedOneHundredTwentyCharacters();
        thereMustBeOneWhiteSpaceAfterIfAndClosingParanthesesCondition();
        avoidUsingStarImport();
        avoidMoreThanThreeReturnStatement();
    }

    private static void oneLineCannotExceedOneHundredTwentyCharacters() {
        System.out.println("something something something something something something something");
    }

    private static void thereMustBeOneWhiteSpaceAfterIfAndClosingParanthesesCondition() {
        final boolean isPrint = true;
        if (isPrint) {
            System.out.println("There Must Be A WhiteSpace After If And Closing Parantheses");
        }
    }

    private static void avoidUsingStarImport() {
        new ArrayList<>();
        new HashMap<>();
        new HashSet<>();
    }

    private static int avoidMoreThanThreeReturnStatement() {
        final String word = "something";
        final int defaultValue = 3;

        if ("somethingg".equals(word)) {
            return 0;
        }

        return defaultValue;
    }

}
