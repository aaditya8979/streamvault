package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.AbstractC4191p0;
import com.ironsource.E0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class L2 extends AbstractC4191p0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final WeakReference<O2> f29750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final a f29751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final M2 f29752l;

    public final class a extends AbstractC4191p0.a implements InterfaceC4362z2 {
        public a() {
            super();
        }

        @Override // com.ironsource.InterfaceC4362z2
        public void a(@NotNull C4328x2 c4328x2) {
            tn.p.k(c4328x2, C4157n2.f33007p);
            IronLog.INTERNAL.verbose(L2.this.a(c4328x2.q()));
            O2 o22 = (O2) L2.this.f29750j.get();
            if (o22 != null) {
                o22.g();
            }
        }

        @Override // com.ironsource.AbstractC4191p0.a, com.ironsource.E
        public void b(@NotNull A a10) {
            tn.p.k(a10, C4157n2.f33007p);
            super.b(a10);
            InterfaceC4343y0 interfaceC4343y0I = L2.this.i();
            if (interfaceC4343y0I != null) {
                interfaceC4343y0I.a(a10.e());
            }
        }

        @Override // com.ironsource.InterfaceC4362z2
        public void b(@NotNull C4328x2 c4328x2) {
            tn.p.k(c4328x2, C4157n2.f33007p);
            IronLog.INTERNAL.verbose(L2.this.a(c4328x2.q()));
            O2 o22 = (O2) L2.this.f29750j.get();
            if (o22 != null) {
                o22.j();
            }
        }

        @Override // com.ironsource.InterfaceC4362z2
        public void c(@NotNull C4328x2 c4328x2) {
            tn.p.k(c4328x2, C4157n2.f33007p);
            IronLog.INTERNAL.verbose(L2.this.a(c4328x2.q()));
            O2 o22 = (O2) L2.this.f29750j.get();
            if (o22 != null) {
                o22.h();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(@NotNull C4173o0 c4173o0, @NotNull M2 m22, @NotNull O2 o22) {
        String str;
        int iB;
        super(c4173o0, m22, o22, null, 8, null);
        tn.p.k(c4173o0, "tools");
        tn.p.k(m22, "adUnitData");
        tn.p.k(o22, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f29750j = new WeakReference<>(o22);
        this.f29751k = new a();
        this.f29752l = m22;
        C4041gd c4041gdG = g();
        IronLog.INTERNAL.verbose("placement = " + c4041gdG);
        if (c4041gdG == null || TextUtils.isEmpty(c4041gdG.c())) {
            tn.x xVar = tn.x.f85368a;
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{c4041gdG == null ? "placement is null" : "placement name is empty"}, 1));
            tn.p.j(str, "format(format, *args)");
            iB = A0.b(m22.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A a(L2 l22, B b10, H h10) {
        tn.p.k(l22, "this$0");
        tn.p.k(b10, "instanceData");
        tn.p.k(h10, "adInstancePayload");
        return new C4328x2(new W0(l22.f(), E0.b.PROVIDER), b10, h10, l22.f29751k);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        return iSBannerSize.isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : iSBannerSize;
    }

    private final ISBannerSize l() {
        return f().a(this.f29752l.b().h());
    }

    @Override // com.ironsource.AbstractC4191p0
    @NotNull
    public D a() {
        return new D() { // from class: com.ironsource.ki
            @Override // com.ironsource.D
            public final A a(B b10, H h10) {
                return L2.a(this.f32177a, b10, h10);
            }
        };
    }

    public final void a(@Nullable InterfaceC4171ng interfaceC4171ng, @NotNull InterfaceC4343y0 interfaceC4343y0) {
        tn.p.k(interfaceC4343y0, "displayListener");
        if (interfaceC4171ng != null) {
            a(new B2(interfaceC4171ng), interfaceC4343y0);
        }
    }

    @Override // com.ironsource.AbstractC4191p0
    @NotNull
    public C4224r0 b() {
        return new S2(this.f29752l.b(), a(l()));
    }
}
