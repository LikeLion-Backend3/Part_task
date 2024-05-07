package springboot.mapping.data.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "lion_part")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "part_id")
    private List<BabyLion> members = new ArrayList<>();

}