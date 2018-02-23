/**
 *
 */
package com.marshall.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.marshall.models.CSVData;
import com.marshall.models.RADataRequest;
import com.marshall.util.ExcelHandlerUtil;

/**
 * @author Vis
 *
 */
@Service
public class CSVServiceImpl implements CSVService {

	private static Map<String, CSVData> csvMap = new HashMap<>();

	@Autowired
	private ResourceLoader resourceLoader;

	@PostConstruct
	private void init() {
		try {
			List<List<String>> csvList = ExcelHandlerUtil
					.readExcel(resourceLoader.getResource("classpath:ra_data_classifier.xlsx").getInputStream());
			for (List<String> row : csvList) {
				CSVData csvData = new CSVData();
				csvData.setHid(row.get(0));
				csvData.setChunk(row.get(1));
				csvData.setHasSpace(row.get(2));
				csvMap.put(csvData.getHid(), csvData);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public CSVData getData(RADataRequest raDataRequest) {
		return csvMap.get(raDataRequest.getHid());
	}

}
