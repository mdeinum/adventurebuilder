package com.sun.j2ee.blueprints.waf.controller.web;

import com.sun.j2ee.blueprints.waf.view.template.Parameter;
import java.io.Serializable;

public class ErrorMapping implements Serializable {

    private String errorClassName;
    private String screen;
    
    public ErrorMapping(String errorClassName, String screen) {
        this.errorClassName = errorClassName;
        this.screen = screen;
    }
    
    public String getScreenName() {
        return screen;
    }
    
    public String getExceptionClassName() {
        return errorClassName;
    }
}
