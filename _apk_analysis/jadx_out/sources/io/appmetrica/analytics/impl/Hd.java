package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Hd implements InterfaceC4687bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65315a;

    public Hd(int i10) {
        this.f65315a = i10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4687bl
    public final boolean a(@NotNull String str) {
        return this.f65315a != Process.myPid();
    }
}
