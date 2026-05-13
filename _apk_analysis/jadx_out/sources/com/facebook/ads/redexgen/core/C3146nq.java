package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3146nq implements InterfaceC15123u {
    public Message A00;
    public C3145np A01;

    public C3146nq() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C3145np.A01(this);
    }

    public final C3146nq A01(Message message, C3145np c3145np) {
        this.A00 = message;
        this.A01 = c3145np;
        return this;
    }

    public final void A02() {
        ((Message) C3M.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C3M.A01(this.A00));
        A00();
        return zSendMessageAtFrontOfQueue;
    }
}
