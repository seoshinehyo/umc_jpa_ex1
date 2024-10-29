package umc.jpa_ex1.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.jpa_ex1.domain.common.BaseEntity;
import umc.jpa_ex1.domain.mapping.SelectCategory;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    private List<SelectCategory> selectCategoryList = new ArrayList<>();
}
