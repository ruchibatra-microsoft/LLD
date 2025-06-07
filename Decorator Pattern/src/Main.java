import base.PlainText;
import base.TextComponent;
import decorator.BoldDecorator;
import decorator.ItalicDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextComponent txt=new BoldDecorator(new ItalicDecorator( new PlainText("Hello World")));
        System.out.println(txt.render());
    }
}