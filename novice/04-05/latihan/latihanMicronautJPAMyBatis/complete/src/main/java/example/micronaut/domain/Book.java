package example.micronaut.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotNull;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@Introspected
public class Book {

    public Book() {
    }

    public Book(@NotNull String name, String isbn, BigInteger genre) {
        this.name = name;
        this.isbn = isbn;
        this.genre = genre;
    }

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String isbn;

    @NotNull
    private BigInteger genre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BigInteger getGenre() {
        return genre;
    }

    public void setGenre(BigInteger genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genre=" + genre +
                '}';
    }
}