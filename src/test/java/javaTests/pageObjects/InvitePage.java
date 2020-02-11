package javaTests.pageObjects;

import helpers.DriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InvitePage extends DriverWait {

    public InvitePage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //Button:
    @AndroidFindBy(id = "com.XXX.client:id/add_invite")
    public MobileElement createInviteBtn;
    @AndroidFindBy(xpath = "//*[@content-desc='Перейти вверх']")
    public MobileElement backBtn;
    @AndroidFindBy(id = "com.XXX.client:id/swExtended")
    public MobileElement extendedAccessSwitch;
    @AndroidFindBy(id = "com.XXX.client:id/swUnlimited")
    public MobileElement unlimitedTimeSwitch;
    @AndroidFindBy(id = "com.XXX.client:id/createBtn")
    public MobileElement finishCreateInviteBtn;
    //Field:
    @AndroidFindBy(id = "com.XXX.client:id/invite_name")
    public MobileElement newInviteNameField;
    //Text:
    @AndroidFindBy(id = "com.XXX.client:id/toolbar_title")
    public MobileElement inviteScreenTitle;
    @AndroidFindBy(id = "com.XXX.client:id/info_text")
    public MobileElement placeholderText;
    @AndroidFindBy(id = "com.XXX.client:id/toolbar_title")
    public MobileElement createInviteScreenTitle;
    @AndroidFindBy(xpath = "//TextInputLayout[@text='Название приглашения']")
    public MobileElement inviteNameTitle;
    @AndroidFindBy(id = "com.XXX.client:id/extendedAccessTitle")
    public MobileElement extendedAccessTitle;
    @AndroidFindBy(xpath = "//*android.widget.RelativeLayout[3]/android.widget.TextView[2]")
    public MobileElement extendedAccessDescription;
    @AndroidFindBy(id = "com.XXX.client:id/text1")
    public MobileElement unlimitedTimeInviteTitle;
    @AndroidFindBy(xpath = "//*android.widget.RelativeLayout[4]/android.widget.TextView[2]")
    public MobileElement unlimitedTimeInviteDescription;
    @AndroidFindBy(id = "com.XXX.client:id/text")
    public MobileElement reUsableInviteTitle;
    @AndroidFindBy(xpath = "//*android.widget.RelativeLayout[5]/android.widget.TextView[2]")
    public MobileElement reUsableInviteDescription;

}

