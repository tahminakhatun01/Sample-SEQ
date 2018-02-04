package com.www.test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FileReader {

	@Test
	public void getItem()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file://Users//shuily//desktop//practice.html");
		String product=driver.findElement(By.xpath("html/body/div[1]/span[5]")).getText();
		System.out.println(product);
		String product2=driver.findElement(By.xpath("html/body/div[1]/span[9]")).getText();
		System.out.println(product2);
		int size=driver.findElements(By.xpath("html/body/div[1]/span")).size();
		HashMap<String,String> storeValue=new HashMap<String,String>();
		for(int i=1;i<=size;i++)
		{
			String key=driver.findElement(By.xpath("html/body/div[1]/span["+i+"]")).getText();
			i++;
			String value=driver.findElement(By.xpath("html/body/div[1]/span["+i+"]")).getText();
			storeValue.put(key, value);
		}
		Iterator i=storeValue.entrySet().iterator();
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println("the key is "+e.getKey()+" and value is "+ e.getValue());
		}
		
	}

}
