package Basc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://magento2-demo.scandiweb.com/admin");
		Thread.sleep(100);

		driver.navigate().refresh();
		Thread.sleep(100);
		driver.manage().window().maximize();

		Thread.sleep(100);

// Username & password scandiweb scandiweb 

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("scandiweb");

		WebElement password = driver.findElement(By.id("login"));
		password.sendKeys("admin1234");

		WebElement Click = driver.findElement(By.xpath("//button[@class=\"action-login action-primary\"]"));
		Click.click();

		boolean truevalue = Click.equals(Click);

		if (truevalue) {
			System.out.println("User redirect to the dashboard for the magento");
		} else {
			System.out.println("User did not redirect to the dashboard");
		}

		driver.navigate().refresh();

		WebElement Sales = driver.findElement(By.id("menu-magento-sales-sales"));
		Sales.click();

		Thread.sleep(200);

		WebElement Catalog = driver.findElement(By.id("menu-magento-catalog-catalog"));
		Catalog.click();

		Thread.sleep(200);

		WebElement Customers = driver.findElement(By.id("menu-magento-customer-customer"));
		Customers.click();

		Thread.sleep(200);

		WebElement Marketing = driver.findElement(By.id("menu-magento-backend-marketing"));
		Marketing.click();

		Thread.sleep(200);

		WebElement Content = driver.findElement(By.id("menu-magento-backend-content"));
		Content.click();

		Thread.sleep(200);

		WebElement Reports = driver.findElement(By.id("menu-magento-reports-report"));
		Reports.click();

		Thread.sleep(200);

		WebElement Scandiweb = driver.findElement(By.id("menu-scandiweb-core-all"));
		Scandiweb.click();

		Thread.sleep(200);

		WebElement Store = driver.findElement(By.id("menu-magento-backend-stores"));
		Store.click();

		Thread.sleep(200);

		WebElement System = driver.findElement(By.id("menu-magento-backend-system"));
		System.click();

		Thread.sleep(200);

		WebElement Dashboard = driver.findElement(By.id("menu-magento-backend-dashboard"));
		Dashboard.click();

		Thread.sleep(400);

// Click on the reload the data 

		WebElement ReloadData = driver.findElement(By.xpath("//button[@class=\"action-primary\"]"));
		ReloadData.click();

		Thread.sleep(400);
		
		  WebElement AddvancedReport =
		  driver.findElement(By.xpath("//a[@class=\"action action-advanced-reports\"]")
		  ); AddvancedReport.click();
		  
		  Thread.sleep(1000);
		  
		  driver.navigate().back();
		 

		driver.getWindowHandles();
		

// Click on the sales tab
		/*
		 * WebElement Sales2 = driver.findElement(By.id("menu-magento-sales-sales"));
		 * Sales2.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement order =
		 * driver.findElement(By.id("menu-magento-sales-sales-order")); order.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement invoice =
		 * driver.findElement(By.id("menu-magento-sales-sales-invoice"));
		 * invoice.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Shipment =
		 * driver.findElement(By.id("menu-magento-sales-sales-shipment"));
		 * Shipment.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Credit_Memoms =
		 * driver.findElement(By.id("menu-magento-sales-sales")); Credit_Memoms.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Billing_Aggrement =
		 * driver.findElement(By.id("menu-magento-sales-sales-creditmemo"));
		 * Billing_Aggrement.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Transactions =
		 * driver.findElement(By.id("menu-magento-sales-sales-transactions"));
		 * Transactions.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Braintree_Virtual =
		 * driver.findElement(By.id("menu-paypal-braintree-virtual-terminal"));
		 * Braintree_Virtual.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Catlaloug
		 * 
		 * WebElement Catalog2 =
		 * driver.findElement(By.id("menu-magento-catalog-catalog")); Catalog2.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Product =
		 * driver.findElement(By.id("menu-magento-catalog-catalog-products"));
		 * Product.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Categories =
		 * driver.findElement(By.id("menu-magento-catalog-catalog-categories"));
		 * Categories.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Customers
		 * 
		 * WebElement Customers2 =
		 * driver.findElement(By.id("menu-magento-customer-customer"));
		 * Customers2.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement All_Customer =
		 * driver.findElement(By.id("menu-magento-customer-customer-manage"));
		 * All_Customer.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement New_Online =
		 * driver.findElement(By.id("menu-magento-customer-customer-online"));
		 * New_Online.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Loin_As_Customre =
		 * driver.findElement(By.id("menu-magento-loginascustomerlog-login-log"));
		 * Loin_As_Customre.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Customer_Group =
		 * driver.findElement(By.id("menu-magento-customer-customer-group"));
		 * Customer_Group.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Customer
		 * 
		 * WebElement Marketing2 =
		 * driver.findElement(By.id("menu-magento-backend-marketing"));
		 * Marketing2.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Promotions
		 * 
		 * WebElement catalogrule =
		 * driver.findElement(By.id("menu-magento-catalogrule-promo-catalog"));
		 * catalogrule.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Cartrule =
		 * driver.findElement(By.id("menu-magento-salesrule-promo-quote"));
		 * Cartrule.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Communitcation
		 * 
		 * WebElement emailtemplate =
		 * driver.findElement(By.id("menu-magento-email-template"));
		 * emailtemplate.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement newslettertemplate =
		 * driver.findElement(By.id("menu-magento-newsletter-newsletter-template"));
		 * newslettertemplate.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement newsletterqueue =
		 * driver.findElement(By.id("menu-magento-newsletter-newsletter-queue"));
		 * newsletterqueue.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement newslettersubscriber =
		 * driver.findElement(By.id("menu-magento-newsletter-newsletter-subscriber"));
		 * newslettersubscriber.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Seo & Search
		 * 
		 * WebElement urlrewrite =
		 * driver.findElement(By.id("menu-magento-urlrewrite-urlrewrite"));
		 * Marketing2.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Search_Terms =
		 * driver.findElement(By.id("menu-magento-search-search-terms"));
		 * Search_Terms.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement searchsynonyms =
		 * driver.findElement(By.id("menu-magento-search-search-synonyms"));
		 * searchsynonyms.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement sitemap =
		 * driver.findElement(By.id("menu-magento-sitemap-catalog-sitemap"));
		 * sitemap.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // User content
		 * 
		 * WebElement Catalogreviews = driver
		 * .findElement(By.id("menu-magento-review-catalog-reviews-ratings-reviews-all")
		 * ); Catalogreviews.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement pendingReview = driver.findElement(By.id(
		 * "menu-magento-review-catalog-reviews-ratings-pending"));
		 * pendingReview.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Content
		 * 
		 * WebElement Content2 =
		 * driver.findElement(By.id("menu-magento-backend-content")); Content2.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * //Element WebElement Pages =
		 * driver.findElement(By.id("menu-magento-cms-cms-page")); Pages.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Blocks = driver.findElement(By.id("menu-magento-cms-cms-block"));
		 * Blocks.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Widght =
		 * driver.findElement(By.id("menu-magento-widget-cms-widget-instance"));
		 * Widght.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Design
		 * 
		 * WebElement Confuigration =
		 * driver.findElement(By.id("menu-magento-theme-design-config"));
		 * Confuigration.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Theme =
		 * driver.findElement(By.id("menu-magento-theme-system-design-theme"));
		 * Theme.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Schedule =
		 * driver.findElement(By.id("menu-magento-backend-system-design-schedule"));
		 * Schedule.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * //Reports WebElement Reports2 =
		 * driver.findElement(By.id("menu-magento-reports-report")); Reports2.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * //ReportsMarketing
		 * 
		 * WebElement ProductCart = driver.findElement(By.id("")); ProductCart.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Searchterms = driver.findElement(By.id("")); Searchterms.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement abandonedCart = driver.findElement(By.id(""));
		 * abandonedCart.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement newsletterReport = driver.findElement(By.id(""));
		 * newsletterReport.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * //Sales
		 * 
		 * WebElement Order = driver.findElement(By.id("")); Order.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Tax = driver.findElement(By.id("")); Tax.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Invoiced = driver.findElement(By.id("")); Invoiced.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Shipping = driver.findElement(By.id("")); Shipping.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Refunds = driver.findElement(By.id("")); Refunds.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Coupan = driver.findElement(By.id("")); Coupan.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement PaypalSettlement = driver.findElement(By.id(""));
		 * PaypalSettlement.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Braintreesettlement = driver.findElement(By.id(""));
		 * Braintreesettlement.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * //Reivew
		 * 
		 * WebElement ByCustomer =
		 * driver.findElement(By.id("menu-magento-review-report-review-customer"));
		 * ByCustomer.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement ByProduct =
		 * driver.findElement(By.id("menu-magento-review-report-review-product"));
		 * ByProduct.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Customres
		 * 
		 * WebElement OrderTotal =
		 * driver.findElement(By.id("menu-magento-reports-report-customers-totals"));
		 * OrderTotal.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement orderCount =
		 * driver.findElement(By.id("menu-magento-reports-report-customers-orders"));
		 * orderCount.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement New =
		 * driver.findElement(By.id("menu-magento-reports-report-customers-accounts"));
		 * New.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Products
		 * 
		 * WebElement Views =
		 * driver.findElement(By.id("menu-magento-reports-report-products-viewed"));
		 * Views.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement BestSeller =
		 * driver.findElement(By.id("menu-magento-reports-report-products-bestsellers"))
		 * ; BestSeller.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement LowStock =
		 * driver.findElement(By.id("menu-magento-reports-report-products-lowstock"));
		 * LowStock.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Ordered =
		 * driver.findElement(By.id("menu-magento-reports-report-products-sold"));
		 * Ordered.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * WebElement Downloads = driver.findElement(By.id(
		 * "menu-magento-downloadable-report-products-downloads")); Downloads.click();
		 * 
		 * Thread.sleep(200);
		 * 
		 * // Refresh Statistics
		 * 
		 * WebElement Statistics =
		 * driver.findElement(By.id("menu-magento-reports-report-statistics"));
		 * Statistics.click();
		 * 
		 * Thread.sleep(200);
		 */
	}
}
