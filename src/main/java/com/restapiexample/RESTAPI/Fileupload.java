package com.restapiexample.RESTAPI;


import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fileupload {

    @PostMapping("/image-upload")
    public ResponseEntity<String> uploadfile(){

       return ResponseEntity.ok("ITS WORKING");
    }
}
