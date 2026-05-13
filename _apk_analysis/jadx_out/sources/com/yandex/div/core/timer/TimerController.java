package com.yandex.div.core.timer;

import bn.r;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTimer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TimerController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TimerController {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Div2View div2View;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivTimer divTimer;

    @Nullable
    private final List<DivAction> endActions;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final ExpressionResolver expressionResolver;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f53951id;
    private boolean savedForBackground;

    @Nullable
    private final List<DivAction> tickActions;

    @NotNull
    private final Ticker ticker;

    @Nullable
    private final String valueVariable;

    /* JADX INFO: compiled from: TimerController.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public TimerController(@NotNull DivTimer divTimer, @NotNull DivActionBinder divActionBinder, @NotNull ErrorCollector errorCollector, @NotNull ExpressionResolver expressionResolver) {
        this.divTimer = divTimer;
        this.divActionBinder = divActionBinder;
        this.errorCollector = errorCollector;
        this.expressionResolver = expressionResolver;
        String str = divTimer.f57964c;
        this.f53951id = str;
        this.valueVariable = divTimer.f57967f;
        this.endActions = divTimer.f57963b;
        this.tickActions = divTimer.f57965d;
        this.ticker = new Ticker(str, new TimerController$ticker$1(this), new TimerController$ticker$2(this), new TimerController$ticker$3(this), new TimerController$ticker$4(this), errorCollector);
        divTimer.f57962a.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.timer.TimerController.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f5635a;
            }

            public final void invoke(long j10) {
                TimerController.this.updateTimer();
            }
        });
        Expression<Long> expression = divTimer.f57966e;
        if (expression != null) {
            expression.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.timer.TimerController.2
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Long l10) {
                    invoke(l10.longValue());
                    return r.f5635a;
                }

                public final void invoke(long j10) {
                    TimerController.this.updateTimer();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnd(long j10) {
        updateTimerVariable(j10);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.endActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(long j10) {
        updateTimerVariable(j10);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.tickActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer() {
        Ticker ticker = this.ticker;
        long jLongValue = this.divTimer.f57962a.evaluate(this.expressionResolver).longValue();
        Expression<Long> expression = this.divTimer.f57966e;
        ticker.update(jLongValue, expression != null ? expression.evaluate(this.expressionResolver) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerVariable(long j10) {
        Div2View div2View;
        String str = this.valueVariable;
        if (str == null || (div2View = this.div2View) == null) {
            return;
        }
        div2View.setVariable(str, String.valueOf(j10));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void applyCommand(@NotNull String str) {
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    this.ticker.cancel();
                    return;
                }
                break;
            case -934426579:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                    this.ticker.resume();
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    this.ticker.stop();
                    return;
                }
                break;
            case 106440182:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                    this.ticker.pause();
                    return;
                }
                break;
            case 108404047:
                if (str.equals("reset")) {
                    this.ticker.reset();
                    return;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    this.ticker.start();
                    return;
                }
                break;
        }
        this.errorCollector.logError(new IllegalArgumentException(str + " is unsupported timer command!"));
    }

    @NotNull
    public final DivTimer getDivTimer() {
        return this.divTimer;
    }

    public final boolean isAttachedToView(@NotNull Div2View div2View) {
        return p.f(div2View, this.div2View);
    }

    public final void onAttach(@NotNull Div2View div2View) {
        this.div2View = div2View;
        if (this.savedForBackground) {
            this.ticker.restoreState(true);
            this.savedForBackground = false;
        }
    }

    public final void onDetach(@Nullable Div2View div2View) {
        if (p.f(div2View, this.div2View)) {
            reset();
        }
    }

    public final void reset() {
        this.div2View = null;
        this.ticker.saveState();
        this.savedForBackground = true;
    }
}
