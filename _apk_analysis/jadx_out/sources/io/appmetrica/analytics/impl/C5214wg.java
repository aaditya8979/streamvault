package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5214wg {
    public C5214wg(Pa pa2) {
    }

    public static Pa a(Context context, IHandlerExecutor iHandlerExecutor) {
        C4888jg c4888jg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c4888jg = new C4888jg(context, iHandlerExecutor);
            } catch (Throwable unused) {
                c4888jg = null;
            }
        } else {
            c4888jg = null;
        }
        return c4888jg == null ? new C5189vg() : c4888jg;
    }
}
