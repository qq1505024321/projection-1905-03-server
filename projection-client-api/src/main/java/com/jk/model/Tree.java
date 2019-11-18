package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class Tree implements Serializable {

	private static final long serialVersionUID = 7588332054287196758L;
	private Integer id;
	
	private String text;
	
	private String url;
	
	private Integer pid;
	
	private Boolean leaf;
	
	private Boolean selectable;
	
	private List<Tree> nodes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Boolean getLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	public Boolean getSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public List<Tree> getNodes() {
		return nodes;
	}

	public void setNodes(List<Tree> nodes) {
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return "Tree{" +
				"id=" + id +
				", text='" + text + '\'' +
				", url='" + url + '\'' +
				", pid=" + pid +
				", leaf=" + leaf +
				", selectable=" + selectable +
				", nodes=" + nodes +
				'}';
	}
}
