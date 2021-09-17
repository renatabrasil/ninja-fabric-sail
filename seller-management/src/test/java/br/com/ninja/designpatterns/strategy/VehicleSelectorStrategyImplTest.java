package br.com.ninja.designpatterns.strategy;

import br.com.ninja.designpatterns.strategy.Channel;
import br.com.ninja.designpatterns.strategy.VehicleSelectorStrategyImpl;
import br.com.ninja.designpatterns.strategy.strategies.MarineVehicleStrategy;
import br.com.ninja.designpatterns.strategy.strategies.RoadVehicleStrategy;
import br.com.ninja.designpatterns.strategy.strategies.VehicleStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class VehicleSelectorStrategyImplTest {

    private VehicleSelectorStrategyImpl vehicleSelectorStrategy;
    private final VehicleStrategy vehicle1 = mock(VehicleStrategy.class);
    private final RoadVehicleStrategy vehicle2 = mock(RoadVehicleStrategy.class);
    private final MarineVehicleStrategy vehicle3 = mock(MarineVehicleStrategy.class);

    @BeforeEach
    public void init() {
        List<VehicleStrategy> strategies = new ArrayList(Arrays.asList(vehicle1, vehicle2, vehicle3));
        vehicleSelectorStrategy = new VehicleSelectorStrategyImpl(strategies);
    }

    private static List<String> getChannels() {
        return Arrays.stream(Channel.values()).map(Enum::name).collect(Collectors.toList());
    }

    @Test
    void getProcessorSuccessfully() {
        // Given
        String channel = "sea";
        when(vehicle1.canDrive(channel)).thenReturn(false);
        when(vehicle2.canDrive(channel)).thenReturn(true);

        // When
        VehicleStrategy result = vehicleSelectorStrategy.getVehicle(channel);

        // Then
        assertNotNull(result);
        verify(vehicle1, times(1)).canDrive(anyString());
        verify(vehicle2, times(1)).canDrive(anyString());
        verify(vehicle3, never()).canDrive(anyString());
    }
}
