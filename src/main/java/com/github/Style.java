package com.github;

public enum Style {
    BOLD("\033[1m", "\033[22m"),
    DIM("\033[2m", "\033[22m"),
    ITALIC("\033[3m", "\033[23m"),
    UNDERLINE("\033[4m", "\033[24m"),
    BLINK_SLOW("\033[5m", "\033[25m"),
    BLINK_FAST("\033[6m", "\033[25m"),
    INVERT("\033[7m", "\033[27m"),
    HIDDEN("\033[8m", "\033[28m"),
    STRIKE_THROUGH("\033[9m", "\033[29m");

    private final String ansi;
    private final String reset;

    public static final String RESET_ALL = "\033[0m";

    Style(String ansi, String reset){
        this.ansi = ansi;
        this.reset = reset;
    }

    public String apply(String str){
        return this.ansi + str + this.reset;
    }

    public void print(Object o){
        IO.print(this.apply(o.toString()));
    }

    public void println(Object o){
        IO.println(this.apply(o.toString()));
    }
}
