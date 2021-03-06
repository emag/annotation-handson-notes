package megascus.annotation.handson.pattern.factory;

import java.util.Locale;

public class CalendarFactory {

  public Calendar getInstance(Locale locale) {
    if (locale.getCountry().equals("ja")) {
      return new JapaneseCalendar();
    }
    return new GregorianCalendar();
  }
}

interface Calendar {
  String getName();
}

class GregorianCalendar implements Calendar {
  @Override
  public String getName() {
    return "グレゴリオ暦";
  }
}

class JapaneseCalendar implements Calendar {
  @Override
  public String getName() {
    return "日本歴";
  }
}