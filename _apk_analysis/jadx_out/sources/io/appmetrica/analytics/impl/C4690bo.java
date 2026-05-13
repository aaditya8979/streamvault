package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4690bo extends Sg {
    public C4690bo(Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        String strJ = this.f65880a.f66216c.j();
        String str = q52.f65795h;
        this.f65880a.f66216c.j(str).b();
        if (TextUtils.equals(strJ, str)) {
            return false;
        }
        this.f65880a.a(N3.o());
        return false;
    }
}
