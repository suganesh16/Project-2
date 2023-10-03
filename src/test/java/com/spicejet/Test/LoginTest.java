package com.spicejet.Test;

import org.testng.annotations.Test;

import com.spicejet.Utils.SeWrappers;
import com.spicejet.Utils.SpicejetWrappers;

public class LoginTest  extends SeWrappers{

SeWrappers se=new SeWrappers();
	
	SpicejetWrappers Sw= new SpicejetWrappers();
	
	@Test
	public void Login() {
		try
		{
			Sw.Login();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
