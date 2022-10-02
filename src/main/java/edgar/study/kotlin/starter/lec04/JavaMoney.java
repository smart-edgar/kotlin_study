package edgar.study.kotlin.starter.lec04;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {
    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }


    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JavaMoney javaMoney = (JavaMoney) o;
        return amount == javaMoney.amount;
    }
}
