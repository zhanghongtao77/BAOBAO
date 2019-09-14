package com.xueqing.demo.springbootsecurity.util;

public class PageUtil {

	//封装分页需要的属性+=》全局变量
	private int totalCount; 	//总记录数
	private int pageSize; 		//分页单位
	private int currentPage;	//当前页
	private int prevPage; 		//上一页
	private int totalPage; 		//尾页
	private int nextPage; 		//下一页
	private int startIndex; 	//索引值



	public PageUtil(String page, int totalCount, int pageSize) {
		initCurrentPage(page);  //计算当前页
		initPrevPage();         //上一页
		this.totalCount=totalCount;  //总条数
		this.pageSize=pageSize;      //分页单位
		initTotalPage();      //尾页
		initNextPage();      //下一页
		initStartIndex();    //索引值
	}



	//索引值
	private void initStartIndex() {
		// TODO Auto-generated method stub
		this.startIndex = (currentPage-1)*pageSize;
	}

	//下一页
	private void initNextPage() {
		// TODO Auto-generated method stub
		this.nextPage = currentPage==totalPage ? totalPage :currentPage+1;
	}



	//尾页
	private void initTotalPage() {
		// TODO Auto-generated method stub
		this.totalPage = (totalCount/pageSize)+(totalCount%pageSize==0 ? 0 : 1);
	}



	//上一页
	private void initPrevPage() {
		// TODO Auto-generated method stub
		this.prevPage = currentPage==1 ? 1 : currentPage-1;
	}



	//计算当前页
	private void initCurrentPage(String page) {
		if(page==null){
			page="1";
		}
		this.currentPage = Integer.parseInt(page);
	}



	/*
	 * getset方法
	 */
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

}
