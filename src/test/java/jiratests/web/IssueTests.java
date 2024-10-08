package jiratests.web;

import jiratests.core.JiraBaseWebTest;
import jiratests.enums.IssueType;
import jiratests.enums.Priority;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IssueTests extends JiraBaseWebTest {

    public static final String ISSUE_TYPE = String.valueOf(IssueType.STORY);
    public static final String SUMMARY = String.format("Automated %s creation", ISSUE_TYPE);
    public static final String TASK_DESC = "Automating test for React dropdown component...";
    public static final String PRIORITY = Priority.LOW.getValue();

    @Test
    public void createStory() {
        jiraProjectsPage.createIssue(ISSUE_TYPE, SUMMARY, TASK_DESC, PRIORITY);
        Assertions.assertTrue(jiraProjectsPage.issueCreated());
    }

    @Test
    public void createBug() {
        jiraProjectsPage.createIssue(String.valueOf(IssueType.BUG), SUMMARY, TASK_DESC, PRIORITY);
        Assertions.assertTrue(jiraProjectsPage.issueCreated());
    }

    @Test
    public void linkStoryToBug() {

    }

}

