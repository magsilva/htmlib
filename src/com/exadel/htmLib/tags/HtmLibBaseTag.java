/*
 * Created on 24.08.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.exadel.htmLib.tags;

import java.io.Serializable;
import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.webapp.UIComponentTag;

abstract public class HtmLibBaseTag extends UIComponentTag{
	String sid;

	String styleClass; 
	String abbr;
	String accept;
	String accesskey;
	String action;
	String align;
	String alink;
	String alt;
	String archive;
	String axis;
	String background;
	String bgcolor;
	String border;
	String cellpadding;
	String cellspacing;
	String charAttribute;
	String charoff;
	String charset;
	String checked;
	String cite;
	String classid;
	String clear;
	String code;
	String codebase;
	String color;
	String cols;
	String colspan;
	String compact;
	String content;
	String coords;
	String data;
	String datetime;
	String declare;
	String defer;
	String dir;
	String disabled;
	String enctype;
	String face;
	String forAttribute;
	String frame;
	String frameborder;
	String headers;
	String height;
	String href;
	String hreflang;
	String hspace;
	String ismap;
	String label;
	String lang;
	String language;
	String link;
	String longdesc;
	String marginheight;
	String marginwidth;
	String maxlength;
	String media;
	String method;
	String multiple;
	String name;
	String nohref;
	String noresize;
	String noshade;
	String nowrap;
	String object;
	String onblur;
	String onchange;
	String onclick;
	String ondblclick;
	String onfocus;
	String onkeydown;
	String onkeypress;
	String onkeyup;
	String onload;
	String onmousedown;
	String onmousemove;
	String onmouseout;
	String onmouseover;
	String onmouseup;
	String onreset;
	String onselect;
	String onsubmit;
	String onunload;
	String profile;
	String prompt;
	String readonly;
	String rel;
	String rev;
	String rows;
	String rowspan;
	String rules;
	String scheme;
	String scope;
	String scrolling;
	String selected;
	String shape;
	String size;
	String span;
	String src;
	String standby;
	String start;
	String style;
	String summary;
	String tabindex;
	String target;
	String text;
	String title;
	String type;
	String usemap;
	String valign;
	String value;
	String valuetype;
	String version;
	String vlink;
	String vspace;
	String width;
	
	/**
	 * @return Returns the sid.
	 */
	public String getSid() {
		return sid;
	}
	/**
	 * @param sid The sid to set.
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}	
	
	/**
	 * @return Returns the abbr.
	 */
	public String getAbbr() {
		return abbr;
	}
	/**
	 * @param abbr The abbr to set.
	 */
	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	/**
	 * @return Returns the accept.
	 */
	public String getAccept() {
		return accept;
	}
	/**
	 * @param accept The accept to set.
	 */
	public void setAccept(String accept) {
		this.accept = accept;
	}
	/**
	 * @return Returns the accesskey.
	 */
	public String getAccesskey() {
		return accesskey;
	}
	/**
	 * @param accesskey The accesskey to set.
	 */
	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}
	/**
	 * @return Returns the action.
	 */
	public String getAction() {
		return action;
	}
	/**
	 * @param action The action to set.
	 */
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * @return Returns the align.
	 */
	public String getAlign() {
		return align;
	}
	/**
	 * @param align The align to set.
	 */
	public void setAlign(String align) {
		this.align = align;
	}
	/**
	 * @return Returns the alink.
	 */
	public String getAlink() {
		return alink;
	}
	/**
	 * @param alink The alink to set.
	 */
	public void setAlink(String alink) {
		this.alink = alink;
	}
	/**
	 * @return Returns the alt.
	 */
	public String getAlt() {
		return alt;
	}
	/**
	 * @param alt The alt to set.
	 */
	public void setAlt(String alt) {
		this.alt = alt;
	}
	/**
	 * @return Returns the archive.
	 */
	public String getArchive() {
		return archive;
	}
	/**
	 * @param archive The archive to set.
	 */
	public void setArchive(String archive) {
		this.archive = archive;
	}
	/**
	 * @return Returns the axis.
	 */
	public String getAxis() {
		return axis;
	}
	/**
	 * @param axis The axis to set.
	 */
	public void setAxis(String axis) {
		this.axis = axis;
	}
	/**
	 * @return Returns the background.
	 */
	public String getBackground() {
		return background;
	}
	/**
	 * @param background The background to set.
	 */
	public void setBackground(String background) {
		this.background = background;
	}
	/**
	 * @return Returns the bgcolor.
	 */
	public String getBgcolor() {
		return bgcolor;
	}
	/**
	 * @param bgcolor The bgcolor to set.
	 */
	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}
	/**
	 * @return Returns the border.
	 */
	public String getBorder() {
		return border;
	}
	/**
	 * @param border The border to set.
	 */
	public void setBorder(String border) {
		this.border = border;
	}
	/**
	 * @return Returns the cellpadding.
	 */
	public String getCellpadding() {
		return cellpadding;
	}
	/**
	 * @param cellpadding The cellpadding to set.
	 */
	public void setCellpadding(String cellpadding) {
		this.cellpadding = cellpadding;
	}
	/**
	 * @return Returns the charAttribute.
	 */
	public String getCharAttribute() {
		return charAttribute;
	}
	/**
	 * @param charAttribute The charAttribute to set.
	 */
	public void setCharAttribute(String charAttribute) {
		this.charAttribute = charAttribute;
	}
	/**
	 * @return Returns the charoff.
	 */
	public String getCharoff() {
		return charoff;
	}
	/**
	 * @param charoff The charoff to set.
	 */
	public void setCharoff(String charoff) {
		this.charoff = charoff;
	}
	/**
	 * @return Returns the charset.
	 */
	public String getCharset() {
		return charset;
	}
	/**
	 * @param charset The charset to set.
	 */
	public void setCharset(String charset) {
		this.charset = charset;
	}
	/**
	 * @return Returns the checked.
	 */
	public String getChecked() {
		return checked;
	}
	/**
	 * @param checked The checked to set.
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}
	/**
	 * @return Returns the cite.
	 */
	public String getCite() {
		return cite;
	}
	/**
	 * @param cite The cite to set.
	 */
	public void setCite(String cite) {
		this.cite = cite;
	}
	/**
	 * @return Returns the classid.
	 */
	public String getClassid() {
		return classid;
	}
	/**
	 * @param classid The classid to set.
	 */
	public void setClassid(String classid) {
		this.classid = classid;
	}
	/**
	 * @return Returns the clear.
	 */
	public String getClear() {
		return clear;
	}
	/**
	 * @param clear The clear to set.
	 */
	public void setClear(String clear) {
		this.clear = clear;
	}
	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code The code to set.
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return Returns the codebase.
	 */
	public String getCodebase() {
		return codebase;
	}
	/**
	 * @param codebase The codebase to set.
	 */
	public void setCodebase(String codebase) {
		this.codebase = codebase;
	}
	/**
	 * @return Returns the color.
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color The color to set.
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return Returns the cols.
	 */
	public String getCols() {
		return cols;
	}
	/**
	 * @param cols The cols to set.
	 */
	public void setCols(String cols) {
		this.cols = cols;
	}
	/**
	 * @return Returns the colspan.
	 */
	public String getColspan() {
		return colspan;
	}
	/**
	 * @param colspan The colspan to set.
	 */
	public void setColspan(String colspan) {
		this.colspan = colspan;
	}
	/**
	 * @return Returns the compact.
	 */
	public String getCompact() {
		return compact;
	}
	/**
	 * @param compact The compact to set.
	 */
	public void setCompact(String compact) {
		this.compact = compact;
	}
	/**
	 * @return Returns the content.
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content The content to set.
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return Returns the coords.
	 */
	public String getCoords() {
		return coords;
	}
	/**
	 * @param coords The coords to set.
	 */
	public void setCoords(String coords) {
		this.coords = coords;
	}
	/**
	 * @return Returns the data.
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data The data to set.
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return Returns the datetime.
	 */
	public String getDatetime() {
		return datetime;
	}
	/**
	 * @param datetime The datetime to set.
	 */
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	/**
	 * @return Returns the declare.
	 */
	public String getDeclare() {
		return declare;
	}
	/**
	 * @param declare The declare to set.
	 */
	public void setDeclare(String declare) {
		this.declare = declare;
	}
	/**
	 * @return Returns the defer.
	 */
	public String getDefer() {
		return defer;
	}
	/**
	 * @param defer The defer to set.
	 */
	public void setDefer(String defer) {
		this.defer = defer;
	}
	/**
	 * @return Returns the disabled.
	 */
	public String getDisabled() {
		return disabled;
	}
	/**
	 * @param disabled The disabled to set.
	 */
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
	/**
	 * @return Returns the enctype.
	 */
	public String getEnctype() {
		return enctype;
	}
	/**
	 * @param enctype The enctype to set.
	 */
	public void setEnctype(String enctype) {
		this.enctype = enctype;
	}
	/**
	 * @return Returns the face.
	 */
	public String getFace() {
		return face;
	}
	/**
	 * @param face The face to set.
	 */
	public void setFace(String face) {
		this.face = face;
	}
	/**
	 * @return Returns the forAttribute.
	 */
	public String getForAttribute() {
		return forAttribute;
	}
	/**
	 * @param forAttribute The forAttribute to set.
	 */
	public void setForAttribute(String forAttribute) {
		this.forAttribute = forAttribute;
	}
	/**
	 * @return Returns the frame.
	 */
	public String getFrame() {
		return frame;
	}
	/**
	 * @param frame The frame to set.
	 */
	public void setFrame(String frame) {
		this.frame = frame;
	}
	/**
	 * @return Returns the frameborder.
	 */
	public String getFrameborder() {
		return frameborder;
	}
	/**
	 * @param frameborder The frameborder to set.
	 */
	public void setFrameborder(String frameborder) {
		this.frameborder = frameborder;
	}
	/**
	 * @return Returns the headers.
	 */
	public String getHeaders() {
		return headers;
	}
	/**
	 * @param headers The headers to set.
	 */
	public void setHeaders(String headers) {
		this.headers = headers;
	}
	/**
	 * @return Returns the height.
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height The height to set.
	 */
	public void setHeight(String height) {
		this.height = height;
	}
	/**
	 * @return Returns the href.
	 */
	public String getHref() {
		return href;
	}
	/**
	 * @param href The href to set.
	 */
	public void setHref(String href) {
		this.href = href;
	}
	/**
	 * @return Returns the hreflang.
	 */
	public String getHreflang() {
		return hreflang;
	}
	/**
	 * @param hreflang The hreflang to set.
	 */
	public void setHreflang(String hreflang) {
		this.hreflang = hreflang;
	}
	/**
	 * @return Returns the hspace.
	 */
	public String getHspace() {
		return hspace;
	}
	/**
	 * @param hspace The hspace to set.
	 */
	public void setHspace(String hspace) {
		this.hspace = hspace;
	}
	/**
	 * @return Returns the ismap.
	 */
	public String getIsmap() {
		return ismap;
	}
	/**
	 * @param ismap The ismap to set.
	 */
	public void setIsmap(String ismap) {
		this.ismap = ismap;
	}
	/**
	 * @return Returns the label.
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label The label to set.
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return Returns the language.
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language The language to set.
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return Returns the link.
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link The link to set.
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return Returns the longdesc.
	 */
	public String getLongdesc() {
		return longdesc;
	}
	/**
	 * @param longdesc The longdesc to set.
	 */
	public void setLongdesc(String longdesc) {
		this.longdesc = longdesc;
	}
	/**
	 * @return Returns the marginheight.
	 */
	public String getMarginheight() {
		return marginheight;
	}
	/**
	 * @param marginheight The marginheight to set.
	 */
	public void setMarginheight(String marginheight) {
		this.marginheight = marginheight;
	}
	/**
	 * @return Returns the marginwidth.
	 */
	public String getMarginwidth() {
		return marginwidth;
	}
	/**
	 * @param marginwidth The marginwidth to set.
	 */
	public void setMarginwidth(String marginwidth) {
		this.marginwidth = marginwidth;
	}
	/**
	 * @return Returns the maxlength.
	 */
	public String getMaxlength() {
		return maxlength;
	}
	/**
	 * @param maxlength The maxlength to set.
	 */
	public void setMaxlength(String maxlength) {
		this.maxlength = maxlength;
	}
	/**
	 * @return Returns the media.
	 */
	public String getMedia() {
		return media;
	}
	/**
	 * @param media The media to set.
	 */
	public void setMedia(String media) {
		this.media = media;
	}
	/**
	 * @return Returns the method.
	 */
	public String getMethod() {
		return method;
	}
	/**
	 * @param method The method to set.
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	/**
	 * @return Returns the multiple.
	 */
	public String getMultiple() {
		return multiple;
	}
	/**
	 * @param multiple The multiple to set.
	 */
	public void setMultiple(String multiple) {
		this.multiple = multiple;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return Returns the nohref.
	 */
	public String getNohref() {
		return nohref;
	}
	/**
	 * @param nohref The nohref to set.
	 */
	public void setNohref(String nohref) {
		this.nohref = nohref;
	}
	/**
	 * @return Returns the noresize.
	 */
	public String getNoresize() {
		return noresize;
	}
	/**
	 * @param noresize The noresize to set.
	 */
	public void setNoresize(String noresize) {
		this.noresize = noresize;
	}
	/**
	 * @return Returns the noshade.
	 */
	public String getNoshade() {
		return noshade;
	}
	/**
	 * @param noshade The noshade to set.
	 */
	public void setNoshade(String noshade) {
		this.noshade = noshade;
	}
	/**
	 * @return Returns the nowrap.
	 */
	public String getNowrap() {
		return nowrap;
	}
	/**
	 * @param nowrap The nowrap to set.
	 */
	public void setNowrap(String nowrap) {
		this.nowrap = nowrap;
	}
	/**
	 * @return Returns the object.
	 */
	public String getObject() {
		return object;
	}
	/**
	 * @param object The object to set.
	 */
	public void setObject(String object) {
		this.object = object;
	}
	/**
	 * @return Returns the onblur.
	 */
	public String getOnblur() {
		return onblur;
	}
	/**
	 * @param onblur The onblur to set.
	 */
	public void setOnblur(String onblur) {
		this.onblur = onblur;
	}
	/**
	 * @return Returns the onchange.
	 */
	public String getOnchange() {
		return onchange;
	}
	/**
	 * @param onchange The onchange to set.
	 */
	public void setOnchange(String onchange) {
		this.onchange = onchange;
	}
	/**
	 * @return Returns the onfocus.
	 */
	public String getOnfocus() {
		return onfocus;
	}
	/**
	 * @param onfocus The onfocus to set.
	 */
	public void setOnfocus(String onfocus) {
		this.onfocus = onfocus;
	}
	/**
	 * @return Returns the onload.
	 */
	public String getOnload() {
		return onload;
	}
	/**
	 * @param onload The onload to set.
	 */
	public void setOnload(String onload) {
		this.onload = onload;
	}
	/**
	 * @return Returns the onreset.
	 */
	public String getOnreset() {
		return onreset;
	}
	/**
	 * @param onreset The onreset to set.
	 */
	public void setOnreset(String onreset) {
		this.onreset = onreset;
	}
	/**
	 * @return Returns the onselect.
	 */
	public String getOnselect() {
		return onselect;
	}
	/**
	 * @param onselect The onselect to set.
	 */
	public void setOnselect(String onselect) {
		this.onselect = onselect;
	}
	/**
	 * @return Returns the onsubmit.
	 */
	public String getOnsubmit() {
		return onsubmit;
	}
	/**
	 * @param onsubmit The onsubmit to set.
	 */
	public void setOnsubmit(String onsubmit) {
		this.onsubmit = onsubmit;
	}
	/**
	 * @return Returns the onunload.
	 */
	public String getOnunload() {
		return onunload;
	}
	/**
	 * @param onunload The onunload to set.
	 */
	public void setOnunload(String onunload) {
		this.onunload = onunload;
	}
	/**
	 * @return Returns the profile.
	 */
	public String getProfile() {
		return profile;
	}
	/**
	 * @param profile The profile to set.
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}
	/**
	 * @return Returns the prompt.
	 */
	public String getPrompt() {
		return prompt;
	}
	/**
	 * @param prompt The prompt to set.
	 */
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	/**
	 * @return Returns the readonly.
	 */
	public String getReadonly() {
		return readonly;
	}
	/**
	 * @param readonly The readonly to set.
	 */
	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}
	/**
	 * @return Returns the rel.
	 */
	public String getRel() {
		return rel;
	}
	/**
	 * @param rel The rel to set.
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
	/**
	 * @return Returns the rev.
	 */
	public String getRev() {
		return rev;
	}
	/**
	 * @param rev The rev to set.
	 */
	public void setRev(String rev) {
		this.rev = rev;
	}
	/**
	 * @return Returns the rows.
	 */
	public String getRows() {
		return rows;
	}
	/**
	 * @param rows The rows to set.
	 */
	public void setRows(String rows) {
		this.rows = rows;
	}
	/**
	 * @return Returns the rowspan.
	 */
	public String getRowspan() {
		return rowspan;
	}
	/**
	 * @param rowspan The rowspan to set.
	 */
	public void setRowspan(String rowspan) {
		this.rowspan = rowspan;
	}
	/**
	 * @return Returns the rules.
	 */
	public String getRules() {
		return rules;
	}
	/**
	 * @param rules The rules to set.
	 */
	public void setRules(String rules) {
		this.rules = rules;
	}
	/**
	 * @return Returns the scheme.
	 */
	public String getScheme() {
		return scheme;
	}
	/**
	 * @param scheme The scheme to set.
	 */
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	/**
	 * @return Returns the scope.
	 */
	public String getScope() {
		return scope;
	}
	/**
	 * @param scope The scope to set.
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}
	/**
	 * @return Returns the scrolling.
	 */
	public String getScrolling() {
		return scrolling;
	}
	/**
	 * @param scrolling The scrolling to set.
	 */
	public void setScrolling(String scrolling) {
		this.scrolling = scrolling;
	}
	/**
	 * @return Returns the selected.
	 */
	public String getSelected() {
		return selected;
	}
	/**
	 * @param selected The selected to set.
	 */
	public void setSelected(String selected) {
		this.selected = selected;
	}
	/**
	 * @return Returns the shape.
	 */
	public String getShape() {
		return shape;
	}
	/**
	 * @param shape The shape to set.
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}
	/**
	 * @return Returns the size.
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size The size to set.
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return Returns the span.
	 */
	public String getSpan() {
		return span;
	}
	/**
	 * @param span The span to set.
	 */
	public void setSpan(String span) {
		this.span = span;
	}
	/**
	 * @return Returns the src.
	 */
	public String getSrc() {
		return src;
	}
	/**
	 * @param src The src to set.
	 */
	public void setSrc(String src) {
		this.src = src;
	}
	/**
	 * @return Returns the standby.
	 */
	public String getStandby() {
		return standby;
	}
	/**
	 * @param standby The standby to set.
	 */
	public void setStandby(String standby) {
		this.standby = standby;
	}
	/**
	 * @return Returns the start.
	 */
	public String getStart() {
		return start;
	}
	/**
	 * @param start The start to set.
	 */
	public void setStart(String start) {
		this.start = start;
	}
	/**
	 * @return Returns the summary.
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary The summary to set.
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * @return Returns the tabindex.
	 */
	public String getTabindex() {
		return tabindex;
	}
	/**
	 * @param tabindex The tabindex to set.
	 */
	public void setTabindex(String tabindex) {
		this.tabindex = tabindex;
	}
	/**
	 * @return Returns the target.
	 */
	public String getTarget() {
		return target;
	}
	/**
	 * @param target The target to set.
	 */
	public void setTarget(String target) {
		this.target = target;
	}
	/**
	 * @return Returns the text.
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text The text to set.
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return Returns the type.
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type The type to set.
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return Returns the usemap.
	 */
	public String getUsemap() {
		return usemap;
	}
	/**
	 * @param usemap The usemap to set.
	 */
	public void setUsemap(String usemap) {
		this.usemap = usemap;
	}
	/**
	 * @return Returns the valign.
	 */
	public String getValign() {
		return valign;
	}
	/**
	 * @param valign The valign to set.
	 */
	public void setValign(String valign) {
		this.valign = valign;
	}
	/**
	 * @return Returns the value.
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value The value to set.
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return Returns the valuetype.
	 */
	public String getValuetype() {
		return valuetype;
	}
	/**
	 * @param valuetype The valuetype to set.
	 */
	public void setValuetype(String valuetype) {
		this.valuetype = valuetype;
	}
	/**
	 * @return Returns the version.
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version The version to set.
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return Returns the vlink.
	 */
	public String getVlink() {
		return vlink;
	}
	/**
	 * @param vlink The vlink to set.
	 */
	public void setVlink(String vlink) {
		this.vlink = vlink;
	}
	/**
	 * @return Returns the vspace.
	 */
	public String getVspace() {
		return vspace;
	}
	/**
	 * @param vspace The vspace to set.
	 */
	public void setVspace(String vspace) {
		this.vspace = vspace;
	}
	/**
	 * @return Returns the width.
	 */
	public String getWidth() {
		return width;
	}
	/**
	 * @param width The width to set.
	 */
	public void setWidth(String width) {
		this.width = width;
	}
	/**
	 * @return Returns the dir.
	 */
	public String getDir() {
		return dir;
	}
	/**
	 * @param dir The dir to set.
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}
	/**
	 * @return Returns the lang.
	 */
	public String getLang() {
		return lang;
	}
	/**
	 * @param lang The lang to set.
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}
	/**
	 * @return Returns the onclick.
	 */
	public String getOnclick() {
		return onclick;
	}
	/**
	 * @param onclick The onclick to set.
	 */
	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}
	/**
	 * @return Returns the ondblclick.
	 */
	public String getOndblclick() {
		return ondblclick;
	}
	/**
	 * @param ondblclick The ondblclick to set.
	 */
	public void setOndblclick(String ondblclick) {
		this.ondblclick = ondblclick;
	}
	/**
	 * @return Returns the onkeydown.
	 */
	public String getOnkeydown() {
		return onkeydown;
	}
	/**
	 * @param onkeydown The onkeydown to set.
	 */
	public void setOnkeydown(String onkeydown) {
		this.onkeydown = onkeydown;
	}
	/**
	 * @return Returns the onkeypress.
	 */
	public String getOnkeypress() {
		return onkeypress;
	}
	/**
	 * @param onkeypress The onkeypress to set.
	 */
	public void setOnkeypress(String onkeypress) {
		this.onkeypress = onkeypress;
	}
	/**
	 * @return Returns the onkeyup.
	 */
	public String getOnkeyup() {
		return onkeyup;
	}
	/**
	 * @param onkeyup The onkeyup to set.
	 */
	public void setOnkeyup(String onkeyup) {
		this.onkeyup = onkeyup;
	}
	/**
	 * @return Returns the onmousedown.
	 */
	public String getOnmousedown() {
		return onmousedown;
	}
	/**
	 * @param onmousedown The onmousedown to set.
	 */
	public void setOnmousedown(String onmousedown) {
		this.onmousedown = onmousedown;
	}
	/**
	 * @return Returns the onmousemove.
	 */
	public String getOnmousemove() {
		return onmousemove;
	}
	/**
	 * @param onmousemove The onmousemove to set.
	 */
	public void setOnmousemove(String onmousemove) {
		this.onmousemove = onmousemove;
	}
	/**
	 * @return Returns the onmouseout.
	 */
	public String getOnmouseout() {
		return onmouseout;
	}
	/**
	 * @param onmouseout The onmouseout to set.
	 */
	public void setOnmouseout(String onmouseout) {
		this.onmouseout = onmouseout;
	}
	/**
	 * @return Returns the onmouseover.
	 */
	public String getOnmouseover() {
		return onmouseover;
	}
	/**
	 * @param onmouseover The onmouseover to set.
	 */
	public void setOnmouseover(String onmouseover) {
		this.onmouseover = onmouseover;
	}
	/**
	 * @return Returns the onmouseup.
	 */
	public String getOnmouseup() {
		return onmouseup;
	}
	/**
	 * @param onmouseup The onmouseup to set.
	 */
	public void setOnmouseup(String onmouseup) {
		this.onmouseup = onmouseup;
	}
	/**
	 * @return Returns the style.
	 */
	public String getStyle() {
		return style;
	}
	/**
	 * @param style The style to set.
	 */
	public void setStyle(String style) {
		this.style = style;
	}
	/**
	 * @return Returns the styleClass.
	 */
	public String getStyleClass() {
		return styleClass;
	}
	/**
	 * @param styleClass The styleClass to set.
	 */
	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}
	/**
	 * @return Returns the title.
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title The title to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	public void release() {
		super.release();
		sid=null;
		styleClass=null; 
		abbr=null;
		accept=null;
		accesskey=null;
		action=null;
		align=null;
		alink=null;
		alt=null;
		archive=null;
		axis=null;
		background=null;
		bgcolor=null;
		border=null;
		cellpadding=null;
		charAttribute=null;
		charoff=null;
		charset=null;
		checked=null;
		cite=null;
		classid=null;
		clear=null;
		code=null;
		codebase=null;
		color=null;
		cols=null;
		colspan=null;
		compact=null;
		content=null;
		coords=null;
		data=null;
		datetime=null;
		declare=null;
		defer=null;
		dir=null;
		disabled=null;
		enctype=null;
		face=null;
		forAttribute=null;
		frame=null;
		frameborder=null;
		headers=null;
		height=null;
		href=null;
		hreflang=null;
		hspace=null;
		ismap=null;
		label=null;
		lang=null;
		language=null;
		link=null;
		longdesc=null;
		marginheight=null;
		marginwidth=null;
		maxlength=null;
		media=null;
		method=null;
		multiple=null;
		name=null;
		nohref=null;
		noresize=null;
		noshade=null;
		nowrap=null;
		object=null;
		onblur=null;
		onchange=null;
		onclick=null;
		ondblclick=null;
		onfocus=null;
		onkeydown=null;
		onkeypress=null;
		onkeyup=null;
		onload=null;
		onmousedown=null;
		onmousemove=null;
		onmouseout=null;
		onmouseover=null;
		onmouseup=null;
		onreset=null;
		onselect=null;
		onsubmit=null;
		onunload=null;
		profile=null;
		prompt=null;
		readonly=null;
		rel=null;
		rev=null;
		rows=null;
		rowspan=null;
		rules=null;
		scheme=null;
		scope=null;
		scrolling=null;
		selected=null;
		shape=null;
		size=null;
		span=null;
		src=null;
		standby=null;
		start=null;
		style=null;
		summary=null;
		tabindex=null;
		target=null;
		text=null;
		title=null;
		type=null;
		usemap=null;
		valign=null;
		value=null;
		valuetype=null;
		version=null;
		vlink=null;
		vspace=null;
		width=null;
	}
	
	protected void setProperties(UIComponent component) {

		super.setProperties(component);
		setString( component , "sid" , sid );
		setString( component , "styleClass" , styleClass );
		setString( component , "abbr" , abbr );
		setString( component , "accept" , accept );
		setString( component , "accesskey" , accesskey );
		setString( component , "action" , action );
		setString( component , "align" , align );
		setString( component , "alink" , alink );
		setString( component , "alt" , alt );
		setString( component , "archive" , archive );
		setString( component , "axis" , axis );
		setString( component , "background" , background );
		setString( component , "bgcolor" , bgcolor );
		setString( component , "border" , border );
		setString( component , "cellpadding" , cellpadding );
		setString( component , "cellspacing" , cellspacing );
		setString( component , "charAttribute" , charAttribute );
		setString( component , "charoff" , charoff );
		setString( component , "charset" , charset );
		setString( component , "checked" , checked );
		setString( component , "cite" , cite );
		setString( component , "classid" , classid );
		setString( component , "clear" , clear );
		setString( component , "code" , code );
		setString( component , "codebase" , codebase );
		setString( component , "color" , color );
		setString( component , "cols" , cols );
		setString( component , "colspan" , colspan );
		setString( component , "compact" , compact );
		setString( component , "content" , content );
		setString( component , "coords" , coords );
		setString( component , "data" , data );
		setString( component , "datetime" , datetime );
		setString( component , "declare" , declare );
		setString( component , "defer" , defer );
		setString( component , "dir" , dir );
		setString( component , "disabled" , disabled );
		setString( component , "enctype" , enctype );
		setString( component , "face" , face );
		setString( component , "forAttribute" , forAttribute );
		setString( component , "frame" , frame );
		setString( component , "frameborder" , frameborder );
		setString( component , "headers" , headers );
		setString( component , "height" , height );
		setString( component , "href" , href );
		setString( component , "hreflang" , hreflang );
		setString( component , "hspace" , hspace );
		setString( component , "ismap" , ismap );
		setString( component , "label" , label );
		setString( component , "lang" , lang );
		setString( component , "language" , language );
		setString( component , "link" , link );
		setString( component , "longdesc" , longdesc );
		setString( component , "marginheight" , marginheight );
		setString( component , "marginwidth" , marginwidth );
		setString( component , "maxlength" , maxlength );
		setString( component , "media" , media );
		setString( component , "method" , method );
		setString( component , "multiple" , multiple );
		setString( component , "name" , name );
		setString( component , "nohref" , nohref );
		setString( component , "noresize" , noresize );
		setString( component , "noshade" , noshade );
		setString( component , "nowrap" , nowrap );
		setString( component , "object" , object );
		setString( component , "onblur" , onblur );
		setString( component , "onchange" , onchange );
		setString( component , "onclick" , onclick );
		setString( component , "ondblclick" , ondblclick );
		setString( component , "onfocus" , onfocus );
		setString( component , "onkeydown" , onkeydown );
		setString( component , "onkeypress" , onkeypress );
		setString( component , "onkeyup" , onkeyup );
		setString( component , "onload" , onload );
		setString( component , "onmousedown" , onmousedown );
		setString( component , "onmousemove" , onmousemove );
		setString( component , "onmouseout" , onmouseout );
		setString( component , "onmouseover" , onmouseover );
		setString( component , "onmouseup" , onmouseup );
		setString( component , "onreset" , onreset );
		setString( component , "onselect" , onselect );
		setString( component , "onsubmit" , onsubmit );
		setString( component , "onunload" , onunload );
		setString( component , "profile" , profile );
		setString( component , "prompt" , prompt );
		setString( component , "readonly" , readonly );
		setString( component , "rel" , rel );
		setString( component , "rev" , rev );
		setString( component , "rows" , rows );
		setString( component , "rowspan" , rowspan );
		setString( component , "rules" , rules );
		setString( component , "scheme" , scheme );
		setString( component , "scope" , scope );
		setString( component , "scrolling" , scrolling );
		setString( component , "selected" , selected );
		setString( component , "shape" , shape );
		setString( component , "size" , size );
		setString( component , "span" , span );
		setString( component , "src" , src );
		setString( component , "standby" , standby );
		setString( component , "start" , start );
		setString( component , "style" , style );
		setString( component , "summary" , summary );
		setString( component , "tabindex" , tabindex );
		setString( component , "target" , target );
		setString( component , "text" , text );
		setString( component , "title" , title );
		setString( component , "type" , type );
		setString( component , "usemap" , usemap );
		setString( component , "valign" , valign );
		setString( component , "value" , value );
		setString( component , "valuetype" , valuetype );
		setString( component , "version" , version );
		setString( component , "vlink" , vlink );
		setString( component , "vspace" , vspace );
		setString( component , "width" , width );
	}

	 public static void setString(UIComponent component, String attributeName,
			String attributeValue) {
		if (attributeValue == null)
			return;
		if (UIComponentTag.isValueReference(attributeValue))
			setValueBinding(component, attributeName, attributeValue);
		else
			component.getAttributes().put(attributeName, attributeValue);
	}

//	public static void setInteger(UIComponent component, String attributeName,
//			String attributeValue) {
//		if (attributeValue == null)
//			return;
//		if (UIComponentTag.isValueReference(attributeValue))
//			setValueBinding(component, attributeName, attributeValue);
//		else
//			component.getAttributes().put(attributeName,
//					new Integer(attributeValue));
//	}

//	public static void setBoolean(UIComponent component, String attributeName,
//			String attributeValue) {
//		if (attributeValue == null)
//			return;
//		if (UIComponentTag.isValueReference(attributeValue))
//			setValueBinding(component, attributeName, attributeValue);
//		else
//			component.getAttributes().put(attributeName,
//					new Boolean(attributeValue));
//	}

	public static void setValueBinding(UIComponent component,
			String attributeName, String attributeValue) {
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		ValueBinding vb = app.createValueBinding(attributeValue);
		component.setValueBinding(attributeName, vb);
	}

//	public static void setActionListener(UIComponent component,
//			String attributeValue) {
//		setMethodBinding(component, "actionListener", attributeValue,
//				new Class[] { ActionEvent.class });
//	}
//
//	public static void setValueChangeListener(UIComponent component,
//			String attributeValue) {
//		setMethodBinding(component, "valueChangeListener", attributeValue,
//				new Class[] { ValueChangeEvent.class });
//	}
//
//	public static void setValidator(UIComponent component, String attributeValue) {
//		setMethodBinding(component, "validator", attributeValue, new Class[] {
//				FacesContext.class, UIComponent.class, Object.class });
//	}

//	public static void setAction(UIComponent component, String attributeValue) {
//		if (attributeValue == null)
//			return;
//		if (UIComponentTag.isValueReference(attributeValue))
//			setMethodBinding(component, "action", attributeValue,
//					new Class[] {});
//		else {
//			FacesContext context = FacesContext.getCurrentInstance();
//			Application app = context.getApplication();
//			MethodBinding mb = new ActionMethodBinding(attributeValue);
//			component.getAttributes().put("action", mb);
//		}
//	}

	public static void setMethodBinding(UIComponent component,
			String attributeName, String attributeValue, Class[] paramTypes) {
		if (attributeValue == null)
			return;
		if (UIComponentTag.isValueReference(attributeValue)) {
			FacesContext context = FacesContext.getCurrentInstance();
			Application app = context.getApplication();
			MethodBinding mb = app.createMethodBinding(attributeValue,
					paramTypes);
			component.getAttributes().put(attributeName, mb);
		}
	}

//	private static class ActionMethodBinding extends MethodBinding implements
//			Serializable {
//		private String result;
//
//		public ActionMethodBinding(String result) {
//			this.result = result;
//		}
//
//		public Object invoke(FacesContext context, Object params[]) {
//			return result;
//		}
//
//		public String getExpressionString() {
//			return result;
//		}
//
//		public Class getType(FacesContext context) {
//			return String.class;
//		}
//	}
			  
	/**
	 * @return Returns the cellspacing.
	 */
	public String getCellspacing() {
		return cellspacing;
	}
	/**
	 * @param cellspacing The cellspacing to set.
	 */
	public void setCellspacing(String cellspacing) {
		this.cellspacing = cellspacing;
	}
}
