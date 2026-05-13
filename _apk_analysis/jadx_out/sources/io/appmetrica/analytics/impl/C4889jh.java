package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4889jh extends N5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4 f67036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4863ih f67037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D3 f67038d;

    public C4889jh(@NonNull Y4 y42, @NonNull InterfaceC4863ih interfaceC4863ih) {
        this(y42, interfaceC4863ih, new D3());
    }

    public C4889jh(Y4 y42, InterfaceC4863ih interfaceC4863ih, D3 d32) {
        super(y42.getContext(), y42.b().c());
        this.f67036b = y42;
        this.f67037c = interfaceC4863ih;
        this.f67038d = d32;
    }

    @NonNull
    public final C4941lh a() {
        return new C4941lh(this.f67036b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4941lh load(@NonNull M5 m52) {
        C4941lh c4941lh = (C4941lh) super.load(m52);
        c4941lh.f67224m = ((C4812gh) m52.componentArguments).f66829a;
        c4941lh.f67229r = this.f67036b.f66233t.a();
        c4941lh.f67234w = this.f67036b.f66230q.a();
        C4812gh c4812gh = (C4812gh) m52.componentArguments;
        c4941lh.f67215d = c4812gh.f66830b;
        c4941lh.f67216e = c4812gh.f66831c;
        c4941lh.f67217f = c4812gh.f66832d;
        c4941lh.f67220i = c4812gh.f66833e;
        c4941lh.f67218g = c4812gh.f66834f;
        c4941lh.f67219h = c4812gh.f66835g;
        Boolean boolValueOf = Boolean.valueOf(c4812gh.f66836h);
        InterfaceC4863ih interfaceC4863ih = this.f67037c;
        c4941lh.f67221j = boolValueOf;
        c4941lh.f67222k = interfaceC4863ih;
        C4812gh c4812gh2 = (C4812gh) m52.componentArguments;
        c4941lh.f67233v = c4812gh2.f66838j;
        C4817gm c4817gm = m52.f65562a;
        C4953m4 c4953m4 = c4817gm.f66859n;
        c4941lh.f67225n = c4953m4.f67256a;
        C5262ye c5262ye = c4817gm.f66864s;
        if (c5262ye != null) {
            c4941lh.f67230s = c5262ye.f68036a;
            c4941lh.f67231t = c5262ye.f68037b;
        }
        c4941lh.f67226o = c4953m4.f67257b;
        c4941lh.f67228q = c4817gm.f66850e;
        c4941lh.f67227p = c4817gm.f66856k;
        D3 d32 = this.f67038d;
        Map<String, String> map = c4812gh2.f66837i;
        A3 a3F = C5009oa.I.f();
        d32.getClass();
        c4941lh.f67232u = D3.a(map, c4817gm, a3F);
        c4941lh.f67235x = this.f67036b.f66235v.f67558e.keySet();
        return c4941lh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C4941lh(this.f67036b);
    }
}
