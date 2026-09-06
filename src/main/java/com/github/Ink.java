package com.github;

public enum Ink {
    RED("",""),
    BLACK("", ""),
    WHITE("", ""),
    GREY("", "");

    private final String fg;
    private final String bg;

    public static final String RESET = "\\033[0m";

    Ink(String fg, String bg) {
        this.fg = fg;
        this.bg = bg;
    }

    public String fg(String str){
        return this.fg + str + RESET;
    }

    public String bg(String str){
        return this.bg + str;
    }
}
