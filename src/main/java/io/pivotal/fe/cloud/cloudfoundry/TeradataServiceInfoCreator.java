package io.pivotal.fe.cloud.cloudfoundry;

import org.springframework.cloud.cloudfoundry.RelationalServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;
import org.springframework.cloud.service.common.MysqlServiceInfo;
import org.springframework.cloud.service.common.RelationalServiceInfo;

/**
 *
 * @author Rob Hardt
 *
 */
public class TeradataServiceInfoCreator extends RelationalServiceInfoCreator<TeradataServiceInfo> {

	public TeradataServiceInfoCreator() {
		super(new Tags("teradata"), TeradataServiceInfo.TERADATA_SCHEME);
	}

	@Override
	public TeradataServiceInfo createServiceInfo(String id, String url, String jdbcUrl) {
		return new TeradataServiceInfo(id, url, jdbcUrl);
	}
}
