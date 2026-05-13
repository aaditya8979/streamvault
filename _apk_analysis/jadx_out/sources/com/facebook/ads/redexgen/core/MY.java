package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MY extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC2841id A00;
    public MX A01;
    public C2529dL A02;
    public String A03;

    static {
        A01();
    }

    public MY(C2529dL c2529dL, String str, InterfaceC2841id interfaceC2841id, MX mx) {
        this.A02 = c2529dL;
        this.A03 = str;
        this.A01 = mx;
        this.A00 = interfaceC2841id;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, 15, 71, 64, 66, 68, 67, 78, 78, 74, 15, 64, 69, 82, 15, 67, 64, 79, 79, 68, 83, 15, 66, 77, 72, 66, 74, 68, 69};
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        OO.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        OO.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action == null || (str = action.split(A00(0, 1, 83))[0]) == null || !A00(1, 31, 48).equals(str)) {
            return;
        }
        this.A01.ACb(this.A00);
    }
}
