package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3887yh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f28597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bh f28598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RootConfig f28600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3887yh(List list, Bh bh2, String str, RootConfig rootConfig, hn.c cVar) {
        super(2, cVar);
        this.f28597c = list;
        this.f28598d = bh2;
        this.f28599e = str;
        this.f28600f = rootConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3887yh c3887yh = new C3887yh(this.f28597c, this.f28598d, this.f28599e, this.f28600f, cVar);
        c3887yh.f28596b = obj;
        return c3887yh;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3887yh) create((fo.m) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28595a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3862xh c3862xh = new C3862xh(this.f28597c, this.f28598d, this.f28599e, this.f28600f, (fo.m) this.f28596b, null);
            this.f28595a = 1;
            if (p000do.j2.c(c3862xh, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
