package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class WeatherAppServiceTestSuite {

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        WeatherAppService weatherAppService = new WeatherAppService();
        WeatherClient client = Mockito.mock(WeatherClient.class);
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

        weatherAppService.sendWeatherNotification(weatherNotification);
        Mockito.verify(client, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldReceiveNotificationsAfterSubscribingToLocalization() {

    }


    @Test
    public void shouldDeleteSubscribedLocalization() {
    }


    @Test
    public void shouldCancelSubscriptionAndDeleteAccount() {
    }


    @Test
    public void shouldSendNotificationOnlyToLocalizationSubscribers() {
    }


    @Test
    public void shouldSendSignificantNotificationToAll() {
    }


    @Test
    public void shouldDeleteChosenLocalization() {
    }


}