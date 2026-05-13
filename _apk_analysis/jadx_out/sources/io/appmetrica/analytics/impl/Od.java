package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Od extends FunctionReferenceImpl implements sn.l {
    public Od(Object obj) {
        super(1, obj, Pd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        Pd pd2 = (Pd) this.receiver;
        pd2.f65746a.markCrashCompleted((String) obj);
        pd2.f65746a.deleteCompletedCrashes();
        return bn.r.f5635a;
    }
}
