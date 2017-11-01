package com.smartsheet.api.sdk_test;
/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2014 Smartsheet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * %[license]
 */


import com.smartsheet.api.Smartsheet;
import com.smartsheet.api.SmartsheetBuilder;
import com.smartsheet.api.SmartsheetException;
import com.smartsheet.api.models.*;
import com.smartsheet.api.models.enums.ColumnInclusion;
import com.smartsheet.api.models.enums.ColumnType;
import com.smartsheet.api.models.enums.Symbol;
import com.smartsheet.api.models.enums.SystemColumnType;
import com.smartsheet.api.oauth.Token;
import java.util.stream.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SheetTests {

	
	@Test
	public void ListSheets_NoParams() throws Exception
	{
		Smartsheet ss =  HelperFunctions.SetupClient("List Sheets - No Params");
		PagedResult<Sheet> sheets = ss.sheetResources().listSheets(null, null, null);
		boolean foundObject = false;
		for(Sheet sheet: sheets.getData()){
			if(sheet.getName().equals("Copy of Sample Sheet")) {
				foundObject = true;
				break;
			}
		}
		Assert.assertTrue(foundObject);
	}

}