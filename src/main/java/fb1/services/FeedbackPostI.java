package fb1.services;

import java.util.*;

import fb1.model.*;

public interface FeedbackPostI {

	public FeedbackPostResponseWrapper execute(FeedbackPostP pojo);
	public <T> T error(int statusCode,Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}