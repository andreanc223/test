package com.archaius.git.example;

import Model.Properties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by acuro on 4/8/16.
 */

@RestController
public class PropertiesController {

    @RequestMapping("/properties")
    public Properties getProperties() {

        return new Properties();
    }

}
