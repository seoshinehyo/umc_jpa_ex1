package umc.jpa_ex1.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.jpa_ex1.domain.Member;
import umc.jpa_ex1.domain.Mission;
import umc.jpa_ex1.domain.common.BaseEntity;
import umc.jpa_ex1.domain.enums.MissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private MissionStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;
}
