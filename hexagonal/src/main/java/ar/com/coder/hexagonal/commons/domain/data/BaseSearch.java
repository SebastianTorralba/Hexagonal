package ar.com.coder.hexagonal.commons.domain.data;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseSearch {

	    private int page;
	    private int size;
	    private Search[] search;
	    private Sort sort;
	    private String date;
	    private String dataStart;
	    private String dataEnd;

	    @Data
	    @ToString
	    @AllArgsConstructor
	    @NoArgsConstructor
	    public class Search {
	        private String criteria;
	        private String word;
	        private String operator;
	    }
	    
	    @Data
	    @ToString
	    @AllArgsConstructor
	    @NoArgsConstructor
	    public class Sort {
	        private String criteria;
	        private String order;
	    }


}
