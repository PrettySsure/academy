package src.main.java.com.example.book.Controller;

import com.example.book.Model.Address;
import com.example.book.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/addresses")
	private List<Address> getAllAddresses(){
		return addressService.getAll();
	}
}
