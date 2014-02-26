package com.exadel.htmLib.components;

public class UIPre extends UIHtmLibBase {

	protected String getTagName() {
		return "pre";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
