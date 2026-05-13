package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.material.TextFieldImplKt;
import com.ironsource.G5;
import com.ironsource.InterfaceC3934ae;
import com.ironsource.adqualitysdk.sdk.i.dy;
import com.ironsource.mediationsdk.demandOnly.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class dq {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1838 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1839;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1840;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1841;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<ed, ed> f1842;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<fr, fr> f1843;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f1844 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1845;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1846;

    public interface b<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo6156(List<dy> list);
    }

    static {
        m6139();
        f1842 = new HashMap();
        f1843 = new HashMap();
        int i10 = f1841 + 123;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
    }

    public dq(String str, String str2) {
        this.f1845 = str;
        this.f1846 = str2;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private dy m6112(List<dy> list) {
        int i10 = f1838 + 87;
        f1841 = i10 % 128;
        try {
        } catch (Exception e10) {
            m6147(m6137((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1168, (char) Drawable.resolveOpacity(0, 0), 34 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), e10);
        }
        if (i10 % 2 != 0) {
            m6113(list);
            throw null;
        }
        if ((m6113(list) ? 'X' : '3') != 'X') {
            m6147(m6137(Color.alpha(0) + 1144, (char) (51780 - (ViewConfiguration.getTapTimeout() >> 16)), Color.rgb(0, 0, 0) + 16777240).intern(), (Throwable) null);
            return null;
        }
        int i11 = this.f1844;
        this.f1844 = i11 + 1;
        dy dyVar = list.get(i11);
        int i12 = f1838 + 17;
        f1841 = i12 % 128;
        if ((i12 % 2 != 0 ? '&' : '*') != '&') {
            return dyVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private boolean m6113(List<dy> list) {
        int i10 = f1841 + 105;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        if ((this.f1844 < list.size() ? 'b' : (char) 0) == 0) {
            return false;
        }
        int i12 = f1841 + 115;
        f1838 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private dy m6114(List<dy> list) {
        int i10 = f1838 + 75;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        try {
            if (m6113(list)) {
                int i12 = f1841 + 73;
                f1838 = i12 % 128;
                int i13 = i12 % 2;
                return list.get(this.f1844);
            }
            int i14 = f1841 + 11;
            f1838 = i14 % 128;
            int i15 = i14 % 2;
            return null;
        } catch (Exception e10) {
            m6147(m6137((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + InterfaceC3934ae.a.f30966c, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8126), ExpandableListView.getPackedPositionType(0L) + 37).intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private Map<String, ed> m6115(List<dy> list) {
        HashMap map = new HashMap();
        Iterator it = m6144(list, m6137(764 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), View.getDefaultSize(0, 0) + 1).intern(), new b<Pair<String, ed>>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ Pair<String, ed> mo6156(List list2) {
                return dq.m6140(dq.this, list2);
            }
        }).iterator();
        int i10 = f1838 + 45;
        f1841 = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            if ((it.hasNext() ? (char) 0 : 'S') == 'S') {
                return map;
            }
            int i12 = f1838 + 95;
            f1841 = i12 % 128;
            int i13 = i12 % 2;
            Pair pair = (Pair) it.next();
            map.put(pair.first, pair.second);
            i10 = f1838 + 5;
            f1841 = i10 % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0252  */
    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6116(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r19) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6116(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private List<ed> m6117(List<dy> list) {
        List<ed> listM6144 = m6144(list, m6137((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 773, (char) (4672 - Drawable.resolveOpacity(0, 0)), 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.4

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f1849 = 5;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1850 = {'E', 'x', 'p', 'e', 'c', 't', 'd', ' ', 'l', 'a', 's', '/', 'v', 'r', 'b', 'u', 'i', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1851 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1852 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m6157(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2151) {
                    char[] cArr2 = f1850;
                    char c10 = f1849;
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

            /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[PHI: r6
              0x002c: PHI (r6v3 com.ironsource.adqualitysdk.sdk.i.ed) = (r6v1 com.ironsource.adqualitysdk.sdk.i.ed), (r6v6 com.ironsource.adqualitysdk.sdk.i.ed) binds: [B:14:0x002a, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private com.ironsource.adqualitysdk.sdk.i.ed m6158(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1851
                    int r0 = r0 + 41
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1852 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    if (r0 != 0) goto L22
                    com.ironsource.adqualitysdk.sdk.i.dq r0 = com.ironsource.adqualitysdk.sdk.i.dq.this
                    com.ironsource.adqualitysdk.sdk.i.ed r6 = com.ironsource.adqualitysdk.sdk.i.dq.m6148(r0, r6)
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.dv
                    r2 = 16
                    int r2 = r2 / r1
                    if (r0 != 0) goto L1c
                    r0 = r1
                    goto L1d
                L1c:
                    r0 = 1
                L1d:
                    if (r0 == 0) goto L2c
                    goto L66
                L20:
                    r6 = move-exception
                    throw r6
                L22:
                    com.ironsource.adqualitysdk.sdk.i.dq r0 = com.ironsource.adqualitysdk.sdk.i.dq.this
                    com.ironsource.adqualitysdk.sdk.i.ed r6 = com.ironsource.adqualitysdk.sdk.i.dq.m6148(r0, r6)
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.dv
                    if (r0 != 0) goto L66
                L2c:
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.ek
                    r2 = 6
                    if (r0 == 0) goto L33
                    r0 = r2
                    goto L35
                L33:
                    r0 = 97
                L35:
                    if (r0 == r2) goto L66
                    com.ironsource.adqualitysdk.sdk.i.dq r0 = com.ironsource.adqualitysdk.sdk.i.dq.this
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r3 = 0
                    int r3 = android.widget.ExpandableListView.getPackedPositionType(r3)
                    int r3 = 32 - r3
                    int r1 = android.view.View.combineMeasuredStates(r1, r1)
                    int r1 = 90 - r1
                    byte r1 = (byte) r1
                    java.lang.String r4 = "\u0001\u0002\u0003\u0004\u0000\t\u0001\b\t\u0002\t\u0005ÍÍ\f\r\b\u000e\t\f\u0014\n\b\f\u0004\u0000\u0001\u0012\r\u0002\u0007\b"
                    java.lang.String r1 = m6157(r4, r3, r1)
                    java.lang.String r1 = r1.intern()
                    r2.append(r1)
                    r2.append(r6)
                    java.lang.String r6 = r2.toString()
                    com.ironsource.adqualitysdk.sdk.i.dq.m6133(r0, r6)
                    r6 = 0
                    return r6
                L66:
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1852
                    int r0 = r0 + 85
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1851 = r1
                    int r0 = r0 % 2
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.m6158(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ ed mo6156(List list2) {
                int i10 = f1851 + 61;
                f1852 = i10 % 128;
                if ((i10 % 2 == 0 ? (char) 0 : 'P') == 'P') {
                    return m6158(list2);
                }
                m6158(list2);
                throw null;
            }
        });
        int i10 = f1838 + 95;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        return listM6144;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6118(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r12) {
        /*
            r11 = this;
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r11.m6116(r12)
            int r1 = com.ironsource.adqualitysdk.sdk.i.dq.f1838
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dq.f1841 = r2
            int r1 = r1 % 2
        Le:
            boolean r1 = r11.m6113(r12)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == r3) goto La4
            com.ironsource.adqualitysdk.sdk.i.dy r1 = r11.m6112(r12)
            java.lang.String r1 = r1.m6203()
            r4 = -1
            int r5 = r1.hashCode()
            r6 = 46
            if (r5 == r6) goto L54
            r6 = 91
            if (r5 == r6) goto L31
            goto L8d
        L31:
            int r5 = android.view.ViewConfiguration.getEdgeSlop()
            int r5 = r5 >> 16
            int r5 = r5 + 789
            int r6 = android.graphics.Color.alpha(r2)
            char r6 = (char) r6
            int r2 = android.graphics.drawable.Drawable.resolveOpacity(r2, r2)
            int r2 = 1 - r2
            java.lang.String r2 = m6137(r5, r6, r2)
            java.lang.String r2 = r2.intern()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8d
            r2 = r3
            goto L8e
        L54:
            java.lang.String r5 = ""
            int r6 = android.text.TextUtils.getCapsMode(r5, r2, r2)
            int r6 = r6 + 788
            r7 = 48721(0xbe51, float:6.8273E-41)
            r8 = 48
            int r5 = android.text.TextUtils.lastIndexOf(r5, r8)
            int r7 = r7 - r5
            char r5 = (char) r7
            long r7 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            java.lang.String r5 = m6137(r6, r5, r7)
            java.lang.String r5 = r5.intern()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L7f
            r1 = r2
            goto L80
        L7f:
            r1 = r3
        L80:
            if (r1 == r3) goto L8d
            int r1 = com.ironsource.adqualitysdk.sdk.i.dq.f1838
            int r1 = r1 + 25
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dq.f1841 = r4
            int r1 = r1 % 2
            goto L8e
        L8d:
            r2 = r4
        L8e:
            if (r2 == 0) goto L9e
            if (r2 == r3) goto L98
            int r12 = r11.f1844
            int r12 = r12 - r3
            r11.f1844 = r12
            return r0
        L98:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r11.m6135(r0, r12)
            goto Le
        L9e:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r11.m6142(r0, r12)
            goto Le
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6118(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private Pair<String, ed> m6119(List<dy> list) {
        int i10 = f1841 + 39;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        dy dyVarM6112 = m6112(list);
        if (!dyVarM6112.m6205()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6137(1047 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (MotionEvent.axisFromString("") + 54412), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            sb2.append(dyVarM6112);
            m6147(sb2.toString(), (Throwable) null);
            int i12 = f1838 + 95;
            f1841 = i12 % 128;
            int i13 = i12 % 2;
        }
        String strM6203 = dyVarM6112.m6203();
        m6134(list, m6137((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + j.a.f32531j, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.red(0) + 1).intern(), strM6203, m6137(1072 - KeyEvent.keyCodeFromString(""), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 48 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        return new Pair<>(strM6203, m6155(list));
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private fk m6120(List<dy> list) {
        ArrayList arrayList = new ArrayList();
        dy dyVarM6114 = m6114(list);
        int i10 = f1841 + 1;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if ((dyVarM6114.m6206(m6137(MotionEvent.axisFromString("") + 765, (char) TextUtils.getOffsetBefore("", 0), 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()) ? (char) 14 : (char) 0) != 0) {
                this.f1844++;
                return (fk) m6143(new fk(arrayList));
            }
            int i12 = f1838 + 81;
            f1841 = i12 % 128;
            int i13 = i12 % 2;
            arrayList.add(m6150(list));
            dyVarM6114 = m6114(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6121(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6121(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private fr m6122(List<dy> list) {
        m6153(list, m6137((ViewConfiguration.getFadingEdgeLength() >> 16) + 43, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -MotionEvent.axisFromString("")).intern(), m6137(726 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 39 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        fr frVarM6143 = m6143(new fn());
        int i10 = f1841 + 81;
        f1838 = i10 % 128;
        if (i10 % 2 != 0) {
            return frVarM6143;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[PHI: r1 r9
      0x0065: PHI (r1v14 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dm), (r1v16 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:21:0x0060, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:21:0x0060, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[PHI: r1 r9
      0x0096: PHI (r1v11 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dm), (r1v16 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:20:0x005e, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:20:0x005e, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[PHI: r1 r9
      0x00b5: PHI (r1v10 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dm), (r1v16 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:19:0x005c, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:19:0x005c, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6123(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r13) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6123(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (m6113(r15) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.dm.m6086(r14.f1846, r0.m6221());
        r5 = m6112(r15).m6203();
        r6 = r5.hashCode();
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r6 == 43) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r6 == 45) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == 1376) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r6 == 1440) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r5.equals(m6137(782 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2).intern()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r5 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r5.equals(m6137(782 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (char) (41135 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')), 1 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r5.equals(m6137(android.view.View.resolveSize(0, 0) + 780, (char) (18346 - android.text.TextUtils.indexOf("", "", 0, 0)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        r5 = '4';
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        r5 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r5 == '\t') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.i.dq.f1838 + 37;
        com.ironsource.adqualitysdk.sdk.i.dq.f1841 = r5 % 128;
        r5 = r5 % 2;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
    
        if (r5.equals(m6137(779 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 40609), -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
    
        if (r9 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        if (r9 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r9 == 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r9 == 3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        r14.f1844--;
        r15 = com.ironsource.adqualitysdk.sdk.i.dq.f1841 + 11;
        com.ironsource.adqualitysdk.sdk.i.dq.f1838 = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        if ((r15 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        if (r2 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
    
        return m6130(new com.ironsource.adqualitysdk.sdk.i.es((com.ironsource.adqualitysdk.sdk.i.ek) r0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
    
        return m6130(new com.ironsource.adqualitysdk.sdk.i.ey((com.ironsource.adqualitysdk.sdk.i.ek) r0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        return m6130(new com.ironsource.adqualitysdk.sdk.i.ex(r0, m6124(r15), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0159, code lost:
    
        return m6130(new com.ironsource.adqualitysdk.sdk.i.fd(r0, m6124(r15), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (m6113(r15) != false) goto L15;
     */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6124(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6124(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private fr m6125(List<dy> list) {
        m6153(list, m6137(Color.argb(0, 0, 0, 0), (char) (14612 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m6137(399 - ImageFormat.getBitsPerPixel(0), (char) (42102 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        fk fkVarM6120 = m6120(list);
        m6153(list, m6137(444 - (Process.myPid() >> 22), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4).intern(), m6137((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 449, (char) (59340 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 53 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        m6153(list, m6137((ViewConfiguration.getFadingEdgeLength() >> 16) + 110, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m6137(502 - View.MeasureSpec.getSize(0), (char) KeyEvent.keyCodeFromString(""), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        dy dyVarM6112 = m6112(list);
        m6145(dyVarM6112, dy.d.f1932, fkVarM6120, m6137((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 543, (char) Color.alpha(0), 27 - Color.alpha(0)).intern());
        ek ekVar = (ek) m6130(new ek(dyVarM6112.m6203(), dm.m6086(this.f1846, dyVarM6112.m6204())));
        m6153(list, m6137((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 151, (char) KeyEvent.keyCodeFromString(""), 1 - Color.alpha(0)).intern(), m6137(570 - KeyEvent.keyCodeFromString(""), (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollBarSize() >> 8) + 39).intern());
        m6153(list, m6137(ExpandableListView.getPackedPositionType(0L), (char) (14612 - (Process.myPid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m6137(610 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (25235 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 46 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        fr frVarM6143 = m6143(new fw(fkVarM6120, m6120(list), ekVar));
        int i10 = f1841 + 73;
        f1838 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return frVarM6143;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private fr m6126(List<dy> list) {
        fr frVarM6143 = m6143(new fu(m6144(list, m6137(43 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Process.myPid() >> 22), KeyEvent.keyCodeFromString("") + 1).intern(), new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f1854 = {'E', 'x', 'p', 'e', 'c', 't', 'd', ' ', 'v', 'a', 'r', 'i', 'b', 'l', 'u', 'F'};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1855 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1856 = 4;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1857;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m6159(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2151) {
                    char[] cArr2 = f1854;
                    char c10 = f1856;
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

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private ed m6160(List<dy> list2) {
                int i10 = f1855 + 43;
                f1857 = i10 % 128;
                int i11 = i10 % 2;
                ed edVarM6155 = dq.this.m6155(list2);
                if (!(edVarM6155 instanceof ek)) {
                    int i12 = f1855 + 17;
                    f1857 = i12 % 128;
                    if (i12 % 2 != 0) {
                        boolean z10 = edVarM6155 instanceof dw;
                        throw null;
                    }
                    if ((edVarM6155 instanceof dw ? (char) 24 : ',') == ',') {
                        dq dqVar = dq.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m6159("\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0007\u0004\u000b\n\u000b\b\n\r\u000e\u0007\u000b\r\u000f\u0006\u0004\u000b\u0002\u0007\u0000\b\t\u0002\u0007r", 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 82)).intern());
                        sb2.append(edVarM6155);
                        dq.m6133(dqVar, sb2.toString());
                        return null;
                    }
                }
                return edVarM6155;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ ed mo6156(List list2) {
                int i10 = f1855 + 19;
                f1857 = i10 % 128;
                int i11 = i10 % 2;
                ed edVarM6160 = m6160(list2);
                int i12 = f1855 + 107;
                f1857 = i12 % 128;
                if ((i12 % 2 != 0 ? '0' : 'X') == 'X') {
                    return edVarM6160;
                }
                throw null;
            }
        })));
        int i10 = f1838 + 103;
        f1841 = i10 % 128;
        if ((i10 % 2 != 0 ? '^' : (char) 17) == 17) {
            return frVarM6143;
        }
        int i11 = 83 / 0;
        return frVarM6143;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private fr m6127(List<dy> list) {
        m6153(list, m6137((-16777106) - Color.rgb(0, 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 1).intern(), m6137(TextUtils.indexOf((CharSequence) "", '0', 0) + 311, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 43 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
        ed edVarM6155 = m6155(list);
        m6153(list, m6137((ViewConfiguration.getScrollDefaultDelay() >> 16) + 151, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetAfter("", 0) + 1).intern(), m6137((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 352, (char) (4015 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 47).intern());
        fr frVarM6143 = m6143(new fv(edVarM6155, m6150(list)));
        int i10 = f1841 + 63;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        return frVarM6143;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private fr m6128(List<dy> list) {
        m6153(list, m6137((KeyEvent.getMaxKeyCode() >> 16) + 43, (char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 1).intern(), m6137(691 - View.resolveSize(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53895), (ViewConfiguration.getPressedStateDuration() >> 16) + 35).intern());
        fr frVarM6143 = m6143(new fl());
        int i10 = f1838 + 121;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        return frVarM6143;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private fr m6129(List<dy> list) {
        fr frVarM6143;
        int i10 = f1841 + 1;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        if (m6114(list).m6206(m6137(43 - Color.red(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
            frVarM6143 = m6143(new fo(null));
        } else {
            frVarM6143 = m6143(new fo(m6155(list)));
            int i12 = f1841 + 57;
            f1838 = i12 % 128;
            int i13 = i12 % 2;
        }
        m6134(list, m6137(TextUtils.getOffsetAfter("", 0) + 43, (char) Color.argb(0, 0, 0, 0), 1 - Color.argb(0, 0, 0, 0)).intern(), frVarM6143, m6137(655 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", ""), 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
        return frVarM6143;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ed m6130(ed edVar) {
        int i10 = f1838 + 117;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        ed edVar2 = f1842.get(edVar);
        if ((edVar2 == null ? 'C' : (char) 20) == 20) {
            return edVar2;
        }
        int i12 = f1841 + 11;
        f1838 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            f1842.put(edVar, edVar);
            return edVar;
        }
        f1842.put(edVar, edVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed m6131(List<dy> list, String str) {
        ed edVarM6155;
        if (m6114(list).m6206(str)) {
            edVarM6155 = null;
        } else {
            edVarM6155 = m6155(list);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6137((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 274, (char) (Drawable.resolveOpacity(0, 0) + 3756), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36).intern());
            sb2.append(str);
            m6134(list, str, edVarM6155, sb2.toString());
            int i10 = f1841 + 53;
            f1838 = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = f1838 + 85;
        f1841 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return edVarM6155;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fr m6132(List<dy> list) {
        m6153(list, m6137(110 - TextUtils.getCapsMode("", 0, 0), (char) TextUtils.getOffsetAfter("", 0), -ExpandableListView.getPackedPositionChild(0L)).intern(), m6137(MotionEvent.axisFromString("") + 201, (char) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 42).intern());
        ed edVarM6131 = m6131(list, m6137((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) + 1).intern());
        ed edVarM6155 = m6155(list);
        m6134(list, m6137(43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 1 - View.combineMeasuredStates(0, 0)).intern(), edVarM6155, m6137(241 - Color.alpha(0), (char) (TextUtils.indexOf("", "", 0) + 64867), 33 - KeyEvent.normalizeMetaState(0)).intern());
        fr frVarM6143 = m6143(new fs(edVarM6131, edVarM6155, m6131(list, m6137((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + TextFieldImplKt.AnimationDuration, (char) TextUtils.indexOf("", "", 0, 0), 1 - Color.red(0)).intern()), m6150(list)));
        int i10 = f1838 + 25;
        f1841 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return frVarM6143;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m6133(dq dqVar, String str) {
        int i10 = f1841 + 81;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        dqVar.m6146(str);
        int i12 = f1838 + 103;
        f1841 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6134(List<dy> list, String str, Object obj, String str2) {
        int i10 = f1841 + 5;
        f1838 = i10 % 128;
        if (i10 % 2 != 0) {
            m6152(m6112(list), str, obj, str2);
        } else {
            m6152(m6112(list), str, obj, str2);
            int i11 = 84 / 0;
        }
        int i12 = f1841 + 47;
        f1838 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed m6135(ed edVar, List<dy> list) {
        int i10 = f1838 + 43;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        ed edVarM6155 = m6155(list);
        m6134(list, m6137(811 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.rgb(0, 0, 0) + 16777217).intern(), edVarM6155, m6137(956 - ExpandableListView.getPackedPositionType(0L), (char) (38840 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 35).intern());
        dy dyVarM6112 = m6112(list);
        dm dmVarM6086 = dm.m6086(this.f1846, dyVarM6112.m6204());
        if (!dyVarM6112.m6206(m6137((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 790, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern())) {
            this.f1844--;
            return m6130(new ei(edVar, edVarM6155, dmVarM6086));
        }
        ed edVarM6130 = m6130(new ej(edVar, edVarM6155, m6155(list), dmVarM6086));
        int i12 = f1838 + 119;
        f1841 = i12 % 128;
        if ((i12 % 2 != 0 ? '?' : '`') != '?') {
            return edVarM6130;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fr m6136(List<dy> list) {
        int i10 = f1838 + 9;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        m6153(list, m6137(110 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern(), m6137(View.MeasureSpec.makeMeasureSpec(0, 0) + 111, (char) (28028 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40).intern());
        ed edVarM6155 = m6155(list);
        m6134(list, m6137(152 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), edVarM6155, m6137((ViewConfiguration.getWindowTouchSlop() >> 8) + 152, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 43 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        fr frVarM6150 = m6150(list);
        fr frVarM61502 = null;
        if (m6113(list)) {
            if (!(m6114(list).m6206(m6137(TextUtils.indexOf("", "") + 196, (char) TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 4).intern()) ? false : true)) {
                int i12 = f1838 + 25;
                f1841 = i12 % 128;
                int i13 = i12 % 2;
                this.f1844++;
                frVarM61502 = m6150(list);
                int i14 = f1838 + 51;
                f1841 = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        return m6143(new fq(edVarM6155, frVarM6150, frVarM61502));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6137(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1839[i10 + i12]) ^ (((long) i12) * f1840)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<ed> m6138(List<dy> list, String str) {
        List<ed> listM6144 = m6144(list, str, new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* synthetic */ ed mo6156(List list2) {
                return dq.this.m6155(list2);
            }
        });
        int i10 = f1841 + 45;
        f1838 = i10 % 128;
        if ((i10 % 2 == 0 ? '`' : 'C') == 'C') {
            return listM6144;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6139() {
        char[] cArr = new char[1307];
        ByteBuffer.wrap("9o\u0000mûÀ÷>ò\u0087îûê]åþááÝGØ©Ô\u000bÐ7ËÏÇ\tÃi¾Þº<µ\u0091±º\u00ad]¨\u0081¤© O\u009bó\u0097\u001b\u0093r\u008e¯\u008a\u0017\u0086c\u0081Ä}8x\u009ft\u0080p6k\u009egîc@^¼Z\u0013VFQ¦M\u0019\u0000;\rÒöx\u0018Hãäï\u0016\u0000wûÍ÷#ò\u0083îñ\u0000rûÀ÷>ò\u009aîæêW\u0000bû×÷/ò\u008eîÿ\u0000cûÊ÷$ò\u009bîýêWå«áæ\u0000tû×÷3\u0004aÿÓó/ÈÙ3x?\u008d:(&I\"ã-\r)\u0017\u0015»\u0010B\u001cá\u0018\u0083\u0003i\u000f¡\u000b\u0092vzr\u008a}%y\u000eeä`6l\u001dhéS\u0013_\u00ad[ÝF\u0013B¾NÝIkµ\u0096\u0000(m\u0015\u0096¿\u009a\u0016\u009fà\u0083\u009c\u0087$\u0088Ö\u008c\u009a°9µÔ¹`½\u001f¦àªn®\u0012Ó¸×YØåÜ\u0082ÀcÅúÉ\u0090ÍröÉúkþ\rãÒçtë\u0007ì¨\u0010N\u0015§\u0019¾\u001d@\u0006¶\n\u0092\u000eh3\u00827*;x\u0000)\u0000iûÃ÷jò\u009cîàêXåªáæÝEØ¨Ô\u001cÐcË\u009cÇ\u0002Ãi¾Åº4µ\u009c±î\u00adV¨\u008b¤ç \u000e\u009b \u0097\u0010\u0093r\u008e·\u008a\u000b\u0086h\u0081\u0091}4x\u009et\u0080p,k\u0084güc]^½Z\u001bV\u0003QïMEI;D\u0090\u0000eûÉ÷9ò\u008a\u0000fûÊ÷8òÏîçêMå¿á÷ÝMØ Ô\u0017ÐyËÈÇAÃu¾Ãº?µ\u0080±ö\u00ad[¨Ä¤ë K\u009bó\u0097\u001e\u0093r\u008e®\u008a\u000b\u0086c\u0081Æ}3x\u009ft\u0080p'k\u0093g¯cU^ùZYV\u000bQïý\u0005\u0006©\n[\u000f¬\u0013\u0094\u00175\u0018Ó\u001c\u0084 \"%Ú)x-\u001b6±:\">\u0016C G\\HãL\u0095P8U§Y\u008f]#fÔj;n\tsÈwp{\u0007|ò\u0080\u0012\u0085£\u0089ä\u000eÃõyù\u0092ü*àWäûë\u0013ïCÓ¤Ö\u0004Ú¦ÞËÅbÉ¨ÍÙ°t´\u0095»6¿X£³¦;ªM®í\u0095\n\u0099¸\u009dÕ\u0080N\u0084®\u0088Î\u008fysÚv ze~\u009de.i\u0003\u0000wûÍ÷#ò\u0083îñê\u0019å\u00adá÷ÝIØ¹Ô\u0017ÐzËÙÇ\u000fÃr¾\u008bº#µ\u009d±õ\u00adJ¨\u0088¤í \u000e\u009b±\u0097\u001d\u0093=\u008e¤\u008a\b\u0086`\u0081Ý}9x\u008ctÅp!kÊgícM^ùZ\u001fV\u0003QïMEI5\u000fØôbø\u008cý,á^å¶ê\u0002îXÒæ×\u0016Û¸ßÕÄvÈ ÌÝ±$µ\u009cº5¾[¢ô§\"«R¯è\u0094\u0013\u0098¹\u009c\u0092\u0081\u001e\u0085 \u0089Ì\u008ekr\u0095w0{/\u007f\u0088d h\u0000lòQ\u0018U¢Yå^\u0003B§F\u009dK?OÛ3\u00878.¤\u0002_¡SEV¹J\u0091N;AÉE\u0081y;|Öpat\u000fo¾c7g\u001d\u001a¨\u001eU\u0011÷\u0015Ì\t+\f÷\u0000ß\u0004;?Ê3c7\u001b*Û.d\"\u0014%£Ù\u0000Ü¥Ð¿Ô]ÏïÃ\u0090Ç&úÊþ(òrõÅéfíCàè\u0000cûÄ÷>ò\u008cîüç¿\u001c\u001c\u0010ø\u0015\u0004\t,\r\u0086\u0002t\u0006<:\u0086?k3Ü7²,\u0003 \u008a$¾Y\b]ôRKV=J\u0090O\u000fC G\u0080|8pÕt¹iemÀa¨f\r\u009aø\u009fT\u0093K\u0097ì\u008cX\u0080d\u0084\u009e¹2½Ö±\u0089¶wªÅ®±£\\§äÛ¾Ð\fÔôÉ^Í3Á\u0094Æzú;\u0000cûÄ÷>ò\u008cîüê\u0019åµáæÝQØºÔ\u001dÐeËØÇAÃu¾Ãº?µ\u0080±ö\u00ad[¨Ä¤ë K\u009bó\u0097\u001e\u0093r\u008e®\u008a\u000b\u0086c\u0081Æ}3x\u009ft\u0080p'k\u0093g¯cU^ùZYV\u000bQï\u0000mûÌ÷9ò\u009cîýêWå¹á£ÝKØ¬Ô\u0006ÐtËÔÇAÃp¾Êº\"µ\u009c±û\u00ad]¨\u0088¤ì \u000e\u009b½\u0097\u0019\u0093p\u008e§\u0000cûÄ÷>ò\u008cîüê\u0019å®áâÝZØ¬Ô\u001fÐ7ËÏÇ\tÃi¾Þº<µ\u0091±º\u00ad]¨\u0081¤© H\u009b¼\u0097\u0014\u0093q\u008e\u00ad\u008a\u0010\u0086i\u0081Õ}vx\u0099tÙpek\u008bg¯c\u0013^ðZYbð\u0099W\u0095\u00ad\u0090\u001f\u008co\u0088\u008a\u0087>\u0083d¿Úº*¶\u0084²é©J¥\u009c¡áÜ\u0018Ø®×\u0013ÓzÏØÊWÆxÂØù`õ\u0088ñáì<è\u0084äðãW\u001f«\u001a\f\u0016\u0013\u0012þ\t\u0010\u0005r\u0001Ô<#8\u00894Õ3{/Ù+ú&Y\"è^»\u0000rûÀ÷>ò\u009aîæêWåþáðÝ\\Ø¬Ô\u0006ÐrËÑÇ\u0004Ãh¾ßºpµ\u0086±ò\u00adP¨\u0091¤å J\u009bó\u0097\u001d\u0093s\u008e¦\u008aG\u0086{\u0081Ø}\"x\u0093t\u0080pbkÑg¨Òê)_%§ \u0006<w8\u00917%3\u007f\u000fÁ\n1\u0006\u009f\u0002ò\u0019Q\u0015\u0087\u0011úl\u0003h«g\u0015c}\u007fÂz\u0000ver\u0086I>E\u009eAñ\\jX\u0098TíSM¯¶ªS¦\u000f¢ö¹E\u0000cûÊ÷$ò\u009bîýêWå«áæÝ\bØ¾Ô\u0006ÐvËÈÇ\u0004Ãk¾Îº>µ\u0081±º\u00adL¨\u008c¤æ [\u009b¿\u0097\u001c\u0093=\u008e§\u008a\t\u0086h\u0081\u0091}!x\u0092tÔp-kÊg¨c\u000f^þ\u0000}\u0082>y\u009b\u0000|ûÙ\u0000=û\u0098\u00053þ\u008au:\u0012~\u0000<û\u0098\u0000>û\u0098\u009e\u008bG\u0087 \u009b[>\u0000-û\u0088\u0000*CÄ\u0000%¾|\u0000[\u0000=\u0007&\u0000mûÌ÷9ò\u009cîýêWå¹á£ÝKØ¡Ô\u001dÐdËÕÇ\u000fÃa¾\u008bºwµÜ±½\u0000]ò\u0096\t\b\u0005ì\u0000T\u001c'\u0018\u009f\u0017~\u00134/\u008e*j&\u0091\"»9\u000f5Ç1·L\tHçGYC+_Ü\u001egåùé\u001dì¥ðÖônû\u008fÿÅÃ\u007fÆ\u009bÊ`ÎQÕáÙ8ÝQ ÷¤B\u0000CûÄ÷?ò\u0088îüêMåþáæÝPØ®Ô\u0017ÐgËÈÇ\bÃi¾Åûk\u0000ó\f\u0014\t¤\u0015Ù\u0011c\u001e\u0095\u001aÉ&&#\u008a/8+\\0ü<;8AEãA\u0017N¾JÆV1S¨_Ò[t`Ýl1h\\u\u0098qi\u0000rûÀ÷,ò\u0083îñêZåªáêÝGØ£ÔRÐtËÐÇ\u0000Ãu¾Øºpµ\u009b±û\u00adR¨\u0081¤ú \u000e\u009b \u0097\u0010\u0093r\u008e·\u008a\u000b\u0086h\u0081\u0091}4x\u009et\u0080p#k\u0085gãcX^¶Z\tVFQ¬MMIpDÎ@|<h7È3=.\u009f*ö&[!«\u001dí\u0019F\u0014 \u0010S\f?\u0007\u0095\u0003Lÿ)ú\u0082öxñÑ\u0097Ëlh`\u0090e$yO}ór\u000fvKJäOUC¹GÇ\\kP¬TÒ)w-È\"/&G:§??3]7ù\f\u0018\u0000¥\u0004Á\u0019Z\u001d¨\u0011Ý\u0016}ê\u0086ïcã?ç üu\u0000nûÐ÷&ò\u0083\u0000sûÐ÷:ò\u008aîæeÝ\u009e~\u0092\u0094\u0097$\u008bH\u008f·\u0080\u0003\u0084E¸é½\u0016±°µÝ®2¢\u00ad¦ÍÛ%ß\u0098Ð4ÔXÈýÍ%ÁPÅåþ\u0019òööÑë\u0015ïéãÃä?\u0018\u0095\u001d0\u0011z\u0015\u0083\u000e+\u0002E\u0006º;\u001e?¾3û4\t( ,Ý!m%\u009bYÀRfÔÎ/V#±&\u0001:|>Æ105l\t\u0083\f\u0015\u0000\u008d\u0004î\u001f^\u0013\u0084\u0017êj\u0000n¹a\u000beey\u0094|\bpmtÑOx\u0000:\u0000jûÖ÷%ò\u0081î´êRå»áúÝ\bØ¾Ô\u001aÐxËÉÇ\rÃb¾\u008bº2µ\u0090±º\u00adY¨\u008b¤å B\u009b¼\u0097\u000f\u0093x\u008e¦\u008aG\u0086n\u0081È}vx\u009at\u0080p3k\u008bgãcA^¼Z^VBQ®M\u0019IwDÅ@|<&7\u009c3l\u0000,\u0000lûÌ÷9ò\u009bî´êJå¶áìÝ]Ø¡Ô\u0016Ð7ËÙÇ\u000fÃb¾\u008bº'µ\u009c±î\u00adW¨Ä¤®\u0003ÄÊ\u00111\u008f=k8Ó$  \u0018/ù+³\u0017\t\u0012í\u001e\u0016\u001a6\u0001\u0096\rA\tbt\u0080pr\u007f\u0091{ªg\u0014bËn¨j\u0004Qä\u0000EûÝ÷)ò\u008aîäêMå·áìÝFØíÔ\u0005Ð\u007fËÕÇ\rÃc¾\u008bº7µ\u0090±î\u00adK¨\u008d¤ç I\u009bó\u0097\u0016\u0093x\u008eº\u008a\u0013\u0086,\u0081Å}9x\u0090tÅp+\u001fúäbè\u0096í5ñ[õòú\bþSÂùÇRËºÏÀÔjØ²ÜÜ¡4¥\u009fª/®@²ë·2»X¿ö\u0084L\u0088¦\u008cÖ\u0091]\u0095¶\u0099Ö\u009evb\u009dgdkko\u0095t>xU|åÂF9¢5J0ý,\u0097(-'\u0098\u0000EûÝ÷:ò\u008aî÷êMå»áçÝ\b\u0000 ûÇ÷?ò\u009bî´êKå»áàÝMØ¤Ô\u0004ÐrËØÇAÔR/ú#\u0018\u0000PûÄ÷8ò\u009cîñêKåñ\u0000PûÄ÷8ò\u009cîýêWå¹á£ÝNØ¬Ô\u001bÐ{ËÙÇ\u0005Ã&¾Ïº%µ\u0090±º\u00adK¨\u008b¤© K\u009b¡\u0097\n\u0093r\u008e°\u008a\u0014".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1307);
        f1839 = cArr;
        f1840 = -5462852528441525339L;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Pair m6140(dq dqVar, List list) {
        int i10 = f1841 + 115;
        f1838 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Pair<String, ed> pairM6119 = dqVar.m6119(list);
        if (!z10) {
            int i11 = 78 / 0;
        }
        return pairM6119;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m6141(dy dyVar) {
        dm dmVarM6086 = dm.m6086(this.f1846, dyVar.m6204());
        if (dyVar.m6200()) {
            try {
                try {
                    return m6130(new fg(Integer.valueOf(Integer.parseInt(dyVar.m6203())), dmVarM6086));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                return m6130(new fe(Long.valueOf(Long.parseLong(dyVar.m6203())), dmVarM6086));
            }
        } else {
            if (dyVar.m6198()) {
                ed edVarM6130 = m6130(new fh(Double.valueOf(Double.parseDouble(dyVar.m6203())), dmVarM6086));
                int i10 = f1838 + 71;
                f1841 = i10 % 128;
                int i11 = i10 % 2;
                return edVarM6130;
            }
            if (dyVar.m6196()) {
                ed edVarM61302 = m6130(new ff(Boolean.valueOf(Boolean.parseBoolean(dyVar.m6203())), dmVarM6086));
                int i12 = f1841 + 3;
                f1838 = i12 % 128;
                if ((i12 % 2 == 0 ? 'Y' : '\r') == '\r') {
                    return edVarM61302;
                }
                int i13 = 70 / 0;
                return edVarM61302;
            }
        }
        return m6130(new fm(dyVar.m6203(), dmVarM6086));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m6142(ed edVar, List<dy> list) {
        int i10 = f1841 + 75;
        f1838 = i10 % 128;
        List<ed> listM6117 = null;
        if (!(i10 % 2 != 0)) {
            m6112(list).m6195();
            throw null;
        }
        dy dyVarM6112 = m6112(list);
        if (!dyVarM6112.m6195()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6137(865 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (64301 - MotionEvent.axisFromString("")), TextUtils.getCapsMode("", 0, 0) + 28).intern());
            sb2.append(dyVarM6112);
            m6147(sb2.toString(), (Throwable) null);
            int i11 = f1838 + 49;
            f1841 = i11 % 128;
            int i12 = i11 % 2;
        }
        String strM6203 = dyVarM6112.m6203();
        dy dyVarM61122 = m6112(list);
        if ((dyVarM61122.m6206(m6137(772 - ImageFormat.getBitsPerPixel(0), (char) (29958 - Color.argb(0, 0, 0, 0)), 1 - KeyEvent.keyCodeFromString("")).intern()) ? (char) 11 : '0') != '0') {
            listM6117 = m6117(list);
            m6134(list, m6137(Color.rgb(0, 0, 0) + 16777326, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), listM6117, m6137(892 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62).intern());
        } else if (!dyVarM61122.m6206(m6137(Color.green(0) + 110, (char) Color.argb(0, 0, 0, 0), TextUtils.getOffsetBefore("", 0) + 1).intern())) {
            this.f1844--;
            return m6130(new ec(edVar, strM6203, dm.m6086(strM6203, dyVarM61122.m6204())));
        }
        return m6130(new ee(edVar, strM6203, listM6117, m6138(list, m6137(View.getDefaultSize(0, 0) + 151, (char) (Color.rgb(0, 0, 0) + 16777216), -((byte) KeyEvent.getModifierMetaStateMask())).intern()), dm.m6086(strM6203, dyVarM61122.m6204())));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static fr m6143(fr frVar) {
        int i10 = f1838 + 17;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        fr frVar2 = f1843.get(frVar);
        if ((frVar2 == null ? (char) 7 : '/') != 7) {
            return frVar2;
        }
        int i12 = f1841 + 7;
        f1838 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 26 : G5.T) != 26) {
            f1843.put(frVar, frVar);
            return frVar;
        }
        f1843.put(frVar, frVar);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> List<T> m6144(List<dy> list, String str, b<T> bVar) {
        ArrayList arrayList = new ArrayList();
        if (!m6112(list).m6206(str)) {
            int i10 = f1838 + 39;
            f1841 = i10 % 128;
            int i11 = i10 % 2;
            this.f1844--;
            arrayList.add(bVar.mo6156(list));
            dy dyVarM6112 = m6112(list);
            while (true) {
                if ((dyVarM6112.m6206(m6137(TextUtils.indexOf((CharSequence) "", '0') + 1121, (char) (ViewConfiguration.getTapTimeout() >> 16), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (char) 4 : 'C') != 4) {
                    break;
                }
                int i12 = f1838 + 1;
                f1841 = i12 % 128;
                int i13 = i12 % 2;
                arrayList.add(bVar.mo6156(list));
                dyVarM6112 = m6112(list);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6137(1122 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22).intern());
            sb2.append(str);
            sb2.append(m6137(Color.alpha(0) + 1143, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 995), 1 - KeyEvent.keyCodeFromString("")).intern());
            m6152(dyVarM6112, str, arrayList, sb2.toString());
        }
        int i14 = f1841 + 119;
        f1838 = i14 % 128;
        if ((i14 % 2 == 0 ? '6' : 'H') == 'H') {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6145(dy dyVar, dy.d dVar, Object obj, String str) {
        if (!dyVar.m6202().equals(dVar)) {
            int i10 = f1841 + 77;
            f1838 = i10 % 128;
            boolean z10 = i10 % 2 == 0;
            m6146(m6151(dVar.toString(), dyVar.m6202().toString(), obj, str));
            if (z10) {
                int i11 = 71 / 0;
            }
        }
        int i12 = f1838 + 113;
        f1841 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6146(String str) {
        int i10 = f1838 + 73;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        m6147(str, (Throwable) null);
        int i12 = f1838 + 99;
        f1841 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6147(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6137(1272 - Gravity.getAbsoluteGravity(0, 0), (char) Color.red(0), 7 - KeyEvent.normalizeMetaState(0)).intern());
        sb2.append(this.f1845);
        sb2.append(m6137((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 786, (char) (17387 - View.MeasureSpec.getMode(0)), 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb2.append(this.f1846);
        co.m5699(sb2.toString(), str, th2);
        throw new RuntimeException(m6137(1279 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28).intern(), th2);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ ed m6148(dq dqVar, List list) {
        int i10 = f1841 + 81;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        ed edVarM6116 = dqVar.m6116(list);
        int i12 = f1838 + 47;
        f1841 = i12 % 128;
        int i13 = i12 % 2;
        return edVarM6116;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed m6149(dy dyVar, List<dy> list) {
        String strM6203 = dyVar.m6203();
        byte b10 = -1;
        int iHashCode = strM6203.hashCode();
        if (iHashCode != 3392903) {
            if (iHashCode == 109801339) {
                if ((strM6203.equals(m6137(995 - View.combineMeasuredStates(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), Color.argb(0, 0, 0, 0) + 5).intern()) ? (char) 27 : ']') != ']') {
                    int i10 = f1841;
                    int i11 = i10 + 63;
                    f1838 = i11 % 128;
                    b10 = !(i11 % 2 == 0) ? (byte) 1 : (byte) 0;
                    int i12 = i10 + 105;
                    f1838 = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        } else if (strM6203.equals(m6137(TextUtils.lastIndexOf("", '0', 0, 0) + 992, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5).intern())) {
            b10 = 0;
        }
        if (b10 == 0) {
            return fj.m6260();
        }
        if (b10 != 1) {
            int i14 = f1838 + 27;
            f1841 = i14 % 128;
            int i15 = i14 % 2;
            return null;
        }
        m6134(list, m6137(TextUtils.indexOf("", "", 0, 0) + 788, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 48722), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), dyVar, m6137((Process.myPid() >> 22) + 1000, (char) (26030 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getTapTimeout() >> 16) + 47).intern());
        ed edVarM6142 = m6142(m6130(new ek(m6137(((byte) KeyEvent.getModifierMetaStateMask()) + 996, (char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 6).intern(), dm.m6086(this.f1846, dyVar.m6204()))), list);
        int i16 = f1838 + 81;
        f1841 = i16 % 128;
        int i17 = i16 % 2;
        return edVarM6142;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fr m6150(List<dy> list) {
        int i10 = f1841 + 101;
        f1838 = i10 % 128;
        if (i10 % 2 == 0) {
            m6112(list).m6203().hashCode();
            throw null;
        }
        String strM6203 = m6112(list).m6203();
        byte b10 = 7;
        switch (strM6203.hashCode()) {
            case -934396624:
                b10 = !(!strM6203.equals(m6137(55 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), View.getDefaultSize(0, 0) + 6).intern())) ? (byte) 4 : (byte) -1;
                break;
            case -567202649:
                b10 = !strM6203.equals(m6137(66 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 59:
                if (!strM6203.equals(m6137((KeyEvent.getMaxKeyCode() >> 16) + 43, (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1838 + 101;
                    f1841 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 0 : (byte) 1;
                }
                break;
            case 123:
                if (!strM6203.equals(m6137(AndroidCharacter.getMirror('0') - '0', (char) (TextUtils.indexOf("", "", 0) + 14612), ExpandableListView.getPackedPositionType(0L) + 1).intern())) {
                    b10 = -1;
                }
                break;
            case 3357:
                if (!strM6203.equals(m6137((Process.myTid() >> 22) + 44, (char) (3514 - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1841 + 7;
                    f1838 = i12 % 128;
                    int i13 = i12 % 2;
                }
                break;
            case 101577:
                if (!strM6203.equals(m6137(46 - TextUtils.getOffsetBefore("", 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6190), MotionEvent.axisFromString("") + 4).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f1841 + 97;
                    f1838 = i14 % 128;
                    int i15 = i14 % 2;
                    b10 = 2;
                }
                break;
            case 115131:
                b10 = strM6203.equals(m6137(((byte) KeyEvent.getModifierMetaStateMask()) + 74, (char) View.resolveSize(0, 0), 3 - TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) 8 : (byte) -1;
                break;
            case 116519:
                if (!strM6203.equals(m6137(75 - ExpandableListView.getPackedPositionChild(0L), (char) (1047 - ExpandableListView.getPackedPositionType(0L)), 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1841 + 123;
                    f1838 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 9;
                }
                break;
            case 94001407:
                b10 = !strM6203.equals(m6137((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 60, (char) Color.argb(0, 0, 0, 0), TextUtils.getTrimmedLength("") + 5).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 113101617:
                if (!strM6203.equals(m6137(MotionEvent.axisFromString("") + 50, (char) (ViewConfiguration.getTouchSlop() >> 8), 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i18 = f1838 + 69;
                    f1841 = i18 % 128;
                    int i19 = i18 % 2;
                    b10 = 3;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return m6143(new fp(null));
            case 1:
                return m6136(list);
            case 2:
                return m6132(list);
            case 3:
                fr frVarM6127 = m6127(list);
                int i20 = f1841 + 81;
                f1838 = i20 % 128;
                int i21 = i20 % 2;
                return frVarM6127;
            case 4:
                return m6129(list);
            case 5:
                return m6128(list);
            case 6:
                return m6122(list);
            case 7:
                return m6120(list);
            case 8:
                return m6125(list);
            case 9:
                return m6126(list);
            default:
                this.f1844--;
                ed edVarM6155 = m6155(list);
                m6134(list, m6137((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern(), edVarM6155, m6137(79 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (51380 - Color.argb(0, 0, 0, 0)), 31 - Drawable.resolveOpacity(0, 0)).intern());
                return m6143(new fp(edVarM6155));
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6151(String str, String str2, Object obj, String str3) {
        String string;
        String string2 = "";
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6137((ViewConfiguration.getJumpTapTimeout() >> 16) + 1239, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49766), ExpandableListView.getPackedPositionGroup(0L) + 7).intern());
            sb2.append(obj);
            string = sb2.toString();
            int i10 = f1838 + 57;
            f1841 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = f1838 + 85;
            f1841 = i12 % 128;
            int i13 = i12 % 2;
            string = "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m6137(1247 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), 9 - TextUtils.getCapsMode("", 0, 0)).intern());
        sb3.append(str);
        sb3.append(string);
        sb3.append(m6137((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1255, (char) View.MeasureSpec.getSize(0), 14 - KeyEvent.getDeadChar(0, 0)).intern());
        sb3.append(str2);
        if (str3 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m6137(1269 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.lastIndexOf("", '0', 0) + 54387), 3 - KeyEvent.getDeadChar(0, 0)).intern());
            sb4.append(str3);
            string2 = sb4.toString();
        }
        sb3.append(string2);
        return sb3.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6152(dy dyVar, String str, Object obj, String str2) {
        int i10 = f1841 + 19;
        f1838 = i10 % 128;
        int i11 = i10 % 2;
        if (!dyVar.m6206(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6137(MotionEvent.axisFromString("") + 1144, (char) (995 - KeyEvent.getDeadChar(0, 0)), 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb2.append(str);
            sb2.append(m6137(Color.green(0) + 1143, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 995), -Process.getGidForName("")).intern());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m6137((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1143, (char) (996 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 1).intern());
            sb3.append(dyVar.m6203());
            sb3.append(m6137(1144 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-16776221) - Color.rgb(0, 0, 0)), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            m6146(m6151(string, sb3.toString(), obj, str2));
        }
        int i12 = f1838 + 91;
        f1841 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6153(List<dy> list, String str, String str2) {
        int i10 = f1838 + 31;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        m6134(list, str, null, str2);
        int i12 = f1841 + 77;
        f1838 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final fk m6154(List<dy> list) {
        int i10 = f1838 + 55;
        f1841 = i10 % 128;
        int i11 = i10 % 2;
        this.f1844 = 0;
        m6153(list, m6137((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (14611 - TextUtils.indexOf((CharSequence) "", '0', 0)), -ImageFormat.getBitsPerPixel(0)).intern(), m6137(1 - KeyEvent.getDeadChar(0, 0), (char) View.combineMeasuredStates(0, 0), 42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        fk fkVarM6120 = m6120(list);
        int i12 = f1838 + 75;
        f1841 = i12 % 128;
        if (i12 % 2 == 0) {
            return fkVarM6120;
        }
        int i13 = 43 / 0;
        return fkVarM6120;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.ed m6155(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6155(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }
}
