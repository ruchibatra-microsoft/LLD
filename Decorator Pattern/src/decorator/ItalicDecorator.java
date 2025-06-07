package decorator;

import base.TextComponent;

public class ItalicDecorator implements TextComponent {
    TextComponent t;

    public ItalicDecorator(TextComponent t) {
        this.t=t;
    }

    @Override
    public String render() {
        return "<I>"+t.render()+"</I>";
    }
}
