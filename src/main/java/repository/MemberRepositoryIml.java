package org.example.repository;

import org.example.entity.Member;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepositoryIml implements MemberRepository {
    private final List<Member> members = new ArrayList<>();

    @Override
    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> getAllMembers() {
        return members;
    }
}
