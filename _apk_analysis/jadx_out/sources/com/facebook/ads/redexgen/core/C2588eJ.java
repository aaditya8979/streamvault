package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2588eJ {
    public static InterfaceC15304m A06;
    public static BT A07;
    public static InterfaceC1956Ln A08;
    public static C2588eJ A09;
    public static File A0A;
    public static byte[] A0B;
    public static String[] A0C = {"4y", "AwMrvrZaA3qCUMe4DaWf", "nMell2jjCxhf1iVkS1T4", "JoDZxKxhXC6KTCYPanywHJvOgx3oSz2Q", "c4TvbpAtmy9oRzm3BRhbekxSipSfphPN", "JNxty2uNXQJQugnl9tUmEGg4l4lnFcO6", "Bo5IZ2fGdsUyi7NqIQl4cfXztCU0TldF", "nOSbM9ZPEjvtyh7HAXbSWFPDuf7zpKmZ"};
    public boolean A00;
    public final C2503cu A04;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final SparseArray<C2586eH> A02 = new SparseArray<>();
    public final Runnable A05 = new RunnableC2585eG(this);
    public final BS A03 = new CN(this);

    static {
        A0D();
    }

    public C2588eJ(C2503cu c2503cu, BT bt2) {
        this.A04 = c2503cu;
        if (bt2 != null) {
            A07 = bt2;
            bt2.A0F(this.A03);
        }
        A03().A0E();
    }

    public static synchronized InterfaceC15304m A01(Context context) {
        if (A06 == null) {
            A06 = new C3144no(context);
        }
        return A06;
    }

    private C16449j A02() {
        return new C16449j().A01(A08(135, 3, 65)).A00(null);
    }

    private synchronized BT A03() {
        A0E();
        return A07;
    }

    public static synchronized InterfaceC1956Ln A04(Context context) {
        if (A08 == null) {
            A08 = new C2853ir(new File(A07(context), A08(121, 14, 26)), new C7R(U7.A0T(context)));
        }
        return A08;
    }

    public static C2859ix A05(C3140nk c3140nk, InterfaceC1956Ln interfaceC1956Ln) {
        return new C2859ix().A06(interfaceC1956Ln).A05(c3140nk).A04(new C3134ne()).A03(2);
    }

    public static synchronized C2588eJ A06(C2503cu c2503cu) {
        if (A09 == null) {
            A09 = new C2588eJ(c2503cu, null);
        }
        return A09;
    }

    public static synchronized File A07(Context context) {
        if (A0A == null) {
            A0A = context.getCacheDir();
            if (A0A == null) {
                A0A = context.getFilesDir();
            }
        }
        return A0A;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A09(C2503cu c2503cu, Uri uri) {
        try {
            if (U7.A1r(c2503cu)) {
                return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
            }
            return null;
        } catch (URISyntaxException e10) {
            c2503cu.A08().AAy(A08(138, 5, 50), AbstractC2142Sv.A0u, new C2143Sw(e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2588eJ.A0A():void");
    }

    private void A0B() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        this.A01.post(this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A01.removeCallbacks(this.A05);
        this.A00 = false;
    }

    public static void A0D() {
        A0B = new byte[]{11, 6, 11, 73, 82, 95, 78, 88, 116, 79, 68, 92, 69, 71, 68, 74, 79, 78, 79, 17, 55, 58, 55, 103, 114, 101, 116, 114, 121, 99, 118, 112, 114, 55, 115, 120, 96, 121, 123, 120, 118, 115, 114, 115, 45, 123, 118, 123, 40, 47, 58, 47, 62, 97, 35, 65, 122, 119, 102, 112, 57, 35, 33, 99, 120, 117, 100, 114, 33, 4, 4, 4, 4, 9, 91, 76, 88, 92, 76, 90, 93, 96, 77, 19, 25, 50, ExifInterface.START_CODE, 51, 49, 50, 60, 57, 56, 57, 115, 125, 14, 41, 60, 41, 56, 103, 125, 62, 9, 9, 20, 9, 85, 91, 40, 15, 26, 15, 30, 65, 91, 110, 91, 73, 81, 126, 123, 113, 104, 50, 123, 112, 104, 113, 115, 112, 126, 123, 108, 37, 32, 55, 84, 86, 84, 95, 82};
    }

    private synchronized void A0E() {
        if (A07 == null) {
            A07 = new BT(this.A04, A01(this.A04), A04(this.A04), A0H(this.A04), Executors.newFixedThreadPool(6));
            A07.A0F(this.A03);
        }
    }

    public final InterfaceC15404w A0H(Context context) {
        return A05(new C3140nk(context, (C5H) null, A02()), A04(context));
    }

    public final void A0I(Uri uri, InterfaceC2587eI interfaceC2587eI, long j10) {
        String strA09 = A09(this.A04, uri);
        if (strA09 == null) {
            strA09 = uri.toString();
        }
        boolean zA0J = A0J(strA09);
        DownloadRequest downloadRequestA05 = new BW(uri.toString(), uri).A00(strA09).A05();
        A03().A0G(downloadRequestA05);
        this.A02.put(downloadRequestA05.A02.hashCode(), new C2586eH(interfaceC2587eI, j10, zA0J, null));
        A0B();
    }

    public final boolean A0J(String str) {
        return A04(this.A04).A74(str, 0L, 1L) > 0;
    }
}
