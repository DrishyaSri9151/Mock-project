package com.mysite.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


@Model(adaptables = SlingHttpServletRequest.class,
        adapters= AuthorBlog.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AuthorblogImpl implements AuthorBlog{
   // private static final Logger LOG = (Logger) LoggerFactory.getLogger(AuthorblogImpl.class);

    @Inject
    Resource componentResource;
    @ValueMapValue
    @Default(values="TTN")
    String blogpage;

    @ValueMapValue
    private List<String> blogs;


    @Override
    public String getBlogpage() {
        return blogpage;
    }

    @Override
    public List<String> getAuthorBlogs() {
      if(blogs!=null){
          return new ArrayList<String>(blogs);
        }else{
          return Collections.emptyList();
      }
    }
}
