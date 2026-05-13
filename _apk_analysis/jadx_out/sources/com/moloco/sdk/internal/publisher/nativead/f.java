package com.moloco.sdk.internal.publisher.nativead;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.publisher.x0;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f46817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4381e f46818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.publisher.nativead.model.a f46819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final r f46820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f46821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l f46823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final w0 f46824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final x0 f46826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f46827k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public List<String> f46828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public List<a.b> f46829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final l f46830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Set<String> f46831d;

        public a(@Nullable List<String> list, @Nullable List<a.b> list2, @NotNull l lVar) {
            p.k(lVar, "persistentHttpRequest");
            this.f46828a = list;
            this.f46829b = list2;
            this.f46830c = lVar;
            this.f46831d = new LinkedHashSet();
        }

        public final void a() {
            List<String> list = this.f46828a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f46830c.a((String) it.next());
                }
            }
            this.f46828a = null;
            List<a.b> list2 = this.f46829b;
            if (list2 != null) {
                for (a.b bVar : list2) {
                    if (bVar.c() != null && bVar.a() == 1 && bVar.b() == 1) {
                        this.f46830c.a(bVar.c());
                    }
                }
            }
            this.f46829b = null;
        }

        public final void b(@NotNull List<String> list) {
            p.k(list, "urls");
            for (String str : list) {
                if (!this.f46831d.contains(str)) {
                    this.f46830c.a(str);
                    this.f46831d.add(str);
                }
            }
        }
    }

    public f(@NotNull String str, @NotNull C4381e c4381e, @NotNull com.moloco.sdk.internal.publisher.nativead.model.a aVar, @NotNull r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2, @NotNull AdFormatType adFormatType, @NotNull l lVar, @NotNull w0 w0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar3) {
        p.k(str, "adUnitId");
        p.k(c4381e, "bid");
        p.k(aVar, "ortbResponse");
        p.k(rVar, "appLifecycleTrackerService");
        p.k(aVar2, "customUserEventBuilderService");
        p.k(adFormatType, "adFormatType");
        p.k(lVar, "persistentHttpRequest");
        p.k(w0Var, "externalLinkHandler");
        p.k(aVar3, "metricsRecorder");
        this.f46817a = str;
        this.f46818b = c4381e;
        this.f46819c = aVar;
        this.f46820d = rVar;
        this.f46821e = aVar2;
        this.f46822f = adFormatType;
        this.f46823g = lVar;
        this.f46824h = w0Var;
        this.f46825i = aVar3;
        this.f46826j = c();
        this.f46827k = d();
    }

    public static final A a(C4381e c4381e) {
        return c4381e.f().f();
    }

    public static final h0 b(f fVar) {
        String strD = fVar.f46818b.d();
        if (strD != null) {
            return new h0(strD, Float.valueOf(fVar.f46818b.g()));
        }
        return null;
    }

    public final x0 c() {
        final C4381e c4381e = this.f46818b;
        r rVar = this.f46820d;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = this.f46821e;
        sn.a aVar2 = new sn.a() { // from class: com.moloco.sdk.internal.publisher.nativead.d
            @Override // sn.a
            public final Object invoke() {
                return f.a(c4381e);
            }
        };
        sn.a aVar3 = new sn.a() { // from class: com.moloco.sdk.internal.publisher.nativead.e
            @Override // sn.a
            public final Object invoke() {
                return f.b(this.f46816b);
            }
        };
        AdFormatType adFormatType = this.f46822f;
        com.moloco.sdk.acm.recorder.a aVar4 = this.f46825i;
        return com.moloco.sdk.internal.publisher.a.a(null, rVar, aVar, aVar2, aVar3, (1632 & 32) != 0 ? k0.b() : null, (1632 & 64) != 0 ? com.moloco.sdk.internal.l.a() : null, adFormatType, aVar4, (1632 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(aVar4) : null, (1632 & 1024) != 0 ? null : null);
    }

    public final a d() {
        com.moloco.sdk.internal.publisher.nativead.model.a aVar = this.f46819c;
        return new a(aVar.c(), aVar.b(), this.f46823g);
    }

    public final void e() {
        a.c cVarD = this.f46819c.d();
        if (cVarD != null) {
            this.f46827k.b(cVarD.a());
            this.f46824h.a(cVarD.b());
        }
        this.f46826j.onAdClicked(MolocoAdKt.createAdInfo$default(this.f46817a, null, null, 6, null));
    }

    public final void f() {
        this.f46827k.a();
        this.f46826j.onAdShowSuccess(MolocoAdKt.createAdInfo$default(this.f46817a, null, null, 6, null));
    }
}
