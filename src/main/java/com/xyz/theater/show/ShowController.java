package com.xyz.theater.show;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.entity.Show;

@RestController
@RequestMapping("/show")
public class ShowController {
	protected Logger logger = Logger.getLogger(ShowController.class.getName());

	private ShowService showService;

	@Autowired
	public ShowController(ShowService showService) {

		this.showService = showService;

	}

	@GetMapping("/checkhealth")
	public String checkHealth() {

		return "Show Service is healthy!!";
	}

	@PostMapping(value = "/createshow", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Integer createShow(@RequestBody final Show show) {

		logger.info("ShowController.createShow() invoked with: " + show.toString());
		Integer showId = showService.createShow(show);
		logger.info("Show Created:\n" + showId);

		return showId;
	}

	@PostMapping(value = "/updateshow", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Boolean updateShow(@RequestBody final Show show) {

		logger.info("ShowController.updateShow() invoked : " + show.toString());
		Boolean updateStatus = showService.updateShow(show);
		logger.info("Show updated:\n" + show.toString());

		return updateStatus;
	}

	@RequestMapping("/deleteshow/{showId}")
	public Boolean deleteShow(@PathVariable("showId") Integer showId) {

		logger.info("ShowController.deleteShow() invoked with: " + showId);
		Boolean deleteStatus = showService.deleteShow(showId);
		logger.info("Show deleted:\n" + showId);

		return deleteStatus;
	}

}
