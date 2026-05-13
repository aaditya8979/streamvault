package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class ba {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f730 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f731 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f732 = {-1651954596, -790938195, 992154125, 913496587, -1926373809, 669856641, -301240990, 786897866, -773343164, 1760198774, -235625106, -467461580, 1141034504, 1909661372, -2102263130, -431286527, 318154931, 71342177};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f733 = 112;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private b f734 = b.f749;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private c f735 = c.f766;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f736;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f737;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f738;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f739;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f740;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f741;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ba$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f742;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f743;

        static {
            int[] iArr = new int[c.valuesCustom().length];
            f742 = iArr;
            try {
                iArr[c.f759.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f742[c.f762.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f742[c.f764.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f742[c.f763.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f742[c.f765.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[b.valuesCustom().length];
            f743 = iArr2;
            try {
                iArr2[b.f752.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f743[b.f751.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f743[b.f750.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f743[b.f745.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f743[b.f753.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum b {
        f749,
        f752,
        f751,
        f750,
        f753,
        f745;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f744 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f746 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char[] f747;

        static {
            m4860();
            int i10 = f744 + 35;
            f746 = i10 % 128;
            int i11 = i10 % 2;
        }

        public static b valueOf(String str) {
            int i10 = f746 + 29;
            f744 = i10 % 128;
            int i11 = i10 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i12 = f746 + 55;
            f744 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return bVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            int i10 = f746 + 105;
            f744 = i10 % 128;
            int i11 = i10 % 2;
            b[] bVarArr = (b[]) values().clone();
            int i12 = f744 + 27;
            f746 = i12 % 128;
            int i13 = i12 % 2;
            return bVarArr;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m4859(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (i.f2470) {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f747, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2469 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2469;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2469 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2469 = 0;
                    while (true) {
                        int i16 = i.f2469;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2469 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2469 = 0;
                    while (true) {
                        int i17 = i.f2469;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2469 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static void m4860() {
            f747 = new char[]{'\'', 'I', 'N', '_', 190, 197, 196, 190, 193, 196, 195, '#', 'H', 'K', 'K', 'N', 'N', 'E', 'F', 'J', 'Q', 'Q', 'K', '\'', 'M', 257, 257, 258, 265, 255, 254, 272, 262, 133, 264, 264, 266, 259};
        }
    }

    public enum c {
        f766,
        f762,
        f764,
        f763,
        f765,
        f759;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static boolean f754 = false;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f755 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f756 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f757;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f758;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static boolean f761;

        static {
            m4861();
            int i10 = f756 + 95;
            f755 = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            int i11 = 57 / 0;
        }

        public static c valueOf(String str) {
            int i10 = f755 + 41;
            f756 = i10 % 128;
            int i11 = i10 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i12 = f756 + 5;
            f755 = i12 % 128;
            int i13 = i12 % 2;
            return cVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            int i10 = f756 + 61;
            f755 = i10 % 128;
            int i11 = i10 % 2;
            c[] cVarArr = (c[]) values().clone();
            int i12 = f756 + 75;
            f755 = i12 % 128;
            int i13 = i12 % 2;
            return cVarArr;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static void m4861() {
            f761 = true;
            f754 = true;
            f757 = 196;
            f758 = new char[]{274, 275, 265, 283, 278, 291, 261, 267, 280, 277, 281, 269, 264, 279, 276, 271, 282, 272, 286, 266, 263};
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m4862(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f3010) {
                char[] cArr2 = f758;
                int i11 = f757;
                if (f754) {
                    int length = bArr.length;
                    m.f3012 = length;
                    char[] cArr3 = new char[length];
                    m.f3011 = 0;
                    while (m.f3011 < m.f3012) {
                        int i12 = m.f3011;
                        int i13 = m.f3012 - 1;
                        int i14 = m.f3011;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3011 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f761) {
                    int length2 = cArr.length;
                    m.f3012 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3011 = 0;
                    while (m.f3011 < m.f3012) {
                        int i15 = m.f3011;
                        int i16 = m.f3012 - 1;
                        int i17 = m.f3011;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3011 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3012 = length3;
                char[] cArr5 = new char[length3];
                m.f3011 = 0;
                while (m.f3011 < m.f3012) {
                    int i18 = m.f3011;
                    int i19 = m.f3012 - 1;
                    int i20 = m.f3011;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3011 = i20 + 1;
                }
                return new String(cArr5);
            }
        }
    }

    public ba(String str) {
        this.f740 = str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m4846() {
        int i10 = f731 + 89;
        f730 = i10 % 128;
        int i11 = i10 % 2;
        String strName = this.f734.name();
        int i12 = f731 + 125;
        f730 = i12 % 128;
        int i13 = i12 % 2;
        return strName;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m4847() {
        int i10 = f730;
        int i11 = i10 + 29;
        f731 = i11 % 128;
        int i12 = i11 % 2;
        if (this.f737 != null) {
            int i13 = i10 + 77;
            f731 = i13 % 128;
            int i14 = i13 % 2;
            if (this.f739 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m4851("ￃ\ufff6\uffe7￮ￃ\ufff9\b\u0015\u0016\f\u0012\u0011\u0016ￃ\u0016\u0018\u0013\u0013\u0012\u0015\u0017\b\u0007\uffdd", 24 - Color.red(0), false, -TextUtils.lastIndexOf("", '0', 0), 206 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb2.append(this.f737);
                sb2.append(m4853(new int[]{-1791069471, -903715253}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3).intern());
                sb2.append(this.f739);
                return sb2.toString();
            }
        }
        int i15 = f731 + 53;
        f730 = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4848() {
        if (this.f740.equals(m4851("\u0006\ufff3\uffff\u0002\ufff4\u0014\u0002", ((byte) KeyEvent.getModifierMetaStateMask()) + 8, true, 4 - TextUtils.lastIndexOf("", '0'), 211 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m4850());
        sb3.append(m4853(new int[]{73906157, -1654754441}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern());
        sb2.append(sb3.toString());
        String strM4852 = m4852();
        if (strM4852 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strM4852);
            sb4.append(m4853(new int[]{73906157, -1654754441}, 1 - ExpandableListView.getPackedPositionType(0L)).intern());
            sb2.append(sb4.toString());
        }
        String strM4847 = m4847();
        if (strM4847 != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(strM4847);
            sb5.append(m4853(new int[]{73906157, -1654754441}, Color.argb(0, 0, 0, 0) + 1).intern());
            sb2.append(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(m4851("\u0019\u0006\u0019\ufff8ￅ\uffdf\u0018\u001a", KeyEvent.getDeadChar(0, 0) + 8, true, TextUtils.lastIndexOf("", '0', 0, 0) + 5, 203 - Color.red(0)).intern());
        sb6.append(m4846());
        sb6.append(m4853(new int[]{73906157, -1654754441}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        sb2.append(sb6.toString());
        b bVar = this.f734;
        if (bVar != b.f750) {
            int i10 = f730 + 107;
            f731 = i10 % 128;
            if (i10 % 2 != 0) {
                b bVar2 = b.f749;
                throw null;
            }
            if (bVar != b.f753) {
                String strM4849 = m4849(this.f735);
                if (strM4849 != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(m4851("\u001b\u001b\r\ufff5\uffc8￢\r\u000f\t", View.MeasureSpec.makeMeasureSpec(0, 0) + 9, true, ExpandableListView.getPackedPositionType(0L) + 4, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 200).intern());
                    sb7.append(strM4849);
                    sb2.append(sb7.toString());
                }
                k.m6890(m4851("\u0006￣￭￦\ufff5\u001b\u0016\u000b\u000e\u0003\u0017\ufff3", 12 - View.resolveSizeAndState(0, 0, 0), true, TextUtils.indexOf((CharSequence) "", '0', 0) + 3, 206 - TextUtils.getTrimmedLength("")).intern(), sb2.toString());
                int i11 = f731 + 53;
                f730 = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
        }
        k.m6897(m4851("\u0006￣￭￦\ufff5\u001b\u0016\u000b\u000e\u0003\u0017\ufff3", Color.argb(0, 0, 0, 0) + 12, true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, 206 - Color.alpha(0)).intern(), sb2.toString());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m4849(c cVar) {
        int i10 = f730 + 89;
        f731 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        if (!(cVar == null)) {
            int i11 = AnonymousClass2.f742[cVar.ordinal()];
            if (i11 == 1) {
                return m4853(new int[]{137488030, -359922737, -2017774956, 1751944291, -1219746495, 1032070237, 1584024098, -1787785060, 926411803, 1010934812, -2074228985, -1614840226}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22).intern();
            }
            if (i11 == 2) {
                String str = String.format(m4853(new int[]{451501713, 1405190935, -171910612, 1274250387, 1195938589, 1238607191, 1132235826, 310786192, -1518597579, 636733615, -907901415, -563455962, -90577279, 1750423757, 571822032, 586410798, 1220481365, -1395748232, -2001810257, 626156600, 1375904924, -1657499583, 1195938589, 1238607191, 1132235826, 310786192, 323998113, -234917244, -2054184062, 2137770738, 1566473387, -1273628156}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62).intern(), this.f740, this.f738, this.f736);
                int i12 = f731 + 3;
                f730 = i12 % 128;
                int i13 = i12 % 2;
                return str;
            }
            if (i11 == 3) {
                return String.format(m4851("ￅ\u0019\u0014\u0013ￅ\u0018\u000eￅ\u0018ￊￅ\u0013\u0014\u000e\u0018\u0017\n\u001bￅ\ufff0￩\ufff8ￅ\u0018ￊ\u0017\u0014\u0019\b\n\u0013\u0013\u0014\bￅ\n\r\u0019ￅ\u001e\u0007ￅ\t\n\u0019\u0017\u0014\u0015\u0015\u001a\u0018ￅ\u0019\n\u001e", ExpandableListView.getPackedPositionChild(0L) + 56, true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24, Color.green(0) + 203).intern(), this.f740, this.f738);
            }
            if (i11 == 4) {
                return m4851("\u0001ﾾ\u0003\u0018\u0007\n\uffff\u0007\u0012\u0007\f\u0007ﾾ\r\u0012ﾾ\u0002\u0003\n\u0007\uffff￤\u0010\r\u0012\u0001\u0003\f\f\r", 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 22 - TextUtils.getTrimmedLength(""), 210 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
            }
            if (i11 == 5) {
                return m4851("\u0014\u000f\u0012￦\u0001\t\f\u0005\u0004\uffc0\u0014\u000f\uffc0\u0003\u0012\u0005\u0001\u0014\u0005\uffc0\u0003\u000f\u000e\u000e\u0005\u0003", 27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, Color.argb(0, 0, 0, 0) + 3, 208 - View.MeasureSpec.getSize(0)).intern();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m4850() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m4853(new int[]{-1305707743, 2105371948, -1305707743, 2105371948, -1305707743, 2105371948, -1885524501, 766283140}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14).intern());
        sb2.append(this.f740);
        sb2.append(m4851("ￂ\u0005\u0011\u0010\u0010\u0007\u0005\u0016\u0011\u0014ￂ", 11 - View.combineMeasuredStates(0, 0), false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 206 - (Process.myPid() >> 22)).intern());
        String string = sb2.toString();
        if (this.f741 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(this.f741);
            sb3.append(m4853(new int[]{506916697, 2073069639}, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            string = sb3.toString();
            int i10 = f731 + 1;
            f730 = i10 % 128;
            int i11 = i10 % 2;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append(m4851("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, 157 - TextUtils.indexOf("", "", 0)).intern());
        String string2 = sb4.toString();
        int i12 = f731 + 73;
        f730 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 2 : 'E') != 2) {
            return string2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4851(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.b.f728) {
            char[] cArr2 = new char[i10];
            com.ironsource.adqualitysdk.sdk.i.b.f726 = 0;
            while (true) {
                int i13 = com.ironsource.adqualitysdk.sdk.i.b.f726;
                if (i13 >= i10) {
                    break;
                }
                com.ironsource.adqualitysdk.sdk.i.b.f727 = cArr[i13];
                cArr2[com.ironsource.adqualitysdk.sdk.i.b.f726] = (char) (com.ironsource.adqualitysdk.sdk.i.b.f727 + i12);
                int i14 = com.ironsource.adqualitysdk.sdk.i.b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f733);
                com.ironsource.adqualitysdk.sdk.i.b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                com.ironsource.adqualitysdk.sdk.i.b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = com.ironsource.adqualitysdk.sdk.i.b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = com.ironsource.adqualitysdk.sdk.i.b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                com.ironsource.adqualitysdk.sdk.i.b.f726 = 0;
                while (true) {
                    int i17 = com.ironsource.adqualitysdk.sdk.i.b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    com.ironsource.adqualitysdk.sdk.i.b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m4852() {
        if ((this.f740 != null ? '+' : 'V') != 'V') {
            int i10 = f730 + 83;
            f731 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            String strIntern = this.f738;
            if (strIntern != null) {
                if ((strIntern.equals(m4851("\ufff0\u0002\u000f", 3 - ExpandableListView.getPackedPositionGroup(0L), false, 2 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getTrimmedLength("") + HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION).intern()) ? '6' : '\\') == '6') {
                    int i11 = f730 + 31;
                    f731 = i11 % 128;
                    int i12 = i11 % 2;
                    if (!(this.f734 == b.f753)) {
                        int i13 = f730 + 95;
                        f731 = i13 % 128;
                        strIntern = ((i13 % 2 != 0 ? '\b' : (char) 30) != '\b' ? m4853(new int[]{1998754247, -1627987434, 933966035, -919751033, -1173963287, -365185903}, 11 - View.MeasureSpec.getMode(0)) : m4853(new int[]{1998754247, -1627987434, 933966035, -919751033, -1173963287, -365185903}, 37 >> View.MeasureSpec.getMode(0))).intern();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f740);
                sb2.append(m4853(new int[]{401584120, 1315452641, 1370400122, -1742726920, 126769399, -1909906021, -126146041, 1467086522}, Color.alpha(0) + 14).intern());
                sb2.append(strIntern);
                String string = sb2.toString();
                int i14 = f731 + 51;
                f730 = i14 % 128;
                if (i14 % 2 != 0) {
                    return string;
                }
                int i15 = 83 / 0;
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4853(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f732.clone();
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m4854() {
        int i10 = f730 + 17;
        f731 = i10 % 128;
        int i11 = i10 % 2;
        b bVar = this.f734;
        if ((bVar != b.f752 ? 'X' : 'c') != 'c' && bVar != b.f751) {
            int i12 = f731 + 29;
            f730 = i12 % 128;
            int i13 = i12 % 2;
            if ((bVar == b.f749 ? 'b' : '(') != 'b') {
                return false;
            }
        }
        int i14 = f731 + 37;
        f730 = i14 % 128;
        if ((i14 % 2 == 0 ? '3' : '>') == '>') {
            return true;
        }
        int i15 = 67 / 0;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m4855() {
        int i10 = f731 + 53;
        f730 = i10 % 128;
        int i11 = i10 % 2;
        String strM4849 = m4849(this.f735);
        int i12 = f731 + 89;
        f730 = i12 % 128;
        if ((i12 % 2 == 0 ? 'R' : '\"') != 'R') {
            return strM4849;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4856(b bVar) {
        int i10 = f730 + 51;
        f731 = i10 % 128;
        int i11 = i10 % 2;
        this.f734 = bVar;
        if ((bVar != b.f745 ? (char) 17 : '\r') == 17) {
            int i12 = f731 + 5;
            f730 = i12 % 128;
            if (!(i12 % 2 != 0)) {
                this.f735 = c.f766;
                throw null;
            }
            this.f735 = c.f766;
        }
        int i13 = AnonymousClass2.f743[bVar.ordinal()];
        if (i13 == 3 || i13 == 4 || i13 == 5) {
            m4848();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4857(c cVar) {
        int i10 = f731 + 11;
        f730 = i10 % 128;
        int i11 = i10 % 2;
        this.f735 = cVar;
        m4856(b.f745);
        int i12 = f730 + 125;
        f731 = i12 % 128;
        if ((i12 % 2 != 0 ? '8' : 'Q') != '8') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4858(com.ironsource.adqualitysdk.sdk.i.cm r9) {
        /*
            r8 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ba.f730
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ba.f731 = r1
            int r0 = r0 % 2
            r9.m5688()
            java.lang.String r0 = r9.m5684()
            r8.f740 = r0
            java.lang.String r0 = r9.m5687()
            r8.f741 = r0
            java.lang.String r0 = r9.m5679()
            r8.f738 = r0
            java.lang.String r0 = ""
            r1 = 0
            int r2 = android.text.TextUtils.indexOf(r0, r0, r1)
            int r2 = r2 + 7
            int r3 = android.graphics.ImageFormat.getBitsPerPixel(r1)
            int r3 = 5 - r3
            float r4 = android.view.ViewConfiguration.getScrollFriction()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            int r4 = 183 - r4
            java.lang.String r6 = "\uffff\u0006￼\ufffb\b\uffff\ufffe"
            r7 = 1
            java.lang.String r2 = m4851(r6, r2, r7, r3, r4)
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = r8.f738
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            r2 = r1
            goto L4d
        L4c:
            r2 = r7
        L4d:
            if (r2 == r7) goto L88
            int r2 = com.ironsource.adqualitysdk.sdk.i.ba.f730
            int r2 = r2 + 17
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ba.f731 = r3
            int r2 = r2 % 2
            r2 = 0
            int r2 = android.widget.ExpandableListView.getPackedPositionType(r2)
            int r2 = 8 - r2
            float r3 = android.media.AudioTrack.getMinVolume()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = r3 + 8
            int r4 = android.view.ViewConfiguration.getScrollBarSize()
            int r4 = r4 >> 8
            int r4 = r4 + 183
            java.lang.String r5 = "�\u0002\f\ufffa\ufffb\u0005\ufffe�"
            java.lang.String r2 = m4851(r5, r2, r1, r3, r4)
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = r8.f738
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L85
            r2 = r1
            goto L86
        L85:
            r2 = r7
        L86:
            if (r2 == r7) goto Laa
        L88:
            r2 = 48
            int r2 = android.text.TextUtils.lastIndexOf(r0, r2)
            int r2 = 2 - r2
            int r3 = android.os.Process.myPid()
            int r3 = r3 >> 22
            int r3 = 2 - r3
            int r0 = android.text.TextUtils.getOffsetAfter(r0, r1)
            int r0 = r0 + 175
            java.lang.String r4 = "\ufff0\u0002\u000f"
            java.lang.String r0 = m4851(r4, r2, r1, r3, r0)
            java.lang.String r0 = r0.intern()
            r8.f738 = r0
        Laa:
            java.lang.String r0 = r9.m5680()
            r8.f737 = r0
            java.lang.String r0 = r9.m5681()
            r8.f739 = r0
            java.lang.String r9 = r9.m5682()
            r8.f736 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ba.m4858(com.ironsource.adqualitysdk.sdk.i.cm):void");
    }
}
