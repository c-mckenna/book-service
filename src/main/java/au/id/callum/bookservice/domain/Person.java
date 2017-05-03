package au.id.callum.bookservice.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String emailAddress;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="PERSON_BOOKS",
            joinColumns = @JoinColumn(name="PERSON_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name="BOOK_ID", referencedColumnName = "ID")
    )
    private List<Book> books;

    public Person() {
    }

    public Person(String name, String phone, String emailAddress) {
        this.name = name;
        this.phone = phone;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", books=" + books +
                '}';
    }
}
