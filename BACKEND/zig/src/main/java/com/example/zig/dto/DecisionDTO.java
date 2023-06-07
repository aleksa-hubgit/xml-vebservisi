package com.example.zig.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
