package rasskazov.laba.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rasskazov.laba.Model.Request;

@Service
@Qualifier("ModifyRequestService")
public class ModifyRequestServiceImpl implements ModifyRequestService
{
    @Override
    public void modify(Request request) {
        request.setSystemTime("test");

        (new RestTemplate()).exchange(
                "http://localhost:8080",
                HttpMethod.POST,
                new HttpEntity<>(request),
                new ParameterizedTypeReference<Request>() {}
        );
    }
}
