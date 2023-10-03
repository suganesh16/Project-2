package com.spicejet.Test;

import org.testng.annotations.Test;

import com.spicejet.Utils.SeWrappers;
import com.spicejet.Utils.SpicejetWrappers;

public class SignInTest  extends SeWrappers{

	
      SeWrappers se=new SeWrappers();
	
	SpicejetWrappers Sw= new SpicejetWrappers();
	
	@Test 
	public void SiginIn() {
		try
		{
			Sw.SignIn();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
