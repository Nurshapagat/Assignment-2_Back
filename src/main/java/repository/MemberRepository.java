package org.example.repository;

import org.example.entity.Member;
import java.util.List;

public interface MemberRepository {
    void addMember(Member member);
    List<Member> getAllMembers();
}
