package com.xyz.discount;

import org.springframework.stereotype.Component;

@Component
public class DiscountServiceImpl implements DiscountService {

	@Override
	public String[] getDiscount(Integer theaterId, Integer cityId) {

		String[] discounts = new String[2];
		// From here we can invoke either an API of the Theater Partner or make a DAO call.

		// Illustrative logic
		if (theaterId == 1 && cityId == 1) {
			discounts[0] = "50% discount on the third ticket";
			discounts[1] = "Tickets booked for the afternoon show get a 20% discount";
		}
		else
			discounts[0] = "No discount for this theater and city";

		return discounts;
	}

}
