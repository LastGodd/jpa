package com.springboot.jpa.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// DB의 테이블구조를 생성하는 데 사용
@Entity
@Getter
@Setter
@NoArgsConstructor // 매개변수가 없는 생성자를 자동 생성
@AllArgsConstructor // 모든 필드를 매개변수로 갖는 생성자를 자동 생성
// @RequiredArgsConstructor 필드 중 final이나 @NotNull이 설정된 변수를 매개변수로 갖는 생성자를 자동 생성
// @toString 필드의 값을 문자열로 조합해서 리턴, 숨겨야 할 정보가 있으면 (exclude = "name")속성을 사용해 필드를 자동 생성에서 제외
// @EqualsAndHashCode 객체의 동등성(Equality)과 동일성(Dientity)을 비교하는 연산 메서드를 생성
// @Data - @Getter/@Setter/@RequiredArgsConstructor, @ToString, @EqualsAndHashCode를 모두 포괄하는 어노테이션
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long number;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Integer price;

	@Column(nullable = false)
	private Integer stock;

	private LocalDateTime createAt;

	private LocalDateTime updateAt;

}
