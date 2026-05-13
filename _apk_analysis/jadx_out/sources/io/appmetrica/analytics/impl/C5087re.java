package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5087re implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f67615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kg f67616b;

    public C5087re(@NotNull File file, @NotNull Kg kg2) {
        this.f67615a = file;
        this.f67616b = kg2;
    }

    @Override // io.appmetrica.analytics.impl.J6
    @NotNull
    public final File a(@NotNull Context context, @NotNull String str) {
        return new File(this.f67615a, this.f67616b.a(str));
    }
}
