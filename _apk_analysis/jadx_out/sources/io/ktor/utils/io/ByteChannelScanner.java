package io.ktor.utils.io;

import bo.a0;
import java.io.IOException;
import no.r;
import oo.c;
import org.jetbrains.annotations.NotNull;
import sl.f;
import tn.p;

/* JADX INFO: compiled from: ByteChannelScanner.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ByteChannelScanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f71248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final oo.a f71249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f71250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final r f71252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final int[] f71253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final no.a f71254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f71255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71256i;

    public ByteChannelScanner(@NotNull a aVar, @NotNull oo.a aVar2, @NotNull f fVar, long j10) {
        p.k(aVar, "channel");
        p.k(aVar2, "matchString");
        p.k(fVar, "writeChannel");
        this.f71248a = aVar;
        this.f71249b = aVar2;
        this.f71250c = fVar;
        this.f71251d = j10;
        if (!(aVar2.e() > 0)) {
            throw new IllegalArgumentException("Empty match string not permitted for scanning".toString());
        }
        this.f71252e = aVar.f();
        this.f71253f = d();
        this.f71254g = new no.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b8 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(hn.c<? super bn.r> r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelScanner.c(hn.c):java.lang.Object");
    }

    public final int[] d() {
        int[] iArr = new int[this.f71249b.e()];
        int iE = this.f71249b.e();
        int i10 = 0;
        for (int i11 = 1; i11 < iE; i11++) {
            while (i10 > 0 && this.f71249b.c(i11) != this.f71249b.c(i10)) {
                i10 = iArr[i10 - 1];
            }
            if (this.f71249b.c(i11) == this.f71249b.c(i10)) {
                i10++;
            }
            iArr[i11] = i10;
        }
        return iArr;
    }

    public final void e(long j10) throws IOException {
        if (this.f71255h + j10 <= this.f71251d) {
            return;
        }
        throw new IOException("Limit of " + this.f71251d + " bytes exceeded while searching for \"" + h(this.f71249b) + '\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:28:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:23:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(hn.c<? super java.lang.Boolean> r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelScanner.f(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e4 -> B:45:0x00e9). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r11, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Long> r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelScanner.g(boolean, hn.c):java.lang.Object");
    }

    public final String h(oo.a aVar) {
        return a0.S(c.b(aVar), "\n", "\\n", false, 4, null);
    }
}
