package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5054q5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4871j f67563b = C5009oa.k().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumSet f67564c = EnumSet.of(NetworkType.OFFLINE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67565d = "connection based";

    public C5054q5(@NotNull Context context) {
        this.f67562a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C4871j c4871j = this.f67563b;
        Context context = this.f67562a;
        c4871j.getClass();
        De de2 = He.f65316a;
        return !this.f67564c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ge()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f67565d;
    }
}
