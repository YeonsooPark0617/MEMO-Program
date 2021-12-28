package org.comstudy21.notice.view;

import org.comstudy21.notice.R;
import org.comstudy21.notice.model.NoticeDao;
import org.comstudy21.notice.model.NoticeVo;

public class NoticeByMessage extends NoticeView {
//	NoticeDao dao = new NoticeDao();
//	NoticeVo vo = new NoticeVo();

	@Override
	public void display() {
		System.out.println("::::: 메시지 검색 :::::");
		System.out.print("메시지 입력 >> ");
		String message = scan.next();
		
		R.noticeVo = new NoticeVo(0, null, message, null);
		
		
//		
//		for (int i = 0; i < message.length(); i++) {
//			message.substring(i, message.length());
//
//		}
		// controller로 이동
	}
	
//	public static void main(String[] args) {
//		String message = "kimjihyeon";
//		String i = message.substring(0, message.length());
//		System.out.println(i);
//	}

}
