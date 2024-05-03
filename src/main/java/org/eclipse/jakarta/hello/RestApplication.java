package org.eclipse.jakarta.hello;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.jakarta.hello.ws.HelloWorldWs;
import org.eclipse.jakarta.hello.ws.MessageWs;


import java.util.Set;

@ApplicationScoped
@ApplicationPath("ws/")
public class RestApplication extends Application {




    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestFullResourceClasses(resources);
        return resources;
    }

    /**
     * Method to add rest full resources
     * @param resources
     */
    private void addRestFullResourceClasses(Set<Class<?>> resources) {
        resources.add(HelloWorldWs.class);
        resources.add(MessageWs.class);

    }

}
