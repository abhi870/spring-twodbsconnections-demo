package com.twodbs.demo.repository.book;

import com.twodbs.demo.ProductInputDAta;
import com.twodbs.demo.model.book.MyBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<MyBook, Long>{
    MyBook save(MyBook book);
}
