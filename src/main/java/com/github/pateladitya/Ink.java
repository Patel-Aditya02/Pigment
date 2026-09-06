package com.github.pateladitya;

public enum Ink {
    BLACK("\033[30m", "\033[40m"),
    RED("\033[31m","\033[41m"),
    GREEN("\033[32m", "\033[42m"),
    YELLOW("\033[33m", "\033[43m"),
    BLUE("\033[34m", "\033[44m"),
    MAGENTA("\033[35m", "\033[45m"),
    CYAN("\033[36m", "\033[46m"),
    WHITE("\033[37m", "\033[47m"),
    GREY("\033[38;5;245m", "\033[48;5;245m");

    public static final String RESET_FG = "\033[39m";
    public static final String RESET_BG = "\033[49m";
    public static final String RESET_INK = "\033[39;49m";

    public final String fg;
    public final String bg;

    Ink(String fg, String bg) {
        this.fg = fg;
        this.bg = bg;
    }

    public String fg(String str){
        return this.fg + str + RESET_FG;
    }

    public String bg(String str){
        return this.bg + str + RESET_BG;
    }

    public void print(Object o){
       System.out.print(this.fg(o.toString()));
    }

    public void printBg(Object o){
        System.out.print(this.bg(o.toString()));
    }

    public void println(Object o){
        System.out.println(this.fg(o.toString()));
    }

    public void printlnBg(Object o){
        System.out.println(this.bg(o.toString()));
    }
}
