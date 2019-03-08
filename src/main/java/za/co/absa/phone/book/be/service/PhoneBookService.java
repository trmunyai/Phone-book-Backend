package za.co.absa.phone.book.be.service;

import za.co.absa.phone.book.be.model.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneBookService extends JpaRepository<PhoneBook, Long>{}
