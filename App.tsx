/* eslint-disable react-native/no-inline-styles */
import React, { useState } from 'react';
import { Button, NativeModules, SafeAreaView, Text } from 'react-native';

const { CounterModule, CalendarModule } = NativeModules;

console.log(NativeModules);

const App = () => {
  const [counter, setCounter] = useState(0);

  const onPressIncreaseAsync = async () => {
    const _counter = await CounterModule.increaseAsync();
    setCounter(_counter);
  };

  const onPressIncrease = async () => {
    CounterModule.increase((_counter: number) => {
      setCounter(_counter);
    });
  };

  const onPressDecrease = () => {
    CounterModule.decrease((_counter: number) => {
      setCounter(_counter);
    });
  };

  const onPressDecreaseAsync = async () => {
    const _counter = await CounterModule.decreaseAsync();
    setCounter(_counter);
  };

  return (
    <SafeAreaView>
      <Text style={{ textAlign: 'center', fontSize: 48 }}>{counter}</Text>

      <Button title="Increase Async" onPress={onPressIncreaseAsync} />
      <Button title="Increase" onPress={onPressIncrease} />
      <Button title="Decrease Async" onPress={onPressDecreaseAsync} />
      <Button title="Decrease" onPress={onPressDecrease} />
      <Button
        title="Test"
        onPress={() => {
          CalendarModule.createCalendarEvent('testName', 'testLocation');
        }}
      />
    </SafeAreaView>
  );
};

export default App;
