package src.main.java.com.example.book.Repository;

import com.example.book.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JPARepository<Address, Long> {
}
