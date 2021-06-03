package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class WeatherAppServiceTestSuite {

    WeatherAppService weatherAppService = new WeatherAppService();
    WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
    WeatherLocalization weatherLocalization = Mockito.mock(WeatherLocalization.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        weatherAppService.addLocalization(weatherLocalization);
        weatherAppService.sendNotificationToLocalization(weatherNotification, weatherLocalization);
        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldReceiveNotificationsAfterSubscribingToLocalization() {
        weatherAppService.addClient(weatherClient, weatherLocalization);
        weatherAppService.sendNotificationToLocalization(weatherNotification, weatherLocalization);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
    }


    @Test
    public void shouldDeleteSubscribedLocalization() {
        weatherAppService.addClient(weatherClient, weatherLocalization);
        weatherAppService.removeClientFromLocalization(weatherClient, weatherLocalization);
        Mockito.verify(weatherLocalization, Mockito.times(1)).removeClient(weatherClient);
    }


    @Test
    public void shouldCancelSubscriptionAndDeleteAccount() {
        WeatherLocalization weatherLocalization1 = Mockito.mock(WeatherLocalization.class);
        weatherAppService.addClient(weatherClient, weatherLocalization);
        weatherAppService.addClient(weatherClient, weatherLocalization1);
        weatherAppService.removeSubscriberFromAllLocalizations(weatherClient);
        Mockito.verify(weatherLocalization, Mockito.times(1)).removeClient(weatherClient);
        Mockito.verify(weatherLocalization1, Mockito.times(1)).removeClient(weatherClient);
    }


    @Test
    public void shouldSendNotificationOnlyToLocalizationSubscribers() {
        weatherAppService.addClient(weatherClient, weatherLocalization);
        weatherAppService.sendNotificationToLocalization(weatherNotification, weatherLocalization);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
    }


    @Test
    public void shouldSendSignificantNotificationToAll() {
        WeatherClient weatherClient1 = Mockito.mock(WeatherClient.class);
        WeatherClient weatherClient2 = Mockito.mock(WeatherClient.class);
        WeatherLocalization weatherLocalization1 = Mockito.mock(WeatherLocalization.class);
        WeatherLocalization weatherLocalization2 = Mockito.mock(WeatherLocalization.class);
        WeatherNotification significantNotification = Mockito.mock(WeatherNotification.class);
        weatherAppService.addClient(weatherClient1, weatherLocalization1);
        weatherAppService.addClient(weatherClient2, weatherLocalization2);
        weatherAppService.sendNotificationToAll(significantNotification);
        Mockito.times(2);

    }


    @Test
    public void shouldDeleteChosenLocalization() {
        weatherAppService.addClient(weatherClient, weatherLocalization);
        weatherAppService.removeLocalization(weatherLocalization);
        Mockito.verify(weatherLocalization, Mockito.times(1)).removeClient(weatherClient);

    }


}