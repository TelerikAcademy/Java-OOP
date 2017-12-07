package com.minkov.models;

import com.minkov.models.base.ModelBase;

import java.util.List;

public class Superhero extends ModelBase {
  private static final int MIN_NAME_LENGTH = 3;
  private static final int MAX_NAME_LENGTH = 60;
  private static final int MIN_STORY_LENGTH = 1;

  private String name;
  private String secretIdentity;
  private Alignment alignment;
  private String story;
  private List<Power> powers;
  private City city;
  private List<Faction> factions;

  public Superhero(String name, String secretIdentity, Alignment alignment, String story, List<Power> powers, City city, List<Faction> factions) {
    setName(name);
    setSecretIdentity(secretIdentity);
    setAlignment(alignment);
    setStory(story);
    setPowers(powers);
    setCity(city);
    setFactions(factions);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {

    checkForNull(name, getMessageFormatter()
      .formatNullCheckMessage("Name"));

    String lengthErrorMessage = getMessageFormatter()
      .formatRangeCheckMessage("Name", MIN_NAME_LENGTH, MAX_NAME_LENGTH);

    checkStringValidity(name, MIN_NAME_LENGTH, MAX_NAME_LENGTH, lengthErrorMessage);
    this.name = name;
  }

  public String getSecretIdentity() {
    return secretIdentity;
  }

  public void setSecretIdentity(String secretIdentity) {
    checkForNull(secretIdentity,
      getMessageFormatter()
        .formatNullCheckMessage("secret identity")
    );

    this.secretIdentity = secretIdentity;
  }

  public Alignment getAlignment() {
    return alignment;
  }

  public void setAlignment(Alignment alignment) {
    checkForNull(alignment,
      getMessageFormatter().formatNullCheckMessage("alignment"));
    this.alignment = alignment;
  }

  public String getStory() {
    return story;
  }

  public void setStory(String story) {
    checkForNull(story,
      getMessageFormatter().formatNullCheckMessage("story"));

    checkStringValidity(story, MIN_STORY_LENGTH, );

    this.story = story;
  }

  public List<Power> getPowers() {
    return powers;
  }

  public void setPowers(List<Power> powers) {
    this.powers = powers;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public List<Faction> getFactions() {
    return factions;
  }

  public void setFactions(List<Faction> factions) {
    this.factions = factions;
  }
}
