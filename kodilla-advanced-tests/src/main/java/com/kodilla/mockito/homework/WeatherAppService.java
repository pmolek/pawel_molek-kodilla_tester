package com.kodilla.mockito.homework;


import java.util.*;

public class WeatherAppService {

    private Map<WeatherLocalization, Set<WeatherClient>> localizations = new HashMap<>();

    public void addClient(WeatherLocalization weatherLocalization, WeatherClient weatherClient) {
        Set<WeatherClient> weatherClients = localizations.get(weatherLocalization);
        if (weatherClients == null) {
            weatherClients = new HashSet<>();
            weatherClients.add(weatherClient);
            localizations.put(weatherLocalization, weatherClients);
        } else {
            weatherClients.add(weatherClient);
        }
    }

    public boolean localizationExists(WeatherLocalization weatherLocalization) {
        return localizations.containsKey(weatherLocalization);
    }

    public boolean removeClientFromLocalization(WeatherLocalization weatherLocalization, WeatherClient weatherClient) {
        if (localizations.size() > 0) {
            if (localizations.containsKey(weatherLocalization)) {
                if (localizations.get(weatherLocalization).contains(weatherClient)) {
                    if (localizations.get(weatherLocalization).remove(weatherClient)) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void removeSubscriberFromAllLocalizations(WeatherClient weatherClient) {
        if (localizations.size() > 0) {
            for (Map.Entry<WeatherLocalization, Set<WeatherClient>> entry : localizations.entrySet()) {
                removeClientFromLocalization(entry.getKey(), weatherClient);
            }
        }
    }

    public void sendNotificationToLocalization(WeatherNotification weatherNotification, WeatherLocalization weatherLocalization) {
        for (Map.Entry<WeatherLocalization, Set<WeatherClient>> entry : localizations.entrySet()) {
            if (entry.getKey().equals(weatherLocalization)) {
                for (WeatherClient subscriber : entry.getValue()) {
                    subscriber.receive(weatherNotification);
                }
            }
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        Set<WeatherClient> notifiedClients = new HashSet<>();
        for (Map.Entry<WeatherLocalization, Set<WeatherClient>> entry : localizations.entrySet()) {
            for (WeatherClient client : entry.getValue()) {
                if (!notifiedClients.contains(client)) {
                    client.receive(weatherNotification);
                    notifiedClients.add(client);
                }
            }
        }
    }

    public void removeLocalization(WeatherLocalization weatherLocalization) {
        if (localizations.size() > 0) {
            if (localizations.containsKey(weatherLocalization)) {
                localizations.remove(weatherLocalization);
            }
        }
    }


    public boolean isWeatherClientSubscribedToGivenLocalization(WeatherLocalization weatherLocalization, WeatherClient weatherClient) {
        if (localizations.containsKey(weatherLocalization)) {
            Set<WeatherClient> localizationClients = localizations.get(weatherLocalization);
            return localizationClients.contains(weatherClient);
        }
        return false;
    }

    public Set<WeatherLocalization> getClientsLocalizations(WeatherClient weatherClient) {
        Set<WeatherLocalization> clientLocalizations = new HashSet<>();
        if (localizations.size() > 0) {
            for (Map.Entry<WeatherLocalization, Set<WeatherClient>> entry : localizations.entrySet()) {
                for (WeatherClient client : entry.getValue()) {
                    if (client.equals(weatherClient)) {
                        clientLocalizations.add(entry.getKey());
                    }
                }
            }
        }
        return clientLocalizations;
    }
}

