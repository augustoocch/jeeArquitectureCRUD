package ar.com.sga.web;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

/**
 *
 * 
 * No es necesario para versiones posteriores, pero para estas versiones si
 */

@FacesConfig(
        version=JSF_2_3
)

@ApplicationScoped
public class ConfigBean {
    
}
