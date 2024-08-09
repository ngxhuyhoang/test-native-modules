import React, { useState } from 'react';
import { Button, NativeModules, Text, View } from 'react-native';

const { CounterModule } = NativeModules;

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
    <View>
      <Text>{counter}</Text>

      <Button title="Increase Async" onPress={onPressIncreaseAsync} />
      <Button title="Increase" onPress={onPressIncrease} />
      <Button title="Decrease Async" onPress={onPressDecreaseAsync} />
      <Button title="Decrease" onPress={onPressDecrease} />
    </View>
  );
};

export default App;
