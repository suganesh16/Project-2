package com.spicejet.Test;

import org.testng.annotations.Test;

import com.spicejet.Utils.SeWrappers;
import com.spicejet.Utils.SpicejetWrappers;

public class BookingTest extends SeWrappers {
SeWrappers se=new SeWrappers();
	
	SpicejetWrappers Sw= new SpicejetWrappers();
	
	@Test
	public void Booking() {
		try
		{
			Sw.Bookin();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
