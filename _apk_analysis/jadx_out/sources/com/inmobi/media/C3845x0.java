package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3845x0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f28475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3845x0(AdQualityResult adQualityResult, hn.c cVar) {
        super(2, cVar);
        this.f28475b = adQualityResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3845x0(this.f28475b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3845x0(this.f28475b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28474a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            H0 h02 = (H0) E0.f25352a.getValue();
            String imageLocation = this.f28475b.getImageLocation();
            this.f28474a = 1;
            Object objA = h02.f25562a.a("ad_quality_db", "image_location=?", new String[]{imageLocation}, this);
            if (objA != in.a.g()) {
                objA = bn.r.f5635a;
            }
            if (objA == objG) {
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
