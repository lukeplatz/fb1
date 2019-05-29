package fb1.model;

import java.util.*;

import org.threeten.bp.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

public class FeedbackPostP {

	private FeedbackInput body;

	public FeedbackPostP(){}

	public FeedbackPostP(FeedbackInput body){
		 this.body=body;
	}


	public FeedbackInput getBody() {
		 return body;
	}

	public void setBody(FeedbackInput body) {
		 this.body=body;
	}
}