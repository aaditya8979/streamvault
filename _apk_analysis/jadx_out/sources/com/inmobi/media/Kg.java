package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Kg extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25813a;

    public Kg(hn.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Kg(cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Kg((hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25813a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                Og og2 = Og.f26086a;
                og2.getClass();
                Context context = Ji.f25747a;
                JSONObject jSONObject = null;
                if (context != null) {
                    if (Og.f26089d == null) {
                        Og.f26089d = new C3911zg(context, "pub_signals_store");
                    }
                    C3911zg c3911zg = Og.f26089d;
                    if (c3911zg == null) {
                        tn.p.C("prefDao");
                        c3911zg = null;
                    }
                    String strA = c3911zg.a("saved_signals");
                    if (strA != null) {
                        jSONObject = new JSONObject(strA);
                    }
                }
                if (jSONObject == null) {
                    return bn.r.f5635a;
                }
                SignalsConfig.PublisherConfig publisherConfigC = Og.c();
                JSONObject jSONObjectA = Pg.a(Pg.a(Pg.a(jSONObject, "obj_", publisherConfigC.getObj().getExpiry()), "auto_", publisherConfigC.getAuto().getExpiry()), "dir_", publisherConfigC.getDirect().getExpiry());
                this.f25813a = 1;
                if (og2.a(jSONObjectA, this) == objG) {
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
