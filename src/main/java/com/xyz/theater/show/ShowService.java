package com.xyz.theater.show;

import com.xyz.entity.Show;

public interface ShowService {

	public Integer createShow(Show show);

	public Boolean updateShow(Show show);

	public Boolean deleteShow(Integer showId);
}
