package lotto.domain;

public enum LottoConstant {
    LOTTO_NUMBER_COUNT(6),
    MIN_LOTTO_NUMBER(1),
    MAX_LOTTO_NUMBER(45);

    private final int value;

    LottoConstant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
