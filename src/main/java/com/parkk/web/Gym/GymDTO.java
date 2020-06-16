package com.parkk.web.Gym;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class GymDTO {
    private String seq , ser_Num,  open_YN, number, address,
            mailing_address, name, centerType, public_Private;
}
