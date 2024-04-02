package com.techacademy;

import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable String yyyymmdd) {
        String date = yyyymmdd;
        int yyyy = Integer.parseInt(date.substring(0, 4));
        int mm = Integer.parseInt(date.substring(4, 6));
        int dd = Integer.parseInt(date.substring(6));

        Calendar cl = Calendar.getInstance();
        cl.set(yyyy,mm-1,dd);

        int dayOfWeek = cl.get(Calendar.DAY_OF_WEEK);
        switch(dayOfWeek) {
            case Calendar.SUNDAY:
                return "Sunday";
            case Calendar.MONDAY:
                return "Monday";
            case Calendar.TUESDAY:
                return "Tuesday";
            case Calendar.WEDNESDAY:
                return "Wednesday";
            case Calendar.THURSDAY:
                return "Thursday";
            case Calendar.FRIDAY:
                return "Friday";
            case Calendar.SATURDAY:
                return "Saturday";
        }
        return "yyyymmdd";
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        Integer res = val1 + val2;
        String s = res.toString();
        return s ;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        Integer res = val1 - val2;
        String s = res.toString();
        return s ;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        Integer res = val1 * val2;
        String s = res.toString();
        return s ;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        Integer res = val1 / val2;
        String s = res.toString();
        return s;
    }
}
