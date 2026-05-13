package io;

import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.y0;
import p000do.y1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends y1 implements p000do.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f71732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f71733c;

    public v(@Nullable Throwable th2, @Nullable String str) {
        this.f71732b = th2;
        this.f71733c = str;
    }

    @Override // p000do.r0
    @NotNull
    public y0 A(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.d dVar) {
        O();
        throw new KotlinNothingValueException();
    }

    @Override // p000do.y1
    @NotNull
    public y1 I() {
        return this;
    }

    @Override // p000do.h0
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        O();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void O() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f71732b
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f71733c
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f71732b
            r1.<init>(r0, r2)
            throw r1
        L36:
            io.u.d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.v.O():java.lang.Void");
    }

    @Override // p000do.r0
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Void a(long j10, @NotNull p000do.k<? super bn.r> kVar) {
        O();
        throw new KotlinNothingValueException();
    }

    @Override // p000do.h0
    public boolean isDispatchNeeded(@NotNull kotlin.coroutines.d dVar) {
        O();
        throw new KotlinNothingValueException();
    }

    @Override // p000do.y1, p000do.h0
    @NotNull
    public p000do.h0 limitedParallelism(int i10, @Nullable String str) {
        O();
        throw new KotlinNothingValueException();
    }

    @Override // p000do.y1, p000do.h0
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f71732b != null) {
            str = ", cause=" + this.f71732b;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
