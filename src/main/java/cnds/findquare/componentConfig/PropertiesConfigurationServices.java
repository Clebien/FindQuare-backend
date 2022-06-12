package cnds.findquare.componentConfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Data
@Configuration
@ConfigurationProperties(prefix="cnds.findquare")
public class PropertiesConfigurationServices {

    private String apiUrl="";

}
