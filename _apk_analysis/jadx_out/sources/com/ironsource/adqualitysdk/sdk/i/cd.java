package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media.AudioAttributesCompat;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class cd extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1275 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1276 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1277 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1278 = 37669;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1279 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1280 = 176;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1281;

    public cd(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m5535() {
        Iterator<Field> it;
        String str;
        int i10 = f1276 + 117;
        f1275 = i10 % 128;
        int i11 = i10 % 2;
        Class clsM5536 = m5536();
        hu.m6425().m6428();
        try {
            it = hu.m6425().m6428().m6377(clsM5536, hq.m6372().m6363(String.class).m6362(8).m6361(16).m6364()).iterator();
            int i12 = f1275 + 121;
            f1276 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception unused) {
        }
        do {
            if ((it.hasNext() ? '\\' : ')') != ')') {
                str = (String) it.next().get(null);
                if ((!str.startsWith(m5541("菀뾮ऌ\ude59᫁‽㻊♖拫㰽읦衻", (char) Color.red(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getFadingEdgeLength() >> 16, "㗷ོ禌圙").intern()) ? 'W' : '2') == '2') {
                    break;
                }
            } else {
                int i14 = f1276 + 47;
                f1275 = i14 % 128;
                int i15 = i14 % 2;
            }
            return null;
        } while (!str.startsWith(m5541("邳릺撶⛭攃ᴃ\ue093优쯮鳘뻔", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), "\u0000\u0000\u0000\u0000", 1474229890 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "脆\udef6蕗较").intern()));
        return str.split(m5542("\u0000", AndroidCharacter.getMirror('0') - '/', false, 1 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 236).intern())[0];
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Class m5536() {
        int i10 = f1275 + 17;
        f1276 = i10 % 128;
        if ((i10 % 2 == 0 ? '\n' : 'K') != '\n') {
            return VungleApiClient.class;
        }
        int i11 = 40 / 0;
        return VungleApiClient.class;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Map<String, String> m5537(Advertisement advertisement) {
        int i10 = f1276 + 29;
        f1275 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> downloadableUrls = advertisement.getDownloadableUrls();
        int i12 = f1275 + 11;
        f1276 = i12 % 128;
        int i13 = i12 % 2;
        return downloadableUrls;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m5538(Advertisement advertisement) {
        int i10 = f1275 + 7;
        f1276 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> mapM5537 = m5537(advertisement);
        int i12 = f1275 + 47;
        f1276 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return mapM5537;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Placement m5539(Repository repository, String str) {
        int i10 = f1275 + 47;
        f1276 = i10 % 128;
        int i11 = i10 % 2;
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        int i12 = f1276 + 95;
        f1275 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return placement;
        }
        int i13 = 75 / 0;
        return placement;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5540(Advertisement advertisement) {
        int i10 = f1276 + 107;
        f1275 = i10 % 128;
        int i11 = i10 % 2;
        String strM5547 = m5547(advertisement);
        int i12 = f1275 + 117;
        f1276 = i12 % 128;
        int i13 = i12 % 2;
        return strM5547;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5541(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1279) ^ ((long) f1277)) ^ ((long) f1278));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5542(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f728) {
            char[] cArr2 = new char[i10];
            b.f726 = 0;
            while (true) {
                int i13 = b.f726;
                if (i13 >= i10) {
                    break;
                }
                b.f727 = cArr[i13];
                cArr2[b.f726] = (char) (b.f727 + i12);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f1280);
                b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i17 = b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5543(Advertisement advertisement) {
        int i10 = f1276 + 13;
        f1275 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String campaign = advertisement.getCampaign();
        if (!z10) {
            int i11 = 37 / 0;
        }
        int i12 = f1275 + 59;
        f1276 = i12 % 128;
        int i13 = i12 % 2;
        return campaign;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5544(Placement placement) {
        int i10 = f1276 + 65;
        f1275 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM5548 = m5548(placement);
        int i12 = f1276 + 75;
        f1275 = i12 % 128;
        int i13 = i12 % 2;
        return zM5548;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5545(Advertisement advertisement) {
        int i10 = f1276 + 17;
        f1275 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String strM5543 = m5543(advertisement);
        if (z10) {
            int i11 = 95 / 0;
        }
        return strM5543;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Placement m5546(Repository repository, String str) {
        int i10 = f1275 + 69;
        f1276 = i10 % 128;
        int i11 = i10 % 2;
        Placement placementM5539 = m5539(repository, str);
        int i12 = f1276 + 109;
        f1275 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return placementM5539;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5547(Advertisement advertisement) {
        int i10 = f1275 + 19;
        f1276 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            advertisement.getAdMarketId();
            throw null;
        }
        String adMarketId = advertisement.getAdMarketId();
        int i11 = f1276 + 31;
        f1275 = i11 % 128;
        int i12 = i11 % 2;
        return adMarketId;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5548(Placement placement) {
        int i10 = f1275 + 101;
        f1276 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '8' : ')';
        boolean zIsIncentivized = placement.isIncentivized();
        if (c10 == '8') {
            int i11 = 60 / 0;
        }
        int i12 = f1275 + 37;
        f1276 = i12 % 128;
        int i13 = i12 % 2;
        return zIsIncentivized;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5541("⋧Ⓔټ횠㜣錤졚\uec9b茅❙呵ᗄ", (char) (KeyEvent.getMaxKeyCode() >> 16), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "Ꭿ㻗滶뵽").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cd.m5546((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m5542("￠\n\u0000\ufffb￼\u0011\u0000\r\u0000\u000b\u0005￼\ufffa\u0005", ExpandableListView.getPackedPositionChild(0L) + 15, true, 3 - Gravity.getAbsoluteGravity(0, 0), 329 - AndroidCharacter.getMirror('0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(cd.m5544((Placement) list.get(0)));
            }
        });
        map.put(m5542("￠\u0013\u0004\u0006\u0003￨\u0013\u0004\n\u0011\u0000￬\u0003", Color.rgb(0, 0, 0) + 16777229, true, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.getDefaultSize(0, 0) + AudioAttributesCompat.FLAG_ALL_PUBLIC).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cd.m5540((Advertisement) list.get(0));
            }
        });
        map.put(m5542("￼\uffde\u000f\u0000\u0002\t\u0002\u0004￼\u000b\b", (ViewConfiguration.getEdgeSlop() >> 16) + 11, true, 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 276 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cd.m5545((Advertisement) list.get(0));
            }
        });
        map.put(m5542("\u0005\b\ufffa�\ufffa\ufffb\u0005\ufffe￮\u000b\u0005\f\u0000\ufffe\r\uffdd\b\u0010\u0007", 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, ImageFormat.getBitsPerPixel(0) + 13, 279 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cd.m5538((Advertisement) list.get(0));
            }
        });
        int i10 = f1276 + 11;
        f1275 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return map;
        }
        int i11 = 70 / 0;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        String strMo4895 = mo4895();
        if ((strMo4895 != null ? (char) 7 : ']') == 7) {
            int i10 = f1275 + 55;
            f1276 = i10 % 128;
            return !(i10 % 2 != 0) ? strMo4895.split(m5542("\u0000", 1 % (KeyEvent.getMaxKeyCode() * 50), true, Color.alpha(0) + 0, 26994 >>> Color.blue(1)).intern())[0] : strMo4895.split(m5542("\u0000", (KeyEvent.getMaxKeyCode() >> 16) + 1, false, Color.alpha(0) + 1, 223 - Color.blue(0)).intern())[1];
        }
        int i11 = f1276 + 61;
        f1275 = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01e6  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cd.mo4814(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo4895() {
        if (this.f1281 == null) {
            int i10 = f1276 + 93;
            f1275 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                String strM5535 = m5535();
                this.f1281 = strM5535;
                m4889(strM5535);
                throw null;
            }
            String strM55352 = m5535();
            this.f1281 = strM55352;
            m4889(strM55352);
            int i11 = f1276 + 99;
            f1275 = i11 % 128;
            int i12 = i11 % 2;
        }
        return this.f1281;
    }
}
