package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수입니다.") //필수로 입력해야 되는 값을 위한 어노테이션 이거랑 @Valid 랑 BindingResult 연관 있음. Valid는 오류 체크해주고 BindingResult는 NotEmpty에 써있는 메세지를 뷰에 띄워줌
    private String name;

    private String city;

    private String street;

    private String zipcode;

}
