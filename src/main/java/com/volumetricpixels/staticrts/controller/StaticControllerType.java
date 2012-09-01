package com.volumetricpixels.staticrts.controller;

import org.spout.api.entity.Controller;
import org.spout.api.entity.controller.type.EmptyConstructorControllerType;

public class StaticControllerType extends EmptyConstructorControllerType {
    public StaticControllerType(Class<? extends Controller> controller, String name) {
        super(controller, name);
    }
}
