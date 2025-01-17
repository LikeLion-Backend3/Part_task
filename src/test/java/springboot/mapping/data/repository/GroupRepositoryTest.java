package springboot.mapping.data.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.mapping.data.entity.BabyLion;
import springboot.mapping.data.entity.Group;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GroupRepositoryTest {

    @Autowired
    BabyLionRepository babyLionRepository;

    @Autowired
    GroupRepository groupRepository;

    @Test
    void relationshipTest(){
        // 테스트 데이터 생성
        BabyLion babyLion = new BabyLion();
        babyLion.setName("유멋사");
        babyLion.setEmail("kangnam@likelion.org");
        babyLion.setNumber("011-1234-5678");
        babyLion.setPassword("0000");
        babyLion.setProfile("none");


        babyLionRepository.save(babyLion);

        Group group = new Group();
        group.setGroupName("멋쟁이사자처럼");
        group.getMembers().add(babyLion);

        groupRepository.save(group);
        List<BabyLion> members = groupRepository.findById(1L).get().getMembers();

        for(BabyLion foundBabyLion : members){
            System.out.println(babyLion);
        }
    }
}