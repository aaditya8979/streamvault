package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class bd extends cz implements cl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f789 = 6453402919862608218L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f790 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f791 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f792 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f793 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f794 = -301922893601565001L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f795;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f796;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f797;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, b> f798;

    public interface b {
        /* JADX INFO: renamed from: ｋ */
        Object mo4815(List<Object> list, ch chVar);
    }

    public bd(String str) {
        this.f796 = str;
    }

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static /* synthetic */ Object m4879(List list, Class cls) {
        int i10 = f793 + 77;
        f792 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5927 = cz.m5927(list, 0, cls);
        int i12 = f792 + 31;
        f793 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return objM5927;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0195  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Class m4880(java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bd.m4880(java.lang.String, boolean):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m4881(bd bdVar) {
        int i10 = f792 + 55;
        int i11 = i10 % 128;
        f793 = i11;
        char c10 = i10 % 2 == 0 ? 'X' : '-';
        String str = bdVar.f797;
        if (c10 == 'X') {
            throw null;
        }
        int i12 = i11 + 99;
        f792 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m4882(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2041) {
            f.f2039 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2040 = 0;
            while (true) {
                int i11 = f.f2040;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f794);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Class m4883(bd bdVar, String str) {
        int i10 = f793 + 125;
        f792 = i10 % 128;
        int i11 = i10 % 2;
        Class clsM4880 = bdVar.m4880(str, false);
        int i12 = f792 + 97;
        f793 = i12 % 128;
        if ((i12 % 2 == 0 ? '4' : '_') != '4') {
            return clsM4880;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4884(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2695) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2697 = 0;
            while (true) {
                int i11 = j.f2697;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2696 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2697;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f789) ^ ((long) f791)) ^ ((long) f790));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m4885() {
        int i10 = f792;
        int i11 = i10 + 81;
        int i12 = i11 % 128;
        f793 = i12;
        int i13 = i11 % 2;
        if ((this.f797 != null ? '6' : '\t') == '6') {
            int i14 = i12 + 81;
            f792 = i14 % 128;
            int i15 = i14 % 2;
            return true;
        }
        int i16 = i10 + 101;
        f793 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public boolean mo4886() {
        int i10 = f793 + 95;
        int i11 = i10 % 128;
        f792 = i11;
        boolean z10 = !(i10 % 2 == 0);
        int i12 = i11 + 23;
        f793 = i12 % 128;
        int i13 = i12 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public boolean mo4887() {
        int i10 = f793;
        int i11 = i10 + 93;
        f792 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 75;
        f792 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return false;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object mo4888(String str, List<Object> list, ch chVar) {
        b bVar = this.f798.get(str);
        try {
        } catch (Exception e10) {
            String str2 = this.f796;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m4882("ᛲ꡴殧⫋\uec01꿢滴‘\ue35aꋭ搨❘\ue692려签㫈\ufdc9뼗纱ㇽ\uf315뉗疡㜽\uf64a覊䬥ੳ춏貚丮", 48817 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            sb2.append(str);
            sb2.append(m4884("괁", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 5119), "⅚雡ៃ妏", (-283108343) - View.MeasureSpec.makeMeasureSpec(0, 0), "क़“\uffefꐓ").intern());
            co.m5699(str2, sb2.toString(), e10);
        }
        if ((bVar != null ? '@' : (char) 17) == '@') {
            Object objMo4815 = bVar.mo4815(list, chVar);
            int i10 = f792 + 9;
            f793 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                return objMo4815;
            }
            int i11 = 33 / 0;
            return objMo4815;
        }
        String str3 = this.f796;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m4882("ᛲ꡴殧⫋\uec01꿢滴‘\ue35aꋭ搨❘\ue692려签㫈\ufdc9뼗纱ㇽ\uf315뉗疡㜽\uf64a覊䬥ੳ춏貚丮", View.MeasureSpec.getMode(0) + 48817).intern());
        sb3.append(str);
        sb3.append(m4882("ᚐ쌆북陻䃾㵴ឝ쀕몋靴䆷㨡ᑇ캘뭞闧乷㣼ᔞ쾔렟銵伡", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54666).intern());
        co.m5699(str3, sb3.toString(), null);
        int i12 = f793 + 3;
        f792 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public abstract Map<String, b> mo4812();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4889(String str) {
        int i10 = f792;
        int i11 = i10 + 43;
        f793 = i11 % 128;
        int i12 = i11 % 2;
        this.f797 = str;
        int i13 = i10 + 103;
        f793 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            int i14 = 97 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo4813();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Class m4890(String str) {
        int i10 = f792 + 73;
        f793 = i10 % 128;
        int i11 = i10 % 2;
        Class clsM4880 = m4880(str, true);
        int i12 = f792 + 29;
        f793 = i12 % 128;
        if ((i12 % 2 == 0 ? 'c' : (char) 11) == 11) {
            return clsM4880;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4891() {
        Map<String, b> mapMo4812 = mo4812();
        this.f798 = mapMo4812;
        mapMo4812.put(m4882("ᛄ껝曝㻜\uf6fe躐䚁ẍ횫湛♷ﹷ뙱万،\ude39阩", View.MeasureSpec.getMode(0) + 47119).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bd.this.m4889((String) bd.m4879(list, String.class));
                return bd.m4881(bd.this);
            }
        });
        this.f798.put(m4884("ਰᰫ骎敇蚁\uf1af앂亟浘踂獒વ罍露䦴즉䕸嬦\ufb0a", (char) (38375 - Color.red(0)), "⅚雡ៃ妏", TextUtils.lastIndexOf("", '0', 0) - 1490347111, "飾⬛\ue7a7▕").intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bd.this.m4885());
            }
        });
        this.f798.put(m4884("认혴\uf0b3뾾鿞氜泄後", (char) TextUtils.indexOf("", "", 0), "⅚雡ៃ妏", KeyEvent.getMaxKeyCode() >> 16, "蘕㛑ݶℍ").intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bd.m4883(bd.this, (String) list.get(0));
            }
        });
        int i10 = f792 + 77;
        f793 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : (char) 18) != 16) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Class m4892(String str) {
        int i10 = f793 + 29;
        f792 = i10 % 128;
        try {
            if (!(i10 % 2 == 0)) {
                Prode.m4317();
                throw null;
            }
            if ((!Prode.m4317() ? (char) 20 : (char) 2) != 20) {
                return mo4814(str);
            }
            Class clsM4880 = m4880(str, false);
            int i11 = f792 + 17;
            f793 = i11 % 128;
            if (i11 % 2 != 0) {
                return clsM4880;
            }
            int i12 = 85 / 0;
            return clsM4880;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000e, B:15:0x0058, B:14:0x0048), top: B:21:0x0001 }] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String m4893() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r6.f795     // Catch: java.lang.Throwable -> L5c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L48
            int r0 = com.ironsource.adqualitysdk.sdk.i.bd.f793     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.bd.f792 = r1     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 % 2
            java.lang.String r0 = r6.f795     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "㕥ሳ턛粗밗茕ꍎ"
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L5c
            int r2 = r2 >> 22
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "⅚雡ៃ妏"
            r4 = 782668984(0x2ea694b8, float:7.575224E-11)
            int r5 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch: java.lang.Throwable -> L5c
            int r5 = r5 >> 16
            int r5 = r5 + r4
            java.lang.String r4 = "렔ꚔȮ툛"
            java.lang.String r1 = m4884(r1, r2, r3, r5, r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L5c
            r1 = 34
            if (r0 == 0) goto L43
            r0 = r1
            goto L45
        L43:
            r0 = 63
        L45:
            if (r0 == r1) goto L48
            goto L58
        L48:
            java.lang.String r0 = r6.mo4813()     // Catch: java.lang.Throwable -> L5c
            r6.f795 = r0     // Catch: java.lang.Throwable -> L5c
            int r0 = com.ironsource.adqualitysdk.sdk.i.bd.f792     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.bd.f793 = r1     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 % 2
        L58:
            java.lang.String r0 = r6.f795     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r6)
            return r0
        L5c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bd.m4893():java.lang.String");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4894(hg hgVar, ch chVar, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hgVar);
            chVar.mo5620(str, arrayList);
            int i10 = f792 + 111;
            f793 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            String str2 = this.f796;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m4882("ᛲ꿪撛㵕\uf279譼䇄ڐ\udfef", (Process.myPid() >> 22) + 47407).intern());
            sb2.append(this);
            co.m5699(str2, sb2.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract Class mo4814(String str);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String mo4895() {
        int i10 = f792 + 87;
        f793 = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f797;
        if (!(str == null)) {
            return str;
        }
        String strM4893 = m4893();
        int i12 = f792 + 117;
        f793 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 17 : '4') == '4') {
            return strM4893;
        }
        throw null;
    }
}
