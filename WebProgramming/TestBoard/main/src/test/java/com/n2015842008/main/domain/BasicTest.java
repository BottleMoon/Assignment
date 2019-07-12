package com.n2015842008.main.domain;

import com.n2015842008.main.repository.BasicRepository;
import com.n2015842008.main.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BasicTest {
    @Autowired
    private BasicRepository basicRepository;

    private Basic savedBasic;

    @Before
    public void init(){
        savedBasic = basicRepository.save(Basic.builder()
                .name("홍길동")
                .label("백수" )
                .email("이메일" )
                .phone("010-1234-568")
                .build());

        savedBasic = basicRepository.save(Basic.builder()
                .name("홍길동1")
                .label("백수1" )
                .email("이메일1" )
                .phone("010-1234-5681")
                .build());

        savedBasic = basicRepository.save(Basic.builder()
                .name("홍길동2")
                .label("백수2" )
                .email("이메일2" )
                .phone("010-1234-5682")
                .build());

    }
    @Test
    public void testFindIDBasic() {
        Basic foundBasic = basicRepository.findById(savedBasic.getIdx()).orElse(null);
        assertThat(foundBasic.getIdx()).isEqualTo(savedBasic.getIdx());
    }

    @Test
    public void testFindAllBasic() {
        List<Basic> findAllBasic = basicRepository.findAllByName("제목3");
        assertThat(findAllBasic.size()).isEqualTo(2);
    }

    @Test
    public void testFindNameBasic() {
        Basic findNameBasic = basicRepository.findFirstByName("제목1");
        assertThat(findNameBasic.getName()).isEqualTo("제목1");
    }

    @Test
    public void testUpdateNameBasic() {
        Basic updateNameBasic = basicRepository.findFirstByName("제목1");
        updateNameBasic.setName("제목1-수정");
        updateNameBasic = basicRepository.save(updateNameBasic);

        assertThat(updateNameBasic.getName()).isEqualTo("제목1-수정");
    }

    @Test
    public void testDeleteNameBasic() {
        Basic deleteNameBasic = basicRepository.findFirstByName("제목1");
        basicRepository.delete(deleteNameBasic);

        Basic findNameBasic = basicRepository.findFirstByName("제목1");

        assertThat(findNameBasic).isNull();
    }

    @Test
    public void testAccountFK(){
        Basic findNameBasic = basicRepository.findFirstByName("제목1");
        assertThat(findNameBasic.getName()).isEqualTo("홍길동");
    }
}