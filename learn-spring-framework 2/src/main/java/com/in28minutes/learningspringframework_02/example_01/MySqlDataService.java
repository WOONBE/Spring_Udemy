package com.in28minutes.learningspringframework_02.example_01;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySqlDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
