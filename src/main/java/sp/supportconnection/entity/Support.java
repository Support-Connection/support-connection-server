package sp.supportconnection.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor()
@Table(name="SUPPORT")
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="support_id")
    private Long id;

    private String name;

    private String category;

    private String site;

    @Column(name="is_local")
    private int isLocal;

    private int type;

    private int amount;

    @OneToOne
    @JoinColumn(name = "condition_id")
    private Condition condition;

}