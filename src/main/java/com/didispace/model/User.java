package com.didispace.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "t_user")
public class User {

    private Long id;

    private String userName;
    private String passWord;
    private String sex;

}