package com.exadel.htmLib.components;

public class UILink extends UIHtmLibBase {

	protected String getTagName() {
		return "link";
	}

	protected boolean isCloseTagForbidden() {
		return true;
	}
}
