package com.exadel.htmLib.components;

public class UIIframe extends UIHtmLibBase {

	protected String getTagName() {
		return "iframe";
	}

	protected boolean isCloseTagForbidden() {
		return true;
	}
}
