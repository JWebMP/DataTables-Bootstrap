package com.jwebmp.plugins.datatable.bootstrap;

import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.datatable.*;

public class DataTableBootstrap<T extends TableRow<?>, J extends DataTableBootstrap<T, J>> extends DataTable<T,J>
{
	public DataTableBootstrap(String id, TableHeaderGroup<?> headerGroup)
	{
		super(id, headerGroup);
	}
	
	public DataTableBootstrap(String id, TableHeaderGroup<?> headerGroup, INgServiceProvider<?> dataService)
	{
		super(id, headerGroup, dataService);
	}
}
