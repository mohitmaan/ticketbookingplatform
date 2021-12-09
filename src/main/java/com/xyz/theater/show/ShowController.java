package com.xyz.theater.show;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	// @RequestMapping("/createshow/{theaterId}")
	// public Integer createShow(@PathVariable("theaterId") Integer theaterId) {
	//
	// logger.info("ShowController.createShow() invoked with: " + theaterId);
	// Integer showId = showService.createShow(theaterId);
	// logger.info("Show Created:\n" + showId);
	//
	// return showId;
	// }

	// ??????
	// @RequestMapping("/updateshow/{showId}")
	// public Boolean updateShow(@PathVariable("showId") Integer showId) {
	//
	// logger.info("ShowController.updateShow() invoked with: " + showId);
	// Boolean updateStatus = showService.updateShow(showId);
	// logger.info("Show Created:\n" + showId);
	//
	// return updateStatus;
	// }

	@RequestMapping("/deleteshow/{showId}")
	public Boolean deleteShow(@PathVariable("showId") Integer showId) {

		logger.info("ShowController.deleteShow() invoked with: " + showId);
		Boolean deleteStatus = showService.deleteShow(showId);
		logger.info("Show deleted:\n" + showId);

		return deleteStatus;
	}

}
