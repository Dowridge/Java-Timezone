import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class time {

//Example Template
/*
 public static String timezone() {
  time obtainDate = new time();
  TimeZone timeZone = TimeZone.getTimeZone("US/Eastern"); // https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
  String dateFormat = "MMMM dd,yyyy";
  String timeFormat = "hh:mm:ss a \nzzzz";
  return String.format("\n\nTodays Date: %s\nCurrent Time: %s", obtainDate.getTodayDate(dateFormat, timeZone), obtainDate.getCurrentTime(timeFormat, timeZone));

 }
 */

 public static String UsEast() {
  time obtainDate = new time();
  TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");
  String dateFormat = "MMMM dd,yyyy";
  String timeFormat = "hh:mm:ss a \nzzzz";
  return String.format("\n\nTodays Date: %s\nCurrent Time: %s", obtainDate.getTodayDate(dateFormat, timeZone), obtainDate.getCurrentTime(timeFormat, timeZone));
 }

 public String EU() {
  time obtainDate = new time();
  TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
  String dateFormat = "MMMM dd,yyyy";
  String timeFormat = "hh:mm:ss a \nzzzz";
  return String.format("\n\nTodays Date: %s\nCurrent Time: %s", obtainDate.getTodayDate(dateFormat, timeZone), obtainDate.getCurrentTime(timeFormat, timeZone));

 }

 public String AU() {
  time obtainDate = new time();
  TimeZone timeZone = TimeZone.getTimeZone("Australia/Sydney");
  String dateFormat = "MMMM dd,yyyy";
  String timeFormat = "hh:mm:ss a \nzzzz";
  return String.format("\n\nTodays Date: %s\nCurrent Time: %s", obtainDate.getTodayDate(dateFormat, timeZone), obtainDate.getCurrentTime(timeFormat, timeZone));
 }

 public String UsWest() {
  time obtainDate = new time();
  TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
  String dateFormat = "MMMM dd,yyyy";
  String timeFormat = "hh:mm:ss a \nzzzz";
  return String.format("\n\nTodays Date: %s\nCurrent Time: %s", obtainDate.getTodayDate(dateFormat, timeZone), obtainDate.getCurrentTime(timeFormat, timeZone));
 }
 
 public String Haw() {
  time obtainDate = new time();
  TimeZone timeZone = TimeZone.getTimeZone("US/Hawaii");
  String dateFormat = "MMMM dd,yyyy";
  String timeFormat = "hh:mm:ss a \nzzzz";
  return String.format("\n\nTodays Date: %s\nCurrent Time: %s", obtainDate.getTodayDate(dateFormat, timeZone), obtainDate.getCurrentTime(timeFormat, timeZone));
 }

 public String getTodaysDay(String dayFormat, TimeZone timeZone) {
  Date date = new Date();
  DateFormat requiredFormat = new SimpleDateFormat(dayFormat);
  requiredFormat.setTimeZone(timeZone);
  String strCurrentDay = requiredFormat.format(date).toUpperCase();
  return strCurrentDay;
 }

 public String getCurrentTime(String timeFormat, TimeZone timeZone) {
  DateFormat dateFormat = new SimpleDateFormat(timeFormat);
  Calendar cal = Calendar.getInstance(timeZone);
  dateFormat.setTimeZone(cal.getTimeZone());
  String currentTime = dateFormat.format(cal.getTime());
  return currentTime;
 }

 public String getTodayDate(String dateFormat, TimeZone timeZone) {
  Date todayDate = new Date();
  DateFormat todayDateFormat = new SimpleDateFormat(dateFormat);
  todayDateFormat.setTimeZone(timeZone);
  String strTodayDate = todayDateFormat.format(todayDate);
  return strTodayDate;
 }

 public String toString() {
  return String.format(Haw() + UsWest()+ UsEast() + EU() + AU());
 }

}