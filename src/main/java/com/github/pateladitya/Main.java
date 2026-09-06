import com.github.pateladitya.Ink;
import com.github.pateladitya.Paint;
import com.github.pateladitya.Style;

void main() {
    IO.println(Paint.of("Test").style(Style.UNDERLINE).fg(Ink.BLACK).bg(Ink.CYAN).style(Style.ITALIC));
}