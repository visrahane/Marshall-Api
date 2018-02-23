/**
 *
 */
package com.marshall.services;

import com.marshall.models.CSVData;
import com.marshall.models.RADataRequest;

/**
 * @author Vis
 *
 */

public interface CSVService {

	CSVData getData(RADataRequest raDataRequest);
}
