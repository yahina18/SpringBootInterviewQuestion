package com.in.sp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@GetMapping("/address")
	public String getAddressDetails()
	{
		return "Pestom Sagar Reti Bundar";
	}
}
