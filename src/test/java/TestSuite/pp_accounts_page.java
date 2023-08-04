package TestSuite;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Browsers.Browsers_login;
import Objects.locators;

public class pp_accounts_page extends locators{
	@Test
	public void acc_migration_report() {
		WebElement accountdcmigrationreport1=driver.findElement(accountdcmigrationreport);
		accountdcmigrationreport1.click();
	}
	@Test
	public void acc_fax_limit_pages() {
		WebElement accountfaxlimitpages1=driver.findElement(accountfaxlimitpages);
		accountfaxlimitpages1.click(); 
	}
	@Test
	public void account_change_settings() {
		WebElement accountchangesettings1=driver.findElement(accounts_changesettings);
		accountchangesettings1.click(); 
	}
	@Test
	public void intlcalling_disable_history() {
		WebElement accountdisablehistory=driver.findElement(intlcallingdisablehistory);
		accountdisablehistory.click(); 
	}
	@Test
	public void manage_im_access() {
		WebElement manageaccess=driver.findElement(manageimaccess);
		manageaccess.click(); 
	}
	@Test
	public void manage_account_im_access() {
		WebElement manageaccimaccess=driver.findElement(manageaccountimaccess);
		manageaccimaccess.click(); 
	}
	@Test
	public void manage_call_routing_seats() {
		WebElement managecallrouting=driver.findElement(managecallroutingseats);
		managecallrouting.click(); 
	}
	@Test
	public void manage_var_demo_seats() {
		WebElement managevardemo=driver.findElement(managevardemoseats);
		managevardemo.click(); 
	}
	@Test
	public void phone_registration_settings() {
		WebElement phoneregistrationsetting=driver.findElement(phoneregistrationsettings);
		phoneregistrationsetting.click(); 
	}
	@Test
	public void search_phone_number() {
		WebElement searchphone=driver.findElement(searchaphonenumber);
		searchphone.click(); 
	}
	@Test
	public void account_upload_logo() {
		WebElement accuploadlogo=driver.findElement(accounts_uploadlogo);
		accuploadlogo.click(); 
	}
	@Test
	public void view_all_sales() {
		WebElement viewallsaless=driver.findElement(viewallsales);
		viewallsaless.click(); 
	}
	@Test
	public void view_other_data_center_accounts() {
		WebElement datacenteraccounts=driver.findElement(ViewOtherDataCenterAccounts);
		datacenteraccounts.click(); 
	}
	@Test
	public void account_intcalling_status_history() {
		WebElement acccallinghistory=driver.findElement(AccountIntlCallingStatusHistory);
		acccallinghistory.click(); 
	}
	@Test
	public void assigned_cm_directsales() {
		WebElement assigneddirectsales=driver.findElement(assigncmdirectsales);
		assigneddirectsales.click(); 
	}
	@Test
	public void assign_partnerto_cm() {
		WebElement assignpartnercm=driver.findElement(assignpartnertocm);
		assignpartnercm.click(); 
	}
	@Test
	public void assignpartnercm (){
		WebElement assignpartnertocm=driver.findElement(assignpartneraccounttocm);
		assignpartnertocm.click(); 
	}
	@Test
	public void create_partner (){
		WebElement createpartner1=driver.findElement(createpartner);
		createpartner1.click(); 
	}
	@Test
	public void csd_login (){
		WebElement csdloginn=driver.findElement(csdlogin);
		csdloginn.click(); 
	}
	@Test
	public void manage_cnam_account (){
		WebElement managecmaccounts=driver.findElement(managecnamaccounts);
		managecmaccounts.click(); 
	}
	@Test
	public void manage_international_calling (){
		WebElement manageintcalling=driver.findElement(manageinternationalcalling);
		manageintcalling.click(); 
	}
	@Test
	public void manage_quote_logins (){
		WebElement manageqlogins=driver.findElement(managequotelogins);
		manageqlogins.click(); 
	}
	@Test
	public void manage_webucc_accounts (){
		WebElement managewebuccaccnts=driver.findElement(managewebuccaccounts);
		managewebuccaccnts.click(); 
	}
	@Test
	public void  partner_provisioning(){
		WebElement partnerproving=driver.findElement(partnerprovisioing);
		partnerproving.click(); 
	}
	@Test
	public void partner_subcodes (){
		WebElement partnersubcodess=driver.findElement(partnersubcodes);
		partnersubcodess.click(); 
	}
	@Test
	public void try_ucreport (){
		WebElement tryucreports=driver.findElement(tryucreport);
		tryucreports.click(); 
	}
	@Test
	public void view_acc_groups (){
		WebElement viewaccgroups=driver.findElement(viewaccountgroups);
		viewaccgroups.click(); 
	}
	@Test
	public void veiw_admins (){
		WebElement viewadminss=driver.findElement(viewadmins);
		viewadminss.click(); 
	}
	@Test
	public void view_agents (){
		WebElement viewagentss=driver.findElement(viewagents);
		viewagentss.click(); 
	}
	@Test
	public void view_cms (){
		WebElement cms=driver.findElement(viewcms);
		cms.click(); 
	}
	@Test
	public void view_interrupted_accounts (){
		WebElement interruptedaccounts=driver.findElement(viewinterruptedaccounts);
		interruptedaccounts.click(); 
	}
	@Test
	public void view_masteragents (){
		WebElement masteragents=driver.findElement(viewmasteragents);
		masteragents.click(); 
	}
	@Test
	public void view_mastervars (){
		WebElement mastervars=driver.findElement(viewmastervars);
		mastervars.click(); 
	}
	@Test
	public void view_production_accounts (){
		WebElement productionaccounts=driver.findElement(viewproductionaccounts);
		productionaccounts.click(); 
	}
	@Test
	public void view_provision_accounts (){
		WebElement provisionaccounts=driver.findElement(viewprovisionaccounts);
		provisionaccounts.click(); 
	}
	@Test
	public void view_term_renewaccounts (){
		WebElement vtermrenewaccounts=driver.findElement(viewtermrenewaccounts);
		vtermrenewaccounts.click(); 
	}
	@Test
	public void view_trial_accounts (){
		WebElement trialaccounts=driver.findElement(viewtrialaccounts);
		trialaccounts.click(); 
	}
	@Test
	public void assign_partner_accountcm (){
		WebElement assignpartnercm=driver.findElement(viewvars);
		assignpartnercm.click(); 
	}
	@Test
	public void view_wholesalers (){
		WebElement viewwholesaler=driver.findElement(viewwholesalers);
		viewwholesaler.click(); 
	}
	@Test
	public void software_downloads (){
		WebElement softwaredownloads1=driver.findElement(softwaredownloads);
		softwaredownloads1.click(); 
	}
	@Test
	public void smartcastpp (){
		WebElement ppsmartcast=driver.findElement(smartcast);
		ppsmartcast.click(); 
	}
	@Test
	public void view_smartbox_accounts (){
		WebElement smartboxaccounts=driver.findElement(viewsmartboxaccounts);
		smartboxaccounts.click(); 
	}
	@Test
	public void view_smartbox_guests (){
		WebElement viewsmartguests=driver.findElement(viewsmartboxguests);
		viewsmartguests.click(); 
	}
	
	
	

	
	

}
