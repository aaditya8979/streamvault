package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Wi extends Sg {
    public Wi(@NonNull Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        String str = q52.f65795h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f65880a.f66216c.j(str).b();
        return false;
    }
}
