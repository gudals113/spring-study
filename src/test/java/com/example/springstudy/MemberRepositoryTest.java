package com.example.springstudy;

import com.example.springstudy.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemberRepositoryTest {
    @Autowired MemberRepository memberRepository;

    @Test
    @Transactional
    public void 멤버_테스트() {
        Member member = new Member();
        member.setUsername("frankie");

        Long savedId = memberRepository.save(member);
        Member foundMember = memberRepository.find(savedId);


        Assertions.assertEquals(foundMember.getId(), member.getId());
        Assertions.assertEquals(foundMember.getUsername(), member.getUsername());

    }
}