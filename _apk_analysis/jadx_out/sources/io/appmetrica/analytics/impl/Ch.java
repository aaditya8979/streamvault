package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: loaded from: classes4.dex */
public final class Ch extends AbstractC4904k6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xn f65125d;

    public Ch(@NonNull Context context, @NonNull Xn xn2, @NonNull InterfaceC4878j6 interfaceC4878j6, @Nullable ICrashTransformer iCrashTransformer) {
        this(xn2, interfaceC4878j6, iCrashTransformer, new N9(context));
    }

    public Ch(Xn xn2, InterfaceC4878j6 interfaceC4878j6, ICrashTransformer iCrashTransformer, N9 n92) {
        super(interfaceC4878j6, iCrashTransformer, n92);
        this.f65125d = xn2;
    }
}
