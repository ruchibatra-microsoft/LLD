package base;

public class PlainText implements TextComponent{
    String s;
    public PlainText(String s){
        this.s=s;
    }
    @Override
    public String render() {
        return this.s;
    }
}
