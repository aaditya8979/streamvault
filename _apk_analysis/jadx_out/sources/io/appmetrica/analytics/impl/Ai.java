package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Ai extends B4 {
    public Ai(C5252y4 c5252y4) {
        super(c5252y4);
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NonNull Q5 q52, @NonNull C5177v4 c5177v4) {
        Bundle bundle = q52.f65800m;
        this.f65016a.f68021k.a(new C5227x4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
