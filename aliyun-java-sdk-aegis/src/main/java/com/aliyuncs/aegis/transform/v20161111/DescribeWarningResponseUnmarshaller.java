/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeWarningResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWarningResponseUnmarshaller {

	public static DescribeWarningResponse unmarshall(DescribeWarningResponse describeWarningResponse, UnmarshallerContext context) {
		
		describeWarningResponse.setRequestId(context.stringValue("DescribeWarningResponse.RequestId"));
		describeWarningResponse.setCount(context.integerValue("DescribeWarningResponse.Count"));
		describeWarningResponse.setPageSize(context.integerValue("DescribeWarningResponse.PageSize"));
		describeWarningResponse.setTotalCount(context.integerValue("DescribeWarningResponse.TotalCount"));
		describeWarningResponse.setCurrentPage(context.integerValue("DescribeWarningResponse.CurrentPage"));

		List<String> warnings = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeWarningResponse.Warnings.Length"); i++) {
			warnings.add(context.stringValue("DescribeWarningResponse.Warnings["+ i +"]"));
		}
		describeWarningResponse.setWarnings(warnings);
	 
	 	return describeWarningResponse;
	}
}