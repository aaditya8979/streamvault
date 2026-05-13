package yads;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class ix0 implements jx0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91026b = {tn.t.f(new MutablePropertyReference1Impl(ix0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f91027a = mm2.a();

    @Override // yads.jx0
    public final void a() {
        lm2 lm2Var = this.f91027a;
        KProperty kProperty = f91026b[0];
        jx0 jx0Var = (jx0) lm2Var.f92035a.get();
        if (jx0Var != null) {
            jx0Var.a();
        }
    }
}
