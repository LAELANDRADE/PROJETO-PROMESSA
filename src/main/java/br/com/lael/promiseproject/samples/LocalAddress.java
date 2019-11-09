package br.com.lael.promiseproject.samples;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LocalAddress {

    private String street;
    private String name;
    private String number;
    private Boolean active;

}
