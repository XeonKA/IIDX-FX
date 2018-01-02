package com.gersonberger;


class Status {

    static final String NOPLAY = "";
    static final String FAILED = "F";
    static final String ASSISTCLEAR = "AC";
    static final String EASYCLEAR = "EC";
    static final String CLEAR = "NC";
    static final String HARDCLEAR = "HC";
    static final String EXHARDCLEAR = "EXHC";
    static final String FULLCOMBO = "FC";

    static final String NOPLAY_FULL = "No Play";
    static final String FAILED_FULL = "Failed";
    static final String ASSISTCLEAR_FULL = "Assist Clear";
    static final String EASYCLEAR_FULL = "Easy Clear";
    static final String CLEAR_FULL = "Clear";
    static final String HARDCLEAR_FULL = "Hard Clear";
    static final String EXHARDCLEAR_FULL = "Ex Hard Clear";
    static final String FULLCOMBO_FULL = "Full Combo";

    static final int NOPLAY_INT = 0;
    static final int FAILED_INT = 1;
    static final int ASSISTCLEAR_INT= 2;
    static final int EASYCLEAR_INT = 3;
    static final int CLEAR_INT = 4;
    static final int HARDCLEAR_INT = 5;
    static final int EXHARDCLEAR_INT = 6;
    static final int FULLCOMBO_INT = 7;

    static String statusToString(int clear) {
        switch (clear) {
            case FAILED_INT:
                return FAILED;
            case ASSISTCLEAR_INT:
                return ASSISTCLEAR;
            case EASYCLEAR_INT:
                return EASYCLEAR;
            case CLEAR_INT:
                return CLEAR;
            case HARDCLEAR_INT:
                return HARDCLEAR;
            case EXHARDCLEAR_INT:
                return EXHARDCLEAR;
            case FULLCOMBO_INT:
                return FULLCOMBO;
            default:
                return NOPLAY;
        }
    }

    static int statusToInt(String clear) {
        switch (clear) {
            case FAILED:
                return FAILED_INT;
            case ASSISTCLEAR:
                return ASSISTCLEAR_INT;
            case EASYCLEAR:
                return EASYCLEAR_INT;
            case CLEAR:
                return CLEAR_INT;
            case HARDCLEAR:
                return HARDCLEAR_INT;
            case EXHARDCLEAR:
                return EXHARDCLEAR_INT;
            case FULLCOMBO:
                return FULLCOMBO_INT;
            default:
                return NOPLAY_INT;
        }
    }

    static int networkStatusToInt(String clear) {
        switch (clear) {
            case "NO_PLAY":
                return NOPLAY_INT;
            case "FAILED":
                return FAILED_INT;
            case "ASSIST_CLEAR":
                return ASSISTCLEAR_INT;
            case "EASY_CLEAR":
                return EASYCLEAR_INT;
            case "CLEAR":
                return CLEAR_INT;
            case "HARD_CLEAR":
                return HARDCLEAR_INT;
            case "EX_HARD_CLEAR":
                return EXHARDCLEAR_INT;
            case "FULL_COMBO":
                return FULLCOMBO_INT;
            default:
                return NOPLAY_INT;
        }
    }

}
