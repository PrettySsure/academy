package src.main.java.com.example.book.Model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@Table(name='addresses')
public class Address{
	@Id
	@Column(name='id')
	private Long id;
	@Column(name='address_number')
	private String addressNumber;
	@Column(name='street')
	private String street;
	@Column(name='ward')
	private String ward;
	@Column(name='district')
	private String district;
	}
