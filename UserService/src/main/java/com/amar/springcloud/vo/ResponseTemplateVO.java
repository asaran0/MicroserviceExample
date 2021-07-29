package com.amar.springcloud.vo;

import com.amar.springcloud.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
