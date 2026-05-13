package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3870y0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig f28551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A0 f28552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f28553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdQualityResult f28554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A0 f28556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdConfig f28557g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3870y0(A0 a02, AdConfig adConfig, hn.c cVar) {
        super(2, cVar);
        this.f28556f = a02;
        this.f28557g = adConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3870y0(this.f28556f, this.f28557g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3870y0(this.f28556f, this.f28557g, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:18|(1:81)|19|(2:79|21)|22|(1:24)|25|26|75|27|(1:29)|30|46|(3:49|50|(0)(0))|48) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:71|41|77|42|(1:44)|45|46|(0)|48) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r3 == r0) goto L48;
     */
    /* JADX WARN: Path cross not found for [B:18:0x0091, B:45:0x00e9], limit reached: 82 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0125 -> B:50:0x0127). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3870y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
