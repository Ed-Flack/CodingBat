public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday && speed <= 65 || speed <= 60) {
    return 0;
  } else if (speed >= 61 && (isBirthday && speed <= 85 || speed <= 80)) {
    return 1;
  }
  return 2;
}
