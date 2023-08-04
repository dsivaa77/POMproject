package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Browsers.Browsers_login;

public class locators extends Browsers_login {
	
	//login page locators
	
	public static By username=By.xpath("//input[@id='xusername']");
	public static By password=By.xpath("//input[@id='password']");
	public static By loginbutton=By.xpath("//input[@value='Login']");
	
	//Quotes tab
	public static By quotetab=By.cssSelector("li[class='menusel'] span");
	
	//Lead creation page
	
	public static By Leadmanagement=By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
	
    
	public static By leadcompanyname=By.xpath("//input[@id='quote_account_companyname']");
	public static By leadfirstname=By.id("quote_account_firstname");
	public static By leadlastname=By.id("quote_account_lastname");
	public static By leadphonenumber=By.id("quote_account_phone");
	public static By leademailid=By.id("quote_account_email");
	
	public static By leadlocatinname=By.id("quote_account_location_name_0");
	public static By leadstreetaddressone=By.id("quote_account_shipping_address1_0");
	public static By leadcity=By.id("quote_account_shipping_city_0");
	public static By leadzipcode=By.id("quote_account_shipping_zip_0");
	
	public static By leadstate=By.id("quote_account_shipping_state_0");
	public static By leadshippingcountry=By.id("quote_account_shipping_country_0");
	public static By leadnotes=By.id("quote_account_others");
	public static By leadsaveandcontinue=By.id("saveandgotoquoteenable");
	
	
	//lead confirm page 
	public static By leadconfirmbutton=By.xpath("//button[@id='confirm']");
	public static By leadcancellbutton=By.id("cancelleadcreation");
	
	//Quote login page
	//public static By quotename=By.className("mdc-text-field__input");
	public static By leadname=By.name("zqhorpp");
	
	public static By selecttemplate=By.id("quote_smartquote_quote_template_id");
	public static By quotecontractterm=By.xpath("//select[@class='ng-valid ng-dirty ng-touched cdk-focused cdk-mouse-focused']");
	
	//Add New Location in quote
	public static By addnewlocation=By.xpath("//span[normalize-space()='Add a Location']");
	public static By locationid=By.id("locationname");
	public static By locationstaddress1=By.id("streetaddress1");
	public static By locationstaddress2=By.id("streetaddress2");
	public static By locationcity=By.xpath("//input[@id='city']");
	public static By locationstate=By.xpath("//select[@id='stateorprovince']");
	public static By locationcountry=By.xpath("//select[@id='country']");
	public static By locationzipcode=By.xpath("//input[@id='zipcode']");
	public static By locationsavebutton=By.xpath("//button[normalize-space()='Save']");
	
	
	//Quote page
	public static By addnewstreamsproducts=By.linkText("Add New Streams Products");
	public static By callcenterproduct=By.id("col6993");
	//public static By callcentercount=By.className("btn btn-primary savebutt ng-star-inserted");
	public static By professionalproduct=By.xpath("//div[@id='col6245']//div[@class='productlisttextmain']");
	public static By professionalcount=By.xpath("//button[@class='btn btn-primary savebutt ng-star-inserted']");
	public static By businessplusproduct=By.xpath("//div[normalize-space()='Price: $24.95']");
	public static By businesspluscount=By.xpath("//button[@class='btn btn-primary savebutt ng-star-inserted']");
	public static By businessbasicproduct=By.xpath("//div[@id='col6237']");
	public static By bbpproduct=By.xpath("//div[@id='col6241']//div[@class='productlistprice'][normalize-space()='Price: $9.95']");
	public static By bbpcount=By.xpath("//button[@class='btn btn-primary savebutt ng-star-inserted']");
	public static By okbuttonproduct=By.xpath("//button[normalize-space()='OK']");
	public static By savebuttonproduct=By.xpath("//button[@id='savebutton']");
	
	//Confirm page
	public static By cancellbuttonincofirmpage=By.xpath("//button[normalize-space()='Cancel']");
	public static By confirmbuttoninconfirmpage=By.xpath("//button[normalize-space()='Confirm']");
	
	
	//Emailid send page
	public static By sendmailid=By.xpath("//input[@id='emailforcustomer']");
	public static By sendmailcomments=By.xpath("//textarea[@id='rejectremarks']");
	public static By mailsendbutton=By.xpath("//div[@class='productinfobutton']");
	public static By alertokbutton=By.xpath("//button[@aria-label='Close dialog']");
	
	
	
	//Quote Acceptance page
	public static By quotepdf=By.xpath("//img[@src='/quoteview-images/pdf.png']");
	public static By quoteaccept=By.xpath("//button[normalize-space()='Accept']");
	
	
	//Quote acceptance details page
	public static By provisioncompanyname=By.name("quoteprovision[accountname]");
	public static By provisionfirstname=By.name("quoteprovision[firstname]");
	public static By provisionlastname=By.name("quoteprovision[lastname]");
	public static By provisiontitle=By.name("quoteprovision[title]");
	public static By provisionemailid=By.name("quoteprovision[email]");
	public static By provisionagreement=By.name("agreement");
	public static By provisionadditionalterms=By.name("additional_terms_acceptance_flag");
	public static By provisionnextbutton=By.id("prev-button");
	
	
	//Provisioning form 
	public static By provisioningaccountname=By.name("quote_provisioning_detail[accountname]");
	public static By provisioningphonenumber=By.name("quote_provisioning_detail[curphonenum]");
	public static By provisioningcompanyname=By.name("quote_provisioning_detail[companyname]");
	public static By provisioningtimezone=By.name("quote_provisioning_detail[timezone]");
	public static By provisioningindustrytype=By.name("quote_provisioning_detail[industrytype]");
	public static By provisioningfirstname=By.name("quote_provisioning_detail[firstname]");
	public static By provisioninglastname=By.name("quote_provisioning_detail[lastname]");
	public static By provisioningemailid=By.name("quote_provisioning_detail[email]");
	public static By provisioningnextbutton=By.xpath("//button[@id='submitt-button']");
	
	//Payment page
	public static By paymenteft=By.xpath("//a[@id='cc-vertical-t-1']");
	public static By paymentaccname=By.xpath("//input[@id='quote_provisioning_detail_nameOnAccount']");
	
	public static By paymentbankname=By.xpath("//input[@id='quote_provisioning_detail_bankName']");
	public static By paymentbrnumber=By.xpath("//input[@id='quote_provisioning_detail_bankRoutingNumber']");
	public static By paymentaccnumber=By.xpath("//input[@id='quote_provisioning_detail_bankAccountNumber']");
	public static By panterradetails=By.xpath("//textarea[contains(@id,'quote_provisioning_detail')]");
	public static By provisioningformfinishbutton=By.xpath("//button[@id='submitt-button']");
	
	
	//PP Home page locators
	public static By ppsettings=By.linkText("Change Settings");
	public static By ppcsdlogin=By.linkText("CSD Login");
	public static By ppuploadlogo=By.linkText("Upload Logo");
	public static By ppwebstorelink=By.linkText("Webstore URL");
	public static By ppwholesaleprogram=By.linkText("Wholesale Program");
	public static By ppblockedaccounts=By.linkText("View Blocked Accounts");
	public static By ppcm=By.linkText("View CMs");
	public static By ppinterruptedaccounts=By.linkText("View Interrupted Accounts");
	public static By ppproductionaccounts=By.linkText("View Production Accounts");
	
	public static By ppprovisionaccounts=By.linkText("View Provision Accounts");
	public static By pptrialaccounts=By.linkText("View Trial Accounts");
	public static By ppmattestresults=By.linkText("MAT Test Results");
	public static By ppsoftwaredownloads=By.linkText("Software Downloads");
	public static By homeproductionacc_count=By.xpath("//a[normalize-space()='5315']");
    public static By homeprovisionacc_count=By.xpath("//a[normalize-space()='1143']");
	public static By homeblockedacc_count=By.xpath("//a[normalize-space()='43']");
	public static By homedemoacc_count=By.xpath("//a[normalize-space()='94']");
	public static By homecmcount=By.xpath("//a[normalize-space()='436']");
	
	
	//Accounts page locators
	
	public static By accountdcmigrationreport=By.linkText("Account DC Migration Report");
	public static By accountfaxlimitpages=By.linkText("Account Fax Limit Pages");
	public static By accounts_changesettings=By.linkText("Change Settings");
	public static By intlcallingdisablehistory=By.linkText("intl. calling Disable history");
	public static By manageimaccess=By.linkText("Manage 3.8 im Access");
	public static By manageaccountimaccess=By.linkText("Manage Account IM Access");
	public static By managecallroutingseats=By.linkText("Manage Call Routing Seats");
	public static By managevardemoseats=By.linkText("Manage VAR Demo Seats");
	public static By phoneregistrationsettings=By.linkText("Phone Registration Settings");
	public static By searchaphonenumber=By.linkText("Search a Phone Number");
	public static By accounts_uploadlogo=By.linkText("Upload Logo");
	public static By viewallsales=By.linkText("View All Sales");
	public static By ViewOtherDataCenterAccounts=By.linkText("View Other Data Center Accounts");
	public static By AccountIntlCallingStatusHistory=By.linkText("Account Intl. Calling Status History");
	public static By assigncmdirectsales=By.linkText("Assign CM/Direct Sales");
	public static By assignpartnertocm=By.linkText("Assign Partner to CM");
	public static By assignpartneraccounttocm=By.linkText("Assign Partner/Account to CM");
	public static By createpartner=By.linkText("Create Partner");
	public static By csdlogin=By.linkText("CSD Login");
	public static By managecnamaccounts=By.linkText("Manage CNAM Accounts");
	public static By manageinternationalcalling=By.linkText("Manage International Calling");
	public static By managequotelogins=By.linkText("Manage Quote Logins");
	public static By managewebuccaccounts=By.linkText("Manage WebUCC Accounts");
	public static By partnerprovisioing=By.linkText("Partner Provisioning");
	public static By partnersubcodes=By.linkText("Partner Subcodes");
	public static By tryucreport=By.linkText("TryUC Report");
	public static By viewaccountgroups=By.linkText("View Account Groups");
	public static By viewadmins=By.linkText("View Admins");
	public static By viewagents=By.linkText("View Agents");
	public static By viewblockedaccounts=By.linkText("View Blocked Accounts");
	public static By viewcms=By.linkText("View CMs");
	public static By viewinterruptedaccounts=By.linkText("View Interrupted Accounts");
	public static By viewmasteragents=By.linkText("View Master Agents");
	public static By viewmastervars=By.linkText("View Master VARs");
	public static By viewproductionaccounts=By.linkText("View Production Accounts");
	public static By viewprovisionaccounts=By.linkText("View Provision Accounts");
	public static By viewtermrenewaccounts=By.linkText("View Term Renew Accounts");
	public static By viewtrialaccounts=By.linkText("View Trial Accounts");
	public static By viewvars=By.linkText("View VARs");
	public static By viewwholesalers=By.linkText("View Wholesalers");
	public static By softwaredownloads=By.linkText("Software Downloads");
	public static By smartcast=By.linkText("Smartcast");
	public static By viewsmartboxaccounts=By.linkText("View SmartBox Accounts");
	public static By viewsmartboxguests=By.linkText("View SmartBox Guests");
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
