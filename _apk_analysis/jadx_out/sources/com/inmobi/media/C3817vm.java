package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AwaitKt;

/* JADX INFO: renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3817vm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f28391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f28392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3817vm(ArrayList arrayList, double d10, AdConfig.VastVideoConfig vastVideoConfig, hn.c cVar) {
        super(2, cVar);
        this.f28390c = arrayList;
        this.f28391d = d10;
        this.f28392e = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3817vm c3817vm = new C3817vm(this.f28390c, this.f28391d, this.f28392e, cVar);
        c3817vm.f28389b = obj;
        return c3817vm;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3817vm) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = in.a.g();
        int i10 = this.f28388a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f28389b;
            if (this.f28390c.isEmpty()) {
                return cn.w.m();
            }
            int iA = AbstractC3875y5.a();
            Pe peA = AbstractC3874y4.a();
            ArrayList arrayList = this.f28390c;
            double d10 = this.f28391d;
            AdConfig.VastVideoConfig vastVideoConfig = this.f28392e;
            ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(p000do.i.b(l0Var, null, null, new C3767tm((C3667pl) it.next(), d10, peA, iA, vastVideoConfig, null), 3, null));
                arrayList2 = arrayList3;
                d10 = d10;
            }
            this.f28388a = 1;
            objA = AwaitKt.a(arrayList2, this);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            objA = obj;
        }
        List listX0 = cn.f0.X0((Iterable) objA, new C3792um());
        ArrayList arrayList4 = new ArrayList(cn.x.x(listX0, 10));
        Iterator it2 = listX0.iterator();
        while (it2.hasNext()) {
            arrayList4.add((C3667pl) ((Pair) it2.next()).getFirst());
        }
        return arrayList4;
    }
}
