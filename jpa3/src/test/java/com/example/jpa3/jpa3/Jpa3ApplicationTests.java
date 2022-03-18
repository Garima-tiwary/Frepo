package com.example.jpa3.jpa3;

import com.example.jpa3.entities.Author2;
import com.example.jpa3.entities.Book2;
import com.example.jpa3.repos.AuthorRepo2;
import com.example.jpa3.repos.BookRepo2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Configuration
class Jpa3ApplicationTests {

	@Autowired
	 private AuthorRepo2 authorRepo2;

	@Autowired
	private BookRepo2 bookRepo2;

	@Test
	void contextLoads() {
	}


	@Test
	void testManytoMany(){
		Author2 author1=new Author2();
		Author2 author11=new Author2();

		author1.setId(10);
		author1.setAuthor("ram");


		author11.setId(20);
		author11.setAuthor("shyam");




		Book2 book1=new Book2();
		Book2 book11=new Book2();

		book1.setId(11);
		book1.setBook("History");


		book11.setId(22);
		book11.setBook("Geography");


		List<Author2>l1=new ArrayList<Author2>();
		List<Book2>l2=new ArrayList<Book2>();

		l1.add(author1);
		l1.add(author11);


		l2.add(book1);
		l2.add(book11);
//
		author1.setBook1s(l2);
		author11.setBook1s(l2);
//		book11.setAuthor1(l1);


		authorRepo2.save(author1);
		authorRepo2.save(author11);

		bookRepo2.save(book1);
		bookRepo2.save(book11);

	}

}

