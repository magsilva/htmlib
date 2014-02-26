package com.exadel.htmLib.components;

public class UIHtml extends UIHtmLibBase {

	protected String getTagName() {
		return "html";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
