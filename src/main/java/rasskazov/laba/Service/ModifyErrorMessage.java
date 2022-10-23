package rasskazov.laba.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rasskazov.laba.Model.Response;

import javax.validation.constraints.NotNull;

@Service
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements ModifyService
{
    @Override
    public Response modify(@NotNull Response response) {
        response.setErrorMessage("Что-то сломалось");

        return response;
    }
}
