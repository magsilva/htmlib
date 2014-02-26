package com.exadel.htmLib.components;

public class UIHr extends UIHtmLibBase {

	protected String getTagName() {
		return "hr";
	}

	protected boolean isCloseTagForbidden() {
		return true;
	}
}
