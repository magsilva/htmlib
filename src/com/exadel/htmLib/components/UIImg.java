package com.exadel.htmLib.components;

public class UIImg extends UIHtmLibBase {

	protected String getTagName() {
		return "img";
	}

	protected boolean isCloseTagForbidden() {
		return true;
	}
}
