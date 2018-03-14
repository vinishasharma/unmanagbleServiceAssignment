package com.knoldus.serviceImpl;

import com.google.inject.AbstractModule;
import com.knoldus.services.AssignmentService;
import com.knoldus.services.PageExternalService;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class AssignemntModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindService(AssignmentService.class, AssignmentServiceImpl.class);
        bindClient(PageExternalService.class);
    }
}
