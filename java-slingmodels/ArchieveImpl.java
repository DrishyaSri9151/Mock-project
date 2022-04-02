package com.mysite.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables= Resource.class , adapters = Archieve.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArchieveImpl implements Archieve{

    @Inject
    String link;



    @Inject
    String name;

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public String getName() {
        return name;
    }
}
