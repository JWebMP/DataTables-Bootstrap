package com.jwebmp.plugins.datatable.bootstrap;

import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

@NgDataType
public class DTData implements INgDataType<DTData>
{
	private String name;
	private String description;
	private String group;
	
	public String getName()
	{
		return name;
	}
	
	public DTData setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public DTData setDescription(String description)
	{
		this.description = description;
		return this;
	}
	
	public String getGroup()
	{
		return group;
	}
	
	public DTData setGroup(String group)
	{
		this.group = group;
		return this;
	}
}
