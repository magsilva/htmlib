package com.exadel.htmLib.components;

public class UIArea extends UIHtmLibBase {

	protected String getTagName() {
		return "area";
	}

	protected boolean isCloseTagForbidden() {
		return true;
	}
}
