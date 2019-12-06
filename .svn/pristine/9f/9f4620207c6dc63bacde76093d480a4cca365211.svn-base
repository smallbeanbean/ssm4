package com.control;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 引入一个泛型类，T表示泛型，对应的实体可以是任意表，可以将页面长度，当前页，总页数，页数数据等为属性
 * @author Administrator
 *
 * @param <T>
 */
@Service
public class Page<T> {
	private int size;//每页长度
	private int curPage;//当前页
	private int cnt;//总条数
	private int pages;//总页数
	private List<T> fenyeData;//分页数据
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public List<T> getFenyeData() {
		return fenyeData;
	}
	public void setFenyeData(List<T> fenyeData) {
		this.fenyeData = fenyeData;
	}
	
	

}
