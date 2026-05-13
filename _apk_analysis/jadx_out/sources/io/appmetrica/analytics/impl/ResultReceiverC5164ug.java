package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ResultReceiverC5164ug extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4811gg f67785a;

    public ResultReceiverC5164ug(Handler handler, InterfaceC4811gg interfaceC4811gg) {
        super(handler);
        this.f67785a = interfaceC4811gg;
    }

    public static void a(ResultReceiver resultReceiver, C5015og c5015og) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c5015og == null ? null : c5015og.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            C5015og c5015og = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c5015og = new C5015og(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f67785a.a(c5015og);
        }
    }
}
