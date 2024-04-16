package pageobjects;

public enum HtmlTag {
    H1("h1"),
    H2("h2"),
    H3("h3"),
    H4("h4"),
    ANCHOR("a"),
    DIV("div");
    private String value;
    HtmlTag(String value) {
        this.value = value;
    }
    protected String getValue() {
        return value;
    }
}
