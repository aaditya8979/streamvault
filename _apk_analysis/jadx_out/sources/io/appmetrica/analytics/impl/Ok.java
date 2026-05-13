package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jk f65718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Nk f65719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f65720d;

    public Ok(Context context, R4 r42) {
        r42.a();
        this.f65717a = "session_extras";
        this.f65718b = new Jk();
        this.f65719c = new Nk();
        this.f65720d = C5009oa.k().B().a(context, r42);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f65720d.get(this.f65717a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f65718b.toModel(this.f65719c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Jk jk2 = this.f65718b;
        this.f65719c.getClass();
        return jk2.toModel(new Lk());
    }
}
