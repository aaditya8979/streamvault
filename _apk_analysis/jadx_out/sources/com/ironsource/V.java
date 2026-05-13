package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class V {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f30561q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f30562r = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f30563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f30564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f30565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4193p2 f30566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f30570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f30571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final O0 f30572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final I0 f30573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f30574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f30575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f30576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f30577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f30578p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V(@NotNull IronSource.a aVar, @Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C4193p2 c4193p2, int i10, int i11, boolean z10, int i12, int i13, @NotNull O0 o02, @NotNull I0 i02, long j10, boolean z11, boolean z12, boolean z13, boolean z14) {
        tn.p.k(aVar, "adUnit");
        tn.p.k(c4193p2, "auctionSettings");
        tn.p.k(o02, "loadingData");
        tn.p.k(i02, "interactionData");
        this.f30563a = aVar;
        this.f30564b = str;
        this.f30565c = list;
        this.f30566d = c4193p2;
        this.f30567e = i10;
        this.f30568f = i11;
        this.f30569g = z10;
        this.f30570h = i12;
        this.f30571i = i13;
        this.f30572j = o02;
        this.f30573k = i02;
        this.f30574l = j10;
        this.f30575m = z11;
        this.f30576n = z12;
        this.f30577o = z13;
        this.f30578p = z14;
    }

    public /* synthetic */ V(IronSource.a aVar, String str, List list, C4193p2 c4193p2, int i10, int i11, boolean z10, int i12, int i13, O0 o02, I0 i02, long j10, boolean z11, boolean z12, boolean z13, boolean z14, int i14, tn.i iVar) {
        this(aVar, str, list, c4193p2, i10, i11, z10, i12, i13, o02, i02, j10, z11, z12, z13, (i14 & 32768) != 0 ? false : z14);
    }

    public final int a() {
        return this.f30571i;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String str) {
        tn.p.k(str, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        Iterator<T> it = listJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(str)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public final void a(int i10) {
        this.f30567e = i10;
    }

    public final void a(boolean z10) {
        this.f30569g = z10;
    }

    @NotNull
    public final IronSource.a b() {
        return this.f30563a;
    }

    public final void b(boolean z10) {
        this.f30578p = z10;
    }

    public final boolean c() {
        return this.f30569g;
    }

    @NotNull
    public final C4193p2 d() {
        return this.f30566d;
    }

    public final long e() {
        return this.f30574l;
    }

    public final int f() {
        return this.f30570h;
    }

    @NotNull
    public final I0 g() {
        return this.f30573k;
    }

    @NotNull
    public final O0 h() {
        return this.f30572j;
    }

    public final int i() {
        return this.f30567e;
    }

    @Nullable
    public List<NetworkSettings> j() {
        return this.f30565c;
    }

    public final boolean k() {
        return this.f30575m;
    }

    public final boolean l() {
        return this.f30577o;
    }

    public final boolean m() {
        return this.f30578p;
    }

    public final int n() {
        return this.f30568f;
    }

    @Nullable
    public String o() {
        return this.f30564b;
    }

    public final boolean p() {
        return this.f30576n;
    }

    public final boolean q() {
        return this.f30566d.g() > 0;
    }

    @NotNull
    public final String r() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", "parallelLoad", Integer.valueOf(this.f30567e), "bidderExclusive", Boolean.valueOf(this.f30569g), com.ironsource.mediationsdk.d.f32411z, Boolean.valueOf(this.f30578p));
        tn.p.j(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }
}
