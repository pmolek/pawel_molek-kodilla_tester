package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WeatherAppServiceTestSuite {

    WeatherAppService weatherAppService = new WeatherAppService();
    WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
    WeatherLocalization weatherLocalization = Mockito.mock(WeatherLocalization.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        weatherAppService.sendNotificationToLocalization(weatherNotification, weatherLocalization);
        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldReceiveNotificationsAfterSubscribingToLocalization() {
        weatherAppService.addClient(weatherLocalization, weatherClient);
        weatherAppService.sendNotificationToLocalization(weatherNotification, weatherLocalization);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
    }


    @Test
    public void shouldDeleteSubscribedLocalization() {

        WeatherClient weatherClient1 = Mockito.mock(WeatherClient.class);
        weatherAppService.addClient(weatherLocalization, weatherClient);
        weatherAppService.addClient(weatherLocalization, weatherClient1);

        assertTrue(weatherAppService.isWeatherClientSubscribedToGivenLocalization(weatherLocalization, weatherClient));
        assertTrue(weatherAppService.isWeatherClientSubscribedToGivenLocalization(weatherLocalization, weatherClient1));

        weatherAppService.removeClientFromLocalization(weatherLocalization, weatherClient);
        weatherAppService.removeClientFromLocalization(weatherLocalization, weatherClient1);

        assertFalse(weatherAppService.isWeatherClientSubscribedToGivenLocalization(weatherLocalization, weatherClient));
        assertFalse(weatherAppService.isWeatherClientSubscribedToGivenLocalization(weatherLocalization, weatherClient1));

    }


    @Test
    public void shouldCancelSubscriptionAndDeleteAccount() {

        WeatherLocalization weatherLocalization1 = Mockito.mock(WeatherLocalization.class);
        WeatherLocalization weatherLocalization2 = Mockito.mock(WeatherLocalization.class);
        WeatherLocalization weatherLocalization3 = Mockito.mock(WeatherLocalization.class);
        weatherAppService.addClient(weatherLocalization1, weatherClient);
        weatherAppService.addClient(weatherLocalization2, weatherClient);
        weatherAppService.addClient(weatherLocalization3, weatherClient);
        assertEquals(3, weatherAppService.getClientsLocalizations(weatherClient).size());
        // when
        weatherAppService.removeSubscriberFromAllLocalizations(weatherClient);
        // then
        assertEquals(0, weatherAppService.getClientsLocalizations(weatherClient).size());
    }


    @Test
    public void shouldSendNotificationOnlyToLocalizationSubscribers() {
        weatherAppService.addClient(weatherLocalization, weatherClient);
        weatherAppService.sendNotificationToLocalization(weatherNotification, weatherLocalization);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);

    }


    @Test
    public void shouldSendSignificantNotificationToAll() {

        WeatherClient weatherClient2 = Mockito.mock(WeatherClient.class);
        WeatherClient weatherClient3 = Mockito.mock(WeatherClient.class);

        WeatherLocalization weatherLocalization1 = Mockito.mock(WeatherLocalization.class);

        weatherAppService.addClient(weatherLocalization, weatherClient);
        weatherAppService.addClient(weatherLocalization1, weatherClient2);
        weatherAppService.addClient(weatherLocalization1, weatherClient3);

        weatherAppService.sendNotificationToAll(weatherNotification);

        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient2, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient3, Mockito.times(1)).receive(weatherNotification);

    }


    @Test
    public void shouldDeleteChosenLocalization() {
        weatherAppService.addClient(weatherLocalization, weatherClient);

        assertTrue(weatherAppService.localizationExists(weatherLocalization));

        weatherAppService.removeLocalization(weatherLocalization);

        assertFalse(weatherAppService.localizationExists(weatherLocalization));

    }


}