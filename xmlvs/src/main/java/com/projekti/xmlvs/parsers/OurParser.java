package com.projekti.xmlvs.parsers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class OurParser {
    private String filePath;
    public abstract void doJob();
}
