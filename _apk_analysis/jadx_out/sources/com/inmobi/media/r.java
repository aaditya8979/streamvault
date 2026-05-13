package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cj f28003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3819w f28005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f28009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C3819w c3819w, String str, int i10, int i11, int i12, hn.c cVar) {
        super(2, cVar);
        this.f28005c = c3819w;
        this.f28006d = str;
        this.f28007e = i10;
        this.f28008f = i11;
        this.f28009g = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new r(this.f28005c, this.f28006d, this.f28007e, this.f28008f, this.f28009g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((r) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws C3357dc {
        Cj cj2;
        Object objG = in.a.g();
        int i10 = this.f28004b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Cj cj3 = new Cj(this.f28005c.f28397a);
            cj3.setLayoutParams(new ViewGroup.LayoutParams(this.f28008f, this.f28009g));
            C3819w c3819w = this.f28005c;
            String str = this.f28006d;
            int i11 = this.f28007e;
            this.f28003a = cj3;
            this.f28004b = 1;
            Object objA = C3819w.a(c3819w, cj3, str, i11, this);
            if (objA == objG) {
                return objG;
            }
            cj2 = cj3;
            obj = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cj2 = this.f28003a;
            kotlin.c.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return cj2;
        }
        throw new C3357dc();
    }
}
