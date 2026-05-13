package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f65977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65978b = "[ComponentMigrationToV113]";

    public U4(Y4 y42) {
        this.f65977a = y42;
    }

    @NotNull
    public final Y4 a() {
        return this.f65977a;
    }

    public final void a(int i10) {
        if (b(i10)) {
            c();
        }
    }

    @NotNull
    public final String b() {
        return this.f65978b;
    }

    public abstract boolean b(int i10);

    public abstract void c();
}
