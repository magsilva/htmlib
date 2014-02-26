package com.exadel.htmLib.components;

public class UIBr extends UIHtmLibBase {

	protected String getTagName() {
		return "br";
	}

	protected boolean isCloseTagForbidden() {
		return true;
	}
}
