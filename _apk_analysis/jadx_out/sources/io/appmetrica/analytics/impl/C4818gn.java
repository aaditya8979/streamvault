package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4818gn implements InterfaceC5122t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5172v f66873b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5147u f66872a = new C5147u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bn.g f66874c = kotlin.b.b(new C4792fn(this));

    public C4818gn(@NotNull Context context) {
        this.f66873b = new C5172v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5122t
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.putAll((Map) this.f66874c.getValue());
        return map;
    }
}
