package src.main.java.com.example.book.Service;
import com.example.book.Model.Address;
import com.example.book.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> getAll(){
		return addressRepository.findAll();
			}
}
