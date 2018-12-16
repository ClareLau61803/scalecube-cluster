package io.scalecube.cluster.leaderelection;

public class Config {

  private int heartbeatInterval = 500;
  private int timeout = 1500;
  private long electionTimeout = 1000;

  private Config() {}

  public int timeout() {
    return timeout;
  }

  public int heartbeatInterval() {
    return heartbeatInterval;
  }

  public long electionTimeout() {
    return electionTimeout;
  }

  public static Config build() {
    return new Config();
  }
}
