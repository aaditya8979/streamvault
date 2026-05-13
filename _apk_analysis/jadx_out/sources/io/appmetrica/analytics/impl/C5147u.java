package io.appmetrica.analytics.impl;

import java.util.Collection;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5147u implements InterfaceC5197w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67756a = "yandex";

    @Nullable
    public final String a() {
        try {
            return new JSONArray((Collection) cn.f0.O0(cn.v.e(this.f67756a), C4696c4.l().m().f66282d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
