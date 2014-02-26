package com.exadel.htmLib.components;

public class UINoscript extends UIHtmLibBase {

	protected String getTagName() {
		return "noscript";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
