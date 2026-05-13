package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class eb extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1944 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1945;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1946 = {-535433339, 1266774245, 742894333, 552658682, -675292885, -722953515, -1744068873, 150274977, -2049564166, 1760004588, -619762561, 876300521, 1359149155, -6322137, -65259615, -2124283863, 123822553, -1002492637};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, ed> f1947;

    public eb(Map<String, ed> map, dm dmVar) {
        super(dmVar);
        this.f1947 = new HashMap();
        for (String str : map.keySet()) {
            this.f1947.put(dz.m6209(str), map.get(str));
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6217(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1946.clone();
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

    public final boolean equals(Object obj) {
        if ((this == obj ? 'E' : (char) 4) != 4) {
            int i10 = f1945 + 95;
            f1944 = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (obj != null) {
            int i12 = f1945 + 11;
            f1944 = i12 % 128;
            int i13 = i12 % 2;
            if (!(eb.class != obj.getClass())) {
                eb ebVar = (eb) obj;
                Map<String, ed> map = this.f1947;
                boolean z10 = map != null;
                Map<String, ed> map2 = ebVar.f1947;
                if (!z10) {
                    return map2 == null;
                }
                boolean zEquals = map.equals(map2);
                int i14 = f1945 + 123;
                f1944 = i14 % 128;
                if (i14 % 2 != 0) {
                    return zEquals;
                }
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = f1944;
        int i11 = i10 + 123;
        f1945 = i11 % 128;
        if ((i11 % 2 != 0 ? 'O' : 'U') != 'U') {
            throw null;
        }
        Map<String, ed> map = this.f1947;
        if (!(map == null)) {
            return map.hashCode();
        }
        int i12 = i10 + 7;
        f1945 = i12 % 128;
        int i13 = i12 % 2;
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6217(new int[]{-1888385502, -1857378714}, TextUtils.indexOf("", "", 0) + 1).intern());
        Iterator<String> it = this.f1947.keySet().iterator();
        boolean z10 = true;
        while (true) {
            if (!it.hasNext()) {
                sb2.append(m6217(new int[]{-255083789, 1747221786}, 1 - Color.alpha(0)).intern());
                return sb2.toString();
            }
            int i10 = f1944 + 23;
            f1945 = i10 % 128;
            int i11 = i10 % 2;
            String next = it.next();
            if (!(z10)) {
                sb2.append(m6217(new int[]{886692583, -1828502837}, 2 - View.resolveSizeAndState(0, 0, 0)).intern());
                int i12 = f1944 + 69;
                f1945 = i12 % 128;
                int i13 = i12 % 2;
            }
            sb2.append(m6217(new int[]{-1759312545, -1534420617}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            sb2.append(next);
            sb2.append(m6217(new int[]{-36148881, 1205995355}, 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            sb2.append(this.f1947.get(next));
            z10 = false;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        Iterator<String> it = this.f1947.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                dr drVar = new dr(jSONObjectJsonObjectInit);
                int i10 = f1944 + 1;
                f1945 = i10 % 128;
                int i11 = i10 % 2;
                return drVar;
            }
            String next = it.next();
            try {
                jSONObjectJsonObjectInit.put(next, this.f1947.get(next).m6222(duVar, cqVar).m6165());
                int i12 = f1944 + 35;
                f1945 = i12 % 128;
                int i13 = i12 % 2;
            } catch (JSONException e10) {
                String strM5759 = cqVar.m5759();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6217(new int[]{92075390, -1860197559, -1766919719, -1754077459, 1403379453, -799474343, -499409809, -172455628, -1202287319, 1659874355, -1819237121, -28594077, 919069850, -1651626105}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25).intern());
                sb2.append(m6223());
                co.m5699(strM5759, sb2.toString(), e10);
            }
        }
    }
}
