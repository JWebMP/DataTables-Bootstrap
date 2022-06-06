package com.jwebmp.plugins.datatable.bootstrap;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.annotations.references.*;
import com.jwebmp.core.base.html.*;

@NgComponent("dt-bs-test")
@NgComponentReference(DataTableDataServiceExample.class)
public class DataTableBootstrapTest extends DataTableBootstrap<TableRow<?>, DataTableBootstrapTest>
{
	
	public DataTableBootstrapTest()
	{
		super("dtid", new TableHeaderGroup<>().add(new TableRow<>()
						.add(new TableHeaderCell<>("Cell 1"))
						.add(new TableHeaderCell<>("Cell 2"))
						.add(new TableHeaderCell<>("Cell 3"))
				),
				new DataTableDataServiceExample());
		getBodyGroup().add(new TableRow<>().addAttribute("*ngFor", "let dd of data")
				.add(new TableCell<>("{{dd.name}}"))
				.add(new TableCell<>("{{dd.name}}"))
				.add(new TableCell<>("{{dd.name}}"))
		);
	}
}