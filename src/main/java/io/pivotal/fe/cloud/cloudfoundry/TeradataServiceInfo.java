package io.pivotal.fe.cloud.cloudfoundry;

import org.springframework.cloud.service.ServiceInfo.ServiceLabel;
import org.springframework.cloud.service.common.RelationalServiceInfo;

/**
 *
 * @author Rob Hardt
 *
 */
@ServiceLabel("teradata")
public class TeradataServiceInfo extends RelationalServiceInfo {
	public static final String TERADATA_SCHEME = "teradata";

	public TeradataServiceInfo(String id, String url) {
		this(id, url, null);
	}

	public TeradataServiceInfo(String id, String url, String jdbcUrl) {
		super(id, url, jdbcUrl, TERADATA_SCHEME);
	}
}
