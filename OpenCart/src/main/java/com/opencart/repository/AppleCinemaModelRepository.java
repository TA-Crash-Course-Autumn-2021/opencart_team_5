package com.opencart.repository;

import com.opencart.datamodel.AppleCinemaModel;
import org.apache.commons.lang3.RandomStringUtils;

public class AppleCinemaModelRepository {

    private AppleCinemaModelRepository() {}

    public static AppleCinemaModel getAppleCinemaModel() {
        return AppleCinemaModel.builder()
                .radio(7) // 5/6/7
                .checkbox(11) // 8/9/10/11
                .text(RandomStringUtils.randomAlphabetic(10))
                .select(1) // 1/2/3/4
                .textarea(RandomStringUtils.randomAlphabetic(20))
                .file("src/test/additionalFiles/File.txt")
                .date("2021-02-20")
                .time("00:00")
                .dateAndTime("2021-11-10 00:00")
                .qty("1")
                .build();
    }
}
