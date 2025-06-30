package racingcar.controller;

import racingcar.service.CarService;
import racingcar.service.CarServiceImpl;
import racingcar.view.OutputView;

import static racingcar.view.InputView.InputPlayCar;
import static racingcar.view.InputView.InputPlayGameCount;

public class CarController {

    private final CarService carService;
    private final OutputView outputView;

    public CarController() {
        this.carService = new CarServiceImpl();
        this.outputView = new OutputView(carService);
    }

    public void StartGame() {
        String name = InputPlayCar();
        int count = Integer.parseInt(InputPlayGameCount());
        carService.setCarName(name);
        carService.setPlayCount(count);
        outputView.result();
        carService.getGame(count);
        outputView.finalResult();
    }
}
