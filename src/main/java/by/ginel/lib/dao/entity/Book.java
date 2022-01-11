package by.ginel.lib.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "book")
public class Book extends AbstractEntity {

    private String name;
    private String author;
    private String description;
    private Double price;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @OneToMany(mappedBy = "book")
    private List<OrderBook> books;

    @OneToOne(mappedBy = "book")
    private BookCover cover;

    @OneToOne(mappedBy = "book")
    private BookQuantity quantity;
}
