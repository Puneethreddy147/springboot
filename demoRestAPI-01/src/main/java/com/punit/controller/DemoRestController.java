/**
 * 
 */
package com.punit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Puneeth
 *
 */
@RestController
public class DemoRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello to All";
	}

}
