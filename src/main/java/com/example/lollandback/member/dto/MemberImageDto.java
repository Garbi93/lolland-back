package com.example.lollandback.member.dto;

import lombok.Data;

@Data
public class MemberImageDto {
    private Long id;
    private String file_name;
    private String file_url;
    private String image_type;
}
