package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ix {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2660 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2661 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2664 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2662 = {'N', 'e', 't', 'U', 'i', 'l', 's', 'E', 'r', 'o', ' ', 'n', 'd', 'g', 'p', 'q', 'u', ':', 'C', '-', 'c', 'z', 'G', 'T', 'O'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2663 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2659 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2666 = 108;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2665 = {193, 192, 178, 153, 164, 188, 187, 191, 175, 219, 218, 224, 209, 229, 220, 205, 216, 213, 207, 155, 214, 223, 167, 140, 212, 222, 169, 225, 210, 152, 142, 166, 233};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6624(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f2662;
            char c10 = f2664;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m6625(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m6624("\u0002\fÃ", View.MeasureSpec.getMode(0) + 3, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 112)).intern());
        int i10 = f2661 + 21;
        f2660 = i10 % 128;
        if ((i10 % 2 == 0 ? '^' : 'F') == 'F') {
            return httpURLConnection;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static iq m6626(JSONObject jSONObject, String str) {
        HttpURLConnection httpURLConnectionM6628;
        long jM6854;
        String strM6631;
        int iHttpUrlConnectionGetResponseCode;
        String responseMessage;
        int i10 = f2661 + 23;
        f2660 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                httpURLConnectionM6628 = m6628(str);
                byte[] bArrM6633 = m6633(httpURLConnectionM6628, jSONObject);
                jM6854 = jx.m6854();
                m6635(httpURLConnectionM6628, bArrM6633);
                strM6631 = m6631(httpURLConnectionM6628);
                iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionM6628);
                responseMessage = httpURLConnectionM6628.getResponseMessage();
                if (!(iHttpUrlConnectionGetResponseCode < 400)) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionM6628);
                }
            } else {
                httpURLConnectionM6628 = m6628(str);
                byte[] bArrM66332 = m6633(httpURLConnectionM6628, jSONObject);
                jM6854 = jx.m6854();
                m6635(httpURLConnectionM6628, bArrM66332);
                strM6631 = m6631(httpURLConnectionM6628);
                iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionM6628);
                responseMessage = httpURLConnectionM6628.getResponseMessage();
                if (iHttpUrlConnectionGetResponseCode >= 28484) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionM6628);
                }
            }
            iq iqVar = new iq(strM6631, iHttpUrlConnectionGetResponseCode, responseMessage, jx.m6854() - jM6854);
            int i11 = f2660 + 9;
            f2661 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return iqVar;
        } catch (Throwable th2) {
            String strIntern = m6624("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", Process.getGidForName("") + 9, (byte) (Gravity.getAbsoluteGravity(0, 0) + 35)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6624("\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u0013\u000e\u0007\u0001\r\u0005\u0000\u0010\u0015\u0006\u0007\u0001\u000f\f", 28 - TextUtils.indexOf("", ""), (byte) (89 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m6906(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6627(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strM6827 = jv.m6827(string);
        String strSubstring = string.substring(0, string.lastIndexOf(125));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(m6630(null, 127 - TextUtils.indexOf("", "", 0), null, "\u009f \u009f\u0096\u0099\u009f\u009e").intern());
        sb2.append(strM6827);
        sb2.append(m6630(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "¡\u009f").intern());
        String string2 = sb2.toString();
        int i10 = f2660 + 73;
        f2661 = i10 % 128;
        int i11 = i10 % 2;
        return string2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m6628(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m6630(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0082\u0088\u0087\u0086").intern());
        httpURLConnection.setRequestProperty(m6630(null, (Process.myTid() >> 22) + 127, null, "\u008d\u008f\u008e\u0082\u0084\u008c\u008b\u008d\u008c\u008b\u008a\u0089").intern(), m6630(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u0085\u0084\u009d\u008c\u009c\u009b\u008c\u008d\u0096\u009a\u0090\u0099\u0093\u0098\u0097\u008b\u008a\u0096\u0095\u0094\u008b\u008a\u0092\u008c\u0090\u0093\u0092\u0091\u008f\u008f\u0090").intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i10 = f2660 + 17;
        f2661 = i10 % 128;
        int i11 = i10 % 2;
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x0035, PHI: r0 r4 r6 r7 r13
      0x004f: PHI (r0v11 java.lang.String) = (r0v10 java.lang.String), (r0v15 java.lang.String) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r4v5 long) = (r4v4 long), (r4v8 long) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r6v1 int) = (r6v0 int), (r6v5 int) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r13v3 java.net.HttpURLConnection) = (r13v2 java.net.HttpURLConnection), (r13v9 java.net.HttpURLConnection) binds: [B:17:0x004d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:8:0x0014, B:19:0x0052, B:18:0x004f, B:16:0x0037), top: B:31:0x0012 }] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ironsource.adqualitysdk.sdk.i.iq m6629(java.lang.String r13) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ix.f2661
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ix.f2660 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            r3 = 0
            if (r0 == r1) goto L37
            java.net.HttpURLConnection r13 = m6625(r13)     // Catch: java.lang.Throwable -> L35
            long r4 = com.ironsource.adqualitysdk.sdk.i.jx.m6854()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = m6631(r13)     // Catch: java.lang.Throwable -> L35
            int r6 = com.safedk.android.internal.partials.IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(r13)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r13.getResponseMessage()     // Catch: java.lang.Throwable -> L35
            r8 = 29428(0x72f4, float:4.1237E-41)
            r9 = 49
            if (r6 < r8) goto L30
            r8 = r9
            goto L32
        L30:
            r8 = 68
        L32:
            if (r8 == r9) goto L4f
            goto L52
        L35:
            r13 = move-exception
            goto L78
        L37:
            java.net.HttpURLConnection r13 = m6625(r13)     // Catch: java.lang.Throwable -> L35
            long r4 = com.ironsource.adqualitysdk.sdk.i.jx.m6854()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = m6631(r13)     // Catch: java.lang.Throwable -> L35
            int r6 = com.safedk.android.internal.partials.IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(r13)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r13.getResponseMessage()     // Catch: java.lang.Throwable -> L35
            r8 = 400(0x190, float:5.6E-43)
            if (r6 < r8) goto L52
        L4f:
            com.safedk.android.internal.partials.IronSourceNetworkBridge.httpUrlConnectionDisconnect(r13)     // Catch: java.lang.Throwable -> L35
        L52:
            r13 = r6
            r11 = r4
            r5 = r0
            r0 = r7
            r6 = r11
            com.ironsource.adqualitysdk.sdk.i.iq r10 = new com.ironsource.adqualitysdk.sdk.i.iq     // Catch: java.lang.Throwable -> L35
            long r8 = com.ironsource.adqualitysdk.sdk.i.jx.m6854()     // Catch: java.lang.Throwable -> L35
            long r8 = r8 - r6
            r4 = r10
            r6 = r13
            r7 = r0
            r4.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L35
            int r13 = com.ironsource.adqualitysdk.sdk.i.ix.f2660
            int r13 = r13 + 47
            int r0 = r13 % 128
            com.ironsource.adqualitysdk.sdk.i.ix.f2661 = r0
            int r13 = r13 % 2
            if (r13 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            if (r1 != 0) goto L75
            return r10
        L75:
            throw r3     // Catch: java.lang.Throwable -> L76
        L76:
            r13 = move-exception
            throw r13
        L78:
            int r0 = android.view.ViewConfiguration.getPressedStateDuration()
            int r0 = r0 >> 16
            int r0 = r0 + 8
            int r1 = android.graphics.Color.green(r2)
            int r1 = 35 - r1
            byte r1 = (byte) r1
            java.lang.String r4 = "\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007"
            java.lang.String r0 = m6624(r4, r0, r1)
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = ""
            int r4 = android.text.TextUtils.getOffsetBefore(r4, r2)
            int r4 = 27 - r4
            int r2 = android.view.View.combineMeasuredStates(r2, r2)
            int r2 = r2 + 103
            byte r2 = (byte) r2
            java.lang.String r5 = "\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u000b\u0003\u0000\f\u0006\u0003\u0010\u0011\u0006\u000b\u0007\u0016\u0087"
            java.lang.String r2 = m6624(r5, r4, r2)
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            java.lang.String r2 = r13.getLocalizedMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ironsource.adqualitysdk.sdk.i.k.m6906(r0, r1, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ix.m6629(java.lang.String):com.ironsource.adqualitysdk.sdk.i.iq");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6630(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2665;
            int i11 = f2666;
            if (f2659) {
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
            if (f2663) {
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6631(HttpURLConnection httpURLConnection) {
        InputStream inputStreamUrlConnectionGetInputStream;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        String string = null;
        try {
            inputStreamUrlConnectionGetInputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamUrlConnectionGetInputStream));
                try {
                    stringBuffer = new StringBuffer();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        k.m6906(m6624("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", View.combineMeasuredStates(0, 0) + 8, (byte) (35 - Gravity.getAbsoluteGravity(0, 0))).intern(), m6624("\b\t\t\u0005\u0005\r\u000b\u0003\u008a\u008a\u0001\u000e\u000e\u000b\u0006\u0003\t\u000b\u0006\u000e\u000b\u0006", ExpandableListView.getPackedPositionGroup(0L) + 22, (byte) (22 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), th);
                    } finally {
                        m6632(inputStreamUrlConnectionGetInputStream);
                        m6632(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamUrlConnectionGetInputStream = null;
            bufferedReader = null;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if ((line != null ? (char) 26 : '3') == '3') {
                break;
            }
            int i10 = f2660 + 5;
            f2661 = i10 % 128;
            int i11 = i10 % 2;
            if ((stringBuffer.length() > 0 ? '2' : (char) 0) == '2') {
                int i12 = f2660 + 109;
                f2661 = i12 % 128;
                if (i12 % 2 != 0) {
                    stringBuffer.append('a');
                } else {
                    stringBuffer.append('\r');
                }
            }
            stringBuffer.append(line);
            return string;
        }
        string = stringBuffer.toString();
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m6632(Closeable closeable) {
        int i10 = f2660 + 29;
        f2661 = i10 % 128;
        int i11 = i10 % 2;
        if (!(closeable == null)) {
            try {
                closeable.close();
                int i12 = f2660 + 21;
                f2661 = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable unused) {
                return;
            }
        }
        int i14 = f2660 + 93;
        f2661 = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        int i15 = 30 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m6633(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        String strM6627 = m6627(jSONObject);
        byte[] bytes = strM6627.getBytes(m6630(null, 127 - (Process.myTid() >> 22), null, "\u0085\u0084\u0083\u0082\u0081").intern());
        if ((m6636(strM6627) ? 'W' : '\f') != 'W') {
            return bytes;
        }
        int i10 = f2660 + 121;
        f2661 = i10 % 128;
        int i11 = i10 % 2;
        httpURLConnection.setRequestProperty(m6624("\u0013\b\f\u0001\u0006\u0010\u0004\u0011\u0006\f\u0018\u0005\u000e\u0002\f\u000e", 16 - View.getDefaultSize(0, 0), (byte) (20 - TextUtils.getCapsMode("", 0, 0))).intern(), m6624("\u000b\u0017\t\u0013", 4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 14)).intern());
        byte[] bArrM6634 = m6634(bytes);
        int i12 = f2661 + 109;
        f2660 = i12 % 128;
        int i13 = i12 % 2;
        return bArrM6634;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m6634(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            e = e11;
            gZIPOutputStream2 = gZIPOutputStream;
            throw new RuntimeException(e);
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6635(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m6632(dataOutputStream);
        int i10 = f2661 + 99;
        f2660 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 > 5209) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if ((r4 > 256) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.ix.f2661 + 15;
        com.ironsource.adqualitysdk.sdk.i.ix.f2660 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if ((r4 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m6636(java.lang.String r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ix.f2661
            r1 = 65
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ix.f2660 = r2
            int r0 = r0 % 2
            r2 = 9
            if (r0 != 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r0 = 1
            r3 = 0
            int r4 = r4.length()
            if (r1 == r2) goto L23
            r1 = 5209(0x1459, float:7.3E-42)
            if (r4 <= r1) goto L1f
            r4 = r0
            goto L20
        L1f:
            r4 = r3
        L20:
            if (r4 == 0) goto L3d
            goto L2c
        L23:
            r1 = 256(0x100, float:3.59E-43)
            if (r4 <= r1) goto L29
            r4 = r0
            goto L2a
        L29:
            r4 = r3
        L2a:
            if (r4 == 0) goto L3d
        L2c:
            int r4 = com.ironsource.adqualitysdk.sdk.i.ix.f2661
            int r4 = r4 + 15
            int r1 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ix.f2660 = r1
            int r4 = r4 % 2
            if (r4 == 0) goto L39
            return r0
        L39:
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L3b
        L3b:
            r4 = move-exception
            throw r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ix.m6636(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m6637(iq iqVar) {
        int i10 = f2660 + 43;
        f2661 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        if (iqVar == null) {
            return null;
        }
        String strM6592 = iqVar.m6592();
        int i11 = f2661 + 57;
        f2660 = i11 % 128;
        int i12 = i11 % 2;
        return strM6592;
    }
}
