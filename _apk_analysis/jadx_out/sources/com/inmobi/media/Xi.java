package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Xi extends SuspendLambda implements sn.l {
    public Xi(hn.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Xi(cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Xi((hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        tn.p.j(Yi.f26653b, "access$getTAG$p(...)");
        C3582mb c3582mb = C3582mb.f27616a;
        if (C3582mb.d()) {
            LocationManager locationManager = C3582mb.f27617b;
            if (locationManager != null) {
                locationManager.removeUpdates(c3582mb);
            }
            GoogleApiClient googleApiClient = C3582mb.f27619d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        C3582mb.f27619d = null;
        return bn.r.f5635a;
    }
}
