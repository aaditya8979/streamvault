package hl;

import il.d;
import il.i;
import io.ktor.http.cio.HeadersData;
import java.io.IOException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: HttpHeadersMap.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f63514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public HeadersData f63517d;

    public a(@NotNull d dVar) {
        p.k(dVar, "builder");
        this.f63514a = dVar;
        this.f63517d = (HeadersData) b.f63519b.E();
    }

    @Nullable
    public final CharSequence a(@NotNull String str) {
        p.k(str, "name");
        if (this.f63515b == 0) {
            return null;
        }
        int iAbs = Math.abs(i.g(str, 0, 0, 3, null));
        int i10 = this.f63516c;
        while (true) {
            int i11 = iAbs % i10;
            int i12 = i11 * 6;
            if (this.f63517d.c(i12 + 0) == -1) {
                return null;
            }
            if (b(str, i12)) {
                return i(i12);
            }
            iAbs = i11 + 1;
            i10 = this.f63516c;
        }
    }

    public final boolean b(CharSequence charSequence, int i10) {
        return i.e(this.f63514a, this.f63517d.c(i10 + 1), this.f63517d.c(i10 + 2), charSequence);
    }

    @NotNull
    public final CharSequence c(int i10) {
        return this.f63514a.subSequence(this.f63517d.c(i10 + 1), this.f63517d.c(i10 + 2));
    }

    @NotNull
    public final ao.i<Integer> d() {
        return this.f63517d.d();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (h()) {
            g();
        }
        int iAbs = Math.abs(i.f(this.f63514a, i10, i11));
        CharSequence charSequenceSubSequence = this.f63514a.subSequence(i10, i11);
        int i16 = iAbs % this.f63516c;
        int i17 = -1;
        while (true) {
            i14 = i16 * 6;
            i15 = i14 + 0;
            if (this.f63517d.c(i15) == -1) {
                break;
            }
            if (b(charSequenceSubSequence, i14)) {
                i17 = i16;
            }
            i16 = (i16 + 1) % this.f63516c;
        }
        this.f63517d.g(i15, iAbs);
        this.f63517d.g(i14 + 1, i10);
        this.f63517d.g(i14 + 2, i11);
        this.f63517d.g(i14 + 3, i12);
        this.f63517d.g(i14 + 4, i13);
        this.f63517d.g(i14 + 5, -1);
        if (i17 != -1) {
            this.f63517d.g((i17 * 6) + 5, i16);
        }
        this.f63515b++;
    }

    public final void f() {
        this.f63515b = 0;
        this.f63516c = 0;
        b.f63519b.r(this.f63517d);
        this.f63517d = (HeadersData) b.f63519b.E();
    }

    public final void g() {
        int i10 = this.f63515b;
        HeadersData headersData = this.f63517d;
        this.f63515b = 0;
        this.f63516c = (this.f63516c * 2) | 128;
        HeadersData headersData2 = (HeadersData) b.f63519b.E();
        headersData2.e((headersData.b() * 2) | 1);
        this.f63517d = headersData2;
        Iterator<Integer> it = headersData.d().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            e(headersData.c(iIntValue + 1), headersData.c(iIntValue + 2), headersData.c(iIntValue + 3), headersData.c(iIntValue + 4));
        }
        b.f63519b.r(headersData);
        if (!(i10 == this.f63515b)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final boolean h() {
        return ((double) this.f63515b) >= ((double) this.f63516c) * 0.75d;
    }

    @NotNull
    public final CharSequence i(int i10) {
        return this.f63514a.subSequence(this.f63517d.c(i10 + 3), this.f63517d.c(i10 + 4));
    }

    @NotNull
    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        b.c(this, "", sb2);
        return sb2.toString();
    }
}
