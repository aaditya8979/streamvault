package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;

/* JADX INFO: loaded from: classes12.dex */
public final class nr3 implements l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitializationListener f92919a;

    public nr3(InitializationListener initializationListener) {
        this.f92919a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nr3) && tn.p.f(((nr3) obj).f92919a, this.f92919a);
    }

    public final int hashCode() {
        return this.f92919a.hashCode();
    }

    @Override // yads.l00
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new mr3(this));
    }
}
