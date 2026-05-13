package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ja {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2698 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2699 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2700 = 4;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2701 = {'C', 'a', 'c', 'h', 'e', 'S', 't', 'o', 'r', 'g', ' ', '(', ')', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final je f2702;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f2703;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f2704;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f2705;

    public interface a {
        /* JADX INFO: renamed from: ﾒ */
        void mo4465(List<jb> list);
    }

    public interface d {
        /* JADX INFO: renamed from: ﻐ */
        void mo4462(int i10);
    }

    public ja(String str, String str2, je jeVar) {
        this(str, str2, jeVar, (byte) 0);
    }

    private ja(String str, String str2, je jeVar, byte b10) {
        this.f2705 = str2;
        this.f2704 = 10000;
        this.f2703 = str;
        this.f2702 = jeVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m6654(ja jaVar, String str) {
        int i10 = f2698 + 9;
        f2699 = i10 % 128;
        int i11 = i10 % 2;
        String strM6660 = jaVar.m6660(str);
        int i12 = f2698 + 85;
        f2699 = i12 % 128;
        int i13 = i12 % 2;
        return strM6660;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static jb m6655(JSONObject jSONObject) {
        jb jbVar = new jb(jSONObject);
        int i10 = f2699 + 69;
        f2698 = i10 % 128;
        int i11 = i10 % 2;
        return jbVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m6656() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6658("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\t\u0000\b\u0005\u000b\b", 14 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (96 - TextUtils.indexOf("", ""))).intern());
        sb2.append(this.f2703);
        sb2.append(m6658("\u009a", 1 - View.resolveSizeAndState(0, 0, 0), (byte) (113 - TextUtils.getTrimmedLength(""))).intern());
        String string = sb2.toString();
        int i10 = f2699 + 121;
        f2698 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m6657(ja jaVar) {
        int i10 = f2699 + 9;
        f2698 = i10 % 128;
        int i11 = i10 % 2;
        String strM6656 = jaVar.m6656();
        int i12 = f2698 + 37;
        f2699 = i12 % 128;
        int i13 = i12 % 2;
        return strM6656;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6658(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f2701;
            char c10 = f2700;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2156 = 0;
                while (true) {
                    int i11 = g.f2156;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2155 = cArr[i11];
                    g.f2153 = cArr[g.f2156 + 1];
                    if (g.f2155 == g.f2153) {
                        cArr3[g.f2156] = (char) (g.f2155 - b10);
                        cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                    } else {
                        g.f2154 = g.f2155 / c10;
                        g.f2152 = g.f2155 % c10;
                        g.f2157 = g.f2153 / c10;
                        g.f2150 = g.f2153 % c10;
                        if (g.f2152 == g.f2150) {
                            g.f2154 = ((g.f2154 + c10) - 1) % c10;
                            g.f2157 = ((g.f2157 + c10) - 1) % c10;
                            int i12 = (g.f2154 * c10) + g.f2152;
                            int i13 = (g.f2157 * c10) + g.f2150;
                            int i14 = g.f2156;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2154 == g.f2157) {
                            g.f2152 = ((g.f2152 + c10) - 1) % c10;
                            g.f2150 = ((g.f2150 + c10) - 1) % c10;
                            int i15 = (g.f2154 * c10) + g.f2152;
                            int i16 = (g.f2157 * c10) + g.f2150;
                            int i17 = g.f2156;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2154 * c10) + g.f2150;
                            int i19 = (g.f2157 * c10) + g.f2152;
                            int i20 = g.f2156;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2156 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6659(jb jbVar) {
        int i10 = f2698 + 87;
        f2699 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String strM6660 = m6660(jbVar.m6672());
        if (!z10) {
            int i11 = 43 / 0;
        }
        int i12 = f2698 + 103;
        f2699 = i12 % 128;
        int i13 = i12 % 2;
        return strM6660;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6660(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2705);
        sb2.append(str);
        String string = sb2.toString();
        int i10 = f2699 + 29;
        f2698 = i10 % 128;
        if ((i10 % 2 != 0 ? '!' : 'W') == 'W') {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m6661(ja jaVar) {
        int i10 = f2699 + 43;
        f2698 = i10 % 128;
        return i10 % 2 != 0 ? 26738 : 10000;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ je m6662(ja jaVar) {
        int i10 = f2698 + 125;
        int i11 = i10 % 128;
        f2699 = i11;
        char c10 = i10 % 2 == 0 ? '3' : 'D';
        je jeVar = jaVar.f2702;
        if (c10 == '3') {
            throw null;
        }
        int i12 = i11 + 45;
        f2698 = i12 % 128;
        int i13 = i12 % 2;
        return jeVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m6663(ja jaVar, jb jbVar) {
        int i10 = f2698 + 81;
        f2699 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String strM6659 = jaVar.m6659(jbVar);
        if (z10) {
            int i11 = 66 / 0;
        }
        return strM6659;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6664(final int i10, final a aVar) {
        je.m6706().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2726 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2727 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f2728 = 5;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f2729 = {'*', 'p', 'o', 's', 't', 'D', 'a', 'u', 'i', 'd', 'C', 'c', 'h', 'e', 'S', 'r', 'g', 'l', 'n', '\'', ' ', 'v', '.', ':', '+'};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m6670(String str, int i11, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2151) {
                    char[] cArr2 = f2729;
                    char c10 = f2728;
                    char[] cArr3 = new char[i11];
                    if (i11 % 2 != 0) {
                        i11--;
                        cArr3[i11] = (char) (cArr[i11] - b10);
                    }
                    if (i11 > 1) {
                        g.f2156 = 0;
                        while (true) {
                            int i12 = g.f2156;
                            if (i12 >= i11) {
                                break;
                            }
                            g.f2155 = cArr[i12];
                            g.f2153 = cArr[g.f2156 + 1];
                            if (g.f2155 == g.f2153) {
                                cArr3[g.f2156] = (char) (g.f2155 - b10);
                                cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                            } else {
                                g.f2154 = g.f2155 / c10;
                                g.f2152 = g.f2155 % c10;
                                g.f2157 = g.f2153 / c10;
                                g.f2150 = g.f2153 % c10;
                                if (g.f2152 == g.f2150) {
                                    g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                    g.f2157 = ((g.f2157 + c10) - 1) % c10;
                                    int i13 = (g.f2154 * c10) + g.f2152;
                                    int i14 = (g.f2157 * c10) + g.f2150;
                                    int i15 = g.f2156;
                                    cArr3[i15] = cArr2[i13];
                                    cArr3[i15 + 1] = cArr2[i14];
                                } else if (g.f2154 == g.f2157) {
                                    g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                    g.f2150 = ((g.f2150 + c10) - 1) % c10;
                                    int i16 = (g.f2154 * c10) + g.f2152;
                                    int i17 = (g.f2157 * c10) + g.f2150;
                                    int i18 = g.f2156;
                                    cArr3[i18] = cArr2[i16];
                                    cArr3[i18 + 1] = cArr2[i17];
                                } else {
                                    int i19 = (g.f2154 * c10) + g.f2150;
                                    int i20 = (g.f2157 * c10) + g.f2152;
                                    int i21 = g.f2156;
                                    cArr3[i21] = cArr2[i19];
                                    cArr3[i21 + 1] = cArr2[i20];
                                }
                            }
                            g.f2156 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﻛ */
            public final void mo4716(Throwable th2) {
                super.mo4716(th2);
                t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        aVar.mo4465(new ArrayList());
                    }
                });
                int i11 = f2727 + 49;
                f2726 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                final ArrayList arrayList = new ArrayList();
                for (String str : ja.m6662(ja.this).m6716(ja.m6654(ja.this, m6670(C3978d4.j.f31383d, -ExpandableListView.getPackedPositionChild(0L), (byte) (ExpandableListView.getPackedPositionChild(0L) + 50)).intern()), i10).values()) {
                    try {
                        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                        arrayList.add(new jb(jSONObjectJsonObjectInit.getJSONObject(m6670("\u0002\u0003\u0004\u0000\u0006\u0007\u0001\t", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, (byte) (View.getDefaultSize(0, 0) + 79)).intern()), jSONObjectJsonObjectInit.optString(m6670("ÅÅ\t\u0005", View.getDefaultSize(0, 0) + 4, (byte) (79 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())));
                        int i11 = f2726 + 69;
                        f2727 = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Exception unused) {
                        String strM6657 = ja.m6657(ja.this);
                        String strIntern = m6670("\u000b\u0005\f\r\u000e\n\u0000\u0003\u0010\u0005\u0012\u000b", 12 - Color.red(0), (byte) (TextUtils.getTrimmedLength("") + 51)).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m6670("\f\u0000\f\u0016\b\u0013\u0018\t\u0015\n\u0012\n\t\u0001\n\u0017\u0010\u000b\f\r\u000e\b\u0017\n\u0017\u000b\u0013\u0003\u0017\u0015\u0004\u0000\u0012\u0005\u0013\u0011\u0015\u0016\u0007\u0010\b\f\u0018\u0015", 44 - ExpandableListView.getPackedPositionGroup(0L), (byte) (3 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern());
                        sb2.append(str);
                        k.m6891(strM6657, strIntern, sb2.toString(), true);
                    }
                }
                t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        aVar.mo4465(arrayList);
                    }
                });
                int i13 = f2727 + 73;
                f2726 = i13 % 128;
                int i14 = i13 % 2;
            }
        });
        int i11 = f2699 + 91;
        f2698 = i11 % 128;
        if ((i11 % 2 != 0 ? 'J' : '$') == '$') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6665(final d dVar) {
        je.m6706().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2706 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f2707 = -6446053649878059917L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f2708 = {'*'};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2709;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m6668(int i10, char c10, int i11) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1675) {
                    char[] cArr = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.d.f1674 = 0;
                    while (true) {
                        int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1674;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f2708[i10 + i12]) ^ (((long) i12) * f2707)) ^ ((long) c10));
                            com.ironsource.adqualitysdk.sdk.i.d.f1674 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                }
                return str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                final int iM6715 = ja.m6662(ja.this).m6715(ja.m6654(ja.this, m6668(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), -TextUtils.lastIndexOf("", '0', 0)).intern()));
                t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        dVar.mo4462(iM6715);
                    }
                });
                int i10 = f2709 + 105;
                f2706 = i10 % 128;
                int i11 = i10 % 2;
            }
        });
        int i10 = f2698 + 17;
        f2699 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6666(final jb jbVar, final ir irVar) {
        je.m6706().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.2

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static short[] f2714 = null;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static byte[] f2715 = {-77, -66, 98, 106, 83, 103, 95, -123, 82, 97, 105, 102, -126, -33, -67, -86, -89, -76, -97, -5, 90, -81, -75, -14, 83, -64, -90, -9, 103, -86, -78, -101, -81, -89, -83, -1, 88, -69, -86, -13, 88, -7, 101, -71, -54, -49, -85, 105, -81, -85, -18, 89, -74, -11, 89, -74, -83, -64, -63, 8, 83, 64, 61, 74, 53, -111, -5, 59, 71, 67, 71, 68, 96};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2716 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f2717 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2718 = 983354943;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2719 = 78;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f2720 = 541533712;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m6669(int i10, short s10, int i11, byte b10, int i12) {
                String string;
                synchronized (o.f3015) {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2719;
                    int i14 = i12 + i13;
                    boolean z10 = i14 == -1;
                    if (z10) {
                        byte[] bArr = f2715;
                        i14 = bArr != null ? (byte) (bArr[f2720 + i10] + i13) : (short) (f2714[f2720 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f3016 = ((i10 + i14) - 2) + f2720 + (z10 ? 1 : 0);
                        o.f3017 = b10;
                        char c10 = (char) (i11 + f2718);
                        o.f3019 = c10;
                        sb2.append(c10);
                        o.f3018 = o.f3019;
                        o.f3020 = 1;
                        while (o.f3020 < i14) {
                            byte[] bArr2 = f2715;
                            if (bArr2 != null) {
                                int i15 = o.f3016;
                                o.f3016 = i15 - 1;
                                o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                            } else {
                                short[] sArr = f2714;
                                int i16 = o.f3016;
                                o.f3016 = i16 - 1;
                                o.f3019 = (char) (o.f3018 + (((short) (sArr[i16] + s10)) ^ o.f3017));
                            }
                            sb2.append(o.f3019);
                            o.f3018 = o.f3019;
                            o.f3020++;
                        }
                    }
                    string = sb2.toString();
                }
                return string;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                int i10 = f2717 + 27;
                f2716 = i10 % 128;
                int i11 = i10 % 2;
                if (ja.m6662(ja.this).m6715(ja.m6654(ja.this, m6669((-558310928) - Color.rgb(0, 0, 0), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + (-40)), (-983354902) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + (-79)).intern())) <= ja.m6661(ja.this)) {
                    String strM6663 = ja.m6663(ja.this, jbVar);
                    if (TextUtils.isEmpty(strM6663)) {
                        int i12 = f2716 + 47;
                        f2717 = i12 % 128;
                        int i13 = i12 % 2;
                        k.m6891(ja.m6657(ja.this), m6669(KeyEvent.normalizeMetaState(0) - 541533711, (short) ((-100) - (Process.myTid() >> 22)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 983354877, (byte) KeyEvent.getDeadChar(0, 0), Drawable.resolveOpacity(0, 0) - 79).intern(), m6669((-541533699) - ExpandableListView.getPackedPositionType(0L), (short) (View.resolveSize(0, 0) + 84), (-983354859) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) KeyEvent.keyCodeFromString(""), View.resolveSize(0, 0) - 79).intern(), true);
                        return;
                    }
                    try {
                        String string = jbVar.m6674().toString();
                        int i14 = f2716 + 107;
                        f2717 = i14 % 128;
                        int i15 = i14 % 2;
                        k.m6899(ja.m6657(ja.this), m6669((-541533711) - TextUtils.indexOf("", "", 0), (short) (TextUtils.indexOf("", "", 0) - 100), (-983354876) - Color.alpha(0), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 79).intern(), m6669((-541533654) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((-66) - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) - 983354876, (byte) Color.blue(0), (-79) - (KeyEvent.getMaxKeyCode() >> 16)).intern(), string, true);
                        ja.m6662(ja.this).m6714(strM6663, string);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                ir irVar2 = irVar;
                if ((irVar2 != null ? 'S' : (char) 18) != 'S') {
                    return;
                }
                t.m7076(irVar2);
            }
        });
        int i10 = f2698 + 73;
        f2699 = i10 % 128;
        if ((i10 % 2 == 0 ? '-' : (char) 31) == 31) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6667(final jb jbVar) {
        je.m6706().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                ja.m6662(ja.this).m6710(ja.m6663(ja.this, jbVar));
            }
        });
        int i10 = f2698 + 63;
        f2699 = i10 % 128;
        int i11 = i10 % 2;
    }
}
