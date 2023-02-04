package com.kefx.super_kassa.service;

import com.kefx.super_kassa.dto.RequestAddValueDto;
import com.kefx.super_kassa.dto.ResponseAddValueDto;

public interface ExampleService {

    ResponseAddValueDto addValue(RequestAddValueDto requestDto);
}
