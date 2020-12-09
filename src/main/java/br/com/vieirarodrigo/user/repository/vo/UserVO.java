package br.com.vieirarodrigo.user.repository.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class UserVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "FULL_NAME")
	private String fullName;
	private String email;
	private String nickName;
	private String password;
	@Column(name = "CREATED_AT")
	private Date created;
}