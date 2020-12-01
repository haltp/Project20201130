package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;


public class BoardDao {
	

	public List<Board> getBoardList() {
		List<Board> bolist = new ArrayList<>();
		bolist.add(new Board("제목1", "내용1"));
		bolist.add(new Board("제목2", "내용2"));
		bolist.add(new Board("제목3", "내용3"));
		
		return bolist;
	}
}
