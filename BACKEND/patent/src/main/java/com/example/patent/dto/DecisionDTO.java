package com.example.patent.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="decision")
public class DecisionDTO {
    public String requestId;
    public Boolean approved;
    public String reason;

    @Override
    public String toString() {
        return "DecisionDTO{" +
                "requestId='" + requestId + '\'' +
                ", approved=" + approved +
                ", reason='" + reason + '\'' +
                '}';
    }
}
