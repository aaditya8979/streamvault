package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class N8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S8 f65630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P8 f65631c;

    public N8(S8 s82, int i10) {
        this.f65629a = i10;
        this.f65630b = s82;
    }

    public final void a() {
        P8 p82;
        S8 s82 = this.f65630b;
        s82.getClass();
        try {
            byte[] bArr = s82.f65872c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                Q8 q82 = s82.f65870a;
                s82.f65871b.getClass();
                C5182v9 c5182v9 = new C5182v9();
                q82.getClass();
                p82 = new P8(c5182v9.f67829a, c5182v9.f67830b, c5182v9.f67831c, CollectionUtils.hashSetFromIntArray(c5182v9.f67832d));
            } else {
                Q8 q83 = s82.f65870a;
                C5182v9 state = s82.f65871b.toState(bArr);
                q83.getClass();
                p82 = new P8(state.f67829a, state.f67830b, state.f67831c, CollectionUtils.hashSetFromIntArray(state.f67832d));
            }
        } catch (Throwable unused) {
            Q8 q84 = s82.f65870a;
            s82.f65871b.getClass();
            C5182v9 c5182v92 = new C5182v9();
            q84.getClass();
            p82 = new P8(c5182v92.f67829a, c5182v92.f67830b, c5182v92.f67831c, CollectionUtils.hashSetFromIntArray(c5182v92.f67832d));
        }
        this.f65631c = p82;
        int i10 = p82.f65743c;
        int i11 = this.f65629a;
        if (i10 != i11) {
            p82.f65743c = i11;
            p82.f65744d = 0;
            S8 s83 = this.f65630b;
            IBinaryDataHelper iBinaryDataHelper = s83.f65872c;
            R8 r82 = s83.f65871b;
            s83.f65870a.getClass();
            iBinaryDataHelper.insert("event_hashes", r82.toByteArray(Q8.a(p82)));
        }
    }
}
