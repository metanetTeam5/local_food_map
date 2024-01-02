package com.example.demo.notice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDto {
	private String	notiTitle;
	private String	notiContent;
	private Long	membId;
}
