package fb1.services.impl;

import java.util.*;

import fb1.model.*;

import fb1.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FeedbackPostImpl implements FeedbackPostI {

	@Override
	public FeedbackPostResponseWrapper execute(FeedbackPostP pojo){
		//TODO
		return new FeedbackPostResponseWrapper();
	}

	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}