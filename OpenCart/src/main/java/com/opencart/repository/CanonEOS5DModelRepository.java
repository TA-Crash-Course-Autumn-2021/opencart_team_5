package com.opencart.repository;

import com.opencart.datamodel.CanonEOS5DModel;

public class CanonEOS5DModelRepository {

    private CanonEOS5DModelRepository() {}

    public static CanonEOS5DModel getCanonEOS5DModel() {
        return CanonEOS5DModel.builder()
                .select(15) // 15/16
                .qty("1")
                .build();
    }
}
