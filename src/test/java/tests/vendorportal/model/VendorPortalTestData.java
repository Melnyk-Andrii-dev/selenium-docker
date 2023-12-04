package tests.vendorportal.model;

public class VendorPortalTestData {
    private String username;
    private String password;
    private String monthlyEarning;
    private String annualEarning;
    private String profitMargin;
    private String availableInventory;
    private String searchKeyword;
    private int searchResultsCount;

    public VendorPortalTestData() {
    }

    public String getUsername() {
        return username;
    }

    public VendorPortalTestData setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public VendorPortalTestData setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getMonthlyEarning() {
        return monthlyEarning;
    }

    public VendorPortalTestData setMonthlyEarning(String monthlyEarning) {
        this.monthlyEarning = monthlyEarning;
        return this;
    }

    public String getAnnualEarning() {
        return annualEarning;
    }

    public VendorPortalTestData setAnnualEarning(String annualEarning) {
        this.annualEarning = annualEarning;
        return this;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public VendorPortalTestData setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
        return this;
    }

    public String getAvailableInventory() {
        return availableInventory;
    }

    public VendorPortalTestData setAvailableInventory(String availableInventory) {
        this.availableInventory = availableInventory;
        return this;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public VendorPortalTestData setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }

    public int getSearchResultsCount() {
        return searchResultsCount;
    }

    public VendorPortalTestData setSearchResultsCount(int searchResultsCount) {
        this.searchResultsCount = searchResultsCount;
        return this;
    }
}
