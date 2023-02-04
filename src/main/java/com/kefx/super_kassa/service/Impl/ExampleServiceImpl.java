package com.kefx.super_kassa.service.Impl;

import com.kefx.super_kassa.dto.RequestAddValueDto;
import com.kefx.super_kassa.dto.ResponseAddValueDto;
import com.kefx.super_kassa.entity.Example;
import com.kefx.super_kassa.exception.EntityNotFoundException;
import com.kefx.super_kassa.repository.ExampleRepository;
import com.kefx.super_kassa.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepository exampleRepository;

    @Override
    public ResponseAddValueDto addValue(RequestAddValueDto requestDto) {
        Example example = exampleRepository.findById(requestDto.getId()).orElseThrow(EntityNotFoundException::new);
        int newObjValue = example.addObj(requestDto.getAdd());
        exampleRepository.save(example);
        return new ResponseAddValueDto(newObjValue);
    }
}
