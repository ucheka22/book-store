package net.polarisdigitech.book_store.book_store.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.polarisdigitech.book_store.book_store.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	Optional<Book> findById(Long bookId);
}
