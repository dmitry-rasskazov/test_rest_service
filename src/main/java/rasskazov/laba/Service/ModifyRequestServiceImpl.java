package rasskazov.laba.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rasskazov.laba.Model.Request;
import rasskazov.laba.Model.Response;

import javax.validation.constraints.NotNull;

@Service
@Qualifier("ModifyRequestService")
public class ModifyRequestServiceImpl implements ModifyRequestService
{
    @Override
    public void modify(@NotNull Request request) {
        request.setSystemTime("test");

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        (new RestTemplate()).exchange(
                "http://localhost:8080/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {}
        );
    }
}
