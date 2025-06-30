package racingcar.view;

import racingcar.message.Input;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String InputPlayCar() {
        System.out.println(Input.inputCarName);
        return Console.readLine();
    }

    public static String InputPlayGameCount() {
        System.out.println(Input.inputPlayCount);
        return Console.readLine();
    }

}
