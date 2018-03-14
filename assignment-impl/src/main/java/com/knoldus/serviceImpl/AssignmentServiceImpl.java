package com.knoldus.serviceImpl;

import akka.NotUsed;
import com.google.inject.Inject;
import com.knoldus.services.AssignmentService;
import com.knoldus.services.PageExternalService;
import com.knoldus.utilities.DataResponse;
import com.lightbend.lagom.javadsl.api.ServiceCall;

public class AssignmentServiceImpl implements AssignmentService {
    PageExternalService pageExternalService;

    @Inject
    AssignmentServiceImpl(PageExternalService pageExternalService) {
        this.pageExternalService = pageExternalService;
    }

    @Override
    public ServiceCall<NotUsed, DataResponse> externalServiceMethod() {
        return request -> pageExternalService.getDataResponse().invoke()
                .thenApply(pageResponse -> pageResponse);
    }

}
