package com.knoldus.services;

import akka.NotUsed;
import com.knoldus.utilities.DataResponse;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.restCall;
import static com.lightbend.lagom.javadsl.api.transport.Method.GET;

public interface PageExternalService extends Service {

    ServiceCall<NotUsed, DataResponse> getDataResponse();

    @Override
    default Descriptor descriptor() {
        return named("external").withCalls(
                restCall(GET, "/api/unknown", this::getDataResponse)
        ).withAutoAcl(true);
    }
}
