package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: loaded from: classes6.dex */
public final class S8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q8 f65870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R8 f65871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f65872c;

    public S8(Context context, R4 r42) {
        this(new R8(), new Q8(), C5009oa.k().B().a(context, r42));
    }

    public S8(R8 r82, Q8 q82, IBinaryDataHelper iBinaryDataHelper) {
        this.f65871b = r82;
        this.f65870a = q82;
        this.f65872c = iBinaryDataHelper;
    }
}
