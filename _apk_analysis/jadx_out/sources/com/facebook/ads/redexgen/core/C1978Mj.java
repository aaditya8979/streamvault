package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1978Mj extends BroadcastReceiver {
    public static byte[] A03;
    public static String[] A04 = {"Zajbq5JOCnWrQ3Qr", "TCN1z34NH4GHaAlQvwLAm", "H6zcI", "fG9vyRzubE117ecaxLAWdwziYhb1qpFD", "HGvL5kVmbL0dgsivMgEslo9gYSg3Drcz", "onuj3", "bRQo93cAMXtZyJucWKt", "haBpxRpvqIWUs6HGbuX"};
    public Context A00;
    public AnonymousClass64 A01;
    public boolean A02 = false;

    static {
        A01();
    }

    public C1978Mj(AnonymousClass64 anonymousClass64, Context context) {
        this.A01 = anonymousClass64;
        this.A00 = context;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{53, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 21, 15, 30, 9, 8, 15, 18, 15, 18, 26, 23, 85, 31, 18, 8, 11, 23, 26, 2, 30, 31, 55, 59, 57, 122, 50, 53, 55, 49, 54, 59, 59, 63, 122, 53, 48, 39, 122, 61, 58, 32, 49, 38, 39, 32, 61, 32, 61, 53, 56, 122, 48, 61, 39, 36, 56, 53, 45, 49, 48, 110, 81, 66, 81, 90, 64, 73, 92, 75, 95, 86, 75, 84, 122, 77, 88, 122, 85, 80, 90, 82, 71, 82, 69, 81, 88, 69, 90, 116, 67, 86, 116, 91, 94, 84, 92, 13, 90, 69, 72, 73, 67, 101, 66, 88, 73, 94, 95, 88, 69, 88, 77, 64, 105, 90, 73, 66, 88, 105, 118, 123, 122, 112, 86, 113, 107, 122, 109, 108, 107, 118, 107, 126, 115, 90, 105, 122, 113, 107, 37};
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(40, 40, 103) + this.A01.getUniqueId());
        intentFilter.addAction(A00(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 22, 44) + this.A01.getUniqueId());
        intentFilter.addAction(A00(100, 16, 4) + this.A01.getUniqueId());
        OO.A00(this.A00).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            OO.A00(this.A00).A05(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String[] strArrSplit = intent.getAction().split(A00(0, 1, 60));
        if (strArrSplit.length == 2 && strArrSplit[1].equals(this.A01.getUniqueId())) {
            String str = strArrSplit[0];
            String[] strArr = A04;
            if (strArr[6].length() == strArr[7].length()) {
                String[] strArr2 = A04;
                strArr2[1] = "cVmv3UmH0jQ76579UnKAx";
                strArr2[0] = "Daa9OCgAFjmRw5DI";
                if (str.equals(A00(1, 39, 72))) {
                    if (this.A01.getListener() != null) {
                        this.A01.getListener().AD9();
                        this.A01.getListener().AFu();
                        return;
                    }
                    return;
                }
                if (!strArrSplit[0].equals(A00(116, 21, 31))) {
                    String str2 = strArrSplit[0];
                    String[] strArr3 = A04;
                    if (strArr3[1].length() != strArr3[0].length()) {
                        String[] strArr4 = A04;
                        strArr4[6] = "hQHl7K2LkQxZ3MVJZ2W";
                        strArr4[7] = "MyC8C5hgly0WituHMEy";
                        if (!str2.equals(A00(85, 15, 10))) {
                            return;
                        }
                    } else {
                        String[] strArr5 = A04;
                        strArr5[3] = "OiP3hK9qgel9CjGx7GeTViZjY0DdeBQ1";
                        strArr5[4] = "Kg9TdH9JmWDwVESkwLvI07zIYN1y95Tk";
                        if (!str2.equals(A00(70, 4, 4))) {
                            return;
                        }
                    }
                    this.A01.A0u();
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra(A00(80, 5, 7));
                if (serializableExtra instanceof DL) {
                    if (this.A01.getListener() != null) {
                        this.A01.getListener().ADF();
                        this.A01.getListener().AFu();
                    }
                    if (this.A02) {
                        this.A01.A0d(1);
                    } else {
                        this.A01.A0d(((DL) serializableExtra).A01());
                    }
                    this.A01.setVisibility(0);
                    this.A01.A0h(EnumC2545db.A04, 1);
                    return;
                }
                if (serializableExtra instanceof DT) {
                    if (this.A01.getListener() == null) {
                        return;
                    }
                    AnonymousClass64 anonymousClass64 = this.A01;
                    String[] strArr6 = A04;
                    if (strArr6[6].length() == strArr6[7].length()) {
                        String[] strArr7 = A04;
                        strArr7[3] = "8JMcdO2ddwvsOz1l0eACjHxgYswUY7yr";
                        strArr7[4] = "ZybcsncwY6JEIQQDyQcFnHvjYhNwtivs";
                        anonymousClass64.getListener().ADN();
                        return;
                    }
                } else {
                    if (serializableExtra instanceof DS) {
                        if (this.A01.getListener() != null) {
                            this.A01.getListener().ADP();
                            return;
                        }
                        return;
                    }
                    if (serializableExtra instanceof C14953d) {
                        if (this.A01.getListener() != null) {
                            this.A01.getListener().ACn();
                        }
                        this.A02 = true;
                        return;
                    }
                    if (serializableExtra instanceof DQ) {
                        if (this.A01.getListener() != null) {
                            this.A01.getListener().AEX();
                        }
                        this.A02 = false;
                        return;
                    }
                    boolean z10 = serializableExtra instanceof C3Y;
                    String[] strArr8 = A04;
                    if (strArr8[5].length() == strArr8[2].length()) {
                        String[] strArr9 = A04;
                        strArr9[5] = "0aNC0";
                        strArr9[2] = "prrJE";
                        if (!z10 || this.A01.getListener() == null) {
                            return;
                        }
                        this.A01.getListener().onPause();
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
    }
}
