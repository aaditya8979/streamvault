package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f65869a;

    public S7() {
        Ec ec2 = new Ec(0);
        ec2.a(T7.f65925b, 0);
        ec2.a(T7.f65926c, 1);
        ec2.a(T7.f65927d, 2);
        ec2.a(T7.f65928e, 3);
        this.f65869a = ec2;
    }

    @NotNull
    public final Ec a() {
        return this.f65869a;
    }

    public abstract boolean a(Object obj, Object obj2);
}
