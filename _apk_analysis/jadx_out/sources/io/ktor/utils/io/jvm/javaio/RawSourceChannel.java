package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.CloseToken;
import io.ktor.utils.io.a;
import java.io.IOException;
import kotlin.coroutines.d;
import kotlinx.coroutines.g;
import no.j;
import no.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k0;
import p000do.t1;
import p000do.w;
import tn.p;

/* JADX INFO: compiled from: Reading.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class RawSourceChannel implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f71279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f71280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public CloseToken f71281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final no.a f71282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final w f71283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final d f71284g;

    public RawSourceChannel(@NotNull j jVar, @NotNull d dVar) {
        p.k(jVar, "source");
        p.k(dVar, "parent");
        this.f71279b = jVar;
        this.f71280c = dVar;
        this.f71282e = new no.a();
        w wVarA = t1.a((g) dVar.get(g.H8));
        this.f71283f = wVarA;
        this.f71284g = dVar.plus(wVarA).plus(new k0("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.a, sl.f
    public void a(@Nullable Throwable th2) {
        String message;
        String message2;
        if (this.f71281d != null) {
            return;
        }
        w wVar = this.f71283f;
        String str = "Channel was cancelled";
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        t1.d(wVar, message, th2);
        this.f71279b.close();
        if (th2 != null && (message2 = th2.getMessage()) != null) {
            str = message2;
        }
        this.f71281d = new CloseToken(new IOException(str, th2));
    }

    @Override // io.ktor.utils.io.a, sl.f
    @Nullable
    public Throwable b() {
        CloseToken closeToken = this.f71281d;
        if (closeToken != null) {
            return CloseToken.c(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.a
    @NotNull
    public r f() {
        return this.f71282e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(int r6, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = (io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r6 = r0.I$0
            kotlin.c.b(r7)
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.c.b(r7)
            io.ktor.utils.io.CloseToken r7 = r5.f71281d
            if (r7 == 0) goto L3f
            java.lang.Boolean r6 = jn.a.a(r3)
            return r6
        L3f:
            kotlin.coroutines.d r7 = r5.f71284g
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2 r2 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = p000do.g.g(r7, r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            no.a r7 = r5.f71282e
            long r0 = ul.e.b(r7)
            long r6 = (long) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            java.lang.Boolean r6 = jn.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.RawSourceChannel.g(int, hn.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.a
    public boolean h() {
        return this.f71281d != null && this.f71282e.exhausted();
    }

    @NotNull
    public final w i() {
        return this.f71283f;
    }
}
