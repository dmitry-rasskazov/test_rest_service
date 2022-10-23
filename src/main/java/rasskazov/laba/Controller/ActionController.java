package rasskazov.laba.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rasskazov.laba.Model.Request;
import rasskazov.laba.Model.Response;

@RestController(value = "/")
public class ActionController {
    @PostMapping(path = "/feedback")
    public ResponseEntity<Response> getFeedback(@RequestBody Request request) {
        return new ResponseEntity<>(Response
                .builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(request.getSystemTime())
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build(), HttpStatus.OK)
        ;
    }
}
