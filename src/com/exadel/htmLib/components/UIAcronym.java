package com.exadel.htmLib.components;

public class UIAcronym extends UIHtmLibBase {

	protected String getTagName() {
		return "acronym";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
