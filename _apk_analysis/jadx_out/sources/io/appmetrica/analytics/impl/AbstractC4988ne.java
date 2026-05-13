package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4988ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67357a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67358b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67359c = 1;

    public final int a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f67357a;
        }
        if (tn.p.f(bool, Boolean.FALSE)) {
            return this.f67358b;
        }
        if (tn.p.f(bool, Boolean.TRUE)) {
            return this.f67359c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final Boolean a(int i10) {
        if (i10 == this.f67358b) {
            return Boolean.FALSE;
        }
        if (i10 == this.f67359c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
