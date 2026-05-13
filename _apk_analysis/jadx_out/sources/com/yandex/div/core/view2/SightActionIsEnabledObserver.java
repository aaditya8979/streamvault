package com.yandex.div.core.view2;

import ah.c9;
import android.view.View;
import bn.r;
import cn.f0;
import cn.w0;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.SightActionIsEnabledObserver;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import sn.l;
import sn.s;

/* JADX INFO: compiled from: SightActionIsEnabledObserver.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SightActionIsEnabledObserver {

    @NotNull
    private final s<Div2View, ExpressionResolver, View, Div, c9, r> onDisable;

    @NotNull
    private final s<Div2View, ExpressionResolver, View, Div, c9, r> onEnable;

    @NotNull
    private final WeakHashMap<View, Set<c9>> boundedActions = new WeakHashMap<>();

    @NotNull
    private final HashMap<c9, Subscription> subscriptions = new HashMap<>();

    @NotNull
    private final WeakHashMap<View, r> hasSubscription = new WeakHashMap<>();

    /* JADX INFO: compiled from: SightActionIsEnabledObserver.kt */
    public static final class Subscription {

        @NotNull
        private final Disposable disposable;

        @NotNull
        private final WeakReference<View> owner;

        public Subscription(@NotNull Disposable disposable, @NotNull View view) {
            this.disposable = disposable;
            this.owner = new WeakReference<>(view);
        }

        public final void close() {
            this.disposable.close();
        }

        @NotNull
        public final WeakReference<View> getOwner() {
            return this.owner;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SightActionIsEnabledObserver(@NotNull s<? super Div2View, ? super ExpressionResolver, ? super View, ? super Div, ? super c9, r> sVar, @NotNull s<? super Div2View, ? super ExpressionResolver, ? super View, ? super Div, ? super c9, r> sVar2) {
        this.onEnable = sVar;
        this.onDisable = sVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSubscriptionIfNeeded(final View view) {
        if (this.hasSubscription.containsKey(view) || !(view instanceof ExpressionSubscriber)) {
            return;
        }
        ((ExpressionSubscriber) view).addSubscription(new Disposable() { // from class: ig.w
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                SightActionIsEnabledObserver.addSubscriptionIfNeeded$lambda$2(this.f64227b, view);
            }
        });
        this.hasSubscription.put(view, r.f5635a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver sightActionIsEnabledObserver, View view) {
        Set<c9> setRemove = sightActionIsEnabledObserver.boundedActions.remove(view);
        if (setRemove == null) {
            setRemove = w0.f();
        }
        sightActionIsEnabledObserver.cancelObserving(setRemove);
    }

    private final void cancelObserving(c9 c9Var) {
        Set<c9> set;
        Subscription subscriptionRemove = this.subscriptions.remove(c9Var);
        if (subscriptionRemove == null) {
            return;
        }
        subscriptionRemove.close();
        View view = subscriptionRemove.getOwner().get();
        if (view == null || (set = this.boundedActions.get(view)) == null) {
            return;
        }
        set.remove(c9Var);
    }

    public final void cancelObserving(@NotNull Iterable<? extends c9> iterable) {
        Iterator<? extends c9> it = iterable.iterator();
        while (it.hasNext()) {
            cancelObserving(it.next());
        }
    }

    public final void observe(@NotNull final View view, @NotNull final Div2View div2View, @NotNull final ExpressionResolver expressionResolver, @NotNull final Div div, @NotNull List<? extends c9> list) {
        Subscription subscriptionRemove;
        SightActionIsEnabledObserver sightActionIsEnabledObserver = this;
        addSubscriptionIfNeeded(view);
        WeakHashMap<View, Set<c9>> weakHashMap = sightActionIsEnabledObserver.boundedActions;
        Set<c9> setF = weakHashMap.get(view);
        if (setF == null) {
            setF = w0.f();
        }
        Set setZ0 = f0.z0(list, setF);
        Set<c9> setK1 = f0.k1(setZ0);
        for (c9 c9Var : setF) {
            if (!setZ0.contains(c9Var) && (subscriptionRemove = sightActionIsEnabledObserver.subscriptions.remove(c9Var)) != null) {
                subscriptionRemove.close();
            }
        }
        for (final c9 c9Var2 : list) {
            if (setZ0.contains(c9Var2)) {
                sightActionIsEnabledObserver = this;
            } else {
                setK1.add(c9Var2);
                sightActionIsEnabledObserver.cancelObserving(c9Var2);
                sightActionIsEnabledObserver.subscriptions.put(c9Var2, new Subscription(c9Var2.isEnabled().observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.SightActionIsEnabledObserver$observe$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return r.f5635a;
                    }

                    public final void invoke(boolean z10) {
                        if (z10) {
                            this.this$0.onEnable.invoke(div2View, expressionResolver, view, div, c9Var2);
                        } else {
                            this.this$0.onDisable.invoke(div2View, expressionResolver, view, div, c9Var2);
                        }
                    }
                }), view));
                sightActionIsEnabledObserver = this;
                setZ0 = setZ0;
            }
        }
        weakHashMap.put(view, setK1);
    }
}
