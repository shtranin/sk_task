package com.kefx.super_kassa.controller;

import com.kefx.super_kassa.dto.RequestAddValueDto;
import com.kefx.super_kassa.dto.ResponseAddValueDto;
import com.kefx.super_kassa.service.Impl.ExampleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sk")
public class ExampleController {
    private final ExampleServiceImpl service;

    @PostMapping(value = "/modify")
    public ResponseEntity<ResponseAddValueDto> postSk(
                          @RequestBody RequestAddValueDto requestDto) {
       return ResponseEntity.ok(service.addValue(requestDto));
    }
}
