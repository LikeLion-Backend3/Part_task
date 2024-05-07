package springboot.mapping.data.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.mapping.data.entity.BabyLion;
import springboot.mapping.data.entity.Part;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PartRepositoryTest {
    @Autowired
    BabyLionRepository babyLionRepository;

    @Autowired
    PartRepository partRepository;

    @Test
    void partTest(){

        // 테스트 데이터 생성
        BabyLion babyLion = new BabyLion();
        babyLion.setName("김민기");
        babyLion.setEmail("kangnam@likelion.org");
        babyLion.setNumber("011-1234-5678");
        babyLion.setPassword("0000");
        babyLion.setProfile("none");

        BabyLion babyLion1 = new BabyLion();
        babyLion1.setName("김멋사");
        babyLion1.setEmail("babylions@likelion.org");
        babyLion1.setNumber("010-1234-5670");
        babyLion1.setPassword("1111");
        babyLion1.setProfile("pic0");


        BabyLion babyLion2 = new BabyLion();
        babyLion2.setName("이멋사");
        babyLion2.setEmail("lion@likelion.org");
        babyLion2.setNumber("010-1111-1111");
        babyLion2.setPassword("0987");
        babyLion2.setProfile("pic1");

        BabyLion babyLion3 = new BabyLion();
        babyLion3.setName("장멋사");
        babyLion3.setEmail("babylion@likelion.org");
        babyLion3.setNumber("010-0987-6543");
        babyLion3.setPassword("4567");
        babyLion3.setProfile("pic2");

        babyLionRepository.save(babyLion);
        babyLionRepository.save(babyLion1);
        babyLionRepository.save(babyLion2);
        babyLionRepository.save(babyLion3);

        Part part = new Part();
        part.setPartName("백엔드");
        part.getMembers().add(babyLion);
        part.getMembers().add(babyLion1);

        Part part1 = new Part();
        part1.setPartName("프론트");
        part1.getMembers().add(babyLion2);
        part1.getMembers().add(babyLion3);

        partRepository.save(part);
        partRepository.save(part1);
        List<BabyLion> members = partRepository.findById(1L).get().getMembers();

        for(BabyLion foundBabyLion : members){
            System.out.println(babyLion);
        }
    }

}