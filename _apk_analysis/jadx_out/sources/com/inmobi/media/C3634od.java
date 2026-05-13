package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3634od extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3659pd f27789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3634od(C3659pd c3659pd, hn.c cVar) {
        super(2, cVar);
        this.f27789a = c3659pd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3634od(this.f27789a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3634od(this.f27789a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        InterfaceC3580m9 interfaceC3580m9L = this.f27789a.l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        C3659pd c3659pd = this.f27789a;
        Hc hc2 = c3659pd.f27870i;
        C3307be c3307be = c3659pd.f27867f;
        G g10 = c3659pd.f28550a.f28473b;
        hc2.a(c3307be, new AdMetaInfo(g10.f25492e, g10.f25499l));
        return bn.r.f5635a;
    }
}
