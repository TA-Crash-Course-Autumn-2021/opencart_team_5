package com.opencart.repository;

import com.opencart.datamodel.AppleCinemaModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class AppleCinemaModelRepository {

    private AppleCinemaModelRepository() {}

    public static AppleCinemaModel getAppleCinemaModel() {
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        return AppleCinemaModel.builder()
                .radio(7) // 5/6/7
                .checkbox(11) // 8/9/10/11
                .text(RandomStringUtils.randomAlphabetic(10))
                .select(1) // 1/2/3/4
                .textarea(RandomStringUtils.randomAlphabetic(20))
                .file("src/test/additionalFiles/File.txt")
                .date(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .time(time.format(DateTimeFormatter.ofPattern("HH:mm")))
                .dateAndTime(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                .qty(RandomStringUtils.randomNumeric(2))
                .build();
    }
}
