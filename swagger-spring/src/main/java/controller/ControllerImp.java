package controller;

import com.example.swagger_spring.api.ApiUtil;
import com.example.swagger_spring.api.TransferApi;
import com.example.swagger_spring.model.GbipTransaction;
import com.example.swagger_spring.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

public class ControllerImp implements TransferApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return TransferApi.super.getRequest();
    }

    @Override
    public ResponseEntity<GbipTransaction> _transferPost(String xGbipRequestId, Product product) {
        return TransferApi.super._transferPost(xGbipRequestId, product);
    }

    @Override
    public ResponseEntity<GbipTransaction> transferPost(String xGbipRequestId, Product product) {
        return TransferApi.super.transferPost(xGbipRequestId, product);
    }
}
