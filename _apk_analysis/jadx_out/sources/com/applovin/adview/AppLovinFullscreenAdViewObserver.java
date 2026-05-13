package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.n2;
import com.applovin.impl.w1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lifecycle f7587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n2 f7588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7589c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w1 f7590d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, n2 n2Var) {
        this.f7587a = lifecycle;
        this.f7588b = n2Var;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f7587a.removeObserver(this);
        n2 n2Var = this.f7588b;
        if (n2Var != null) {
            n2Var.a();
            this.f7588b = null;
        }
        w1 w1Var = this.f7590d;
        if (w1Var != null) {
            w1Var.a("lifecycle_on_destroy");
            this.f7590d.r();
            this.f7590d = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        w1 w1Var = this.f7590d;
        if (w1Var != null) {
            w1Var.s();
            this.f7590d.v();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        w1 w1Var;
        if (this.f7589c.getAndSet(false) || (w1Var = this.f7590d) == null) {
            return;
        }
        w1Var.t();
        this.f7590d.b(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        w1 w1Var = this.f7590d;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void setPresenter(w1 w1Var) {
        this.f7590d = w1Var;
    }
}
