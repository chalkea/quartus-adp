import ui.PageFactory;

public class TestFramework {
    public TestFramework() {
    }
    public void isAccessible() throws Exception {
        PageFactory.init(HomePage.class);
    }
}
