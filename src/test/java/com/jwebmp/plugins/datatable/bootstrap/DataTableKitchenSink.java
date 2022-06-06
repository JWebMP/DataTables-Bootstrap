package com.jwebmp.plugins.datatable.bootstrap;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;

@NgComponent("dt-bs-kitchen-sink")
public class DataTableKitchenSink extends DivSimple<DataTableKitchenSink>
		implements INgComponent<DataTableKitchenSink>
{
	@Override
	public void init()
	{
		add(new DataTableBootstrapTest());
		super.init();
	}
}
