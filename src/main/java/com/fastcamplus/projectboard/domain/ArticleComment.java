package com.fastcamplus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; //게시글 (ID)
    private String content; // 본문

    private String createBy; //생성일시
    private LocalDateTime modifiedAt; //생성자
    private LocalDateTime createAt; //수정일시
    private String modifiedBy; //
}
