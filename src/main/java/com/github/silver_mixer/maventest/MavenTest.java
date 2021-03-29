package com.github.silver_mixer.maventest;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MavenTest {
	
	public static void main(String[] args) throws JsonProcessingException {
		ArrayList<Object> data = new ArrayList<Object>();
		String name = "MavenTest";
		int[] intArray = {2021, 03, 29};
		int version = 100;
		
		data.add(name);
		data.add(intArray);
		data.add(version);
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(data));
	}
}
