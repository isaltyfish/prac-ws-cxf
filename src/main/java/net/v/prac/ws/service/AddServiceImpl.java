package net.v.prac.ws.service;

import org.apache.cxf.annotations.SchemaValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@SchemaValidation
@WebService(
        serviceName = CommonConst.CALC_SERVICE,
        targetNamespace = CommonConst.CALC_NAMESPACE,
        endpointInterface = "net.v.prac.ws.service.AddService"
)
public class AddServiceImpl implements AddService {

    private static final Logger log = LoggerFactory.getLogger(AddServiceImpl.class);

    @Override
    public long add(AddReq req) {
        return req.getX() + req.getY();
    }
}
