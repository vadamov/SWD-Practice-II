package jiratests.enums;

public enum TestData {
    USERNAME("vladislav.adamov.a61@learn.telerikacademy.com"),
    PASSWORD("Vladislav1997*");

    final String value;

    TestData(String propName) {
        value = propName;
    }

    public String getValue() {
        return value;
    }
}
