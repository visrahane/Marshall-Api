/**
 *
 */
package com.marshall.apis;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marshall.models.CSVData;
import com.marshall.models.RADataRequest;
import com.marshall.models.RADataResponse;
import com.marshall.services.CSVService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Vis
 *
 */
@RestController
@RequestMapping("ra")
@Api(value = "/ra")
public class CRUDController {

	@Autowired
	private CSVService csvService;

	@ApiOperation(value = "accepts a hid and outputs record", response = RADataResponse.class)
	@RequestMapping(method={RequestMethod.GET}, produces=MediaType.APPLICATION_JSON_VALUE)
	public RADataResponse getData( @Valid RADataRequest raDataRequest){
		RADataResponse raDataResponse=new RADataResponse();
		CSVData csvData = csvService.getData(raDataRequest);
		if (csvData == null) {
			raDataResponse.setError("No records found");
		} else {
			raDataResponse.setCsvData(csvData);
		}

		// System.out.println("i m in get");
		return raDataResponse;
	}
}
