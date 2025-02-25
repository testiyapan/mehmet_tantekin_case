package interfaces;

public interface IHomePage {
    boolean isHomePageOpened();

    String getHomePageTitle();

    boolean isNavigationMenuDisplayed();

    void clickLoginButton();

    void clickLoginButtonAndSwitchToNewTab();

    void navigateToCareers();
}
