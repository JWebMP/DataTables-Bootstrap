package com.jwebmp.plugins.datatable.bootstrap;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.plugins.datatable.*;

@NgDataService("DataTableDataServiceExample")
public class DataTableDataServiceExample extends DataTableDataService<DataTableDataServiceExample>
{
	@Override
	public DynamicData getData(AjaxCall<?> call)
	{
		return new DynamicData().addData(new DTData().setName("name"))
		                        .addData(new DTData().setName("second"));
	}
	
}
