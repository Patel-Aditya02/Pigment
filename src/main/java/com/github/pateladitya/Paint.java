package com.github.pateladitya;

public final class Paint {

    private final String text;
    private String fg;
    private String bg;
    private final StringBuilder styles = new StringBuilder();

    public static final String RESET_ALL = "\033[0m";

    private Paint(String text) {
        this.text = text;
    }

    public static Paint of(String text) {
        return new Paint(text);
    }

    // Convenience: fg only
    public static String string(String text, Ink fg) {
        return new Paint(text).fg(fg).toString();
    }

    // Convenience: fg + bg
    public static String string(String text, Ink fg, Ink bg){
        return new Paint(text).fg(fg).bg(bg).toString();
    }

    // Convenience: fg + styles
    public static String string(String text, Ink fg, Style... styles) {
        return new Paint(text).fg(fg).style(styles).toString();
    }

    // Convenience: fg + bg + styles
    public static String string(String text, Ink fg, Ink bg, Style... styles) {
        return new Paint(text).fg(fg).bg(bg).style(styles).toString();
    }

    public Paint fg(Ink ink) {
        this.fg = ink.fg;
        return this;
    }

    public Paint bg(Ink ink) {
        this.bg = ink.bg;
        return this;
    }

    public Paint style(Style... styles) {
        for (Style s : styles) {
            this.styles.append(s.ansi);
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (fg != null) sb.append(fg);
        if (bg != null) sb.append(bg);
        sb.append(styles);
        sb.append(text);
        sb.append(RESET_ALL);
        return sb.toString();
    }
}
