package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4800g5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f66809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66810b;

    public C4800g5(@NotNull IExecutionPolicy... iExecutionPolicyArr) {
        this.f66809a = iExecutionPolicyArr;
        this.f66810b = "Composite of {" + cn.r.n0(iExecutionPolicyArr, ", ", null, null, 0, null, C4774f5.f66726a, 30, null) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f66809a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i10];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i10++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f66810b;
    }
}
