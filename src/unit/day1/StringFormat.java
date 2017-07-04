package unit.day1;
import java.math.BigDecimal;

/**
 * 1.%[argument_index$][flags][width][.precision]conversion
 *  
 *   String.format("%1$s",1234,5678); 指向第参数转换字符串
 *   String.format("%1$s%2$s",1234,5678);两参数格式化字符串,并连接起
 *   String.format("%s",1234,5678);   指向第参数转换字符串
 *   String.format("%s%06d",1234,5678); 第格式化1234 第二格式化005678 w
 */
public class StringFormat {

	/**
	 * 处理浮点型数据 应用范围float、Float、double、Double  BigDecimal
	 *  %[argument_index$][flags][width][.precision]conversion
	 *   %[index$][标识][宽度][保留精度]转换式
	 *           标识：
	 *                   '-'    宽度内左齐与用0填充同使用
	 *                        '+'    结总包括符号
	 *                         '  '    值前加空格负值前加负号
	 *                        '0'    结用零填充
	 *                        ','    每3位数字间用隔（适用于fgG转换）
	 *                         '('    若参数负数则结添加负号用圆括号数字括起（适用于eEfgG转换）
	 *                宽度: 终该整数转化字符串少包含少位数字
	 *                保留精度：保留数位面数
	 *            转换式：
	 *                        'e', 'E'  --  结格式化用计算机科记数表示十进制数
	 *                        'f'       --  结格式化十进制普通表示式
	 *                        'g', 'G'  --  根据具体情况自选择用普通表示式科计数式
	 *                        'a', 'A'  --  结格式化带效位数指数十六进制浮点数
	 *                        
	 */
	public static void formatFloat() {
		System.out.println(String.format("%1$e", 1234567890.123456789));//转换科记数表示
		System.out.println(String.format("%1$020e", 1234567890.123456789));//转换科记数表示,度20,用0填充
		System.out.println(String.format("%1$g", 12345.123456789));//根据结制识别使用转换器e或f
		System.out.println(String.format("%1$a", 12345.123456789));//转换16进制浮点数
		System.out.println(String.format("%1$,f", 1234567890.123456789));//转换结保留默认数位3位数字用,隔转换十进制表示
		System.out.println(String.format("%1$,f", 1234567890.123456789));//转换结保留默认数位3位数字用,隔
		System.out.println(String.format("%1$.10f", 1234567890.123456789));//转换结保留10位精度.转换十进制表示式
		System.out.println(String.format("%1$,.100f", new BigDecimal("12345678909.1234567890123456789")));//转换结保留100位精度,没精度丢失,整数位3用,隔
		System.out.println(String.format("%1$,.5f", 1234567890.123456789));//转换结保留5位数3位数字用,隔
	}
	/**
	 * 处理整数型数据 应用范围 byte、Byte、short、Short、int、Integer、long、Long  BigInteger 
	 *                                         
	 * %[argument_index$][flags][width]conversion
	 *  %[index$][标识][宽度]转换式
	 *            标识：
	 *                         '-'    宽度内左齐与用0填充同使用
	 *                        '#'   适用于8进制16进制8进制结前面增加016进制结前面增加0x
	 *                        '+'   结总包括符号（般情况适用于10进制若象BigInteger才用于8进制16进制）
	 *                        '  '  值前加空格负值前加负号（般情况适用于10进制若象BigInteger才用于8进制16进制）
	 *                        '0'   结用零填充
	 *                        ','   适用于10进制每3位数字间用,隔
	 *                        '('   若参数负数则结添加负号用圆括号数字括起（同‘+’具同限制）
	 *           宽度: 终该整数转化字符串少包含少位数字
	 *           转换式：d-十进制   o-八进制   x或X-十六进制 
	 */
	public static void formatNumber() {
		System.out.println(String.format("%1$d", -31)); //格式化数值表示使用十进制结"-31"
		System.out.println(String.format("%1$o", -31)); //格式化数值表示使用八进制结"37777777741"
		System.out.println(String.format("%1$19d", -31));//格式化数值表示使用十进制总度显示19位结"                -31"
		System.out.println(String.format("%1$-19d", -31));//格式化数值表示使用十进制总度显示19位,左靠齐结"-31                "
		System.out.println(String.format("%1$09d", -31));//格式化数值表示,使用十进制结"-00000031"
		System.out.println(String.format("%1$,9d", -3123));//每3位数字用,隔,总度9位结"   -3,123"
		System.out.println(String.format("%1$,09d", -3123));//每3位数字用,隔,用0填充总度9位结"-0003,123"
		System.out.println(String.format("%1$(9d", -3123));//每3位数字用,用0填充总度9位结"     (3123)"
		System.out.println(String.format("%1$ 9d", -31));
	}
	/**
	 * 处理字符型数据
	 *         字符进行格式化非简单c C表示字符标识'-'表示左齐其没
	 */
	public static void formatChar() {
		System.out.println(String.format("%1$c", 97));//转换字符
		System.out.println(String.format("%1$10c", '邹'));//转换字符,十位
		System.out.println(String.format("%1$-10c", '鸿'));//转换字符十位靠左
	}
	/**
	 * 格式化百比.%特殊字符转义格式 %%\
	 */
	public static void formatBaiFenBi() {
		System.out.println(String.format("%1$f%%", 12.123456));
		System.out.println(String.format("%1$.4f%%", 12.123456));//留取4位数,4舍5入
		BigDecimal a = new BigDecimal("12.12"),b = new BigDecimal("13.13");
		BigDecimal c = a.divide(b,28,BigDecimal.ROUND_HALF_UP);//保留28位数
		System.out.println(c + "");
		System.out.println(String.format("%1$.28f", c));//格式保留28位数
	}
	/**
	 * 获取独立平台行隔符
	 */
	public static void getSeparator() {
		System.out.println(String.format("%n"));
		System.out.println( System.getProperty("line.separator"));
	}
	/**
	 * 格式化期 (用范围long,Long,Calendar,java.util.Date)
	 * %[index$][标识][宽度]转换式
	 *          标识：
	 *                 期间转换字符前缀 t或者T
	 *          转换式：
	 *                 格式化期转换字符
	 *                         'B'  特定于语言环境月份全称例 "January"  "February" 
	 *                        'b'  特定于语言环境月份简称例 "Jan"  "Feb" 
	 *                        'h'  与 'b' 相同 
	 *                        'A'  特定于语言环境星期几全称例 "Sunday"  "Monday" 
	 *                        'a'  特定于语言环境星期几简称例 "Sun"  "Mon" 
	 *                        'C'  除 100 四位数表示份格式化必要带前导零两位数即 00 - 99 
	 *                        'Y'  份格式化必要带前导零四位数（至少）例0092 等于格高利历 92 CE 
	 *                        'y'  份两位数格式化必要带前导零两位数即 00 - 99 
	 *                        'j'  数格式化必要带前导零三位数例于格高利历 001 - 366 
	 *                        'm'  月份格式化必要带前导零两位数即 01 - 13 
	 *                        'd'  月数格式化必要带前导零两位数即 01 - 31 
	 *                        'e'  月数格式化两位数即 1 - 31 
	 *
	 *                 格式化间字符
	 *                         'H'  24 制格式化必要带前导零两位数即 00 - 23 
	 *                        'I'  12 制格式化必要带前导零两位数即 01 - 12 
	 *                        'k'  24 制即 0 - 23 
	 *                        'l'  12 制即 1 - 12 
	 *                        'M'  钟格式化必要带前导零两位数即 00 - 59 
	 *                        'S'  钟秒格式化必要带前导零两位数即 00 - 60 （"60" 支持闰秒所需特殊值） 
	 *                        'L'  秒毫秒格式化必要带前导零三位数即 000 - 999 
	 *                        'N'  秒毫微秒格式化必要带前导零九位数即 000000000 - 999999999 
	 *                        'p'  特定于语言环境 午或午 标记写形式表示例 "am" 或 "pm"使用转换前缀 'T' 强行输转换写形式 
	 *                        'z'  相于 GMT  RFC 822 格式数字区偏移量例 -0800 
	 *                        'Z'  表示区缩写形式字符串Formatter 语言环境取代参数语言环境（） 
	 *                        's'  自协调世界 (UTC) 1970  1 月 1  00:00:00 至现所经秒数即 Long.MIN_VALUE/1000 与 Long.MAX_VALUE/1000 间差值 
	 *                        'Q'  自协调世界 (UTC) 1970  1 月 1  00:00:00 至现所经毫秒数即 Long.MIN_VALUE 与 Long.MAX_VALUE 间差值
	 *                格式化间组合字符
	 *                        'R'  24 制间格式化 "%tH:%tM" 
	 *                        'T'  24 制间格式化 "%tH:%tM:%tS" 
	 *                        'r'  12 制间格式化 "%tI:%tM:%tS %Tp"午或午标记 ('%Tp') 位置能与语言环境关 
	 *                        'D'  期格式化 "%tm/%td/%ty" 
	 *                        'F'  ISO 8601 格式完整期格式化 "%tY-%tm-%td" 
	 *                        'c'  期间格式化 "%ta %tb %td %tT %tZ %tY"例 "Sun Jul 20 16:17:00 EDT 1969" 
	 *
	 */
	public static void formatDate() {
		long c = System.currentTimeMillis();
		System.out.println(String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", c));
		System.out.println(String.format("%1$ty-%1$tm-%1$td %1$tI:%1$tM:%1$tS %1$tp %1$tb %1$ta", c));
		System.out.println(String.format("%1$tF %1$tT", 1244943575031l));
	}
	/**
	 * 规转换应用于任何参数类型
	 *                 'b或B'  '\u0062'   "true" 或 "false" 参数 null则结 "false"参数 boolean 值或 Boolean结由 String.valueOf() 返字符串否则结 "true"
	 *                'h或H'  '\u0068'  表示象哈希码值字符串  参数 arg  null则结 "null"否则结调用 Integer.toHexString(arg.hashCode()) 结
	 *                's或S'  '\u0073'  字符串 参数 null则结 "null"参数实现 Formattable则调用其 formatTo 否则结调用参数 toString() 结 
	 *
	 *
	 */
	public static void formatAny() {
		System.out.println(String.format("%b %b %b %b", null,"","true",true));
		String pattern = "%1$s  %4$tF %4$tT 说 \"%1$s  %2$s %3$d \"";
		System.out.println(String.format(pattern, "mingming","shuilian",10000,System.currentTimeMillis()));
	}
	public static void main(String[] args) {
		formatAny();
	}
}