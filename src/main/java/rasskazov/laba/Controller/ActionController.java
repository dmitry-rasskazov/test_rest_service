package rasskazov.laba.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rasskazov.laba.Model.Request;
import rasskazov.laba.Model.Response;
import rasskazov.laba.Service.ModifyService;

@Slf4j
@RestController(value = "/")
public class ActionController {
    private final ModifyService modifyService;

    @Autowired
    public ActionController(@Qualifier("ModifyErrorMessage") ModifyService modifyService) {
        this.modifyService = modifyService;
    }

    @PostMapping(path = "/feedback")
    public ResponseEntity<Response> getFeedback(@RequestBody Request request) {
        log.info("Вхщдящий request: " + request.toString());


        Response responseAfterModify = modifyService.modify(Response
                .builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime("ERP")
                .code("success")
                .errorCode("")
                .errorMessage("")
                .build());

        return new ResponseEntity<>(responseAfterModify, HttpStatus.OK);
    }
}
