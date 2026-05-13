package io.ktor.utils.io;

import cn.w;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: LineEndingMode.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f71271b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f71272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f71273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f71274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f71275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<b> f71276g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71277a;

    /* JADX INFO: compiled from: LineEndingMode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return b.f71272c;
        }

        public final int b() {
            return b.f71274e;
        }

        public final int c() {
            return b.f71273d;
        }
    }

    static {
        int iE = e(1);
        f71272c = iE;
        int iE2 = e(2);
        f71273d = iE2;
        int iE3 = e(4);
        f71274e = iE3;
        f71275f = e(7);
        f71276g = w.p(d(iE), d(iE2), d(iE3));
    }

    public /* synthetic */ b(int i10) {
        this.f71277a = i10;
    }

    public static final /* synthetic */ b d(int i10) {
        return new b(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return (i11 | i10) == i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).l();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int j(int i10, int i11) {
        return e(i10 | i11);
    }

    @NotNull
    public static String k(int i10) {
        if (h(i10, f71272c)) {
            return "CR";
        }
        if (h(i10, f71273d)) {
            return "LF";
        }
        if (h(i10, f71274e)) {
            return "CRLF";
        }
        List<b> list = f71276g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (f(i10, ((b) obj).l())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public boolean equals(Object obj) {
        return g(this.f71277a, obj);
    }

    public int hashCode() {
        return i(this.f71277a);
    }

    public final /* synthetic */ int l() {
        return this.f71277a;
    }

    @NotNull
    public String toString() {
        return k(this.f71277a);
    }
}
