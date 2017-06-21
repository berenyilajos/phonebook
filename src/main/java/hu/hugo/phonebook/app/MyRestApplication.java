package hu.hugo.phonebook.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import hu.hugo.phonebook.service.PhonebookService;

@ApplicationPath("/phone")
public class MyRestApplication extends Application {
    private Set<Class<?>> classes = new HashSet<Class<?>>();
//    private Set<Object> singletons = new HashSet<Object>();
    
    public MyRestApplication() {
        classes.add(PhonebookService.class);
//        singletons.add(new IndexService());
//        singletons.add(new ResultService());
//        singletons.add(new ResultRestService());
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

//    @Override
//    public Set<Object> getSingletons() {
//        return singletons;
//    }
    
}
