package com.xyz.search;

import java.util.Date;
import java.util.List;

import com.xyz.entity.Show;

public interface SearchService {

	public List<Show> findShows(Integer movieId, Date showDate);

}
