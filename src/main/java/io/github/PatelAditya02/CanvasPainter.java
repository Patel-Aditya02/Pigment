package io.github.PatelAditya02;

import java.io.PrintStream;

public class CanvasPainter implements Paintable{

    private PrintStream canvas;
    private Paintable paintable;

    public CanvasPainter(Paintable paintable, PrintStream canvas){
        if(paintable == null || canvas == null) {
            throw new IllegalArgumentException("Paintable and Canvas are required and cannot be null!");
        }
        this.paintable = paintable;
        this.canvas = canvas;
    }

    public PrintStream getCanvas(){
        return canvas;
    }

    public Paintable getPaintable(){
        return paintable;
    }

    public void setCanvas(PrintStream canvas){
        if(canvas != null) this.canvas = canvas;
    }

    public void setPaintable(Paintable paintable){
        if(paintable != null) this.paintable = paintable;
    }

    @Override
    public String paint(String text) {
        return paintable.paint(text);
    }

    @Override
    public void print(Object o) {
        canvas.print(this.paint(o.toString()));
    }

    @Override
    public void println(Object o) {
        canvas.println(this.paint(o.toString()));
    }
}
