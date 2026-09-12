package io.github.PatelAditya02;

public enum Ink implements Paintable {
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

    @Override
    public String paint(String str){
        return this.fg + str + RESET_FG;
    }

    public String paintBg(String str){
        return this.bg + str + RESET_BG;
    }

    public void printBg(Object o){
        System.out.print(this.paintBg(o.toString()));
    }

    public void printlnBg(Object o){
        System.out.println(this.paintBg(o.toString()));
    }

//    @Override
//    public String toString(){
//        return null;
//    }
}
