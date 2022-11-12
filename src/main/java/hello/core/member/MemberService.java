package hello.core.member;

public interface MemberService {

    void join(Member member); //가입기능

    Member findMember(Long memberId); //조회기능
}
