import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.datatable.bootstrap.DataTablesBootstrapPageConfigurator;
import com.jwebmp.plugins.datatable.bootstrap.implementations.DataTablesBootstrapModuleInclusion;

module com.jwebmp.plugins.datatable.bootstrap {

    exports com.jwebmp.plugins.datatable.bootstrap;

    requires com.jwebmp.client;
    requires com.jwebmp.core;

    requires transitive com.jwebmp.plugins.datatable;
    requires transitive com.jwebmp.plugins.bootstrap;
    requires transitive com.jwebmp.core.base.angular.client;

    opens com.jwebmp.plugins.datatable.bootstrap to com.google.guice;

    provides IPageConfigurator with DataTablesBootstrapPageConfigurator;
    provides IGuiceScanModuleInclusions with DataTablesBootstrapModuleInclusion;

}
