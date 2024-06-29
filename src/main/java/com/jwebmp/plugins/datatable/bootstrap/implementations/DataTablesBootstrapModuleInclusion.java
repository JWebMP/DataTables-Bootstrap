package com.jwebmp.plugins.datatable.bootstrap.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;

import java.util.Set;

public class DataTablesBootstrapModuleInclusion implements IGuiceScanModuleInclusions<DataTablesBootstrapModuleInclusion>
{
    @Override
    public Set<String> includeModules()
    {
        return Set.of("com.jwebmp.plugins.datatable.bootstrap");
    }
}
