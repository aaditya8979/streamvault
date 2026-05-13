package ah;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivCount;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivAnimatorBase.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface b2 {
    @Nullable
    List<DivAction> a();

    @NotNull
    DivCount b();

    @NotNull
    Expression<DivAnimationInterpolator> c();

    @Nullable
    List<DivAction> d();

    @NotNull
    Expression<Long> e();

    @NotNull
    Expression<DivAnimationDirection> getDirection();

    @NotNull
    Expression<Long> getDuration();

    @NotNull
    String getId();
}
