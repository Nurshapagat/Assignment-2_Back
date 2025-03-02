package org.example.service;

import org.example.entity.Member;
import org.example.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("yogaMembersService")
public class YogaMemberService implements MembersService {
    private final MemberRepository repository;

    @Autowired
    public YogaMemberService(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerMember(Member member) {
        System.out.println("Yoga member: " + member);
        repository.addMember(member);
    }
}