package jp.co.seattle.library.dto;

import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * ユーザー情報格納DTO
 *
 */
@Configuration
@Data
public class UserInfo {

	private int userId;

	private String email;

	private String password;

	private String passwordCheck;

}