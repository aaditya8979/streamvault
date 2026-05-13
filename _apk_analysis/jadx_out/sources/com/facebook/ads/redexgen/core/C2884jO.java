package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2884jO implements InterfaceC1932Kp {
    public static byte[] A09;
    public static String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", "wl", "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final C1940Kx A02;
    public final LA A04;
    public final SQ A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C1942Kz A03 = new C1942Kz();

    static {
        A04();
        A0B = C2884jO.class.getSimpleName();
    }

    public C2884jO(SQ sq2, C1940Kx c1940Kx, LA la2) {
        this.A05 = sq2;
        this.A08 = c1940Kx.A02();
        this.A00 = c1940Kx.A00();
        this.A04 = la2;
        this.A01 = c1940Kx.A01();
        this.A02 = c1940Kx;
    }

    public static C2881jK A00(Context context, String str) throws L6 {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i10 == -1) {
                    return new C2881jK(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            throw new L6(A03(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 18, 78), e10);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 78));
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE 
      (r10v1 ?? I:com.facebook.ads.redexgen.X.LA)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.Kv)
     INTERFACE call: com.facebook.ads.redexgen.X.LA.AGk(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void (m)], block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE 
      (r10v0 ?? I:com.facebook.ads.redexgen.X.LA)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.Kv)
     INTERFACE call: com.facebook.ads.redexgen.X.LA.AGk(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.Kv):void (m)], block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private File A02(C1938Kv c1938Kv, String str, String str2, int i10, C1941Ky c1941Ky) throws Throwable {
        C1938Kv c1938Kv2;
        String strAGk;
        C1938Kv c1938Kv3;
        String strAGk2;
        String strA03 = A03(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 22, 17);
        try {
            String str3 = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            final long jA0R = U7.A0R(this.A05);
            C2879jI c2879jI = new C2879jI(file, new AbstractC2883jN(jA0R) { // from class: com.facebook.ads.redexgen.X.7f
                public static byte[] A01;
                public final long A00;

                static {
                    A01();
                }

                {
                    if (jA0R <= 0) {
                        throw new IllegalArgumentException(A00(0, 33, 110));
                    }
                    this.A00 = jA0R;
                }

                public static String A00(int i11, int i12, int i13) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i11, i11 + i12);
                    for (int i14 = 0; i14 < bArrCopyOfRange.length; i14++) {
                        bArrCopyOfRange[i14] = (byte) ((bArrCopyOfRange[i14] - i13) - 38);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A01 = new byte[]{ExifInterface.MARKER_APP1, -11, 12, -76, 7, -3, 14, -7, -76, 1, 9, 7, 8, -76, -10, -7, -76, 4, 3, 7, -3, 8, -3, 10, -7, -76, 2, 9, 1, -10, -7, 6, -75};
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC2883jN
                public final boolean A08(File file2, long j10, int i11) {
                    return j10 <= this.A00;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC2883jN, com.facebook.ads.redexgen.core.L0
                public final /* bridge */ /* synthetic */ void AJg(File file2) throws IOException {
                    super.AJg(file2);
                }
            });
            if (c2879jI.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 36) + c2879jI.A00.getName();
                }
                this.A06.put(str3, file);
                c2879jI.A06();
                this.A04.AGl(str3, true, c1938Kv);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 76) + c2879jI.A00.getName();
            }
            if (!c1941Ky.A04()) {
                return null;
            }
            this.A04.AGl(str3, false, c1938Kv);
            for (int i11 = 0; i11 < this.A00; i11++) {
                try {
                    SQ sq2 = this.A05;
                    if (A0A[3].charAt(31) != '9') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                    strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                    str3 = str3;
                    try {
                        A05(sq2, c2879jI, str3, i10, i11, jCurrentTimeMillis);
                        break;
                    } catch (L6 e10) {
                        e = e10;
                        if (i11 == this.A00 - 1) {
                            A06(c2879jI);
                            if (e instanceof C2880jJ) {
                                throw ((C2880jJ) e);
                            }
                            if (e instanceof C2875jE) {
                                throw ((C2875jE) e);
                            }
                        }
                    }
                } catch (L6 e11) {
                    e = e11;
                }
            }
            int iA03 = c2879jI.A03();
            c2879jI.A06();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            c1941Ky.A00().A55(file, this.A04);
            this.A06.put(str3, file);
            this.A04.AGk(str3, 2112, null, Long.valueOf(iA03), Long.valueOf(jCurrentTimeMillis2), c1938Kv);
            return file;
        } catch (C2875jE e12) {
            this.A04.AGk(strAGk2, 2113, e12.toString(), null, null, c1938Kv3);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e12);
            return null;
        } catch (C2880jJ e13) {
            this.A04.AGk(strAGk, 2119, e13.toString(), null, null, c1938Kv2);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e13);
            return null;
        }
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, -128, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, 18, 18, 3, 11, 14, 18, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, ExifInterface.MARKER_APP1, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, ExifInterface.MARKER_APP1, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, ExifInterface.MARKER_APP1, -18, -89, -12, -96, -14, -27, ExifInterface.MARKER_APP1, -28, -96, ExifInterface.MARKER_APP1, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, 22, 22, 19, 22, -60, 7, 16, 19, 23, 13, 18, 11, -60, 23, 19, 25, 22, 7, 9, ExifInterface.MARKER_EOI, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, 39, 23, 28, 21, -50, 34, 29, -50, 32, 19, 15, 18, -50, ExifInterface.MARKER_APP1, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, ExifInterface.MARKER_APP1, -29, -24, -27, -50, -32, -32, -46, ExifInterface.MARKER_APP1, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[Catch: all -> 0x00c8, PHI: r21
      0x00b5: PHI (r21v2 int) = (r21v0 int), (r21v1 int) binds: [B:26:0x00ac, B:27:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00c8, blocks: (B:25:0x00aa, B:28:0x00b5), top: B:105:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157 A[Catch: L6 -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #13 {L6 -> 0x015f, all -> 0x01c6, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:112:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(android.content.Context r24, com.facebook.ads.redexgen.core.C2879jI r25, java.lang.String r26, int r27, int r28, long r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2884jO.A05(android.content.Context, com.facebook.ads.redexgen.X.jI, java.lang.String, int, int, long):void");
    }

    private void A06(C2879jI c2879jI) {
        try {
            File fileA04 = c2879jI.A04();
            if (fileA04.exists()) {
                c2879jI.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 14) + zDelete);
                }
            }
        } catch (Exception e10) {
            if (A0A[0].length() != 14) {
                throw new RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 18), e10);
            }
        }
    }

    private boolean A07(C2879jI c2879jI) {
        try {
            c2879jI.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (C2875jE e10) {
            if (!this.A08) {
                return false;
            }
            Log.e(A0B, A03(244, 19, 48), e10);
            return false;
        }
    }

    public final <T> C1934Kr<T> A08(C1938Kv c1938Kv, C1941Ky<T> c1941Ky) {
        Semaphore semaphore;
        if (c1941Ky.A03()) {
            File file = this.A06.get(c1938Kv.A09);
            if (file != null) {
                this.A04.AGl(c1938Kv.A09, true, c1938Kv);
                return c1941Ky.A00().A3p(file, this.A04);
            }
            this.A04.AGl(c1938Kv.A09, false, c1938Kv);
            return new C1934Kr<>(false, null);
        }
        String str = c1938Kv.A09;
        String str2 = this.A03.A03(str) + c1938Kv.A04;
        synchronized (this.A07) {
            semaphore = this.A07.get(str2);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(str2, semaphore);
            }
            try {
            } catch (Throwable th2) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(str2);
                    throw th2;
                }
            }
        }
        try {
            semaphore.acquire();
            File fileA02 = A02(c1938Kv, str, str2, this.A01, c1941Ky);
            if (fileA02 != null) {
                C1934Kr<T> c1934KrA3p = c1941Ky.A00().A3p(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(str2);
                }
                return c1934KrA3p;
            }
            C1934Kr<T> c1934Kr = new C1934Kr<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(str2);
            }
            return c1934Kr;
        } catch (InterruptedException unused) {
            if (this.A08) {
                String str3 = A03(97, 11, 52) + str + A03(0, 22, 79);
            }
            C1934Kr<T> c1934Kr2 = new C1934Kr<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(str2);
                return c1934Kr2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1932Kp
    public final C1934Kr<Bitmap> AHu(C1938Kv c1938Kv, boolean z10) {
        return A08(c1938Kv, new C1941Ky(new C2887jR(c1938Kv.A01, c1938Kv.A00, this.A02.A04(), this.A02.A03(), z10)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1932Kp
    public final File AHv(C1938Kv c1938Kv) {
        C1941Ky c1941Ky = new C1941Ky(new C2886jQ());
        c1941Ky.A01(true);
        c1941Ky.A02(false);
        return (File) A08(c1938Kv, c1941Ky).A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1932Kp
    public final String AHw(C1938Kv c1938Kv) {
        return (String) A08(c1938Kv, new C1941Ky(new C2885jP())).A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1932Kp
    public final String AHx(C1938Kv c1938Kv) {
        C1941Ky c1941Ky = new C1941Ky(new C2885jP());
        c1941Ky.A01(true);
        c1941Ky.A02(false);
        return (String) A08(c1938Kv, c1941Ky).A00();
    }
}
