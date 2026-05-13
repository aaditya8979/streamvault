package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2194Uw implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ SQ A00;
    public final /* synthetic */ C2197Uz A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public RunnableC2194Uw(C2197Uz c2197Uz, String str, SQ sq2) {
        this.A01 = c2197Uz;
        this.A02 = str;
        this.A00 = sq2;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, ExifInterface.MARKER_EOI, -35, -51, -37, -36, -57, -47, -52};
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<C2196Uy> arrayList;
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            C2143Sw c2143Sw = new C2143Sw(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            for (C2196Uy c2196Uy : arrayList) {
                jSONArray.put(A00(0, 0, 23) + c2196Uy.A00 + ';' + c2196Uy.A02 + ';' + c2196Uy.A01);
            }
            c2143Sw.A07(jSONObject);
            c2143Sw.A05(1);
            this.A00.A08().AAz(A00(10, 9, 117), AbstractC2142Sv.A2R, c2143Sw);
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
