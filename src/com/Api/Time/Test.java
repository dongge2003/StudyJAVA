package com.Api.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        /*
        Date类:
            public Date()：从运行程序的此时此刻到时间原点经历的毫秒值,转换成Date对象，分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。

            public Date(long date)：将指定参数的毫秒值date,转换成Date对象，分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，
            即1970年1月1日00:00:00 GMT）以来的指定毫秒数。
         */

        //创建对象表示一个时间
        //空参构造
        Date date1 = new Date(1000L);
        System.out.println(date1);//Wed Sep 04 23:30:43 HKT 2024

        //有参构造
        Date date2 = new Date();


        /*
        setTime 方法
        从原子时间开始传入多少毫秒的参数,则在此基础上增加几秒
        1000毫秒 = 1秒
         */
        date2.setTime(1000);
        System.out.println(date2);//Thu Jan 01 08:00:01 HKT 1970

        /*
        getTime 方法
        获取当前时间到原子时间的毫秒值
         */
        System.out.println(date2.getTime());//1000

        System.out.println("--------------------------------------------");





        /*
        SimpleDateFormat类:
            java.text.SimpleDateFormat 是日期/时间格式化类，我们通过这个类可以帮我们完成日期和文本之间的转换,
            也就是可以在Date对象与String对象之间进行来回转换。

            格式化：按照指定的格式，把Date对象转换为String对象。
            解析：按照指定的格式，把String对象转换为Date对象。

            public simpleDateFormat() 默认格式
            public simpleDateFormat(String pattern) 指定格式
            public final string format(Date date) 格式化(日期对象 ->字符串)
            public Date parse(string source) 解析(字符串 ->日期对象)
         */

        //空参构造SimpleDateFormat对象,默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date();
        String str = sdf1.format(d1);
        System.out.println(str);//2024/9/5 10:13

        //带参构造 - 指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);//2024年09月05日 10:15:58

        System.out.println("--------------------------------------------");

        /*
        字母	日期或时间元素	表示	示例
        G	Era 标志符	Text	AD
        y	年	Year	1996; 96
        M	年中的月份	Month	July; Jul; 07
        w	年中的周数	Number	27
        W	月份中的周数	Number	2
        D	年中的天数	Number	189
        d	月份中的天数	Number	10
        F	月份中的星期	Number	2
        E	星期中的天数	Text	Tuesday; Tue
        a	Am/pm 标记	Text	PM
        H	一天中的小时数（0-23）	Number	0
        k	一天中的小时数（1-24）	Number	24
        K	am/pm 中的小时数（0-11）	Number	0
        h	am/pm 中的小时数（1-12）	Number	12
        m	小时中的分钟数	Number	30
        s	分钟中的秒数	Number	55
        S	毫秒数	Number	978
        z	时区	General time zone	Pacific Standard Time; PST; GMT-08:00
        Z	时区	RFC 822 time zone	-0800
         */

        //创建对象来表示:2024年09月05日 10时25分49秒492毫秒 2024年中第36周,09月中第01周,今天是周四
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS毫秒 yyyy年中第ww周,MM月中第FF周,今天是EE");
        Date d2 = new Date();
        String str3 = sdf3.format(d2);
        System.out.println(str3);//2024年09月05日 10时25分49秒492毫秒 2024年中第36周,09月中第01周,今天是周四

        System.out.println("--------------------------------------------");

        //按照指定格式输出:
        // 如生日为:2004-06-06
        //输出:2004年06月06日
        String str4 = "2004-06-06";
        //1.解析,把字符串变成日期对象
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd");
        Date d3 = sdf5.parse(str4);//!!!这里有异常,需要异常处理
        //2.指定格式
        SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy年MM月dd日");
        String str7 = sdf6.format(d3);
        System.out.println(str7);//2004年06月06日
        System.out.println("--------------------------------------------");



        /*
        Calendar类:
            public static Calendar getInstance()	        获取一个它的子类GregorianCalendar对象

            public final Date getTime()                     获取日期对象
            public final setTime(Date date)                 给日历设置日期对象

            public long getTimeInMillis()                   拿到时间毫秒值
            public void getTimeInMillis(long millis)        给日历设置时间毫秒值

            public int get(int field)                       取日期中的某个字段信息
            public void set(int field , int value)          修改日历的某个字段信息
            public int add(int field , int amount)          为某个字段增加/减少指定的值

         */

        //获取日历对象
        //Calendar类是一个抽象类,不能直接new,需要一个静态方法获取到子类对象

        //底层原理:
        //会根据系统不同时区来获取不同的日历对象
        //会把时间中的纪元,年,月,日,时,分,秒,星期等等都放到一个数组当中
        /*
        0 : 纪元
        1 : 年
        2 : 月
        3 : 一年中的第几周
        4 : 一个月中的第几周
        5 : 一个月中的第几天(日期
        ...
         */

        //月份:范围0 - 11,如果获取的是0,那么实际上是1月
        //星期:在老外眼里,星期日是一周中的第一天
        //则:星期日:1  星期一:2 .....

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("--------------------------------------------");
        /*
        java.util.GregorianCalendar[time=1725531107947,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
        zone=sun.util.calendar.ZoneInfo[id="Asia/Hong_Kong",offset=28800000,dstSavings=0,useDaylight=false,transitions=71,
        lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=2,
        DAY_OF_MONTH=5,DAY_OF_YEAR=249,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=11,SECOND=47,
        MILLISECOND=947,ZONE_OFFSET=28800000,DST_OFFSET=0]
         */

        //2.修改日历代表的时间
        Date d4 = new Date(0L);
        c.setTime(d4);
        System.out.println(c);
        System.out.println("--------------------------------------------");

        //public int get(int field)                       取日期中的某个字段信息
        //public void set(int field , int value)          修改日历的某个字段信息
        //public int add(int field , int amount)          为某个字段增加/减少指定的值

        //1.取字段
        int year = c.get(1);
        int month = c.get(2);
        int date = c.get(Calendar.DATE);//这种也可以
        System.out.println(year + "-" + month + "-" + date);
        System.out.println("--------------------------------------------");

        //2.修改字段
        c.set(1,2000);
        int newyear1 = c.get(1);
        System.out.println(newyear1);//2000
        System.out.println("--------------------------------------------");

        //3.增加减少字段
        c.add(1,1);
        int newyear2 = c.get(1);
        System.out.println(newyear2);//2001




    }
}

