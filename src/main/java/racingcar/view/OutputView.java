package racingcar.view;

import racingcar.service.CarService;
import racingcar.service.CarServiceImpl;

import java.util.List;

public class OutputView {

    private final CarService carService;

    public OutputView(CarService carService) {
        this.carService = carService;
    }

    public void result() {
        System.out.println("실행 결과");
    }

    public void finalResult() {
        carService.setRandom(); // 우승자 계산
        List<String> winners = ((CarServiceImpl) carService).getWinners();

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }

}
