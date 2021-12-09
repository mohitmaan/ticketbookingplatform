package com.xyz.theater.show;

import org.springframework.stereotype.Component;

import com.xyz.entity.Show;

@Component
public class ShowServiceImpl implements ShowService {

	@Override
	public Integer createShow(Show show) {

		// From here we can invoke either an API of the Theater Partner or make a DAO call.

		return null;
	}

	@Override
	public Boolean updateShow(Show show) {

		// From here we can invoke either an API of the Theater Partner or make a DAO call.
		return null;
	}

	@Override
	public Boolean deleteShow(Integer showId) {

		// From here we can invoke either an API of the Theater Partner or make a DAO call.
		return null;
	}

}
