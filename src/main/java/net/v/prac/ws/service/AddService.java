package net.v.prac.ws.service;

import org.springframework.validation.annotation.Validated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
        name = CommonConst.CALC_SERVICE,
        targetNamespace = CommonConst.CALC_NAMESPACE
)
public interface AddService {

    @WebMethod(operationName = "add")
    @WebResult(name = "ret")
    long add(@WebParam(name = "req", targetNamespace = CommonConst.CALC_NAMESPACE) @Validated AddReq req);
}
