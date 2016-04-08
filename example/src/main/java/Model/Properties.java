package Model;

import com.netflix.config.DynamicBooleanProperty;
import com.netflix.config.DynamicIntProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

/**
 * Created by acuro on 4/7/16.
 */
public class Properties {

    private final boolean DEBUG;
    private final String logLevel;
    private final boolean saveLogs;
    private final String locale;
    private final String csClientId;
    private final String jiraEnv;
    private final int contactCustomerTransitionId;
    private final int constructionMsagCompleteTransitionId;
    private final int constructionPortCompleteTransitionId;
    private final int constructionNoPortTransitionId;
    private final int constructionManualProvisioningCompleteTransitionId;
    private final int constructionBillingReviewCompleteTransitionId;
    private final int upgradePortCompleteTransitionId;
    private final int upgradeBillingReviewCompleteTransitionId;
    private final String title;
    private final String customerService;
    private final String customerServiceEmail;
    private final String mailingAddress;
    private final String fax;
    private final String phone;
    private final String emailDomain;
    private final int emailLimit;
    private final int emailMinLength;
    private final int emailMaxLength;
    private final String queue;
    private final String netConnect;
    private final String alarmNet;
    private final String compass;
    private final String fiberhoodCity;
    private final String timeTrade;
    private final boolean twoTechniciansOnInstall;
    private final String timeTradeInstall;
    private final String earlyTerminationFees;
    private final boolean featuresEmail;
    private final boolean featuresBestContactInfo;
    private final boolean featuresHomeAutomation;
    private final boolean featuresSNAP;
    private final boolean featuresOfflineModePoller;
    private final String minimumDate;
    private final String orderQueue;
    private final String constructionQueue;
    private final String upgradeQueue;

    private static String getStringProperty(String key, String defaultValue) {
        final DynamicStringProperty property = DynamicPropertyFactory.getInstance().getStringProperty(key, defaultValue);
        return property.get();
    }

    private static boolean getBooleanProperty(String key, boolean defaultValue) {
        final DynamicBooleanProperty property = DynamicPropertyFactory.getInstance().getBooleanProperty(key, defaultValue);
        return property.get();
    }

    private static int getIntProperty(String key, int defaultValue) {
        final DynamicIntProperty property = DynamicPropertyFactory.getInstance().getIntProperty(key, defaultValue);
        return property.get();
    }

    public Properties() {
        this.DEBUG = getBooleanProperty("DEBUG", false);
        this.logLevel = getStringProperty("logLevel", "");
        this.saveLogs = getBooleanProperty("saveLogs", false);
        this.locale = getStringProperty("locale", "");
        this.csClientId = getStringProperty("csClientId", "");
        this.jiraEnv = getStringProperty("jiraEnv", "");
        this.contactCustomerTransitionId = getIntProperty("contactCustomerTransitionId", 0);
        this.constructionMsagCompleteTransitionId = getIntProperty("constructionMsagCompleteTransitionId", 0);
        this.constructionPortCompleteTransitionId = getIntProperty("constructionPortCompleteTransitionId", 0);
        this.constructionNoPortTransitionId = getIntProperty("constructionNoPortTransitionId", 0);
        this.constructionManualProvisioningCompleteTransitionId = getIntProperty("constructionManualProvisioningCompleteTransitionId", 0);
        this.constructionBillingReviewCompleteTransitionId = getIntProperty("constructionBillingReviewCompleteTransitionId", 0);
        this.upgradePortCompleteTransitionId = getIntProperty("upgradePortCompleteTransitionId", 0);
        this.upgradeBillingReviewCompleteTransitionId = getIntProperty("upgradeBillingReviewCompleteTransitionId", 0);
        this.title = getStringProperty("title", "");
        this.customerService = getStringProperty("customerService", "");
        this.customerServiceEmail = getStringProperty("customerServiceEmail", "");
        this.mailingAddress = getStringProperty("mailingAddress", "");
        this.fax = getStringProperty("fax", "");
        this.phone = getStringProperty("phone", "");
        this.emailDomain = getStringProperty("emailDomain", "");
        this.emailLimit = getIntProperty("emailLimit", 0);
        this.emailMinLength = getIntProperty("emailMinLength", 0);
        this.emailMaxLength = getIntProperty("emailMaxLength", 0);
        this.queue = getStringProperty("queue", "");
        this.netConnect = getStringProperty("netConnect", "");
        this.alarmNet = getStringProperty("alarmNet", "");
        this.compass = getStringProperty("compass", "");
        this.fiberhoodCity = getStringProperty("fiberhoodCity", "");
        this.timeTrade = getStringProperty("fiberhoodCity", "");
        this.twoTechniciansOnInstall = getBooleanProperty("twoTechniciansOnInstall", false);
        this.timeTradeInstall = getStringProperty("timeTradeInstall", "");
        this.earlyTerminationFees = getStringProperty("earlyTerminationFees", "");
        this.featuresEmail = getBooleanProperty("featuresEmail", false);
        this.featuresBestContactInfo = getBooleanProperty("featuresBestContactInfo", false);
        this.featuresHomeAutomation = getBooleanProperty("featuresHomeAutomation", false);
        this.featuresSNAP = getBooleanProperty("featuresSNAP", false);
        this.featuresOfflineModePoller = getBooleanProperty("featuresOfflineModePoller", false);
        this.minimumDate = getStringProperty("minimumDate", "");
        this.orderQueue = getStringProperty("orderQueue", "");
        this.constructionQueue = getStringProperty("constructionQueue", "");
        this.upgradeQueue = getStringProperty("upgradeQueue", "");
    }

    public boolean isDEBUG() {
        return DEBUG;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getUpgradeQueue() {
        return upgradeQueue;
    }

    public String getConstructionQueue() {
        return constructionQueue;
    }

    public boolean isFeaturesOfflineModePoller() {
        return featuresOfflineModePoller;
    }

    public boolean isSaveLogs() {
        return saveLogs;
    }

    public String getLocale() {
        return locale;
    }

    public String getCsClientId() {
        return csClientId;
    }

    public String getJiraEnv() {
        return jiraEnv;
    }

    public int getContactCustomerTransitionId() {
        return contactCustomerTransitionId;
    }

    public int getConstructionMsagCompleteTransitionId() {
        return constructionMsagCompleteTransitionId;
    }

    public int getConstructionPortCompleteTransitionId() {
        return constructionPortCompleteTransitionId;
    }

    public int getConstructionNoPortTransitionId() {
        return constructionNoPortTransitionId;
    }

    public int getConstructionManualProvisioningCompleteTransitionId() {
        return constructionManualProvisioningCompleteTransitionId;
    }

    public int getConstructionBillingReviewCompleteTransitionId() {
        return constructionBillingReviewCompleteTransitionId;
    }

    public int getUpgradePortCompleteTransitionId() {
        return upgradePortCompleteTransitionId;
    }

    public int getUpgradeBillingReviewCompleteTransitionId() {
        return upgradeBillingReviewCompleteTransitionId;
    }

    public String getTitle() {
        return title;
    }

    public String getCustomerService() {
        return customerService;
    }

    public String getCustomerServiceEmail() {
        return customerServiceEmail;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public String getFax() {
        return fax;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public int getEmailLimit() {
        return emailLimit;
    }

    public int getEmailMinLength() {
        return emailMinLength;
    }

    public int getEmailMaxLength() {
        return emailMaxLength;
    }

    public String getQueue() {
        return queue;
    }

    public String getNetConnect() {
        return netConnect;
    }

    public String getAlarmNet() {
        return alarmNet;
    }

    public String getCompass() {
        return compass;
    }

    public String getFiberhoodCity() {
        return fiberhoodCity;
    }

    public String getTimeTrade() {
        return timeTrade;
    }

    public boolean isTwoTechniciansOnInstall() {
        return twoTechniciansOnInstall;
    }

    public String getTimeTradeInstall() {
        return timeTradeInstall;
    }

    public String getEarlyTerminationFees() {
        return earlyTerminationFees;
    }

    public boolean isFeaturesEmail() {
        return featuresEmail;
    }

    public boolean isFeaturesBestContactInfo() {
        return featuresBestContactInfo;
    }

    public boolean isFeaturesHomeAutomation() {
        return featuresHomeAutomation;
    }

    public boolean isFeaturesSNAP() {
        return featuresSNAP;
    }

    public String getMinimumDate() {
        return minimumDate;
    }

    public String getOrderQueue() {
        return orderQueue;
    }

}
