package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes9.dex */
public final class X9 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f26582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f26586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(Y9 y92, long j10, String str, int i10, String str2, hn.c cVar) {
        super(1, cVar);
        this.f26582a = y92;
        this.f26583b = j10;
        this.f26584c = str;
        this.f26585d = i10;
        this.f26586e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new X9(this.f26582a, this.f26583b, this.f26584c, this.f26585d, this.f26586e, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((X9) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.inmobi.media.L2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.inmobi.media.L2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        in.a.g();
        kotlin.c.b(obj);
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3680q9.f27953a;
        ArrayList arrayList2 = new ArrayList();
        V9 v92 = new V9();
        ArrayList arrayList3 = new ArrayList();
        p000do.h.b(null, new U9(v92, arrayList3, null), 1, null);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3329ca((W9) it.next()));
        }
        arrayList.addAll(arrayList2);
        Iterator it2 = arrayList.iterator();
        tn.p.j(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            tn.p.j(next, "next(...)");
            Y9 y92 = this.f26582a;
            long j10 = this.f26583b;
            C3329ca c3329ca = (C3329ca) ((Z9) next);
            long j11 = c3329ca.f26924a.f26530c.f27958b;
            if (j10 >= j11 && j10 - j11 <= y92.f26626a) {
                String str = this.f26584c;
                int i10 = this.f26585d;
                c3329ca.a("Message - " + str + ", Reason - " + i10 + ", Timestamp - " + j10 + ", Data - " + this.f26586e);
                c3329ca.b(String.valueOf(i10));
                Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(c3329ca.b());
                if (thM7537exceptionOrNullimpl != null) {
                    try {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ?? l22 = new L2(thM7537exceptionOrNullimpl);
                        ref$ObjectRef.element = l22;
                        P9.a(l22);
                        Object objA = c3329ca.a();
                        Throwable thM7537exceptionOrNullimpl2 = Result.m7537exceptionOrNullimpl(objA);
                        if (thM7537exceptionOrNullimpl2 != null) {
                            try {
                                ?? l23 = new L2(thM7537exceptionOrNullimpl2);
                                ref$ObjectRef.element = l23;
                                P9.a(l23);
                                objA = Result.m7534constructorimpl(bn.r.f5635a);
                            } catch (Throwable th2) {
                                Result.a aVar = Result.Companion;
                                objA = Result.m7534constructorimpl(kotlin.c.a(th2));
                            }
                        }
                        Result.m7534constructorimpl(Result.m7533boximpl(objA));
                    } catch (Throwable th3) {
                        Result.a aVar2 = Result.Companion;
                        Result.m7534constructorimpl(kotlin.c.a(th3));
                    }
                }
            }
        }
        return bn.r.f5635a;
    }
}
