package hello.hello_spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import hello.hello_spring.domain.Member;
import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long> , MemberRepository {

    //JPQL : select m from Member m where m.name=?
    @Override
    Optional<Member> findByName(String name);



}
