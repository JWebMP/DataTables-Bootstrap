package com.jwebmp.plugins.datatable.bootstrap;

import com.guicedee.guicedinjection.*;
import com.guicedee.guicedservlets.undertow.*;
import com.guicedee.logger.*;
import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.angular.services.*;
import com.jwebmp.core.base.angular.services.compiler.*;
import org.junit.jupiter.api.*;

import java.io.*;
import java.util.logging.*;

import static com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils.*;


@NgApp(name = "dtbsapp", bootComponent = DataTableKitchenSink.class)
public class DTBSApp extends NGApplication<DTBSApp>
{
	public DTBSApp()
	{
		getOptions().setTitle("DataTables Bootstrap Kitchen Sink");
	}
	
	public static void main(String[] args) throws Exception
	{
		LogFactory.configureDefaultLogHiding();
		LogFactory.configureConsoleColourOutput(Level.FINE);
		GuicedUndertow.boot("localhost", 6524);
	}
	
	@Test
	public void testAppSearch() throws IOException
	{
		GuiceContext.inject();
		
		for (INgApp<?> app : JWebMPTypeScriptCompiler.getAllApps())
		{
			JWebMPTypeScriptCompiler compiler = new JWebMPTypeScriptCompiler(app);
			
			System.out.println("Generating @NgApp (" + getTsFilename(app.getClass()) + ") " +
			                   "in folder " + IComponent.getClassDirectory(app.getClass()));
			System.out.println("================");
			//	compiler.renderAppTS(app);
			System.out.println("================");
		}
	}
}
