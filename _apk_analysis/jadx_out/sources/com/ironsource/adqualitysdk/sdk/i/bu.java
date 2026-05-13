package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: loaded from: classes7.dex */
public final class bu extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1063 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1064 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1065 = -494605247435270810L;

    public bu(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5238(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f1065);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m5239(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i10 = f1064 + 119;
        f1063 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m5240(maioAdsListenerInterface);
        if (z10) {
            throw null;
        }
        int i11 = f1063 + 21;
        f1064 = i11 % 128;
        if ((i11 % 2 == 0 ? '2' : '^') != '2') {
            return;
        }
        int i12 = 74 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5240(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i10 = f1064 + 5;
        f1063 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        if (z10) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5238("锕\ued50斴\ufdd2瑋첐䓻\udf62垚꿾☔뺞㛱褥Ɖ駕ဳ梗", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30803).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bu.m5239((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        int i10 = f1063 + 111;
        f1064 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f1064 + 27;
        f1063 = i10 % 128;
        int i11 = i10 % 2;
        String sdkVersion = MaioAds.getSdkVersion();
        int i12 = f1063 + 101;
        f1064 = i12 % 128;
        int i13 = i12 % 2;
        return sdkVersion;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bu.mo4814(java.lang.String):java.lang.Class");
    }
}
