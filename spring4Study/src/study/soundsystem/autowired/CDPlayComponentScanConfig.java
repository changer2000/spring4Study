package study.soundsystem.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages={"study.soundsystem.autowired"})	//OK
@ComponentScan(basePackageClasses={IComponentScanPackage.class})
public class CDPlayComponentScanConfig {

}
