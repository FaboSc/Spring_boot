package spring.boot.zip.layout.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

/**
 * Taken from
 * https://github.com/dsyer/spring-boot-sample-data-eclipselink/blob/master
 * /src/main/java/sample/data/jpa/SampleDataJpaApplication.java
 */
@Configuration
public class EclipseLinkConfiguration extends JpaBaseConfiguration {

	@Override
	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
		EclipseLinkJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
		return adapter;
	}

	/**
	 * If needed add EclipseLink Properties here e.g.
	 * https://eclipse.org/eclipselink/documentation/2.5/jpa/extensions/
	 * p_ddl_generation.htm
	 */
	@Override
	protected Map<String, Object> getVendorProperties() {
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}
}
