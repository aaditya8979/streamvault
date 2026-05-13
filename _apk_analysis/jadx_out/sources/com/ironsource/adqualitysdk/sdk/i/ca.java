package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import io.presage.Presage;
import io.presage.common.PresageSdk;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ca extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1216 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1217 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1218 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1219 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1220 = 4437560584879617831L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1221 = 792353447269362345L;

    public ca(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Presage m5442() {
        int i10 = f1216 + 81;
        f1219 = i10 % 128;
        if (i10 % 2 == 0) {
            return Presage.getInstance();
        }
        int i11 = 12 / 0;
        return Presage.getInstance();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Presage m5443() {
        Presage presageM5442;
        int i10 = f1219 + 31;
        f1216 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            presageM5442 = m5442();
            int i11 = 91 / 0;
        } else {
            presageM5442 = m5442();
        }
        int i12 = f1216 + 33;
        f1219 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return presageM5442;
        }
        int i13 = 58 / 0;
        return presageM5442;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5444(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1220) ^ ((long) f1218)) ^ ((long) f1217));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5445(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i10 = f1216 + 23;
        f1219 = i10 % 128;
        int i11 = i10 % 2;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        int i12 = f1216 + 21;
        f1219 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5446(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f1221);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m5447(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i10 = f1216 + 85;
        f1219 = i10 % 128;
        int i11 = i10 % 2;
        m5449(presageOptinVideo, presageOptinVideoCallback);
        int i12 = f1216 + 9;
        f1219 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m5448(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i10 = f1216 + 3;
        f1219 = i10 % 128;
        int i11 = i10 % 2;
        m5445(presageInterstitial, presageInterstitialCallback);
        int i12 = f1219 + 107;
        f1216 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m5449(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i10 = f1219 + 57;
        f1216 = i10 % 128;
        int i11 = i10 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        int i12 = f1219 + 73;
        f1216 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5444("ț믐銻祍㼱ㅥኳ萺䇂ᢼ礛Ώ⚡련ໄᤁ\ue2a8\udd0a", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65132), "㜧㬆懗㶕", Color.argb(0, 0, 0, 0), "仑㻓涟擾").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return ca.m5443();
            }
        });
        map.put(m5446("\ueada虣㎃곭塻\uf5b6曖ሒ辢㣺퐖䅘\uf2f4渫᭗뒫‸\udd5a事喝靤\u0091뷈", 27823 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                ca.m5448((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m5444("蔉朼鼞↢鞛祛\uf755଼쎵鶦섊㲑╺涁뭂섍없셶맡\ue830梫", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "㜧㬆懗㶕", ((byte) KeyEvent.getModifierMetaStateMask()) - 1725439885, "爙⟠抙ಲ").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                ca.m5447((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i10 = f1219 + 31;
        f1216 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if ((r0 != null ? 'Q' : '`') != 'Q') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if ((r0 != null ? 0 : 'b') != 'b') goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ca.f1216 + 15;
        com.ironsource.adqualitysdk.sdk.i.ca.f1219 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        return r0.split(m5446("\uea84", 14243 - android.view.KeyEvent.normalizeMetaState(0)).intern())[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ca.f1216 + 117;
        com.ironsource.adqualitysdk.sdk.i.ca.f1219 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if ((r1 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r1 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        return null;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo4813() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ca.f1219
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1216 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == r1) goto L22
            java.lang.String r0 = r4.mo4895()
            r1 = 81
            if (r0 == 0) goto L1d
            r3 = r1
            goto L1f
        L1d:
            r3 = 96
        L1f:
            if (r3 == r1) goto L32
            goto L53
        L22:
            java.lang.String r0 = r4.mo4895()
            r1 = 92
            int r1 = r1 / r2
            r1 = 98
            if (r0 == 0) goto L2f
            r3 = r2
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == r1) goto L53
        L32:
            int r1 = com.ironsource.adqualitysdk.sdk.i.ca.f1216
            int r1 = r1 + 15
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1219 = r3
            int r1 = r1 % 2
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            int r1 = 14243 - r1
            java.lang.String r3 = "\uea84"
            java.lang.String r1 = m5446(r3, r1)
            java.lang.String r1 = r1.intern()
            java.lang.String[] r0 = r0.split(r1)
            r0 = r0[r2]
            return r0
        L53:
            r0 = 0
            int r1 = com.ironsource.adqualitysdk.sdk.i.ca.f1216
            int r1 = r1 + 117
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1219 = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L66
            r1 = 51
            int r1 = r1 / r2
            return r0
        L64:
            r0 = move-exception
            throw r0
        L66:
            return r0
        L67:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.mo4813():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.mo4814(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo4895() {
        int i10 = f1219 + 51;
        f1216 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                String str = (String) Class.forName(m5446("\ueac0\uef97\ue025\ue52aﾟ\uf059\uf53c쿿쁆씕\udfad킱픊꿙ꂪꕹ뿗냦땲迌胓蕚鸾邍镙渥惡敋縛烠疢与䃨䖭帟僾喢\u2e69\u20cd▍㹌㌿㖍ๆ̡כṕ", 1361 - View.resolveSize(0, 0)).intern()).getMethod(m5446("\ueac8", 22469 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new Class[0]).invoke(null, new Object[0]);
                int i12 = f1216 + 57;
                f1219 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                return str;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }
}
