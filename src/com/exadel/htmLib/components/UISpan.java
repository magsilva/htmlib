package com.exadel.htmLib.components;

public class UISpan extends UIHtmLibBase {

	protected String getTagName() {
		return "span";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
