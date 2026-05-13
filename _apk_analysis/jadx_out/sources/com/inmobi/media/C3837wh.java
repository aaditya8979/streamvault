package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3837wh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bh f28449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f28452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f28453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fo.m f28454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3837wh(Bh bh2, String str, String str2, RootConfig rootConfig, List list, fo.m mVar, hn.c cVar) {
        super(2, cVar);
        this.f28449b = bh2;
        this.f28450c = str;
        this.f28451d = str2;
        this.f28452e = rootConfig;
        this.f28453f = list;
        this.f28454g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3837wh(this.f28449b, this.f28450c, this.f28451d, this.f28452e, this.f28453f, this.f28454g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3837wh) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28448a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                Bh bh2 = this.f28449b;
                String str = this.f28450c;
                String str2 = this.f28451d;
                RootConfig rootConfig = this.f28452e;
                List list = this.f28453f;
                fo.m mVar = this.f28454g;
                this.f28448a = 1;
                if (bh2.a(str, str2, rootConfig, list, mVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
        return bn.r.f5635a;
    }
}
