package decorator;

import base.PlainText;
import base.TextComponent;

public class BoldDecorator implements TextComponent {
    TextComponent t;

    public BoldDecorator(TextComponent t){
        this.t=t;
    }

    @Override
    public String render() {
        return "<b>"+t.render()+"</b>";
    }
}
