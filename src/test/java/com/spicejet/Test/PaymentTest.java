package com.spicejet.Test;

import org.testng.annotations.Test;

import com.spicejet.Utils.SeWrappers;
import com.spicejet.Utils.SpicejetWrappers;

public class PaymentTest  extends SeWrappers{

SeWrappers se=new SeWrappers();
	
	SpicejetWrappers Sw= new SpicejetWrappers();
	
	@Test
	public void Payment() {
		try
		{
			Sw.Payment();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
