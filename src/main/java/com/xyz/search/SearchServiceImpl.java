package com.xyz.search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.xyz.entity.Show;

@Component
public class SearchServiceImpl implements SearchService {

	@Override
	public List<Show> findShows(Integer movieId, Date showDate) {

		List<Show> shows = new ArrayList<Show>();

		// From here we can invoke either an API of the Theater Partner or make a DAO call .
		return shows;
	}

}
