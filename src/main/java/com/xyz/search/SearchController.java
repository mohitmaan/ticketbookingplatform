package com.xyz.search;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.entity.Show;
import com.xyz.exceptions.RecordNotFoundException;

@RestController
@RequestMapping("/search")

public class SearchController {
	protected Logger logger = Logger.getLogger(SearchController.class.getName());

	private SearchService searchService;

	@Autowired
	public SearchController(SearchService searchService) {

		this.searchService = searchService;

	}

	@GetMapping("/checkhealth")
	public String checkHealth() {

		return "Search Service is healthy!!";
	}

	@RequestMapping("/theater/{movieId}")
	public List<Show> findShows(@PathVariable("movieId") Integer movieId) {

		logger.info("search-service findShows() invoked: ");
		Date date = new Date();
		List<Show> lstShows = searchService.findShows(movieId, date);
		logger.info("# of Shows found for the movie and date: " + lstShows.size());

		if (lstShows == null || lstShows.size() == 0)
			throw new RecordNotFoundException(movieId + " - " + date);
		else {
			return lstShows;
		}
	}

}
