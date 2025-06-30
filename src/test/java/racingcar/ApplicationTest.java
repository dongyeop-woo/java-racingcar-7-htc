package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 기능_테스트() {
        assertRandomNumberInRangeTest(
            () -> {
                run("pobi,woni", "1");
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }

    // 이름은 5자 이하만 가능하다.
    @Test
    void 이름_5자이하_테스트(){
        //then
        assertThatThrownBy(() -> run("aaaaaa", "5"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 5글자 이하여야 합니다.");
    }

    // 쉼표를 기준으로 분리가 되는지 확인한다.
    @Test
    void 쉼표_분리_테스트(){
        //then
        assertThatThrownBy(() -> run("aaab.dddd", "5"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("");
    }

    // 주어진 횟수 동안 N대의 자동차는 전진 또는 멈출 수 있다.
    @Test
    void 전진_멈춤_테스트(){
        //given

        //when

        //then
    }

    // 이동 입력 시 오류가 나진 않는지 테스트한다.
    @Test
    void 이동_입력_테스트(){
        //given

        //when

        //then
    }

    // 무작위값이 4이상 나왔을 때 이동을 하는지 확인한다.
    @Test
    void 무작위값이_4_이상_경우_전진_테스트(){
        //given

        //when

        //then
    }

    // 우승자가 여러 명일 경우 쉼표(,)을 이용해서 구분이 되는지 확인한다.
    @Test
    void 여러_우승자_구분_테스트(){
        //given

        //when

        //then
    }


    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
