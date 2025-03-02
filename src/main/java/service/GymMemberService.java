package org.example.service;

import org.example.entity.Member;
import org.example.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GymMemberService implements MembersService {
    private final MemberRepository repository;

    @Autowired
    public GymMemberService(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerMember(Member member) {
        System.out.println("Gym member: " + member);
        repository.addMember(member);
    }
}