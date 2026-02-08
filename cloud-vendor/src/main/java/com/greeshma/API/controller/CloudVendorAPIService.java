package com.greeshma.API.controller;

import org.springframework.web.bind.annotation.*;
import com.greeshma.API.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	@GetMapping({"vendorId"})
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return new CloudVendor("c1","vendor1","Address1","xxx");
	}

}
