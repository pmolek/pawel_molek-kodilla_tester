package com.kodilla.mockito.homework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAppService {

    private Map<WeatherLocalization, List<WeatherClient>> localizations = new HashMap<>();


    public void addLocalization(WeatherLocalization weatherLocalization) {
        System.out.println("Adding localization: " + weatherLocalization);
        localizations.put(weatherLocalization, new ArrayList<WeatherClient>());

    }

    public void removeLocalization(WeatherLocalization weatherLocalization) {
        System.out.println("Removing localization " + weatherLocalization);
        for (Map.Entry<WeatherLocalization, List<WeatherClient>> entry : localizations.entrySet()) {
            if (entry.getKey().equals(weatherLocalization)) {
                for (WeatherClient weatherClient : entry.getValue()) {
                    entry.getKey().removeClient(weatherClient);
                }
            }
        }
        localizations.remove(weatherLocalization);
    }

    public void addClient(WeatherClient weatherClient, WeatherLocalization weatherLocalization) {
        if (!localizations.containsKey(weatherLocalization)) {
            System.out.println("Localization not found. Creating a new one");
            this.addLocalization(weatherLocalization);
        } else {
            System.out.println("Localization found.");
        }
        for (Map.Entry<WeatherLocalization, List<WeatherClient>> entry : localizations.entrySet()) {
            if (entry.getKey().equals(weatherLocalization)) {
                entry.getValue().add(weatherClient);
                entry.getKey().receiveClient(weatherClient);
                System.out.println("Adding client " + weatherClient + " to localization " + weatherLocalization);
            }
        }
    }

    public void removeClientFromLocalization(WeatherClient weatherClient, WeatherLocalization weatherLocalization) {
        for (Map.Entry<WeatherLocalization, List<WeatherClient>> entry : localizations.entrySet()) {
            if (entry.getKey().equals(weatherLocalization) && entry.getValue().contains(weatherClient)) {
                entry.getValue().remove(weatherClient);
                entry.getKey().removeClient(weatherClient);
                System.out.println("Removing client " + weatherClient + " from localization " + weatherLocalization + ".");
            }
        }
    }

    public void removeSubscriberFromAllLocalizations(WeatherClient weatherClient) {
        for (Map.Entry<WeatherLocalization, List<WeatherClient>> entry : localizations.entrySet()) {
            if (entry.getValue().contains(weatherClient)) {
                entry.getValue().remove(weatherClient);
                entry.getKey().removeClient(weatherClient);
            }
        }
        System.out.println("Removing client " + weatherClient + " from all followed localizations.");
    }

    public void sendNotificationToLocalization(WeatherNotification weatherNotification, WeatherLocalization weatherLocalization) {
        for (Map.Entry<WeatherLocalization, List<WeatherClient>> entry : this.localizations.entrySet()) {
            if (entry.getKey().equals(weatherLocalization)) {
                entry.getValue().forEach(user -> user.receive(weatherNotification));
                System.out.println("Notification sent to " + weatherLocalization + "clients");
            }
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        for (Map.Entry<WeatherLocalization, List<WeatherClient>> entry : this.localizations.entrySet()) {
            entry.getValue().forEach(weatherClient -> weatherClient.receive(weatherNotification));
            System.out.println("Notification sent to all clients.");
        }

    }
}
