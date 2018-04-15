## Java-Timezone

The following time file can be used to get the timezones from the various functions i have included. 
### How it Works

Basically, you can either pass a timezone via this method.
![BotImp](https://i.imgur.com/cNZbBHd.png)

or create a method like this..
![BotImp](https://i.imgur.com/EAdnNzH.png)

and call it from main or toString()
![BotImp](https://i.imgur.com/YTRs7S1.png)

//Example Template
```
 public static String timezone() {
  time obtainDate = new time();
  TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");
  String dateFormat = "MMMM dd,yyyy";
  String timeFormat = "hh:mm:ss a \nzzzz";
  return String.format("\n\nTodays Date: %s\nCurrent Time: %s", obtainDate.getTodayDate(dateFormat, timeZone), obtainDate.getCurrentTime(timeFormat, timeZone));

 }
```
More timezone ID's can be found here: https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/

### Below is the implementation via my discord 

```
  if (objMsg.getContentRaw().equals("$time")) {
   time alltimes = new time();
   objChannel.sendMessage("```" + alltimes + "```").queue();
```

![BotImp](https://i.imgur.com/ZOQTiRh.png)
