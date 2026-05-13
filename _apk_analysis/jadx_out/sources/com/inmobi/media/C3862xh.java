package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3862xh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f28524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bh f28525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f28527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fo.m f28528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3862xh(List list, Bh bh2, String str, RootConfig rootConfig, fo.m mVar, hn.c cVar) {
        super(2, cVar);
        this.f28524b = list;
        this.f28525c = bh2;
        this.f28526d = str;
        this.f28527e = rootConfig;
        this.f28528f = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3862xh c3862xh = new C3862xh(this.f28524b, this.f28525c, this.f28526d, this.f28527e, this.f28528f, cVar);
        c3862xh.f28523a = obj;
        return c3862xh;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3862xh) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        p000do.l0 l0Var = (p000do.l0) this.f28523a;
        List list = this.f28524b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((C3575m4) obj2).f27597a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Bh bh2 = this.f28525c;
        String str2 = this.f28526d;
        RootConfig rootConfig = this.f28527e;
        fo.m mVar = this.f28528f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            RootConfig rootConfig2 = rootConfig;
            p000do.i.d(l0Var, null, null, new C3837wh(bh2, (String) entry.getKey(), str2, rootConfig2, (List) entry.getValue(), mVar, null), 3, null);
            mVar = mVar;
            rootConfig = rootConfig2;
            str2 = str2;
        }
        return bn.r.f5635a;
    }
}
