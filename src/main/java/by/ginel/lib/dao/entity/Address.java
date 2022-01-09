package by.ginel.lib.dao.entity;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "address")
public class Address extends AbstractEntity {

    private String city;
    private String street;
    private String house;
    private String flat;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
