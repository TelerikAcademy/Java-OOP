package com.minkov.factories;

import com.minkov.models.Power;
import com.minkov.models.PowerType;

import java.util.HashMap;
import java.util.Map;

public class PowersFactory {

  private final Map<Power, Power> powersMap;

  public PowersFactory() {
    powersMap = new HashMap<>();
  }

  public Power getPower(String name, PowerType powerType) {
    Power power = new Power(name, powerType);
    if (!powersMap.containsKey(power)) {
      powersMap.put(power, power);
    }

    return powersMap.get(power);
  }
}
