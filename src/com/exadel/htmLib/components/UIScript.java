package com.exadel.htmLib.components;

public class UIScript extends UIHtmLibBase {

	protected String getTagName() {
		return "script";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
