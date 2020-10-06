package org.pmt.util;

import org.json.JSONArray;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DateCategorization {

    public JSONArray categorizeDateList(List<LocalDateTime> localDateTimeList) {
        JSONArray dataList = new JSONArray();

        final LocalDateTime[] minLocalDateTime = {null};
        final LocalDateTime[] maxLocalDateTime = {null};
        localDateTimeList
            .stream()
            .forEach(localDateTime -> {
                if(Objects.isNull(minLocalDateTime[0]) || minLocalDateTime[0].isAfter(localDateTime)) {
                    minLocalDateTime[0] = localDateTime;
                }
                if(Objects.isNull(maxLocalDateTime[0]) || maxLocalDateTime[0].isBefore(localDateTime)) {
                    maxLocalDateTime[0] = localDateTime;
                }
            });
        if(!Objects.isNull(minLocalDateTime[0]) && !Objects.isNull(maxLocalDateTime[0])) {
            Long dayDiff = minLocalDateTime[0].until(maxLocalDateTime[0], ChronoUnit.DAYS);
            List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
            LocalDateTime currentLocalDateTime = minLocalDateTime[0];
            if(dayDiff.intValue() > 365) {
                while(currentLocalDateTime.isBefore(maxLocalDateTime[0])) {
                    LocalDateTime finalCurrentLocalDateTime = currentLocalDateTime;
                    Map<Object,Object> map = new HashMap<Object,Object>();
                    map.put("label", finalCurrentLocalDateTime.getYear());
                    map.put("y", localDateTimeList.stream().filter(localDateTime -> finalCurrentLocalDateTime.getYear() == localDateTime.getYear()).count());
                    list.add(map);
                    currentLocalDateTime = currentLocalDateTime.plusYears(1);
                }
            } else if(dayDiff.intValue() > 30) {
                while(currentLocalDateTime.isBefore(maxLocalDateTime[0])) {
                    LocalDateTime finalCurrentLocalDateTime = currentLocalDateTime;
                    Map<Object,Object> map = new HashMap<Object,Object>();
                    map.put("label", finalCurrentLocalDateTime.getMonth() + " " + finalCurrentLocalDateTime.getYear());
                    map.put("y", localDateTimeList.stream().filter(localDateTime -> finalCurrentLocalDateTime.getMonthValue() == localDateTime.getMonthValue() && finalCurrentLocalDateTime.getYear() == localDateTime.getYear()).count());
                    list.add(map);
                    currentLocalDateTime = currentLocalDateTime.plusMonths(1);
                }
            } else {
                while(currentLocalDateTime.isBefore(maxLocalDateTime[0])) {
                    LocalDateTime finalCurrentLocalDateTime = currentLocalDateTime;
                    Map<Object,Object> map = new HashMap<Object,Object>();
                    map.put("label", finalCurrentLocalDateTime.getYear() + "-" + finalCurrentLocalDateTime.getMonthValue() + "-" + finalCurrentLocalDateTime.getDayOfMonth());
                    map.put("y", localDateTimeList.stream().filter(localDateTime -> finalCurrentLocalDateTime.getDayOfMonth() == localDateTime.getDayOfMonth() && finalCurrentLocalDateTime.getMonthValue() == localDateTime.getMonthValue() && finalCurrentLocalDateTime.getYear() == localDateTime.getYear()).count());
                    list.add(map);
                    currentLocalDateTime = currentLocalDateTime.plusDays(1);
                }
            }
            dataList = new JSONArray(list);
        }
        return dataList;
    }

}
