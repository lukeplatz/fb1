package fb1.services.impl;

import java.util.*;

import fb1.model.*;

import fb1.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FeedbackGetImpl implements FeedbackGetI {

	@Override
	public FeedbackGetResponseWrapper execute(FeedbackGetP pojo){
		//TODO
		return new FeedbackGetResponseWrapper();
	}

	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}