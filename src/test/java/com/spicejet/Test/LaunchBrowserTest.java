package com.spicejet.Test;

import org.testng.annotations.Test;

import com.spicejet.Utils.SeWrappers;
import com.spicejet.Utils.SpicejetWrappers;

public class LaunchBrowserTest extends SeWrappers {

	SeWrappers se=new SeWrappers();
	
	SpicejetWrappers Sw= new SpicejetWrappers();
	
	@Test
	
	public void launchBrowser() {
		try
		{
			launchBrowser("https://www.spicejet.com/");
			Sw.launchSpiceject();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
