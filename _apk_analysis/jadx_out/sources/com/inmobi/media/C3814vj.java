package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3814vj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Image f28381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3839wj f28382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3814vj(Image image, C3839wj c3839wj, hn.c cVar) {
        super(2, cVar);
        this.f28381b = image;
        this.f28382c = c3839wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3814vj(this.f28381b, this.f28382c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3814vj(this.f28381b, this.f28382c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28380a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ArrayList arrayListA = AbstractC3899z4.a("click", this.f28381b.getTrackers());
            go.k kVar = this.f28382c.f28458d;
            Link link = this.f28381b.getLink();
            C3490ij c3490ij = new C3490ij(link != null ? link.getUrl() : null, arrayListA);
            this.f28380a = 1;
            if (kVar.emit(c3490ij, this) == objG) {
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
