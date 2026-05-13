package com.ironsource.mediationsdk;

import com.ironsource.C4002ea;
import com.ironsource.C4030g2;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f32613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<C4030g2> f32614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f32616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f32618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private List<String> f32619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private h f32621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private C4002ea f32622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private String f32623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private ISBannerSize f32624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f32626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private String f32628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private String f32629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private Boolean f32630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Double f32631s;

    public i(@NotNull IronSource.a aVar) {
        tn.p.k(aVar, "adUnit");
        this.f32613a = aVar;
        this.f32614b = new ArrayList<>();
        this.f32616d = "";
        this.f32618f = new HashMap();
        this.f32619g = new ArrayList();
        this.f32620h = -1;
        this.f32623k = "";
    }

    public static /* synthetic */ i a(i iVar, IronSource.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = iVar.f32613a;
        }
        return iVar.a(aVar);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void m() {
    }

    @NotNull
    public final IronSource.a a() {
        return this.f32613a;
    }

    @NotNull
    public final i a(@NotNull IronSource.a aVar) {
        tn.p.k(aVar, "adUnit");
        return new i(aVar);
    }

    public final void a(int i10) {
        this.f32620h = i10;
    }

    public final void a(@Nullable C4002ea c4002ea) {
        this.f32622j = c4002ea;
    }

    public final void a(@NotNull C4030g2 c4030g2) {
        tn.p.k(c4030g2, "instanceInfo");
        this.f32614b.add(c4030g2);
    }

    public final void a(@Nullable ISBannerSize iSBannerSize) {
        this.f32624l = iSBannerSize;
    }

    public final void a(@Nullable h hVar) {
        this.f32621i = hVar;
    }

    public final void a(@Nullable Boolean bool) {
        this.f32630r = bool;
    }

    public final void a(@Nullable Double d10) {
        this.f32631s = d10;
    }

    public final void a(@Nullable String str) {
        this.f32629q = str;
    }

    public final void a(@NotNull List<String> list) {
        tn.p.k(list, "<set-?>");
        this.f32619g = list;
    }

    public final void a(@NotNull Map<String, Object> map) {
        tn.p.k(map, "<set-?>");
        this.f32618f = map;
    }

    public final void a(boolean z10) {
        this.f32625m = z10;
    }

    @Nullable
    public final String b() {
        return this.f32629q;
    }

    public final void b(@Nullable String str) {
        this.f32628p = str;
    }

    public final void b(boolean z10) {
        this.f32617e = z10;
    }

    @NotNull
    public final IronSource.a c() {
        return this.f32613a;
    }

    public final void c(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f32616d = str;
    }

    public final void c(boolean z10) {
        this.f32615c = z10;
    }

    @Nullable
    public final String d() {
        return this.f32628p;
    }

    public final void d(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f32623k = str;
    }

    public final void d(boolean z10) {
        this.f32626n = z10;
    }

    @Nullable
    public final h e() {
        return this.f32621i;
    }

    public final void e(boolean z10) {
        this.f32627o = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f32613a == ((i) obj).f32613a;
    }

    @Nullable
    public final ISBannerSize f() {
        return this.f32624l;
    }

    @Nullable
    public final Double g() {
        return this.f32631s;
    }

    @NotNull
    public final Map<String, Object> h() {
        return this.f32618f;
    }

    public int hashCode() {
        return this.f32613a.hashCode();
    }

    @NotNull
    public final String j() {
        return this.f32616d;
    }

    @NotNull
    public final ArrayList<C4030g2> k() {
        return this.f32614b;
    }

    @NotNull
    public final List<String> l() {
        return this.f32619g;
    }

    @Nullable
    public final C4002ea n() {
        return this.f32622j;
    }

    public final int o() {
        return this.f32620h;
    }

    public final boolean p() {
        return this.f32626n;
    }

    public final boolean q() {
        return this.f32627o;
    }

    @NotNull
    public final String r() {
        return this.f32623k;
    }

    public final boolean s() {
        return this.f32625m;
    }

    public final boolean t() {
        return this.f32617e;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f32613a + ")";
    }

    @Nullable
    public final Boolean u() {
        return this.f32630r;
    }

    public final boolean v() {
        return this.f32615c;
    }
}
