package com.twilio;

import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

public class MakeCall {
	
	public static final String ACCOUNT_SID = "AC72c3d5a86e8a08a277ae75db67b2eac2";
	public static final String AUTH_TOKEN= "Twilio Token";

	public static void main(String[] args) throws URISyntaxException {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		String to = "+37254580605";
        String from = "+19294292757";
        
        Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
                new URI("http://demo.twilio.com/docs/voice.xml")
                ).create();
		
		/*
		 * Call call = Call.creator( new PhoneNumber(System.getenv("MY_PHONE_NUMBER")),
		 * new PhoneNumber("+19294292757"), new
		 * URI("http://demo.twilio.com/docs/voice.xml") ).create();
		 */
		
		System.out.println(call.getSid());

	}

}
