/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.datatable.bootstrap;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;
import jakarta.validation.constraints.NotNull;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "Data Tables",
        pluginUniqueName = "data-tables-bootstrap",
        pluginDescription = "DataTables is a plug-in for the " +
                "jQuery Javascript library. " +
                "It is a highly flexible " +
                "tool, based upon the " +
                "foundations of progressive " +
                "enhancement, and will add advanced interaction  controls  to any  HTML  table .",
        pluginVersion = "1.10.22",
        pluginDependancyUniqueIDs = "jquery,bootstrap",
        pluginCategories = "jquery,datatables, tables, ui, " + "web, framework",
        pluginSubtitle = "DataTables is very simple to use as a jQuery plug-in with a huge range of customisable option",
        pluginGitUrl = "https://github.com/GedMarc/JWebMP-DataTablesPlugin",
        pluginSourceUrl = "https://datatables" + "" + ".net/download/index",
        pluginWikiUrl = "https://github.com/GedMarc/JWebMP-DataTablesPlugin/wiki",
        pluginOriginalHomepage = "https://www.datatables.net/",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.forms/jwebmp-data-tables",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginLastUpdatedDate = "2021/09/05",
        pluginGroupId = "com.jwebmp.plugins.forms",
        pluginArtifactId = "jwebmp-data-tables-bootstrap",
        pluginModuleName = "com.jwebmp.plugins.datatable",
        pluginStatus = PluginStatus.Released
)
@TsDependency(value = "datatables.net-bs5", version = "*")
@TsDependency(value = "datatables.net-autofill-bs5", version = "*")
@TsDependency(value = "datatables.net-buttons-bs5", version = "*")
@TsDependency(value = "datatables.net-colreorder-bs5", version = "*")
@TsDependency(value = "datatables.net-datetime", version = "*")
@TsDependency(value = "datatables.net-fixedcolumns-bs5", version = "*")
@TsDependency(value = "datatables.net-fixedheader-bs5", version = "*")
@TsDependency(value = "datatables.net-keytable-bs5", version = "*")
@TsDependency(value = "datatables.net-responsive", version = "*")
@TsDependency(value = "datatables.net-responsive-bs5", version = "*")
@TsDependency(value = "datatables.net-rowgroup-bs5", version = "*")
@TsDependency(value = "datatables.net-rowreorder-bs5", version = "*")
@TsDependency(value = "datatables.net-scroller-bs5", version = "*")
@TsDependency(value = "datatables.net-searchbuilder-bs5", version = "*")
@TsDependency(value = "datatables.net-searchpanes-bs5", version = "*")
@TsDependency(value = "datatables.net-select-bs5", version = "*")
@TsDependency(value = "datatables.net-staterestore-bs5", version = "*")

@NgScript("datatables.net-bs5/js/dataTables.bootstrap5.js")
@NgStyleSheet("datatables.net-bs5/css/dataTables.bootstrap5.css")


@NgScript("datatables.net-autofill-bs5/js/autoFill.bootstrap5.js")
@NgStyleSheet("datatables.net-autofill-bs5/css/autoFill.bootstrap5.css")

@NgScript("datatables.net-buttons-bs5/js/buttons.bootstrap5.js")
@NgStyleSheet("datatables.net-buttons-bs5/css/buttons.bootstrap5.css")

@NgScript("datatables.net-colreorder-bs5/js/colReorder.bootstrap5.js")
@NgStyleSheet("datatables.net-colreorder-bs5/css/colReorder.bootstrap5.css")

@NgScript("datatables.net-fixedcolumns-bs5/js/fixedColumns.bootstrap5.js")
@NgStyleSheet("datatables.net-fixedcolumns-bs5/css/fixedColumns.bootstrap5.css")

@NgScript("datatables.net-fixedheader-bs5/js/fixedHeader.bootstrap5.js")
@NgStyleSheet("datatables.net-fixedheader-bs5/css/fixedHeader.bootstrap5.css")

@NgScript("datatables.net-keytable-bs5/js/keyTable.bootstrap5.js")
@NgStyleSheet("datatables.net-keytable-bs5/css/keyTable.bootstrap5.css")


@NgScript("datatables.net-responsive-bs5/js/responsive.bootstrap5.js")
@NgStyleSheet("datatables.net-responsive-bs5/css/responsive.bootstrap5.css")

@NgScript("datatables.net-rowgroup-bs5/js/rowGroup.bootstrap5.js")
@NgStyleSheet("datatables.net-rowgroup-bs5/css/rowGroup.bootstrap5.css")

@NgScript("datatables.net-rowreorder-bs5/js/rowReorder.bootstrap5.js")
@NgStyleSheet("datatables.net-rowreorder-bs5/css/rowReorder.bootstrap5.css")

@NgScript("datatables.net-scroller-bs5/js/scroller.bootstrap5.js")
@NgStyleSheet("datatables.net-scroller-bs5/css/scroller.bootstrap5.css")

@NgScript("datatables.net-searchbuilder-bs5/js/searchBuilder.bootstrap5.js")
@NgStyleSheet("datatables.net-searchbuilder-bs5/css/searchBuilder.bootstrap5.css")

@NgScript("datatables.net-searchpanes-bs5/js/searchPanes.bootstrap5.js")
@NgStyleSheet("datatables.net-searchpanes-bs5/css/searchPanes.bootstrap5.css")

@NgScript("datatables.net-select-bs5/js/select.bootstrap5.js")
@NgStyleSheet("datatables.net-select-bs5/css/select.bootstrap5.css")

@NgScript("datatables.net-staterestore-bs5/js/stateRestore.bootstrap5.js")
@NgStyleSheet("datatables.net-staterestore-bs5/css/stateRestore.bootstrap5.css")

public class DataTablesBootstrapPageConfigurator
        implements IPageConfigurator<DataTablesBootstrapPageConfigurator>
{
    public DataTablesBootstrapPageConfigurator()
    {
        //Nothing Needed
    }

    @NotNull
    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }

}
