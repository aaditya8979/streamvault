package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4309w0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a f34299r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f34300s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4028g0 f34301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f34303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<NetworkSettings> f34304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4201pa f34305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final C4193p2 f34306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f34308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f34310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f34311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final O0 f34312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f34313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f34314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f34315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f34316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34317q;

    /* JADX INFO: renamed from: com.ironsource.w0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(@NotNull C4028g0 c4028g0, @Nullable C3931ab c3931ab, @NotNull sn.l<? super T3, ? extends AdFormatConfig> lVar, @NotNull sn.p<? super C4292v0, ? super AdFormatConfig, ? extends AdUnitData> pVar) {
            List<C4355yc> listM;
            Ne neD;
            tn.p.k(c4028g0, "adProperties");
            tn.p.k(lVar, "getAdFormatConfig");
            tn.p.k(pVar, "createAdUnitData");
            AdFormatConfig adformatconfigInvoke = lVar.invoke((c3931ab == null || (neD = c3931ab.d()) == null) ? null : neD.c());
            if (adformatconfigInvoke == null) {
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
            return pVar.mo2invoke(new C4292v0(strF, arrayList, c4201paB), adformatconfigInvoke);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4309w0(@NotNull C4028g0 c4028g0, boolean z10, @Nullable String str, @NotNull List<? extends NetworkSettings> list, @NotNull C4201pa c4201pa, @NotNull C4193p2 c4193p2, int i10, int i11, boolean z11, int i12, int i13, @NotNull O0 o02, long j10, boolean z12, boolean z13, boolean z14, boolean z15) {
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(list, "providerList");
        tn.p.k(c4201pa, "publisherDataHolder");
        tn.p.k(c4193p2, "auctionSettings");
        tn.p.k(o02, "loadingData");
        this.f34301a = c4028g0;
        this.f34302b = z10;
        this.f34303c = str;
        this.f34304d = list;
        this.f34305e = c4201pa;
        this.f34306f = c4193p2;
        this.f34307g = i10;
        this.f34308h = i11;
        this.f34309i = z11;
        this.f34310j = i12;
        this.f34311k = i13;
        this.f34312l = o02;
        this.f34313m = j10;
        this.f34314n = z12;
        this.f34315o = z13;
        this.f34316p = z14;
        this.f34317q = z15;
    }

    public /* synthetic */ AbstractC4309w0(C4028g0 c4028g0, boolean z10, String str, List list, C4201pa c4201pa, C4193p2 c4193p2, int i10, int i11, boolean z11, int i12, int i13, O0 o02, long j10, boolean z12, boolean z13, boolean z14, boolean z15, int i14, tn.i iVar) {
        this(c4028g0, z10, str, list, c4201pa, c4193p2, i10, i11, z11, i12, i13, o02, j10, z12, z13, z14, (i14 & 65536) != 0 ? false : z15);
    }

    public final int a() {
        return this.f34311k;
    }

    @NotNull
    public AdData a(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), this.f34303c);
        tn.p.j(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String str) {
        Object next;
        tn.p.k(str, "instanceName");
        Iterator<T> it = this.f34304d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(str)) {
                break;
            }
        }
        return (NetworkSettings) next;
    }

    public final void a(int i10) {
        this.f34307g = i10;
    }

    public final void a(boolean z10) {
        this.f34309i = z10;
    }

    @NotNull
    public C4028g0 b() {
        return this.f34301a;
    }

    @NotNull
    public abstract JSONObject b(@NotNull NetworkSettings networkSettings);

    public final void b(boolean z10) {
        this.f34317q = z10;
    }

    @NotNull
    public abstract String c();

    public final boolean d() {
        return this.f34309i;
    }

    @NotNull
    public final C4193p2 e() {
        return this.f34306f;
    }

    public final long f() {
        return this.f34313m;
    }

    public final int g() {
        return this.f34310j;
    }

    public final int h() {
        return this.f34308h;
    }

    @NotNull
    public final O0 i() {
        return this.f34312l;
    }

    @NotNull
    public abstract String j();

    public final int k() {
        return this.f34307g;
    }

    @NotNull
    public final String l() {
        String strC;
        C4041gd c4041gdF = b().f();
        return (c4041gdF == null || (strC = c4041gdF.c()) == null) ? "" : strC;
    }

    @NotNull
    public final List<NetworkSettings> m() {
        return this.f34304d;
    }

    public final boolean n() {
        return this.f34314n;
    }

    @NotNull
    public final C4201pa o() {
        return this.f34305e;
    }

    public final boolean p() {
        return this.f34316p;
    }

    public final boolean q() {
        return this.f34317q;
    }

    @Nullable
    public final String r() {
        return this.f34303c;
    }

    public final boolean s() {
        return this.f34315o;
    }

    public final boolean t() {
        return this.f34306f.g() > 0;
    }

    public boolean u() {
        return this.f34302b;
    }

    @NotNull
    public final String v() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", "parallelLoad", Integer.valueOf(this.f34307g), "bidderExclusive", Boolean.valueOf(this.f34309i), com.ironsource.mediationsdk.d.f32411z, Boolean.valueOf(this.f34317q));
        tn.p.j(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }
}
