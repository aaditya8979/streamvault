package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class rj extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj f94468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(tj tjVar, Looper looper) {
        super(looper);
        this.f94468a = tjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f94468a.a(message);
    }
}
