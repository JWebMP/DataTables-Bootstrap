import com.jwebmp.core.services.*;
import com.jwebmp.plugins.datatable.bootstrap.*;

module com.jwebmp.plugins.datatable.bootstrap {
	
	exports com.jwebmp.plugins.datatable.bootstrap;
	
	requires transitive com.jwebmp.plugins.datatable;
	requires transitive com.jwebmp.plugins.bootstrap;
	requires transitive com.jwebmp.core.base.angular.client;
	
	opens com.jwebmp.plugins.datatable.bootstrap to com.google.guice;
	
	provides IPageConfigurator with DataTablesBootstrapPageConfigurator;
	
}
