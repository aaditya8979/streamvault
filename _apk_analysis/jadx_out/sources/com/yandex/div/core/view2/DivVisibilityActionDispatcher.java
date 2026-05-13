package com.yandex.div.core.view2;

import ah.c9;
import android.view.View;
import bn.r;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivVisibilityAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivVisibilityActionDispatcher.kt */
/* JADX INFO: loaded from: classes7.dex */
public class DivVisibilityActionDispatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<CompositeLogId, Integer> appearLogCounters = CollectionsKt.arrayMap();

    @NotNull
    private final Map<CompositeLogId, Integer> disappearLogCounters = CollectionsKt.arrayMap();

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionHandler divActionHandler;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final List<DivVisibilityChangeListener> visibilityListeners;

    /* JADX INFO: compiled from: DivVisibilityActionDispatcher.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivVisibilityActionDispatcher(@NotNull Div2Logger div2Logger, @NotNull List<? extends DivVisibilityChangeListener> list, @NotNull DivActionHandler divActionHandler, @NotNull DivActionBeaconSender divActionBeaconSender) {
        this.logger = div2Logger;
        this.visibilityListeners = list;
        this.divActionHandler = divActionHandler;
        this.divActionBeaconSender = divActionBeaconSender;
    }

    private Map<CompositeLogId, Integer> countersFor(c9 c9Var) {
        return c9Var instanceof DivVisibilityAction ? this.appearLogCounters : this.disappearLogCounters;
    }

    private void logAction(Div2View div2View, ExpressionResolver expressionResolver, View view, c9 c9Var) {
        if (c9Var instanceof DivVisibilityAction) {
            this.logger.logViewShown(div2View, expressionResolver, view, (DivVisibilityAction) c9Var);
        } else {
            Div2Logger div2Logger = this.logger;
            p.i(c9Var, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(div2View, expressionResolver, view, (DivDisappearAction) c9Var);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(c9Var, expressionResolver);
    }

    private void logAction(Div2View div2View, ExpressionResolver expressionResolver, View view, c9 c9Var, String str) {
        if (c9Var instanceof DivVisibilityAction) {
            this.logger.logViewShown(div2View, expressionResolver, view, (DivVisibilityAction) c9Var, str);
        } else {
            Div2Logger div2Logger = this.logger;
            p.i(c9Var, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(div2View, expressionResolver, view, (DivDisappearAction) c9Var, str);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(c9Var, expressionResolver);
    }

    public void dispatchAction(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull c9 c9Var) {
        CompositeLogId compositeLogIdCompositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(div2View, c9Var.b().evaluate(expressionResolver));
        Map<CompositeLogId, Integer> mapCountersFor = countersFor(c9Var);
        Integer num = mapCountersFor.get(compositeLogIdCompositeLogIdOf);
        if (num == null) {
            num = 0;
            mapCountersFor.put(compositeLogIdCompositeLogIdOf, num);
        }
        int iIntValue = num.intValue();
        KLog kLog = KLog.INSTANCE;
        Severity severity = Severity.INFO;
        if (kLog.isAtLeast(severity)) {
            kLog.print(4, "DivVisibilityActionDispatcher", "visibility action dispatched: id=" + compositeLogIdCompositeLogIdOf + ", counter=" + iIntValue);
        }
        long jLongValue = c9Var.c().evaluate(expressionResolver).longValue();
        if (jLongValue == 0 || iIntValue < jLongValue) {
            if (this.divActionHandler.getUseActionUid()) {
                String string = UUID.randomUUID().toString();
                DivActionHandler actionHandler = div2View.getActionHandler();
                if (!(actionHandler != null ? actionHandler.handleAction(c9Var, div2View, expressionResolver, string) : false) && !this.divActionHandler.handleAction(c9Var, div2View, expressionResolver, string)) {
                    logAction(div2View, expressionResolver, view, c9Var, string);
                }
            } else {
                DivActionHandler actionHandler2 = div2View.getActionHandler();
                if (!(actionHandler2 != null ? actionHandler2.handleAction(c9Var, div2View, expressionResolver) : false) && !this.divActionHandler.handleAction(c9Var, div2View, expressionResolver)) {
                    logAction(div2View, expressionResolver, view, c9Var);
                }
            }
            countersFor(c9Var).put(compositeLogIdCompositeLogIdOf, Integer.valueOf(iIntValue + 1));
            if (kLog.isAtLeast(severity)) {
                kLog.print(4, "DivVisibilityActionDispatcher", "visibility action logged: " + compositeLogIdCompositeLogIdOf);
            }
        }
    }

    public void dispatchActions(@NotNull final Div2View div2View, @NotNull final ExpressionResolver expressionResolver, @NotNull final View view, @NotNull final c9[] c9VarArr) {
        div2View.bulkActions$div_release(new a<r>() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher.dispatchActions.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c9[] c9VarArr2 = c9VarArr;
                DivVisibilityActionDispatcher divVisibilityActionDispatcher = this;
                Div2View div2View2 = div2View;
                ExpressionResolver expressionResolver2 = expressionResolver;
                View view2 = view;
                for (c9 c9Var : c9VarArr2) {
                    divVisibilityActionDispatcher.dispatchAction(div2View2, expressionResolver2, view2, c9Var);
                }
            }
        });
    }

    public void dispatchVisibleViewsChanged(@NotNull Map<View, ? extends Div> map) {
        Iterator<T> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            ((DivVisibilityChangeListener) it.next()).onViewsVisibilityChanged(map);
        }
    }
}
