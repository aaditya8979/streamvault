package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.i.jz;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jn {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jn f2855;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, e> f2856 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2857 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, e> f2858;

    public enum e {
        f2871,
        f2869,
        f2870;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2862 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2863;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f2864;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f2865;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f2866;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2867;

        static {
            m6772();
            int i10 = f2862 + 47;
            f2863 = i10 % 128;
            if ((i10 % 2 != 0 ? '0' : '#') != '#') {
                int i11 = 19 / 0;
            }
        }

        public static e valueOf(String str) {
            int i10 = f2863 + 33;
            f2862 = i10 % 128;
            int i11 = i10 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            int i12 = f2862 + 117;
            f2863 = i12 % 128;
            int i13 = i12 % 2;
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() throws CloneNotSupportedException {
            int i10 = f2863 + 21;
            f2862 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 30 : '9') == 30) {
                values().clone();
                throw null;
            }
            e[] eVarArr = (e[]) values().clone();
            int i11 = f2863 + 19;
            f2862 = i11 % 128;
            int i12 = i11 % 2;
            return eVarArr;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static void m6772() {
            f2866 = (char) 41656;
            f2865 = (char) 41873;
            f2864 = (char) 18113;
            f2867 = (char) 2664;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.ironsource.adqualitysdk.sdk.i.jn.e m6773(java.lang.String r7) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jn.e.m6773(java.lang.String):com.ironsource.adqualitysdk.sdk.i.jn$e");
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m6774(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2866)) ^ ((c11 >>> 5) + f2864)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2865) ^ ((c12 + i12) ^ ((c12 << 4) + f2867))));
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
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jn m6764() {
        if (f2855 == null) {
            f2855 = new jn();
        }
        return f2855;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized Map<String, e> m6765() {
        return new HashMap(this.f2856);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized Map<String, e> m6766() {
        if (this.f2858 == null) {
            this.f2858 = new HashMap();
            JSONObject jSONObjectMo4569 = ar.m4559().mo4569();
            if (jSONObjectMo4569 != null) {
                this.f2858 = jz.m6873(jSONObjectMo4569, new jz.c<e>() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                    /* JADX INFO: renamed from: ﻛ */
                    public final /* synthetic */ e mo4625(JSONObject jSONObject, String str) {
                        return e.m6773(jSONObject.optString(str));
                    }
                });
            }
        }
        return this.f2858;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized e m6768(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m6765().containsKey(name)) {
                return m6765().get(name);
            }
            if (m6766().containsKey(name)) {
                return m6766().get(name);
            }
        }
        return e.m6773(ar.m4559().mo4565());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m6769(final String str, final e eVar) {
        this.f2857.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                synchronized (jn.this) {
                    jn.this.f2856.put(str, eVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m6770(Activity activity) {
        return e.f2869 == m6768(activity);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m6771(Activity activity) {
        return e.f2870 == m6768(activity);
    }
}
