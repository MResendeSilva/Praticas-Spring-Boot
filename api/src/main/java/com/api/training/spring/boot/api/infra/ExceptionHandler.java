package com.api.training.spring.boot.api.infra;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity tratadorError404 (ChangeSetPersister.NotFoundException e) {

        return ResponseEntity.notFound().build();
    }

}
