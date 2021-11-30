package com.opencart.repository;

import com.opencart.datamodel.CanonEOS5DModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CanonEOS5DModelRepository {

    private CanonEOS5DModelRepository() {}

    public static CanonEOS5DModel getCanonEOS5DModel() {
        return CanonEOS5DModel.builder()
                .select(15) // 15/16
                .qty(RandomStringUtils.randomNumeric(1,2))
                .build();
    }
}
