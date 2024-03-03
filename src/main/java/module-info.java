import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.datatable.bootstrap.DataTablesBootstrapPageConfigurator;

module com.jwebmp.plugins.datatable.bootstrap {

    exports com.jwebmp.plugins.datatable.bootstrap;

    requires com.jwebmp.client;
    requires com.jwebmp.core;

    requires transitive com.jwebmp.plugins.datatable;
    requires transitive com.jwebmp.plugins.bootstrap;
    requires transitive com.jwebmp.core.base.angular.client;

    opens com.jwebmp.plugins.datatable.bootstrap to com.google.guice;

    provides IPageConfigurator with DataTablesBootstrapPageConfigurator;

}
