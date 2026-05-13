package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2502ct extends AbstractC2124Sd {
    public static byte[] A00;
    public static String[] A01 = {"S72iqLUHJq0HxavSC6ufHzOfLzRtkhG1", "2e23vyAJ1VfrYECWW2PuMy9", "U", "BHx2UoB4woyKjmRGK8g7VJyuwo8iE1MX", "2k4S21J4fALKY04XcYptMZ4CnaCsWgOl", "PftoDMjSF3TujDQXHZcKzxMpxF8wabcx", "G9sGcewQNY3LQ1dDEReskE69oTmTF8fU", "WiiYP1Z6q1ZZMC28sRcL9b9"};
    public static final SX A02;
    public static final SX A03;
    public static final SX A04;
    public static final SX A05;
    public static final SX A06;
    public static final SX A07;
    public static final SX A08;
    public static final SX A09;
    public static final SX A0A;
    public static final SX[] A0B;
    public static final String A0C;

    static {
        A04();
        A04 = new SX(0, A00(159, 8, 1), A00(73, 16, 127));
        A09 = new SX(1, A00(207, 8, 26), A00(89, 59, 108));
        String strA00 = A00(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 8, 4);
        String strA002 = A00(4, 7, 4);
        A05 = new SX(2, strA00, strA002);
        String strA003 = A00(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 4, 8);
        String strA004 = A00(69, 4, 116);
        A0A = new SX(3, strA003, strA004);
        String strA005 = A00(203, 4, 34);
        String strA006 = A00(11, 4, 88);
        A08 = new SX(4, strA005, strA006);
        A07 = new SX(5, A00(191, 12, 31), strA006);
        A06 = new SX(6, A00(181, 10, 87), strA004);
        A03 = new SX(7, A00(155, 4, 103), strA004);
        A02 = new SX(8, A00(148, 7, 8), strA002);
        A0B = new SX[]{A04, A09, A05, A0A, A08, A07, A06, A03, A02};
        A0C = AbstractC2124Sd.A02(A00(167, 6, 97), A0B);
    }

    public C2502ct(SZ sz) {
        super(sz);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-104, -75, -104, -73, -102, -97, -91, -106, -104, -106, -93, -9, -22, -26, -15, -47, -61, -54, -61, -63, -46, -98, -88, -98, -60, -48, -51, -53, -98, -29, -12, -29, -20, -14, -15, -98, -43, -58, -61, -48, -61, -98, -29, -43, -36, -43, -45, -28, -80, -13, -1, 5, -2, 4, -72, -70, -71, -80, -42, -30, -33, -35, -80, -11, 6, -11, -2, 4, 3, 21, 6, 25, 21, 32, 17, 36, 32, -20, 28, 30, 21, 25, 13, 30, 37, -20, 23, 17, 37, 13, -2, 17, 13, ExifInterface.MARKER_EOI, 11, -2, -1, -2, 11, -2, 7, -4, -2, 12, ExifInterface.MARKER_EOI, 45, 40, 36, 30, 39, 44, ExifInterface.MARKER_EOI, 8, 7, ExifInterface.MARKER_EOI, 14, 9, -3, -6, 13, -2, ExifInterface.MARKER_EOI, -4, -6, 12, -4, -6, -3, -2, ExifInterface.MARKER_EOI, 8, 7, ExifInterface.MARKER_EOI, -3, -2, 5, -2, 13, -2, ExifInterface.MARKER_EOI, 11, -2, 12, 13, 11, 2, -4, 13, -74, -55, -55, -70, -62, -59, -55, 24, 21, 40, 21, -77, -60, -77, -68, -62, -83, -73, -78, 19, 36, 19, 28, 34, 33, -63, -61, -70, -64, -61, -70, -59, -54, 23, 9, 23, 23, 13, 19, 18, 3, 13, 8, -33, -47, -33, -33, -43, -37, -38, -53, -32, -43, ExifInterface.MARKER_EOI, -47, -29, -40, -36, -44, -37, -42, -46, -52, -43, -58, -48, -53, -55, -50, -59, -70};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2124Sd
    public final String A06() {
        return A00(167, 6, 97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2124Sd
    public final SX[] A0A() {
        return A0B;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A00(42, 27, 67), null);
    }

    public final Cursor A0C() {
        return A05().rawQuery(A0C, null);
    }

    public final Cursor A0D(String str) {
        return A05().rawQuery(A00(15, 27, 49) + A04.A01 + A00(0, 4, 43), new String[]{str});
    }

    public final String A0E(String str, int i10, String str2, double d10, double d11, String str3, Map<String, String> map) throws SQLiteException {
        String string = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        contentValues.put(A04.A01, string);
        contentValues.put(A09.A01, str);
        contentValues.put(A05.A01, Integer.valueOf(i10));
        contentValues.put(A0A.A01, str2);
        contentValues.put(A08.A01, Double.valueOf(d10));
        contentValues.put(A07.A01, Double.valueOf(d11));
        contentValues.put(A06.A01, str3);
        contentValues.put(A03.A01, map != null ? new JSONObject(map).toString() : null);
        String str4 = A02.A01;
        String[] strArr = A01;
        if (strArr[5].charAt(26) != strArr[3].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "LHixrdeQ9nvdAu8uzIal1NDup18dDyzZ";
        strArr2[3] = "Oc0hVPeTX1hGgtg7NBB4ZrhrOq8xlSVE";
        contentValues.put(str4, (Integer) 0);
        A05().insertOrThrow(A00(167, 6, 97), null, contentValues);
        return string;
    }

    public final boolean A0F(String str) {
        return A05().delete(A00(167, 6, 97), new StringBuilder().append(A04.A01).append(A00(0, 4, 43)).toString(), new String[]{str}) > 0;
    }
}
