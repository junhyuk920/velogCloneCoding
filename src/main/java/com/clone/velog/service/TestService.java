package com.clone.velog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.velog.models.TestModels;
import com.clone.velog.itf.CrudInterface;
import com.clone.velog.repository.TestRepository;

import lombok.RequiredArgsConstructor;

// 임시 생성 파일, Service 관련 폴더
// 데이터 처리 로직
// 직접 데이터 베이스에 접근하는 로직 처리
@Service
@RequiredArgsConstructor
public class TestService {
    
    @Autowired
    private TestRepository testRepository;

    
    public List<TestModels> getAll() {
        List<TestModels> data = testRepository.findAll();
        System.out.println(data.size());
        return data;
    }


}
