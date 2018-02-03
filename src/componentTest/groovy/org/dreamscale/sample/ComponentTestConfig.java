package org.dreamscale.sample;

import org.dreamscale.test.BaseTestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Sample.class})
public class ComponentTestConfig extends BaseTestConfig {

}
