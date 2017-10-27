package com.marykay.mybiz.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
/**
 * @author derek feng
 */
public class Customer {

    private long id;

    private String name, contact, telephone, email, remark;

}
