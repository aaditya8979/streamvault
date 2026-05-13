package ah;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFunction;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivBase.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface e2 {
    @Nullable
    List<DivVisibilityAction> a();

    @Nullable
    Expression<Long> b();

    @Nullable
    List<DivVariable> c();

    @Nullable
    DivEdgeInsets d();

    @Nullable
    Expression<Long> e();

    @Nullable
    Expression<String> f();

    @Nullable
    Expression<DivAlignmentHorizontal> g();

    @NotNull
    Expression<Double> getAlpha();

    @Nullable
    List<DivBackground> getBackground();

    @Nullable
    List<DivExtension> getExtensions();

    @NotNull
    DivSize getHeight();

    @Nullable
    String getId();

    @Nullable
    DivTransform getTransform();

    @NotNull
    Expression<DivVisibility> getVisibility();

    @NotNull
    DivSize getWidth();

    @Nullable
    List<DivTooltip> h();

    @Nullable
    DivAppearanceTransition i();

    @Nullable
    DivChangeTransition j();

    @Nullable
    List<DivDisappearAction> k();

    @Nullable
    List<DivTransitionTrigger> l();

    @Nullable
    Expression<DivAlignmentVertical> m();

    @Nullable
    DivFocus n();

    @Nullable
    DivAccessibility o();

    @Nullable
    DivEdgeInsets p();

    @Nullable
    List<DivAction> q();

    @Nullable
    DivLayoutProvider r();

    @Nullable
    List<DivTrigger> s();

    @Nullable
    DivVisibilityAction t();

    @Nullable
    List<DivFunction> u();

    @Nullable
    DivAppearanceTransition v();

    @Nullable
    List<DivAnimator> w();

    @Nullable
    DivBorder x();
}
