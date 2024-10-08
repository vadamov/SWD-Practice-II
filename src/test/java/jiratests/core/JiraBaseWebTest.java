package jiratests.core;

import com.jira.pages.AtlassianHomePage;
import com.jira.pages.JiraProjectsPage;
import com.jira.pages.LoginPage;
import jiratests.enums.TestData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import testframework.PropertiesManager;
import testframework.core.BaseWebTest;


public class JiraBaseWebTest extends BaseWebTest {

    protected LoginPage loginPage;
    protected AtlassianHomePage atlassianHomePage;
    protected JiraProjectsPage jiraProjectsPage;

    @BeforeEach
    public void beforeTests() throws InterruptedException {

        loginPage = new LoginPage();
        atlassianHomePage = new AtlassianHomePage();
        jiraProjectsPage = new JiraProjectsPage();

        // Navigate to base page
        driver().get(PropertiesManager.getConfigProperties().getProperty("jiraBaseUrl"));

        //Login to Atlassian
        loginPage.login(TestData.USERNAME.getValue(), TestData.PASSWORD.getValue());

        //Go to Jira
        atlassianHomePage.goToJira();
    }

}

