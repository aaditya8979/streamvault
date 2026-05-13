package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.adqualitysdk.sdk.i.bb;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class aa<T> extends w<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static short[] f91 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f92 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f93 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f94 = {-72, 113, -124, -66, 120, -121, 120, -114, 114, -65, -54, 62, -49, 49, -54, -34, 35, -28, 13, -43, 59, -44, 51, 58, -55, -58, -79, -74, 66, -74, 106, -128, -80, 73, -71, 87, 90, -111, -80, 0, -3, 74, 6, ExifInterface.MARKER_APP1, 76, -78, 79, 98, -76, 9, -27, -16, -3, -63, 37, -37, 53, -116, 113, 49, -51, 61, -56, -57, 54, -113, 102, -53, 53, -56, -27};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f95 = 1306129093;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f96 = 673858351;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f97 = 81;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<WebView, js> f98 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<jk> f99 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jp f100;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f101;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f102;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f103;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private js f104;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f105;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aa$3, reason: invalid class name */
    public class AnonymousClass3 implements jk {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f106 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f109 = 0;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static boolean f111 = true;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f113 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f114 = 14;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f112 = {129, 130, 'p', 'q', 'o', 's', 'r', 'u', 'e', 'd', 'w', 133, 'O', 'V', '|', 'z', 128, 'S', '}', '.', 132, 'x'};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static long f107 = -6702392760180083472L;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f108 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f110 = 0;

        public AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ void m4344(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z10) {
            int i10 = f106 + 55;
            f109 = i10 % 128;
            boolean z11 = i10 % 2 == 0;
            anonymousClass3.m4345(webView, str, z10);
            if (!z11) {
                int i11 = 86 / 0;
            }
            int i12 = f109 + 111;
            f106 = i12 % 128;
            int i13 = i12 % 2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m4345(final WebView webView, final String str, final boolean z10) {
            t.m7069(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo4334 = aa.this.mo4334(webView);
                    t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3.2

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f124 = 1;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f125 = 0;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static long f126 = 51974363563975081L;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m4353(String str2, int i10) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (h.f2306) {
                                char[] cArrM6319 = h.m6319(f126, cArr, i10);
                                h.f2307 = 4;
                                while (true) {
                                    int i11 = h.f2307;
                                    if (i11 < cArrM6319.length) {
                                        h.f2305 = i11 - 4;
                                        cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f126));
                                        h.f2307++;
                                    } else {
                                        str3 = new String(cArrM6319, 4, cArrM6319.length - 4);
                                    }
                                }
                            }
                            return str3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                            try {
                                jSONObjectJsonObjectInit.put(ih.f2548, str);
                                jSONObjectJsonObjectInit.put(ih.f2549, m4353("\udf94\udfe3눟폀\uef77ⱆ붗", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
                                jSONObjectJsonObjectInit.put(ih.f2561, originalUrl);
                                if (z10) {
                                    int i10 = f124 + 105;
                                    f125 = i10 % 128;
                                    int i11 = i10 % 2;
                                    jSONObjectJsonObjectInit.put(ih.f2558, true);
                                }
                                int i12 = f124 + 45;
                                f125 = i12 % 128;
                                int i13 = i12 % 2;
                            } catch (JSONException e10) {
                                String strIntern = m4353("\u191f᥈軳\uef3f᭤\ud854\ue8ef챂鿒ܗ釕果ᐳ膆ࢯ\ufe6f誗᫆輏瓗", 1 - (Process.myTid() >> 22)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m4353("孊嬏탬넷ﵥ㹅荤\ua7f0\udd9c奚矐ఝ噧\udfa7\ueeab闚죈䓅楛ὴ䆶쵧\ue3c4預艹뎀媰憰糼㢌핏", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                                sb2.append(e10.getLocalizedMessage());
                                k.m6886(strIntern, sb2.toString());
                            }
                            C03703 c03703 = C03703.this;
                            aa aaVar = aa.this;
                            aaVar.mo5789(jSONObjectJsonObjectInit, webView, aa.m4329(aaVar), objMo4334);
                        }
                    });
                }
            });
            int i10 = f109 + 27;
            f106 = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4346(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f107) ^ ((long) f108)) ^ ((long) f110));
                        j.f2697 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            }
            return str4;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4347(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f112;
                int i11 = f114;
                if (f113) {
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
                if (f111) {
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

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo4348(WebView webView) {
            int i10 = f109 + 65;
            f106 = i10 % 128;
            int i11 = i10 % 2;
            aa.m4321(aa.this, webView);
            int i12 = f106 + 79;
            f109 = i12 % 128;
            int i13 = i12 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo4349(WebView webView, String str) {
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put(ih.f2559, str);
                jSONObjectJsonObjectInit.put(ih.f2556, ih.f2553);
                JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit2.put(ih.f2560, jSONObjectJsonObjectInit);
                aa aaVar = aa.this;
                aaVar.mo5785(jSONObjectJsonObjectInit2, webView, this, aaVar.mo4334(webView));
                int i10 = f106 + 93;
                f109 = i10 % 128;
                int i11 = i10 % 2;
            } catch (Exception e10) {
                kd.m6948(m4347(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0091\u0086\u0090\u0087\u008f\u0085\u008e\u0087\u008d\u008c\u0086\u008b\u008a\u0083\u0086\u0089").intern(), m4347(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u008f\u0093\u0081\u0096\u0094\u0082\u008f\u0086\u0095\u0086\u0094\u0084\u0084\u008c\u0094\u0088\u008f\u008b\u0082\u0085\u0086\u0091\u0084\u0094\u0091\u0093\u0091\u0091\u0092").intern(), e10, false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo4350(WebView webView, String str, String str2) {
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (!(!strSubstring.equals(m4347(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0086\u0085\u0084\u0083\u0082\u0081").intern()))) {
                int i10 = f109 + 109;
                f106 = i10 % 128;
                int i11 = i10 % 2;
                aa.m4321(aa.this, webView);
                return;
            }
            if (strSubstring.equals(m4346("Ⲥ턿\ue4bbა꺭㽪", (char) (ExpandableListView.getPackedPositionChild(0L) + 59468), "\uf4f0ꁐ克ꋼ", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "楬怕䯷珨").intern())) {
                JSONObject jSONObjectM4323 = aa.m4323(strSubstring2);
                aa aaVar = aa.this;
                aaVar.m4342(jSONObjectM4323, webView, aaVar.mo4334(webView));
                return;
            }
            if (strSubstring.equals(m4347(null, 127 - View.resolveSize(0, 0), null, "\u0085\u0085\u0084\u0083\u0082\u0081").intern())) {
                int i12 = f109 + 113;
                f106 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 21 : 'V') != 21) {
                    JSONObject jSONObjectM43232 = aa.m4323(strSubstring2);
                    aa aaVar2 = aa.this;
                    aaVar2.mo5780(jSONObjectM43232, webView, aa.m4329(aaVar2), aa.this.mo4334(webView));
                    return;
                } else {
                    JSONObject jSONObjectM43233 = aa.m4323(strSubstring2);
                    aa aaVar3 = aa.this;
                    aaVar3.mo5780(jSONObjectM43233, webView, aa.m4329(aaVar3), aa.this.mo4334(webView));
                    int i13 = 39 / 0;
                    return;
                }
            }
            if ((strSubstring.equals(m4347(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u0084\u0085\u0084\u0083\u0082\u0081").intern()) ? '0' : '9') == '9') {
                if (strSubstring.equals(m4347(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0087\u0085\u0084\u0083\u0082\u0081").intern())) {
                    int i14 = f109 + 59;
                    f106 = i14 % 128;
                    int i15 = i14 % 2;
                    JSONObject jSONObjectM43234 = aa.m4323(strSubstring2);
                    kd.m6950(jSONObjectM43234.optString(m4347(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u0088\u0085\u0082").intern()), jSONObjectM43234.optString(m4346("흹ꀂ䘩몚㍖", (char) (49468 - ((byte) KeyEvent.getModifierMetaStateMask())), "\uf4f0ꁐ克ꋼ", 1031845588 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "픝肶㴽濁").intern()), jSONObjectM43234.optString(m4346("ﱅ\ud835ƻ攬ﵣ桯", (char) (Color.argb(0, 0, 0, 0) + 1886), "\uf4f0ꁐ克ꋼ", (-1) - MotionEvent.axisFromString(""), "顭谐廪萇").intern()), jSONObjectM43234.optString(m4346("髂鿻懄쩮\uf4ae", (char) (50576 - Color.red(0)), "\uf4f0ꁐ克ꋼ", (-1758873904) - View.MeasureSpec.getSize(0), "킥⦶邗\uf8c5").intern()));
                    return;
                }
                return;
            }
            int i16 = f109 + 27;
            f106 = i16 % 128;
            if (i16 % 2 != 0) {
                JSONObject jSONObjectM43235 = aa.m4323(strSubstring2);
                jSONObjectM43235.remove(ih.f2557);
                aa aaVar4 = aa.this;
                aaVar4.mo5788(jSONObjectM43235, webView, aaVar4.mo4334(webView));
                return;
            }
            JSONObject jSONObjectM43236 = aa.m4323(strSubstring2);
            jSONObjectM43236.remove(ih.f2557);
            aa aaVar5 = aa.this;
            aaVar5.mo5788(jSONObjectM43236, webView, aaVar5.mo4334(webView));
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void mo4351(final WebView webView, final String str, final boolean z10) {
            t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo4352() {
                    if (aa.m4328(aa.this)) {
                        if (aa.m4322(aa.this) == null || aa.m4322(aa.this).isEmpty()) {
                            AnonymousClass3.m4344(AnonymousClass3.this, webView, str, z10);
                            return;
                        }
                        Iterator it = aa.m4322(aa.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m4344(AnonymousClass3.this, webView, str, z10);
                                return;
                            }
                        }
                    }
                }
            });
            int i10 = f106 + 59;
            f109 = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4320(WebView webView) {
        int i10 = f93 + 29;
        f92 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            this.f100.m6787(webView);
            throw null;
        }
        this.f100.m6787(webView);
        int i11 = f92 + 3;
        f93 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m4321(aa aaVar, WebView webView) {
        int i10 = f92 + 41;
        f93 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        aaVar.m4326(webView);
        if (z10) {
            throw null;
        }
        int i11 = f92 + 45;
        f93 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m4322(aa aaVar) {
        int i10 = f92 + 109;
        int i11 = i10 % 128;
        f93 = i11;
        int i12 = i10 % 2;
        List<String> list = aaVar.f103;
        int i13 = i11 + 111;
        f92 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m4323(String str) {
        int i10 = f92 + 7;
        f93 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '&' : '\r';
        JSONObject jSONObjectM4332 = m4332(str);
        if (c10 != '\r') {
            int i11 = 64 / 0;
        }
        return jSONObjectM4332;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4324(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f93 + 103;
        f92 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 22 : 'X') == 22) {
            jSONObject.remove(ih.f2557);
            super.mo4343(jSONObject, webView, t10);
            throw null;
        }
        jSONObject.remove(ih.f2557);
        super.mo4343(jSONObject, webView, t10);
        int i11 = f93 + 109;
        f92 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4325(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f97;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f94;
                i14 = bArr != null ? (byte) (bArr[f96 + i10] + i13) : (short) (f91[f96 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f96 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f95);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f94;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f91;
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4326(WebView webView) {
        int i10 = f92 + 111;
        f93 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f98.get(webView);
            throw null;
        }
        js jsVar = this.f98.get(webView);
        if (this.f105) {
            if (!(!jsVar.m6797())) {
                if (ki.m6989(webView) ? false : true) {
                    jsVar.m6799();
                }
                m4320(webView);
            }
        }
        int i11 = f93 + 1;
        f92 = i11 % 128;
        if ((i11 % 2 == 0 ? '<' : '1') != '<') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m4327(JSONObject jSONObject, WebView webView) {
        if ((webView != null ? (char) 20 : '>') != 20) {
            return;
        }
        int i10 = f92 + 9;
        f93 = i10 % 128;
        int i11 = i10 % 2;
        try {
            String str = ih.f2520;
            boolean z10 = false;
            if (!(webView.getWindowToken() != null)) {
                int i12 = f92 + 31;
                f93 = i12 % 128;
                int i13 = i12 % 2;
            } else {
                z10 = true;
            }
            jSONObject.put(str, z10);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4328(aa aaVar) {
        int i10 = f92;
        int i11 = i10 + 59;
        f93 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = aaVar.f101;
        int i13 = i10 + 59;
        f93 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ bb.e m4329(aa aaVar) {
        int i10 = f93 + 65;
        f92 = i10 % 128;
        int i11 = i10 % 2;
        bb.e eVarM4331 = aaVar.m4331();
        int i12 = f93 + 125;
        f92 = i12 % 128;
        int i13 = i12 % 2;
        return eVarM4331;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jk m4330() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        int i10 = f93 + 67;
        f92 = i10 % 128;
        int i11 = i10 % 2;
        return anonymousClass3;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bb.e m4331() {
        js jsVar = this.f104;
        if ((jsVar != null ? '\"' : ' ') == ' ') {
            int i10 = f93 + 27;
            f92 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 0 : '\b') != 0) {
                return null;
            }
            throw null;
        }
        int i11 = f92 + 49;
        f93 = i11 % 128;
        int i12 = i11 % 2;
        bb.e eVarM6798 = jsVar.m6798();
        int i13 = f93 + 123;
        f92 = i13 % 128;
        int i14 = i13 % 2;
        return eVarM6798;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m4332(String str) {
        int i10 = f92 + 21;
        f93 = i10 % 128;
        int i11 = i10 % 2;
        try {
            String strDecode = URLDecoder.decode(str, m4325((-673858303) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-1) - MotionEvent.axisFromString("")), TextUtils.getTrimmedLength("") - 1306129008, (byte) (2 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 83).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                return IronSourceVideoBridge.jsonObjectInit(strDecode);
            }
        } catch (Exception e10) {
            k.m6906(m4325((ViewConfiguration.getFadingEdgeLength() >> 16) - 673858342, (short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1306129006) - Color.blue(0), (byte) ((-58) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) - 81).intern(), m4325((-673858298) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) ((-1) - TextUtils.lastIndexOf("", '0')), (-1306129024) - TextUtils.getTrimmedLength(""), (byte) ((-57) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 81).intern(), e10);
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        int i12 = f92 + 67;
        f93 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectJsonObjectInit;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        WebView webView;
        try {
            if ((view instanceof WebView ? 'X' : (char) 6) != 'X') {
                return;
            }
            int i18 = f92 + 45;
            f93 = i18 % 128;
            if (!(i18 % 2 != 0)) {
                webView = (WebView) view;
                if (!this.f98.containsKey(webView)) {
                    return;
                }
            } else {
                webView = (WebView) view;
                int i19 = 55 / 0;
                if (!this.f98.containsKey(webView)) {
                    return;
                }
            }
            m4326(webView);
            int i20 = f93 + 29;
            f92 = i20 % 128;
            int i21 = i20 % 2;
        } catch (Throwable th2) {
            kd.m6948(m4325((-673858342) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-1306129007) - TextUtils.lastIndexOf("", '0'), (byte) ((-57) - Color.blue(0)), TextUtils.indexOf("", "", 0, 0) - 82).intern(), m4325(Color.alpha(0) - 673858326, (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1306129024) - TextUtils.getCapsMode("", 0, 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 80), (-82) - (Process.myTid() >> 22)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final WebView m4333() {
        int i10 = f92;
        int i11 = i10 + 79;
        f93 = i11 % 128;
        int i12 = i11 % 2;
        js jsVar = this.f104;
        if ((jsVar != null ? 'F' : 'S') != 'F') {
            return null;
        }
        int i13 = i10 + 97;
        f93 = i13 % 128;
        if ((i13 % 2 != 0 ? 'J' : ';') == ';') {
            return jsVar.m6800();
        }
        jsVar.m6800();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract T mo4334(WebView webView);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4335(List<WebView> list) {
        int i10 = f92 + 83;
        f93 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
            if (list == null) {
                return;
            }
        } else {
            if (!(list != null)) {
                return;
            }
        }
        Iterator<WebView> it = list.iterator();
        int i12 = f93 + 99;
        f92 = i12 % 128;
        while (true) {
            int i13 = i12 % 2;
            if ((it.hasNext() ? '*' : '/') != '*') {
                return;
            }
            m4340(it.next());
            i12 = f92 + 3;
            f93 = i12 % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4336() {
        Iterator<WebView> it = this.f98.keySet().iterator();
        while (true) {
            if ((it.hasNext() ? '#' : '@') != '#') {
                this.f99.clear();
                this.f104 = null;
                this.f98.clear();
                return;
            }
            WebView next = it.next();
            next.removeOnLayoutChangeListener(this);
            js jsVar = this.f98.get(next);
            Iterator<jk> it2 = this.f99.iterator();
            while (true) {
                if ((it2.hasNext() ? (char) 20 : (char) 29) != 20) {
                    break;
                }
                int i10 = f92 + 41;
                f93 = i10 % 128;
                if (i10 % 2 != 0) {
                    jsVar.m6801(it2.next());
                    throw null;
                }
                jsVar.m6801(it2.next());
            }
            int i11 = f93 + 15;
            f92 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4337(String str, List<String> list, boolean z10, boolean z11, boolean z12) {
        this.f105 = z10;
        this.f100 = new jp(str, z12);
        this.f101 = z11;
        this.f103 = list;
        int i10 = f93 + 11;
        f92 = i10 % 128;
        if ((i10 % 2 == 0 ? '`' : '$') != '`') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo4338(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f93 + 101;
        f92 = i10 % 128;
        char c10 = i10 % 2 == 0 ? ':' : '>';
        m4342(jSONObject, (WebView) obj, obj2);
        if (c10 != ':') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String mo4339(T t10) {
        int i10 = f92;
        int i11 = i10 + 49;
        f93 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f102;
        int i13 = i10 + 105;
        f93 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4340(WebView webView) {
        int i10 = f93 + 117;
        f92 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 17 / 0;
            if ((webView != null ? '\t' : (char) 28) != '\t') {
                return;
            }
        } else {
            if ((webView != null ? (char) 24 : '`') == '`') {
                return;
            }
        }
        if (this.f98.containsKey(webView)) {
            return;
        }
        int i12 = f93 + 111;
        f92 = i12 % 128;
        int i13 = i12 % 2;
        js jsVarM6793 = js.m6793(webView, m4325(View.resolveSizeAndState(0, 0, 0) - 673858351, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 1306128996, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 113), TextUtils.getOffsetBefore("", 0) - 82).intern());
        if (this.f104 == null) {
            this.f104 = jsVarM6793;
            int i14 = f93 + 83;
            f92 = i14 % 128;
            int i15 = i14 % 2;
        }
        this.f98.put(webView, jsVarM6793);
        jk jkVarM4330 = m4330();
        this.f99.add(jkVarM4330);
        jsVarM6793.m6796(jkVarM4330);
        m4326(webView);
        webView.addOnLayoutChangeListener(this);
        int i16 = f93 + 31;
        f92 = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4341(String str) {
        int i10 = f92 + 91;
        int i11 = i10 % 128;
        f93 = i11;
        int i12 = i10 % 2;
        this.f102 = str;
        int i13 = i11 + 63;
        f92 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 11 : 'G') == 'G') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4342(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f92 + 59;
        f93 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m4327(jSONObject, webView);
            super.mo4338(jSONObject, webView, t10);
        } else {
            m4327(jSONObject, webView);
            super.mo4338(jSONObject, webView, t10);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ void mo4343(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f93 + 29;
        f92 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'P' : 'V';
        m4324(jSONObject, (WebView) obj, obj2);
        if (c10 == 'P') {
            throw null;
        }
        int i11 = f92 + 109;
        f93 = i11 % 128;
        if ((i11 % 2 != 0 ? '\r' : (char) 15) == 15) {
        } else {
            throw null;
        }
    }
}
