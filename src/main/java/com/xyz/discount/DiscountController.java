package com.xyz.discount;

import java.util.Date;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discount")
public class DiscountController {
	protected Logger logger = Logger.getLogger(DiscountController.class.getName());

	private DiscountService discountService;

	@Autowired
	public DiscountController(DiscountService discountService) {

		this.discountService = discountService;

	}

	@GetMapping("/checkhealth")
	public String checkHealth() {

		return "Discount Service is healthy!!";
	}

	@RequestMapping("/theater/{theaterId}/city/{cityId}")
	public Integer getDiscount(@PathVariable("theaterId") Integer theaterId, @PathVariable("cityId") Integer cityId) {

		logger.info("DiscountController.getDiscount() invoked with: " + theaterId + ", " + cityId);
		Date date = new Date();
		Integer discountPercentage = discountService.getDiscount(theaterId, cityId);
		logger.info("discountPercentage for the theaterId - cityId: " + theaterId + "-" + cityId + " is "
				+ discountPercentage);

		return discountPercentage;
	}

}
