package io.pivotal.fe.cloud.cloudfoundry;

import org.springframework.cloud.service.common.MysqlServiceInfo;
import org.springframework.cloud.service.relational.DataSourceCreator;


/**
 * 
 * @author Ramnivas Laddad
 *
 */
public class TeradataDataSourceCreator extends DataSourceCreator<TeradataServiceInfo> {
	public static final String[] DRIVERS = new String[]{"com.teradata.jdbc.TeraDriver"};
	/**
	 * Validation query obtained from the MySQL reference manual:
	 * http://dev.mysql.com/doc/refman/5.1/en/connector-j-usagenotes-j2ee.html
	 */
	public static final String VALIDATION_QUERY = "SELECT 1";

	public TeradataDataSourceCreator() {
	    super("spring-cloud.teradata.driver", DRIVERS, VALIDATION_QUERY);
	}

}
