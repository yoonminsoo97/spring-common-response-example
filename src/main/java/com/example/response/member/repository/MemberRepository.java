package com.example.response.member.repository;

import com.example.response.member.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean existsByNickname(String nickname);
    boolean existsByUsername(String username);
    Optional<Member> findByUsername(String username);

}
