package com.smartsheet.api.sdk_test;

import com.smartsheet.api.Smartsheet;
import com.smartsheet.api.SmartsheetBuilder;
import com.smartsheet.api.oauth.Token;

public class HelperFunctions {
	public static Smartsheet SetupClient(String apiScenario){
		Token token = new Token();
		token.setAccessToken("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		Smartsheet ss = new SmartsheetBuilder()
				.setBaseURI("http://localhost:8082/")
				.setAccessToken(token.getAccessToken())
				.setAPIScenario(apiScenario)
				.build();

		return ss;
	}
}