package com.moloco.sdk.acm.eventprocessing;

import bn.r;
import com.moloco.sdk.acm.http.j;
import gl.n;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f45814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.db.d f45815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f45816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l<n, r> f45817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f45818e;

    @jn.d(c = "com.moloco.sdk.acm.eventprocessing.RequestAndPurgeDBImpl", f = "RequestAndPurgeDB.kt", l = {38, 48}, m = "invoke-IoAF18A")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f45820b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45822d;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45820b = obj;
            this.f45822d |= Integer.MIN_VALUE;
            Object objA = k.this.a(this);
            return objA == in.a.g() ? objA : Result.m7533boximpl(objA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull j jVar, @NotNull com.moloco.sdk.acm.db.d dVar, @NotNull e eVar, @NotNull l<? super n, r> lVar) {
        p.k(jVar, "metricsRequest");
        p.k(dVar, "metricsDAO");
        p.k(eVar, "dataAgeChecker");
        p.k(lVar, "headers");
        this.f45814a = jVar;
        this.f45815b = dVar;
        this.f45816c = eVar;
        this.f45817d = lVar;
        this.f45818e = "RequestAndPurgeDB";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull hn.c<? super kotlin.Result<java.lang.String>> r11) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.k.a(hn.c):java.lang.Object");
    }
}
