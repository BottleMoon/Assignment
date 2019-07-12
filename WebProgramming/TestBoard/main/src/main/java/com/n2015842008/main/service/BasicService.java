package com.n2015842008.main.service;

import com.n2015842008.main.domain.Basic;
import com.n2015842008.main.repository.BasicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicService {
    private BasicRepository basicRepository;

    public BasicService(BasicRepository basicRepository){this.basicRepository = basicRepository;}
    public List<Basic> findBasicList() {       //Get에서만 쿼리스트링 씀. get은 역등이여야 함.
        return basicRepository.findAll();
    }
    public Basic findBasicByIdx(Long idx){
        return basicRepository.findById(idx).orElse(new Basic());
    }
    public Basic saveBasic(Basic basic){return basicRepository.save(basic);}
    public Basic getOne(Long idx){return basicRepository.getOne(idx);}
    public void deletBasicByIdx(Long idx){basicRepository.deleteById(idx);}
}
