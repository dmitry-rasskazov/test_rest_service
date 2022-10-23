package rasskazov.laba.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rasskazov.laba.Model.Response;

import javax.validation.constraints.NotNull;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements ModifyService
{
    @Override
    public Response modify(@NotNull Response response) {
        response.setUid("New Uid");

        return response;
    }
}
