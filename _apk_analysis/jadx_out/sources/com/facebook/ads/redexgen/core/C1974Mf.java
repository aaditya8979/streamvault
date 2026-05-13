package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1974Mf extends BroadcastReceiver {
    public static byte[] A04;
    public static String[] A05 = {"Y8Z1", "Gib9", "71bezSKIJxKufdL13ppDGQvN3l", "amgHka60jBO0VGEiDWjvaQpooGEX1vUM", "ttT0jofZ4zWB5Dwx3mPNIXc", "eyh0I6c0vYFaGMFwnoeMEbyGHh2pIYmK", "GRZnv0m", "VfIH6aQ48NmkLcOtEQWPZe5uGeHooIii"};
    public C2825iN A00;
    public InterfaceC1973Me A01;
    public C2529dL A02;
    public String A03;

    static {
        A01();
    }

    public C1974Mf(C2529dL c2529dL, String str, C2825iN c2825iN, InterfaceC1973Me interfaceC1973Me) {
        this.A02 = c2529dL;
        this.A03 = str;
        this.A01 = interfaceC1973Me;
        this.A00 = c2825iN;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-12, -58, -46, -48, -111, -55, -60, -58, -56, -59, -46, -46, -50, -111, -60, -57, -42, -111, -47, -60, -41, -52, ExifInterface.MARKER_EOI, -56, -111, -60, -57, -62, -58, -49, -52, -58, -50};
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 32, 35) + A00(0, 1, 122) + this.A03);
        OO.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        OO.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String[] strArrSplit = action.split(A00(0, 1, 122));
        if (strArrSplit.length >= 1 && (str = strArrSplit[0]) != null) {
            String[] strArr = A05;
            if (strArr[0].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A05[7] = "UAhxU8HTiJONxaKo3zNJYg3uL8StvHDr";
            if (A00(1, 32, 35).equals(str)) {
                InterfaceC1973Me interfaceC1973Me = this.A01;
                C2825iN c2825iN = this.A00;
                String[] strArr2 = A05;
                if (strArr2[0].length() != strArr2[1].length()) {
                    throw new RuntimeException();
                }
                A05[6] = "";
                interfaceC1973Me.AEG(c2825iN);
            }
        }
    }
}
