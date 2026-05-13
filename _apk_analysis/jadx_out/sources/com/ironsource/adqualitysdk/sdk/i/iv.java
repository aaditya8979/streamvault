package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class iv extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2615 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2616;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String f2617;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2618;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Context f2619;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2620 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<iu> f2621 = new HashSet();

    static {
        m6596();
        f2617 = m6604(new int[]{1680840310, -1147872975, 167404258, -2010743116, -335671392, -1762109579, 1814456296, -1829633020, -1467497195, 1498107812}, 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        int i10 = f2616 + 47;
        f2615 = i10 % 128;
        int i11 = i10 % 2;
    }

    public iv(Context context) {
        this.f2619 = context.getApplicationContext();
        k.m6885(f2617, m6604(new int[]{995112144, -839696886, 793125423, -823182672, -1891621481, -35567808, -1945032620, 1315422620, 1315402392, -1070529798, 1795521819, 622117249, -2128202635, 1774877377, -2024043855, 252286014}, AndroidCharacter.getMirror('0') - 18).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m6604(new int[]{-2122701851, 1546060630, 712174246, -318067401, 14123920, 1721127285, 247592397, -212372362, 804305082, 389616605, -1178561709, 1762587455, 334432064, 1298451654, -593429956, 100212106, 342276724, 1645800780}, 36 - TextUtils.indexOf("", "")).intern());
        this.f2619.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static void m6596() {
        f2618 = new int[]{1327670354, -1341658831, 542698013, 1787449947, -734461109, -14954278, 218993377, 1412001391, 55029058, -1538574215, 326963627, -820688930, -1586025059, -1868220713, 494196336, 1092001671, 175100163, -50875469};
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Set<iu> m6597() {
        HashSet hashSet = new HashSet(this.f2621);
        int i10 = f2615 + 99;
        f2616 = i10 % 128;
        if ((i10 % 2 != 0 ? '/' : (char) 5) == 5) {
            return hashSet;
        }
        int i11 = 8 / 0;
        return hashSet;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static NetworkInfo m6598(Context context) {
        if ((context != null ? 'F' : 'b') != 'b') {
            int i10 = f2616 + 47;
            f2615 = i10 % 128;
            int i11 = i10 % 2;
            return ((ConnectivityManager) context.getSystemService(m6604(new int[]{247592397, -212372362, -1244825590, -1813295031, -363167493, 1955524488}, 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())).getActiveNetworkInfo();
        }
        int i12 = f2615 + 33;
        f2616 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m6599(iv ivVar, Context context) {
        int i10 = f2615 + 23;
        f2616 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM6602 = m6602(context);
        int i12 = f2615 + 37;
        f2616 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 1 : '@') != 1) {
            return zM6602;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m6600() {
        int i10 = f2615 + 89;
        int i11 = i10 % 128;
        f2616 = i11;
        int i12 = i10 % 2;
        String str = f2617;
        int i13 = i11 + 75;
        f2615 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m6601(boolean z10) {
        int i10 = f2616;
        int i11 = i10 + 17;
        f2615 = i11 % 128;
        int i12 = i11 % 2;
        this.f2620 = z10;
        int i13 = i10 + 3;
        f2615 = i13 % 128;
        if ((i13 % 2 == 0 ? '[' : (char) 18) != 18) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m6602(Context context) {
        int i10 = f2616 + 103;
        f2615 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m6598(context);
            throw null;
        }
        NetworkInfo networkInfoM6598 = m6598(context);
        if (networkInfoM6598 == null || !networkInfoM6598.isConnected()) {
            return false;
        }
        String str = f2617;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6604(new int[]{1680840310, -1147872975, 1401269269, -57271758}, 8 - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(networkInfoM6598.getTypeName());
        sb2.append(m6604(new int[]{802974129, 1865419882, -1703191499, 2082952551, 1806828347, 721542486}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11).intern());
        k.m6901(str, sb2.toString());
        int i11 = f2615 + 61;
        f2616 = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m6603(iv ivVar, boolean z10) {
        int i10 = f2616 + 125;
        f2615 = i10 % 128;
        boolean z11 = i10 % 2 == 0;
        ivVar.m6601(z10);
        if (z11) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6604(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2618.clone();
            e.f1935 = 0;
            while (true) {
                int i11 = e.f1935;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1937 = (c10 << 16) + c11;
                    e.f1936 = (c12 << 16) + c13;
                    e.m6211(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1937 ^ iArr2[i13];
                        e.f1937 = i14;
                        e.f1936 = e.m6210(i14) ^ e.f1936;
                        int i15 = e.f1937;
                        e.f1937 = e.f1936;
                        e.f1936 = i15;
                    }
                    int i16 = e.f1937;
                    e.f1937 = e.f1936;
                    e.f1936 = i16;
                    e.f1936 = i16 ^ iArr2[16];
                    e.f1937 ^= iArr2[17];
                    int i17 = e.f1935;
                    int i18 = e.f1937;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1936;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m6211(iArr2);
                    int i20 = e.f1935;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1935 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f2622 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char f2623 = 34772;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static char f2624 = 11765;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2625 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f2626 = 54483;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f2627 = 10665;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m6611(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (n.f3014) {
                    char[] cArr2 = new char[cArr.length];
                    n.f3013 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = n.f3013;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2623)) ^ ((c11 >>> 5) + f2624)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2626) ^ ((c12 + i12) ^ ((c12 << 4) + f2627))));
                                i12 -= 40503;
                            }
                            int i14 = n.f3013;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            n.f3013 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                }
                return str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:4:0x0013, B:16:0x0055, B:18:0x0086, B:20:0x00a8, B:22:0x00b2, B:24:0x00bb, B:10:0x0034), top: B:37:0x0011 }] */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void mo4352() {
                /*
                    Method dump skipped, instruction units count: 237
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iv.AnonymousClass2.mo4352():void");
            }
        });
        int i10 = f2615 + 59;
        f2616 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6605() {
        Iterator<iu> it = m6597().iterator();
        while (true) {
            if (!it.hasNext()) {
                int i10 = f2615 + 29;
                f2616 = i10 % 128;
                int i11 = i10 % 2;
                return;
            } else {
                int i12 = f2616 + 25;
                f2615 = i12 % 128;
                int i13 = i12 % 2;
                it.next().mo4470();
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m6606() {
        int i10 = f2616 + 75;
        f2615 = i10 % 128;
        if ((i10 % 2 == 0 ? 'O' : '\r') != '\r') {
            throw null;
        }
        return this.f2620;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6607() {
        Iterator<iu> it;
        int i10;
        int i11 = f2616 + 121;
        f2615 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            it = m6597().iterator();
            int i12 = 82 / 0;
        } else {
            it = m6597().iterator();
        }
        do {
            if (!(it.hasNext())) {
                return;
            }
            int i13 = f2616 + 91;
            f2615 = i13 % 128;
            i10 = i13 % 2;
            it.next();
        } while (i10 != 0);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m6608(iu iuVar) {
        int i10 = f2616 + 77;
        f2615 = i10 % 128;
        int i11 = i10 % 2;
        this.f2621.remove(iuVar);
        int i12 = f2615 + 49;
        f2616 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6609() {
        int i10 = f2616 + 51;
        f2615 = i10 % 128;
        int i11 = i10 % 2;
        this.f2619.unregisterReceiver(this);
        int i12 = f2616 + 13;
        f2615 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return;
        }
        int i13 = 26 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m6610(iu iuVar) {
        int i10 = f2616 + 55;
        f2615 = i10 % 128;
        int i11 = i10 % 2;
        this.f2621.add(iuVar);
        int i12 = f2615 + 115;
        f2616 = i12 % 128;
        if ((i12 % 2 != 0 ? '8' : 'T') != 'T') {
            throw null;
        }
    }
}
