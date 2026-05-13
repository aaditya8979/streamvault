package com.yandex.div.core.timer;

import bn.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.l;

/* JADX INFO: compiled from: TimerController.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class TimerController$ticker$4 extends FunctionReferenceImpl implements l<Long, r> {
    public TimerController$ticker$4(Object obj) {
        super(1, obj, TimerController.class, "onTick", "onTick(J)V", 0);
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(Long l10) {
        invoke(l10.longValue());
        return r.f5635a;
    }

    public final void invoke(long j10) {
        ((TimerController) this.receiver).onTick(j10);
    }
}
