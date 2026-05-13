package io.ktor.http;

import cn.w;
import cn.x;
import com.ironsource.C3978d4;
import gl.c0;
import gl.i0;
import gl.q0;
import gl.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: URLBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f71194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Url f71195l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f71196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f71197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public URLProtocol f71199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f71200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f71201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f71202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public List<String> f71203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public c0 f71204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public c0 f71205j;

    /* JADX INFO: compiled from: URLBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f71194k = aVar;
        f71195l = i0.d(f.a(aVar));
    }

    public e(@Nullable URLProtocol uRLProtocol, @NotNull String str, int i10, @Nullable String str2, @Nullable String str3, @NotNull List<String> list, @NotNull b bVar, @NotNull String str4, boolean z10) {
        p.k(str, "host");
        p.k(list, "pathSegments");
        p.k(bVar, "parameters");
        p.k(str4, ContainerActivity.FRAGMENT);
        this.f71196a = str;
        this.f71197b = z10;
        this.f71198c = i10;
        this.f71199d = uRLProtocol;
        this.f71200e = str2 != null ? gl.e.m(str2, false, 1, null) : null;
        this.f71201f = str3 != null ? gl.e.m(str3, false, 1, null) : null;
        this.f71202g = gl.e.u(str4, false, false, null, 7, null);
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gl.e.s((String) it.next()));
        }
        this.f71203h = arrayList;
        c0 c0VarE = r0.e(bVar);
        this.f71204i = c0VarE;
        this.f71205j = new q0(c0VarE);
    }

    public /* synthetic */ e(URLProtocol uRLProtocol, String str, int i10, String str2, String str3, List list, b bVar, String str4, boolean z10, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : uRLProtocol, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : str2, (i11 & 16) == 0 ? str3 : null, (i11 & 32) != 0 ? w.m() : list, (i11 & 64) != 0 ? b.f71179b.a() : bVar, (i11 & 128) == 0 ? str4 : "", (i11 & 256) == 0 ? z10 : false);
    }

    public final void A(@Nullable URLProtocol uRLProtocol) {
        this.f71199d = uRLProtocol;
    }

    public final void B(boolean z10) {
        this.f71197b = z10;
    }

    public final void C(@Nullable String str) {
        this.f71200e = str != null ? gl.e.m(str, false, 1, null) : null;
    }

    public final void a() {
        if ((this.f71196a.length() > 0) || p.f(o().getName(), C3978d4.i.f31327b)) {
            return;
        }
        Url url = f71195l;
        this.f71196a = url.getHost();
        if (this.f71199d == null) {
            this.f71199d = url.getProtocolOrNull();
        }
        if (this.f71198c == 0) {
            y(url.getSpecifiedPort());
        }
    }

    @NotNull
    public final Url b() {
        a();
        return new Url(this.f71199d, this.f71196a, this.f71198c, m(), this.f71205j.build(), i(), r(), l(), this.f71197b, c());
    }

    @NotNull
    public final String c() {
        a();
        String string = ((StringBuilder) g.e(this, new StringBuilder(256))).toString();
        p.j(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String d() {
        return this.f71202g;
    }

    @NotNull
    public final c0 e() {
        return this.f71204i;
    }

    @Nullable
    public final String f() {
        return this.f71201f;
    }

    @NotNull
    public final List<String> g() {
        return this.f71203h;
    }

    @Nullable
    public final String h() {
        return this.f71200e;
    }

    @NotNull
    public final String i() {
        return gl.e.k(this.f71202g, 0, 0, false, null, 15, null);
    }

    @NotNull
    public final String j() {
        return this.f71196a;
    }

    @NotNull
    public final c0 k() {
        return this.f71205j;
    }

    @Nullable
    public final String l() {
        String str = this.f71201f;
        if (str != null) {
            return gl.e.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    @NotNull
    public final List<String> m() {
        List<String> list = this.f71203h;
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gl.e.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f71198c;
    }

    @NotNull
    public final URLProtocol o() {
        URLProtocol uRLProtocol = this.f71199d;
        return uRLProtocol == null ? URLProtocol.Companion.c() : uRLProtocol;
    }

    @Nullable
    public final URLProtocol p() {
        return this.f71199d;
    }

    public final boolean q() {
        return this.f71197b;
    }

    @Nullable
    public final String r() {
        String str = this.f71200e;
        if (str != null) {
            return gl.e.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void s(@NotNull String str) {
        p.k(str, "<set-?>");
        this.f71202g = str;
    }

    public final void t(@NotNull c0 c0Var) {
        p.k(c0Var, "value");
        this.f71204i = c0Var;
        this.f71205j = new q0(c0Var);
    }

    @NotNull
    public String toString() {
        String string = ((StringBuilder) g.e(this, new StringBuilder(256))).toString();
        p.j(string, "toString(...)");
        return string;
    }

    public final void u(@Nullable String str) {
        this.f71201f = str;
    }

    public final void v(@NotNull List<String> list) {
        p.k(list, "<set-?>");
        this.f71203h = list;
    }

    public final void w(@Nullable String str) {
        this.f71200e = str;
    }

    public final void x(@NotNull String str) {
        p.k(str, "<set-?>");
        this.f71196a = str;
    }

    public final void y(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 65536) {
            z10 = true;
        }
        if (z10) {
            this.f71198c = i10;
            return;
        }
        throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i10).toString());
    }

    public final void z(@NotNull URLProtocol uRLProtocol) {
        p.k(uRLProtocol, "value");
        this.f71199d = uRLProtocol;
    }
}
