package com.knoldus.services;

import akka.NotUsed;
import com.knoldus.utilities.DataResponse;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.Method;

public interface AssignmentService extends Service {
    ServiceCall<NotUsed, DataResponse> externalServiceMethod();

    @Override
    default Descriptor descriptor() {
        return Service.named("pageData").withCalls(
                Service.restCall(Method.GET, "/api/get", this::externalServiceMethod)
        ).withAutoAcl(true);
    }



}
