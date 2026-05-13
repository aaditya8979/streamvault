package yads;

import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class jg3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91223c = {tn.t.f(new MutablePropertyReference1Impl(jg3.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f91224a = cn.w0.h(hg3.f90401b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ig3 f91225b;

    public jg3() {
        wn.a aVar = wn.a.f86472a;
        this.f91225b = new ig3(this);
    }

    public final hg3 a() {
        return (hg3) this.f91225b.getValue(this, f91223c[0]);
    }

    public final void a(hg3 hg3Var) {
        this.f91225b.setValue(this, f91223c[0], hg3Var);
    }
}
