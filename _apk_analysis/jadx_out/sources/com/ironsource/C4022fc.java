package com.ironsource;

import com.ironsource.AbstractC4309w0;
import com.ironsource.O0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4022fc extends AbstractC4309w0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f31696y = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final C4028g0 f31697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final C4292v0 f31698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Qb f31699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final String f31700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f31701x;

    /* JADX INFO: renamed from: com.ironsource.fc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final C4022fc a(@NotNull C4028g0 c4028g0, @Nullable C3931ab c3931ab) {
            List<C4355yc> listM;
            Ne neD;
            tn.p.k(c4028g0, "adProperties");
            AbstractC4309w0.a aVar = AbstractC4309w0.f34299r;
            T3 t3C = (c3931ab == null || (neD = c3931ab.d()) == null) ? null : neD.c();
            Qb qbE = t3C != null ? t3C.e() : null;
            if (qbE == null) {
                throw new IllegalStateException("Error getting " + c4028g0.a() + " configurations");
            }
            if (c3931ab == null || (listM = c3931ab.d(c4028g0.e(), c4028g0.c())) == null) {
                listM = cn.w.m();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(cn.x.x(listM, 10));
            Iterator<T> it = listM.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4355yc) it.next()).f());
            }
            C4201pa c4201paB = C4201pa.b();
            tn.p.j(c4201paB, "getInstance()");
            return new C4022fc(c4028g0, new C4292v0(strF, arrayList, c4201paB), qbE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4022fc(@NotNull C4028g0 c4028g0, @NotNull C4292v0 c4292v0, @NotNull Qb qb2) {
        super(c4028g0, true, c4292v0.f(), c4292v0.d(), c4292v0.e(), qb2.d(), qb2.b(), (int) (qb2.c() / ((long) 1000)), qb2.a(), qb2.f(), -1, new O0(O0.a.MANUAL, qb2.d().j(), qb2.d().b(), -1L), qb2.h(), qb2.i(), qb2.k(), qb2.j(), false, 65536, null);
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(qb2, C4089j8.f32059p);
        this.f31697t = c4028g0;
        this.f31698u = c4292v0;
        this.f31699v = qb2;
        this.f31700w = "NA";
        this.f31701x = C3949bb.f31030e;
    }

    public static /* synthetic */ C4022fc a(C4022fc c4022fc, C4028g0 c4028g0, C4292v0 c4292v0, Qb qb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4028g0 = c4022fc.f31697t;
        }
        if ((i10 & 2) != 0) {
            c4292v0 = c4022fc.f31698u;
        }
        if ((i10 & 4) != 0) {
            qb2 = c4022fc.f31699v;
        }
        return c4022fc.a(c4028g0, c4292v0, qb2);
    }

    @NotNull
    public final Qb A() {
        return this.f31699v;
    }

    @NotNull
    public final C4022fc a(@NotNull C4028g0 c4028g0, @NotNull C4292v0 c4292v0, @NotNull Qb qb2) {
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(qb2, C4089j8.f32059p);
        return new C4022fc(c4028g0, c4292v0, qb2);
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public C4028g0 b() {
        return this.f31697t;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        JSONObject nativeAdSettings = networkSettings.getNativeAdSettings();
        tn.p.j(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String c() {
        return this.f31700w;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4022fc)) {
            return false;
        }
        C4022fc c4022fc = (C4022fc) obj;
        return tn.p.f(this.f31697t, c4022fc.f31697t) && tn.p.f(this.f31698u, c4022fc.f31698u) && tn.p.f(this.f31699v, c4022fc.f31699v);
    }

    public int hashCode() {
        return (((this.f31697t.hashCode() * 31) + this.f31698u.hashCode()) * 31) + this.f31699v.hashCode();
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String j() {
        return this.f31701x;
    }

    @NotNull
    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f31697t + ", adUnitCommonData=" + this.f31698u + ", configs=" + this.f31699v + ")";
    }

    @NotNull
    public final C4028g0 w() {
        return this.f31697t;
    }

    @NotNull
    public final C4292v0 x() {
        return this.f31698u;
    }

    @NotNull
    public final Qb y() {
        return this.f31699v;
    }

    @NotNull
    public final C4292v0 z() {
        return this.f31698u;
    }
}
