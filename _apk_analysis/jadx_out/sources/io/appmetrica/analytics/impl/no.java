package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: loaded from: classes11.dex */
public final class no implements La {
    @Override // io.appmetrica.analytics.impl.La
    @Nullable
    public final String a(@NonNull Context context) {
        IdentifiersResult identifiersResultQ = new We(C4696c4.l().c(context).a(context)).q();
        if (TextUtils.isEmpty(identifiersResultQ.f68099id)) {
            return null;
        }
        return identifiersResultQ.f68099id;
    }
}
