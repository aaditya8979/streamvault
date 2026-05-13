package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ar;
import com.ironsource.adqualitysdk.sdk.i.je;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class s extends IronSourceAdQuality {

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static int f3021 = 1;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static long f3022;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private static char[] f3023;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f3024;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static s f3025;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private je f3026;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private an f3027;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private iz f3028;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private am f3029;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private iw f3031;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private at f3032;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private af f3034;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private ISAdQualityAdListener f3035;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Context f3036;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ISAdQualityConfig f3041;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ao f3044 = new ao();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3043 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f3042 = false;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3039 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3040 = false;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f3038 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private ISAdQualityLogLevel f3037 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f3030 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private final al f3033 = new al();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1, reason: invalid class name */
    public class AnonymousClass1 implements av {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3046;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final /* synthetic */ Context f3047;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3048;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final /* synthetic */ String f3049;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3050;

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1$3, reason: invalid class name */
        public class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1$3$4, reason: invalid class name */
            public class AnonymousClass4 extends ir {

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static long f3052 = 2703359542927637431L;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f3053 = 1;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f3054;

                public AnonymousClass4() {
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m7058(String str, int i10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (h.f2306) {
                        char[] cArrM6319 = h.m6319(f3052, cArr, i10);
                        h.f2307 = 4;
                        while (true) {
                            int i11 = h.f2307;
                            if (i11 < cArrM6319.length) {
                                h.f2305 = i11 - 4;
                                cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f3052));
                                h.f2307++;
                            } else {
                                str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                            }
                        }
                    }
                    return str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    s.m7002(s.this).m6708(m7058("矚\uf3ef蛽瞼㨲젴\uf1f2襰館\ud91a\ue0de顁ꨑ\ueaf4펈ꪊ묫\ufbca", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new je.b() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.3.4.1

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f3056 = 0;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static long f3057 = -378883568601775516L;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3058 = 1;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m7059(String str, int i10) {
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
                                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f3057);
                                        f.f2040++;
                                    } else {
                                        str2 = new String(cArr2);
                                    }
                                }
                            }
                            return str2;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[PHI: r5
                          0x0032: PHI (r5v6 boolean) = (r5v1 boolean), (r5v7 boolean) binds: [B:20:0x0030, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // com.ironsource.adqualitysdk.sdk.i.je.b
                        /* JADX INFO: renamed from: ﻛ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void mo6718(java.lang.String r5) {
                            /*
                                r4 = this;
                                int r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C03801.f3056
                                int r0 = r0 + 65
                                int r1 = r0 % 128
                                com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C03801.f3058 = r1
                                int r0 = r0 % 2
                                r1 = 1
                                r2 = 0
                                if (r0 != 0) goto L10
                                r0 = r2
                                goto L11
                            L10:
                                r0 = r1
                            L11:
                                if (r0 == r1) goto L24
                                boolean r5 = android.text.TextUtils.isEmpty(r5)
                                r0 = 73
                                int r0 = r0 / r2
                                if (r5 == 0) goto L1e
                                r0 = r1
                                goto L1f
                            L1e:
                                r0 = r2
                            L1f:
                                if (r0 == r1) goto L32
                                goto L68
                            L22:
                                r5 = move-exception
                                throw r5
                            L24:
                                boolean r5 = android.text.TextUtils.isEmpty(r5)
                                r0 = 46
                                if (r5 == 0) goto L2f
                                r1 = 53
                                goto L30
                            L2f:
                                r1 = r0
                            L30:
                                if (r1 == r0) goto L68
                            L32:
                                com.ironsource.adqualitysdk.sdk.i.s$1$3$4 r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.s$1$3 r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.s$1 r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.this
                                com.ironsource.adqualitysdk.sdk.i.s r0 = com.ironsource.adqualitysdk.sdk.i.s.this
                                com.ironsource.adqualitysdk.sdk.i.je r0 = com.ironsource.adqualitysdk.sdk.i.s.m7002(r0)
                                java.lang.String r1 = ""
                                int r1 = android.text.TextUtils.indexOf(r1, r1, r2, r2)
                                int r1 = r1 + 2039
                                java.lang.String r2 = "䈂䗿䷫嗦嶖旑淇痗綯ֿඑᖜᶕ▁"
                                java.lang.String r1 = m7059(r2, r1)
                                java.lang.String r1 = r1.intern()
                                int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
                                int r2 = r2 >> 16
                                int r2 = 28643 - r2
                                java.lang.String r3 = "䈂ⷦ鷎\u0dbeﶍ"
                                java.lang.String r2 = m7059(r3, r2)
                                java.lang.String r2 = r2.intern()
                                r3 = 0
                                r0.m6712(r1, r2, r3)
                            L68:
                                com.ironsource.adqualitysdk.sdk.i.s$1$3$4$1$4 r0 = new com.ironsource.adqualitysdk.sdk.i.s$1$3$4$1$4
                                r0.<init>()
                                com.ironsource.adqualitysdk.sdk.i.t.m7067(r0)
                                int r5 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C03801.f3058
                                int r5 = r5 + 93
                                int r0 = r5 % 128
                                com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C03801.f3056 = r0
                                int r5 = r5 % 2
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C03801.mo6718(java.lang.String):void");
                        }
                    });
                    int i10 = f3053 + 39;
                    f3054 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }
            }

            public AnonymousClass3() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                if (anonymousClass1.f3046) {
                    s.m7015(s.this).m4704(AnonymousClass1.this.f3047, new AnonymousClass4());
                }
            }
        }

        public AnonymousClass1(boolean z10, Context context, boolean z11, String str, boolean z12) {
            this.f3046 = z10;
            this.f3047 = context;
            this.f3048 = z11;
            this.f3049 = str;
            this.f3050 = z12;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.av
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4393() {
            t.m7071(new AnonymousClass3());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$5, reason: invalid class name */
    public class AnonymousClass5 extends ir {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char[] f3075 = {'M', 150, 162, 170, 179, 187, 182, 186, 190, 198, 182, 155, '$', '[', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'q', 'k', 'j', 'C', 'K', 'p', 'n', 'n', 'D', '@', 'h', 'p', 'H', 'E', 'h', 'o', 'L', 'F', 175, 218, 224, 224, 197, 190, 209, 214, 203, 205, 224, 217, 217, 183, 177, 219, 219, 221, 184, 182, 224, 222, 214, 218, 202, 159, 141, 142, 142, 176, 218, 224, 224, 197, 190, 209, 214, 203, 205, 224, 217, 217, 183, 177, 219, 219, 221, 184, 175, 218, 220, 215, 179, 180, 216, 176, 183, 222, 219, 180, 180, 198, 159, 141, 142, 142, 161, 183, 184, 184, 189, 182, 185, 169, 142, 142, 175, 209, 209, 216, 214, 207, 216, 219, 211, 175, 175, 208, 174, 179, 217, 215, 221, '7', 'h', '[', 'Z', 'j', 'o', 'f', 'g', 'i', 'k', 'p', 'l', 'f', 'I', 'N', 'q', 'P', '7', 'Z', 'v', 'd', 206, 202, 210, 218, 227, 235, 230, 234, 238, 246, 230, 203, 199, 181, 201, 243, 234, 233, 243, 238, 235, 234, 195, 195, 234, 240, 201, 202, 243, 239, 211, 173, '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'q', 'k', 'j', 'C', '4', 'N', 'J', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'L', '9', 'K', 'G'};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ String f3076;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f3077;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ Activity f3079;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ Application f3080;

        public AnonymousClass5(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f3077 = iSAdQualityConfig;
            this.f3076 = str;
            this.f3080 = application;
            this.f3079 = activity;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m7062(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f3075, i10, cArr, 0, i11);
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

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4352() {
            try {
                String userId = this.f3077.getUserId();
                s.m7032(s.this, this.f3077.getLogLevel());
                String strIntern = m7062("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7062("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", false, new int[]{12, 26, 0, 0}).intern());
                sb2.append(this.f3076);
                k.m6897(strIntern, sb2.toString());
                ij.m6573(this.f3080.getApplicationContext()).m6577();
                s.m7023(s.this, this.f3077.isTestMode());
                if (this.f3077.isTestMode()) {
                    k.m6890(m7062("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern(), m7062("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true, new int[]{38, 94, 109, 74}).intern());
                }
                try {
                    Class.forName(m7062("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false, new int[]{Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 20, 0, 6}).intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f3079;
                if (activity != null) {
                    jw.m6837(activity);
                } else {
                    jw.m6833(this.f3080);
                }
                s.m7025(s.this).m4541(this.f3076);
                s.m7025(s.this).m4547(this.f3077.getInitializationSource());
                s.m7025(s.this).m4542(this.f3077.getCoppa());
                s.m7025(s.this).m4544(this.f3077.getDeviceIdType());
                s.m7025(s.this).m4545(this.f3077.getMetaData());
                Context applicationContext = this.f3080.getApplicationContext();
                s.m7017(s.this, applicationContext);
                s.m7034(s.this, new iw(applicationContext));
                s sVar = s.this;
                s.m7042(s.this);
                s.m7026(sVar, new je(applicationContext, al.m4508(), "B0r1sW@sH3re"));
                ar.m4559().mo4585(applicationContext, s.m7019(s.this), s.m7042(s.this), new ar.c() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.1

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int[] f3081 = {161392192, 1499823339, -721695532, 1269414944, -1536597178, 1972528928, 1184997248, -2043409729, -1004510380, 458687647, -227969981, -1984234855, -432624880, 1761999894, -2057114334, -1735393248, -353286572, -2044858911};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f3082 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f3083;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m7063(int[] iArr, int i10) {
                        String str;
                        synchronized (e.f1934) {
                            char[] cArr = new char[4];
                            char[] cArr2 = new char[iArr.length << 1];
                            int[] iArr2 = (int[]) f3081.clone();
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo4627() {
                        int i10 = f3083 + 19;
                        f3082 = i10 % 128;
                        int i11 = i10 % 2;
                        s.m7031(s.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m7063(new int[]{-2023492544, 119760403, 1112005157, -1552877142, 650114569, -547908151, -1274178265, -1666651247, -1022986945, -1222045747, -2093729363, -2114175799, -1121388671, -1634671810, 1720117596, -983965390, 1489073122, 215868034}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35).intern());
                        int i12 = f3083 + 117;
                        f3082 = i12 % 128;
                        if (i12 % 2 != 0) {
                        } else {
                            throw null;
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4628() {
                        s sVar2;
                        ISAdQualityInitError iSAdQualityInitError;
                        String strM7063;
                        int i10 = f3082 + 45;
                        f3083 = i10 % 128;
                        if (i10 % 2 != 0) {
                            sVar2 = s.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM7063 = m7063(new int[]{1747955636, 701275797, -340711641, 167662369, 1304856093, -1186197523, -1810694215, -1744796554, 1015162854, 1270649485, -1305307675, -1285633435}, (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)) + 10);
                        } else {
                            sVar2 = s.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM7063 = m7063(new int[]{1747955636, 701275797, -340711641, 167662369, 1304856093, -1186197523, -1810694215, -1744796554, 1015162854, 1270649485, -1305307675, -1285633435}, 21 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        }
                        s.m7031(sVar2, iSAdQualityInitError, strM7063.intern());
                        int i11 = f3083 + 27;
                        f3082 = i11 % 128;
                        if ((i11 % 2 == 0 ? 'c' : 'I') != 'c') {
                        } else {
                            throw null;
                        }
                    }
                }, s.m7052(s.this));
                s.m7020(s.this, new iz(applicationContext, s.m7019(s.this), s.m7042(s.this).m4514()));
                final String strM6862 = jy.m6862(applicationContext);
                ar.m4559().mo4590(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.2

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static char f3086 = 62599;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f3087 = 1;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f3088 = 0;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char f3089 = 31914;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char f3090 = 32823;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char f3091 = 15337;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m7064(String str, int i10) {
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
                                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3091)) ^ ((c11 >>> 5) + f3086)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3089) ^ ((c12 + i12) ^ ((c12 << 4) + f3090))));
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4393() {
                        int i10 = f3087 + 101;
                        f3088 = i10 % 128;
                        int i11 = i10 % 2;
                        if (!ar.m4559().mo4589(m7064("\ue28e맦ᨣꡠ䁊\ua6fc", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5).intern(), strM6862)) {
                            s.m7036(s.this);
                            int i12 = f3088 + 121;
                            f3087 = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        int i14 = f3087 + 13;
                        f3088 = i14 % 128;
                        if ((i14 % 2 != 0 ? (char) 20 : '!') == '!') {
                        } else {
                            throw null;
                        }
                    }
                });
                ar.m4559().mo4588(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4393() {
                        ar.m4559().mo4584(s.m7010(s.this));
                    }
                });
                s.m7030(s.this, applicationContext);
                s.m7033(s.this, new af(applicationContext, s.m7025(s.this), s.m7042(s.this), this.f3079 != null, strM6862, new q() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.q
                    public void onEvent(final String str) {
                        t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.3.4

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static short[] f3095 = null;

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f3096 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static byte[] f3097 = {12, -52, -61, 37, -37, -1, -54, -27, -7, 21, -117, 86, -57, -53, 28, -61, 24, 21, -52, -61, 37, -69, 0};

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static int f3098 = 1;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static int f3099 = -2103921642;

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f3100 = 40;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static int f3101 = -1720684892;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static String m7065(int i10, int i11, byte b10, int i12, short s10) {
                                String string;
                                synchronized (o.f3015) {
                                    StringBuilder sb3 = new StringBuilder();
                                    int i13 = f3100;
                                    int i14 = i12 + i13;
                                    boolean z10 = i14 == -1;
                                    if (z10) {
                                        byte[] bArr = f3097;
                                        i14 = bArr != null ? (byte) (bArr[f3099 + i10] + i13) : (short) (f3095[f3099 + i10] + i13);
                                    }
                                    if (i14 > 0) {
                                        o.f3016 = ((i10 + i14) - 2) + f3099 + (z10 ? 1 : 0);
                                        o.f3017 = b10;
                                        char c10 = (char) (i11 + f3101);
                                        o.f3019 = c10;
                                        sb3.append(c10);
                                        o.f3018 = o.f3019;
                                        o.f3020 = 1;
                                        while (o.f3020 < i14) {
                                            byte[] bArr2 = f3097;
                                            if (bArr2 != null) {
                                                int i15 = o.f3016;
                                                o.f3016 = i15 - 1;
                                                o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                                            } else {
                                                short[] sArr = f3095;
                                                int i16 = o.f3016;
                                                o.f3016 = i16 - 1;
                                                o.f3019 = (char) (o.f3018 + (((short) (sArr[i16] + s10)) ^ o.f3017));
                                            }
                                            sb3.append(o.f3019);
                                            o.f3018 = o.f3019;
                                            o.f3020++;
                                        }
                                    }
                                    string = sb3.toString();
                                }
                                return string;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4352() {
                                int i10 = f3096 + 25;
                                f3098 = i10 % 128;
                                int i11 = i10 % 2;
                                s.m7015(s.this).m4702(m7065((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2103921642, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1720684992, (byte) ((Process.myPid() >> 22) - 38), Color.blue(0) - 17, (short) (17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), Collections.singletonList(str));
                                int i12 = f3096 + 59;
                                f3098 = i12 % 128;
                                int i13 = i12 % 2;
                            }
                        });
                    }
                }));
                if (!this.f3077.isUserIdSet()) {
                    s.m7025(s.this).m4534();
                    userId = s.m7011(s.this).m4442();
                }
                if (s.this.m7055()) {
                    s.m7011(s.this).m4449(new ag() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ag
                        public void onEventReceived(JSONObject jSONObject) {
                            in.m6586(s.m7013(s.this), ih.f2529, jSONObject, new Object[0]);
                        }
                    });
                }
                s.m7011(s.this).m4446(new je.d() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.je.d
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo6719() {
                        s.m7036(s.this);
                    }
                });
                s.m7018(s.this, new at(s.m7010(s.this), s.m7011(s.this), strM6862, new bb(), new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.10
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        s.m7031(s.this, iSAdQualityInitError, str);
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        s.m7008(s.this);
                    }
                }));
                s.m7015(s.this).m4706(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.6
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m7006(s.this) != null) {
                            s.m7006(s.this).adClosed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m7006(s.this) != null) {
                            s.m7006(s.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }
                });
                s.m7044(s.this, new am(s.m7015(s.this)));
                s.m7045(s.this, new an(s.m7011(s.this)));
                String strIntern2 = m7062("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m7062("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000", false, new int[]{152, 33, 128, 0}).intern());
                sb3.append(s.m7042(s.this).m4513());
                k.m6901(strIntern2, sb3.toString());
                s sVar2 = s.this;
                Context context = this.f3079;
                if (context == null) {
                    context = applicationContext;
                }
                s.m7038(sVar2, context, userId);
                s.m7037(s.this, applicationContext);
                s.m7003(s.this);
                s.m7000(s.this);
            } catch (Throwable th2) {
                String strIntern3 = m7062("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{185, 34, 0, 0}).intern();
                kd.m6956(m7062("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern(), strIntern3, th2, true, false, true);
                s.m7031(s.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern3);
            }
        }
    }

    static {
        m7016();
        f3025 = null;
        int i10 = f3021 + 31;
        f3024 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private s() {
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static /* synthetic */ Set m6998(s sVar) {
        int i10 = f3024;
        int i11 = i10 + 15;
        f3021 = i11 % 128;
        int i12 = i11 % 2;
        Set<ISAdQualityInitListener> set = sVar.f3030;
        int i13 = i10 + 7;
        f3021 = i13 % 128;
        if (i13 % 2 != 0) {
            return set;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static /* synthetic */ an m6999(s sVar) {
        int i10 = f3024;
        int i11 = i10 + 17;
        f3021 = i11 % 128;
        int i12 = i11 % 2;
        an anVar = sVar.f3027;
        int i13 = i10 + 59;
        f3021 = i13 % 128;
        if ((i13 % 2 == 0 ? ',' : 'H') != ',') {
            return anVar;
        }
        int i14 = 65 / 0;
        return anVar;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ void m7000(s sVar) {
        int i10 = f3024 + 57;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7024(false);
        int i12 = f3024 + 69;
        f3021 = i12 % 128;
        if ((i12 % 2 == 0 ? 'Q' : 'I') == 'I') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m7001() {
        int i10 = f3021 + 9;
        f3024 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 6 : 'J') == 6) {
            throw null;
        }
        return this.f3042;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ je m7002(s sVar) {
        int i10 = f3021;
        int i11 = i10 + 23;
        f3024 = i11 % 128;
        char c10 = i11 % 2 != 0 ? G5.T : '_';
        je jeVar = sVar.f3026;
        if (c10 != '_') {
            int i12 = 58 / 0;
        }
        int i13 = i10 + 43;
        f3024 = i13 % 128;
        if ((i13 % 2 == 0 ? 'H' : (char) 0) != 0) {
            return jeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ void m7003(s sVar) {
        int i10 = f3024 + 77;
        f3021 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            sVar.m7040(false);
        } else {
            sVar.m7040(true);
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m7004() {
        boolean z10;
        int i10 = f3021;
        int i11 = i10 + 77;
        f3024 = i11 % 128;
        int i12 = i11 % 2;
        z10 = this.f3043;
        int i13 = i10 + 35;
        f3024 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7005(s sVar) {
        int i10 = f3021 + 11;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM7004 = sVar.m7004();
        int i12 = f3021 + 71;
        f3024 = i12 % 128;
        if ((i12 % 2 != 0 ? '_' : (char) 18) == 18) {
            return zM7004;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ ISAdQualityAdListener m7006(s sVar) {
        int i10 = f3021 + 107;
        f3024 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        ISAdQualityAdListener iSAdQualityAdListener = sVar.f3035;
        if (!z10) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m7007() {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                for (ISAdQualityInitListener iSAdQualityInitListener : s.m6998(s.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                s.m6998(s.this).clear();
            }
        });
        int i10 = f3024 + 85;
        f3021 = i10 % 128;
        if ((i10 % 2 == 0 ? ']' : 'N') != ']') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ void m7008(s sVar) {
        int i10 = f3021 + 31;
        f3024 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        sVar.m7007();
        if (z10) {
            int i11 = 56 / 0;
        }
        int i12 = f3024 + 13;
        f3021 = i12 % 128;
        if ((i12 % 2 == 0 ? 'b' : '-') != 'b') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized boolean m7009() {
        boolean z10;
        int i10 = f3021 + 73;
        int i11 = i10 % 128;
        f3024 = i11;
        int i12 = i10 % 2;
        z10 = this.f3040;
        int i13 = i11 + 121;
        f3021 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ iz m7010(s sVar) {
        int i10 = f3021;
        int i11 = i10 + 121;
        f3024 = i11 % 128;
        int i12 = i11 % 2;
        iz izVar = sVar.f3028;
        int i13 = i10 + 59;
        f3024 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return izVar;
        }
        int i14 = 63 / 0;
        return izVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ af m7011(s sVar) {
        int i10 = f3021;
        int i11 = i10 + 89;
        f3024 = i11 % 128;
        int i12 = i11 % 2;
        af afVar = sVar.f3034;
        int i13 = i10 + 125;
        f3024 = i13 % 128;
        int i14 = i13 % 2;
        return afVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized ao m7012() {
        ao aoVar;
        int i10 = f3024 + 61;
        f3021 = i10 % 128;
        if (i10 % 2 == 0) {
            aoVar = this.f3044;
            int i11 = 5 / 0;
        } else {
            aoVar = this.f3044;
        }
        return aoVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ Context m7013(s sVar) {
        int i10 = f3024 + 39;
        int i11 = i10 % 128;
        f3021 = i11;
        int i12 = i10 % 2;
        Context context = sVar.f3036;
        int i13 = i11 + 115;
        f3024 = i13 % 128;
        int i14 = i13 % 2;
        return context;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject m7014() {
        int i10 = f3021 + 21;
        f3024 = i10 % 128;
        if (i10 % 2 != 0) {
            m7012().m4536();
            throw null;
        }
        Map<String, String> mapM4536 = m7012().m4536();
        if (mapM4536 != null && mapM4536.containsKey(m7046((char) ((Process.getThreadPriority(0) + 20) >> 6), 1032 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0, 0) + 13).intern())) {
            try {
                return IronSourceVideoBridge.jsonObjectInit(mapM4536.get(m7046((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1031, 12 - TextUtils.lastIndexOf("", '0', 0)).intern()));
            } catch (JSONException unused) {
            }
        }
        int i11 = f3021 + 69;
        f3024 = i11 % 128;
        if ((i11 % 2 != 0 ? '<' : '_') == '_') {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ at m7015(s sVar) {
        int i10 = f3024;
        int i11 = i10 + 85;
        f3021 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 25 : '%';
        at atVar = sVar.f3032;
        if (c10 != '%') {
            throw null;
        }
        int i12 = i10 + 61;
        f3021 = i12 % 128;
        int i13 = i12 % 2;
        return atVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static void m7016() {
        char[] cArr = new char[1654];
        ByteBuffer.wrap("vV<\u0081ãÄ\u0096\u001c]z\u0000k¶°}è \u001e×^\u009ad@\u0083÷Çº=a\u0007\u0014uÚ¡\u0081ë4\u0001ûA®zT¢\u001bèÎ\u000euB8:î®\u0095ïX\u001d\u000fR²|x´/ËÒR\u0099DLjò¬¹\u009el\u001c\u0013QÆd\u008c¾3\u009dæ\u0012\u00adFP6\u0006¦ÍÚpO'Vêl\u0090¸GÞ\nN±`dw*³ÑÓ\u0084\u001bKIþg¤¿k\u0096\u001e-Å/\u0088b>©åÑ¨\b_?\u0002eÈ\u00ad\u007fØ\"\u00040Õz=¥_Ð\u0086\u001bÁFùð3;{f\u0085\u0091òÜÒ\u0006\u0010\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷°BJ\u008dyØk\"ñmÿ¸\u000f\u0003\u0018Nk\u0098·ãë.\u001byVÄt\u000e¸YÓ¤Mïi:C\u0084\u009fÏÒ\u001aNeK°zú°EÑ\u0090\nÛR&}pö»Ê\u0006\u001eQ\u001d\u009c~æ¿1Á|QÇ_\u0012{\\¨\u0000IJ\u009e\u0095Ûà\u0003+evtÀ¯\u000b÷V\u0001¡Aì{6\u009c\u0081ØÌ\"\u0017\u0018bj¬¾÷ôB\u001e\u008d^Øe\"½m÷¸\u0011\u0003]N%\u0098³ãó.\u001ey\\Äg\u000e·YÙ¤MïY:f\u0084¸ÏÍ\u001a\u000be_2Äx\u0013§VÒ\u008e\u0019èDùò\"9zd\u008c\u0093ÌÞö\u0004b³Bþ %ðP®\u009e4Å~p\u008e¿Îêà\u0010=_\u007f\u008a\u008f1Ï|íª\u007fÑ\u007f\u001c\u0084KÀöã<1kI\u0096ÀÝÔ\bë¶7ý\f(\u0081WÓ\u0082¥È=wW¢\u0087éÒ\u0014ñB/\u0089K4\u0099c\u0090®èÔ4\u0003EN\u0085õ\u0093 én;\u0095KÀ\u009a\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷°BJ\u008d~ØW\"\u0090mú¸:\u0003MNd\u0098¾ãö.\u0018y@Ä&\u000e\u0080Yä¤&ï\u001a:p\u0084µÏÒ\u001aNeH°`ú EÖ\u0090\u000bÛS&~p¸»\u008d\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷ÔB9\u008dvØ`\"\u0080më¸\n\u0003TNl\u0098¦ãæ.LyjÄB\u000e\u0098Y\u0080¤\u001aïS:s\u0084¼Ï\u0081\u001a\u0000eN°dú¹E\u0082\u0090\u0000ÛN&)p³»Î\u0006\u0000QI\u009csæ÷1Ñ|\u0002Ç[\u0012y\\ø§Ìò\u0016=\u0011\\Y\u0016¶Éî¼ZwZ*;\u009c½Wï\n\u001bý[°qj´Ýê\u0090\u001aKV>|ðê«ª\u001ePÑL\u0084n~»1Ïä\u0014_[\u0012?Ä«¿är\u0018%\u0004\u0098hRé\u0005Øø\u0012³\u0000fsØ»\u0093×F\u00189\u0001ì}¦½\u0019\u0098Ì\u0010\u0087Kzc,¸çÀZD@p\n§Õâ :k\\6M\u0080\u0096KÎ\u00168áx¬Bv¥Áá\u008c\u001bW/\"Mì\u0088·×\u0002sÍo\u0098Qb\u009a-Âø3Ce\u000eEØË£Õn=9u\u0084KN\u008e\u0019öä#¯mz\u0010\u0000IJ\u009e\u0095Ûà\u0003+evtÀ¯\u000b÷V\u0001¡Aì{6\u009c\u0081ØÌ\"\u0017\u0016bt¬±÷îBJ\u008dYØa\"§mû¸\u0019\u0003\u0018Nl\u0098¼ãö.\u0018yPÄg\u000e¿YÉ¤\u0017ï_:c\u0084ôÏ\u008c\u001aNeU°gúõEÌ\u0090\nÛY&mpö»×\u0006\u001fQ\u001d\u009cyæ¿1Ñ|\u0005ÇZ\u0012d\\¯§Ëò\\k¦!qþ4\u008bì@\u008a\u001d\u009b«@`\u0018=îÊ®\u0087\u0094]\u0000ê §Â|\u0092\tÌÇH\u009c\u0013)öæø³\u0098IV\u0006\u0004Óðh³%\u0085óJ\u0088\u001e#'i¬¶ïÃ\u000f\b^U&ã\u0088(øu>\u0082GÏd\u0015¤¢òï\u001a4HA$\u008f§Ôöa\f®Dûe\u0001¹Në\u009b\u0001\u0000sJ¨\u0095èà\u0011+Qvs\u0000sJ©\u0095ñ`\u001f\u0000tJ½\u0095Åà\u0013+G¡ ëñ4¦AY\u008a\u000b×3cW)Íö\u0084\u0083dH+\u0015V£Ëh\u00895~Â1\u008f\u001aUÖâÑ¯>Z\u008f\u0010uÏ\"ºÂq\u008c,ë\u009awQ9\f×û\u008b¶¼llÛ8\u0096ÄMÜ8\u00adöu\u00ad \u0018Î\u0000EJ¿\u0095èà\b+Fv!À½\u000bþV\u001c¡Aìk6¡\u0081ûÌI\u0017Cbp¬µ÷ïB#\u008dSØ$ÉÆ\u0083)\\q)ÅâÅ¿¤\t(Âv\u009f\u008chÞ%àÿ/H9\u0005\u0099ÞÀ«ãe'>8\u008b\u0086DÖ\u0011¡ëy¤;q§Êî\u0087ÁQ3*Kç\u009c°Ý\rïÇ?\u0090Qm\u0091&\u009fóÑM\u0015\u0006oÓË¬Éyì3#\u008c\u0007Y\u0099\u0012Ñïù¹'rBÏ\u009a\u0098ÏUá/|\u0000YJ¢\u0095ïàG+YvtÀ½\u000bïVH¡\\ìl6¦\u0081èÌ\u0000\u0017Wbo¬¹÷çB\u000f\u008d\u0017ØM\"\u0082mß¸\u000f\u0003iNp\u0098³ãó.\u0005yMÄ\u007f\u000eóYó¤)ïq:'\u0084¶ÏÄ\u001a\beT°zú°E\u0082\u0090\fÛ]&epº»Ê\u0006\u001eQZ\u009c*æð1Ç|\u0019Ç_\u0012e\\¿§Àò'=L\u0088iÒ«\u001dïh\u0017³g\u0000NJ¨\u0095íàG+AvrÀ«\u000béVH¡\\ìf6ï\u0081ÿÌ\b\u0017Xb$¬¤÷½B\b\u008dRØ$\"¿më¸\u0007\u0003TN%\u0098½ãí.Ly\\Äk\u000e£YÔ¤\u0014¾Cô\u0099+Î^.\u0095`È&~èµèè\u001d\u001fVRv\u0088é?Ór+©\u0010Ül\u0012¥I»ü\u00023Dfn\u009c»Ó¶\u0006M½nðo&±]ø\u0090\u0019ÇZz °¸çÇ\u001a\u0000QY\u0084!:¡qÒ¤\u001aÛX\u000e.D§ûË.IeJ\u0098nÎ£\u0005Ö¸VïZ\",X§\u008fÃÂ\u001byQ¬iâþ\u0019ÍL\u001b\u0083W6'l±£ÕÖ\u0019\r*@+ö©-Ò`\u0017\u00975Ê(\u0000\u0094·êêS!0Tf\u008aúÁæt#«\u0004Þr\u0014\u008aKÙþ\u00105.h~\u009e¬ÕÔ\b^¿\u0010òP(\u0092_\u0084\u0000aJ£\u0095ãà\u0013+\\vhÀ \u000büVE¡Lìm6º\u0081±Ì\u001e\u0017Wbm¬¤\u0000EJ\u009f\u0095Èà(+fv Àî\u000bÂV\u0007¡@ì%6½\u0081ùÌI\u0017Cbp¬¹÷óB\r\u008d\u0017Øp\"¹mû¸K\u0003\\N`\u0098´ãþ.\u0019yUÄr\u000eóYÕ¤\u001eï_:u\u0084ôÏè\u001a*e\u001b\u009dñ×2\b\u0015}Ô¶\u008eë¿]b\u0096!Ë\u0097<\u0087q¼«{\u001c&Q\u0096\u008a\u009aÿ©1}j'ß\u0095\u0010\u009cE´¿.ð1%Õ\u009e\u0094Ó©\u0005-~!³\u0093ä\u0093Y·\u0093eÄ\u000e9Çr\u0080§ø\u0019~R\r\u0087Ôø\u0096-÷gCØ9\r\u0090F\u0085»¹í{&\\\u009bÊÌ\u0083\u0001¶{`¬[áÛZ\u0092\u008f±Áu:ZoÙ \u008f\u0015óOO\u0080*õí.ûc\u0083Õp\u000e\u0019CÇ´÷é¥#}\u0094WÉù\u0002Ùw\u009b©-û@±»nö\u001b\fÐ\r\u008dQ;\u0084ðÃ\u00ad\u0015Z}\u0017nÍ·zé7\u0019ì[\u0099cWé\f×¹7ve#=Ù½\u0096ôC\u0017øSµ<c\u0082\u0018ÂÕU\u0082I?lõð¢\u0099\u0000aJ©\u0095ëà8+]voÀ§\u000bïV7¡Wìn6 \u0081þ}\u009e7Tè\u0019\u009d¾V°\u000b\u0093½Jv\u001f+ÖÜ¦\u0000tJ¿\u0095ûà\u0004+QvcÀ¯\u000bøV\u0003¡\u001bìi6¹\u0081²Ì\r\u0017Tb-¬±÷óB\u000b\u008d[Ø}\"¥m÷¸\b\u0003KDë\u000e:Ñm¤\u0092oÀ2ø\u0084{Op\u0012\u0095åÎ¨èr2Åp\u0088ÜS\u009a&úè&³d\u0006\u009eÉÖ\u009cèf )eü\u0080\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìk6¡\u0081èÌ\f\u0017Dbm¬±÷ñBJ\u008dCØa\"¢mê¸K\u0003UNj\u0098¶ãú.Ly\u0014Ä&\u000e\u009aYó¤,ï^:V\u0084¡ÏÀ\u001a\u0002eR°|ú¬E\u0082\u0090<Ûx&Bpö»Ô\u0006\u0011QN\u009c*æ¤1Ì|\u0004ÇJ\u0012o\\·§Òò\u001c=\u0011\u0000MJ¸\u0095éà\u0013+\u0014vrÀ«\u000bïVH¡\\ìl6»\u0081ùÌ\u001b\u0017Xbb¬¼÷½B\u001e\u008dRØw\"¥m¾¸\u0006\u0003WNa\u0098·ã¿.\u000ey\\Ä`\u000e¼YÒ¤\bï\u001a:n\u0084ºÏÈ\u001a\u001aeR°iú¹EË\u0090\u0015ÛU&gp±»\u0082\u00052Oð\u0090\u00adåF.\bs;Åù\u000eæSR¤\bé%3ù\u0084¡ÉN\u0012Kg1©àòºGP\u0088\u000bÝ9'¬h\u008f½y\u0006?K\u0002\u009dÄæ\u009e+f|5Á\u0016\u000bÈ\\²¡pê.?\u0011\u0081Ã\u009cÐÖ:\te|\u009d·Çêó\\x\u0097yÊ\u0091=\u0083pæª<\u001dmP\u0096\u008bÓþá0#kyÞÜ\u0011ÃDó¾3ñ|$\u0098\u009fÜÒê\u0004d\u007f{²\u009fåÌXõ\u0092,Å@8\u009esÞ\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìc6«\u0081¼Ì\u0005\u0017_bp¬¤÷øB\u0004\u008dRØv\"ñm³¸K\u0003qNV\u0098\u0093ãû.=yLÄg\u000e¿YÉ¤\u0019ïC:'\u0084\u0087Ïå\u001a%e\u001b°\u007fú´EÑ\u0090OÛO&ap£»×\u0006\u0014QR\u009c}æ¹1\u008a\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u0006¡Qì\"6¬\u0081éÌ\u001a\u0017Bbl¬½÷½B\u0007\u008dRØ`\"¸mÿ¸\u001f\u0003QNj\u0098¼ã¿.\u001ey\\Äp\u000e¶YÎ¤\u0018ï_:'\u0084ùÏ\u0081\u001a'eh°Iú±Eó\u0090\u001aÛ]&ep¿»×\u0006\tQ\u001d\u009cYæ\u00931ï|QÇI\u0012j\\«§\u0085ò\u0001=W\u0088yÒ\u00ad\u001dÂh\u001c³7þcHô\u008e\u0003Äì\u001b´n\u0000¥\u0000øaNý\u0085¾ØF/\u0011bb¸ì\u000f©BZ\u0099\u0002ì,\"ýyýÌG\u0003\u0012V ¬øã¿6_\u008d\u0011À*\u0016ümÿ ^÷\u001cJ0\u0080ö×\u008e*Xa\u001f´g\n¹AÁ\u0094gë(>\ttñË³\u001eZU\u001d¨%þÿ5\u0097\u0088Iß]\u0012\u0019hÓ¿¯ò\u0011I\u0017\u009c8Ò¸)\u008b|]³\u000b\u0006l\\ð\u0093\u0088æZ=tp$Æû\u001d\u008bP]§{ú+0ÿ\u0087Æ\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìq6ª\u0081ûÌ\u0004\u0017Sbm¬¤÷½BG\u008d\u0017ØM\"\u0082mß¸\u000f\u0003iNp\u0098³ãó.\u0005yMÄ\u007f\u000eóYó¤)ïq:'\u0084£ÏÀ\u001a\u001de\u001b°{ú½E×\u0090\u001bÛX&fp¡»Í\u0006^Z\u0080\u0010oÏ7º\u0083q\u0083,â\u009a~Q=\fßûÖ¶¢lcÛ1\u0096ÌM\u009c8§ö3\u00ads\u0018\u0089×½\u0082\u0094xS79âùY\u008e\u0014§Â}¹5tÛ#\u0083\u009eåTC\u0003'þåµÙ`³Þv\u0095\u0011@\u008d?\u008bê£ c\u001f\u0015ÊÈ\u0081\u0090|½*{áN\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìa6 \u0081òÌ\u000f\u0017_bd¬ð÷°BJ\u008d~ØW\"\u0090mú¸:\u0003MNd\u0098¾ãö.\u0018y@Ä&\u000e\u0080Yä¤&ï\u001a:n\u0084§Ï\u0081\u001a\u000feW°zú°EÃ\u0090\u000bÛE&)p¿»Í\u0006\u0019QI\u009ccæ¶1È|\u0018ÇD\u0012n\\¼§\u008bÆ·\u008ctS*&Öí\u0098°º\u0006OÍ5\u0090Äg\u008e*\u0083ðxG,\nÞÑ\u009c¤\u0082jm1,\u0084ÚK\u008f\u001e³äh".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1654);
        f3023 = cArr;
        f3022 = 7154453121027623629L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Context m7017(s sVar, Context context) {
        int i10 = f3024 + 71;
        f3021 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        sVar.f3036 = context;
        if (z10) {
            throw null;
        }
        return context;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ at m7018(s sVar, at atVar) {
        int i10 = f3024;
        int i11 = i10 + 63;
        f3021 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3032 = atVar;
        int i13 = i10 + 111;
        f3021 = i13 % 128;
        if (i13 % 2 != 0) {
            return atVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ iw m7019(s sVar) {
        int i10 = f3021;
        int i11 = i10 + 81;
        f3024 = i11 % 128;
        int i12 = i11 % 2;
        iw iwVar = sVar.f3031;
        int i13 = i10 + 51;
        f3024 = i13 % 128;
        if ((i13 % 2 != 0 ? 'Z' : 'a') == 'a') {
            return iwVar;
        }
        int i14 = 72 / 0;
        return iwVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ iz m7020(s sVar, iz izVar) {
        int i10 = f3021 + 95;
        int i11 = i10 % 128;
        f3024 = i11;
        char c10 = i10 % 2 != 0 ? '<' : 'X';
        sVar.f3028 = izVar;
        if (c10 != 'X') {
            throw null;
        }
        int i12 = i11 + 59;
        f3021 = i12 % 128;
        if ((i12 % 2 == 0 ? '(' : '5') != '(') {
            return izVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m7021(Context context) {
        int i10 = f3024 + 43;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        String strM6713 = this.f3026.m6713(m7046((char) (32247 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTapTimeout() >> 16) + IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES, TextUtils.lastIndexOf("", '0', 0, 0) + 11).intern());
        if (!TextUtils.isEmpty(strM6713)) {
            new je(context, m7046((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25).intern(), m7046((char) (17560 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 1080, 23 - ImageFormat.getBitsPerPixel(0)).intern()).m6714(m7046((char) (32247 - TextUtils.indexOf("", "")), 1045 - Gravity.getAbsoluteGravity(0, 0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), strM6713);
            this.f3026.m6710(m7046((char) (Gravity.getAbsoluteGravity(0, 0) + 32247), 1045 - (ViewConfiguration.getLongPressTimeout() >> 16), 10 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        }
        int i12 = f3024 + 121;
        f3021 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m7022(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f3021 + 91;
        f3024 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f3037 = iSAdQualityLogLevel;
            throw null;
        }
        this.f3037 = iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m7023(s sVar, boolean z10) {
        int i10 = f3024 + 37;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7043(z10);
        int i12 = f3021 + 3;
        f3024 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m7024(boolean z10) {
        int i10 = f3021 + 35;
        f3024 = i10 % 128;
        if ((i10 % 2 != 0 ? 'F' : (char) 16) != 'F') {
            this.f3042 = z10;
        } else {
            this.f3042 = z10;
            int i11 = 2 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ao m7025(s sVar) {
        int i10 = f3024 + 87;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        ao aoVarM7012 = sVar.m7012();
        int i12 = f3024 + 111;
        f3021 = i12 % 128;
        int i13 = i12 % 2;
        return aoVarM7012;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ je m7026(s sVar, je jeVar) {
        int i10 = f3021 + 91;
        f3024 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        sVar.f3026 = jeVar;
        if (z10) {
            throw null;
        }
        return jeVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static s m7027() {
        synchronized (s.class) {
            if (f3025 == null) {
                f3025 = new s();
            }
        }
        return f3025;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m7028(Context context) {
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    jw.m6839(intent);
                }
            }, new IntentFilter(m7046((char) (1363 - (Process.myPid() >> 22)), 1212 - (ViewConfiguration.getScrollBarSize() >> 8), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()), null, t.m7066());
            int i10 = f3024 + 17;
            f3021 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            k.m6892(m7046((char) (12435 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 74, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m7046((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 40086), 1249 - (ViewConfiguration.getTouchSlop() >> 8), 34 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m7029(Context context, String str, boolean z10, boolean z11, boolean z12) {
        String strM4543 = m7012().m4543();
        m7012().m4538(str);
        if (!(str != null)) {
            int i10 = f3021 + 117;
            f3024 = i10 % 128;
            int i11 = i10 % 2;
            k.m6890(m7046((char) (TextUtils.indexOf("", "", 0, 0) + 12436), 73 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTouchSlop() >> 8) + 12).intern(), m7046((char) (48646 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 772, TextUtils.getCapsMode("", 0, 0) + 93).intern());
        } else if (str.equals(m7046((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 866, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17).intern())) {
            String strIntern = m7046((char) (12436 - (ViewConfiguration.getScrollBarSize() >> 8)), 74 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 12).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7046((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 882, 40 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb2.append(str);
            sb2.append(m7046((char) (KeyEvent.normalizeMetaState(0) + 40415), KeyEvent.getDeadChar(0, 0) + 922, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 76).intern());
            k.m6890(strIntern, sb2.toString());
        } else {
            String strIntern2 = m7046((char) (12436 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 74, 12 - ExpandableListView.getPackedPositionType(0L)).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m7046((char) (KeyEvent.normalizeMetaState(0) + 64281), 999 - (ViewConfiguration.getPressedStateDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 33).intern());
            sb3.append(str);
            k.m6897(strIntern2, sb3.toString());
            int i12 = f3021 + 39;
            f3024 = i12 % 128;
            int i13 = i12 % 2;
        }
        ar.m4559().mo4583(new AnonymousClass1(z10, context, z11, strM4543, z12));
        JSONObject jSONObjectM7014 = m7014();
        if (!(jSONObjectM7014 != null)) {
            ar.m4559().mo4582(context, m7012(), true);
            return;
        }
        int i14 = f3021 + 67;
        f3024 = i14 % 128;
        int i15 = i14 % 2;
        ar.m4559().mo4591(jSONObjectM7014);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m7030(s sVar, Context context) {
        int i10 = f3024 + 101;
        f3021 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        sVar.m7021(context);
        if (z10) {
            throw null;
        }
        int i11 = f3021 + 95;
        f3024 = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        int i12 = 23 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m7031(s sVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i10 = f3024 + 101;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7049(iSAdQualityInitError, str);
        int i12 = f3024 + 23;
        f3021 = i12 % 128;
        if ((i12 % 2 == 0 ? '*' : '-') != '*') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m7032(s sVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f3021 + 117;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7022(iSAdQualityLogLevel);
        int i12 = f3024 + 25;
        f3021 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ af m7033(s sVar, af afVar) {
        int i10 = f3024;
        int i11 = i10 + 77;
        f3021 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3034 = afVar;
        int i13 = i10 + 77;
        f3021 = i13 % 128;
        if ((i13 % 2 == 0 ? '^' : 'K') == 'K') {
            return afVar;
        }
        int i14 = 63 / 0;
        return afVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ iw m7034(s sVar, iw iwVar) {
        int i10 = f3024;
        int i11 = i10 + 101;
        f3021 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3031 = iwVar;
        int i13 = i10 + 21;
        f3021 = i13 % 128;
        int i14 = i13 % 2;
        return iwVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7035(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3021 + 17;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        m7047(activity.getApplication(), activity, str, iSAdQualityConfig);
        int i12 = f3024 + 51;
        f3021 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m7036(s sVar) {
        int i10 = f3024 + 73;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7050(true);
        int i12 = f3021 + 77;
        f3024 = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        int i13 = 34 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m7037(s sVar, Context context) {
        int i10 = f3021 + 99;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7028(context);
        int i12 = f3021 + 43;
        f3024 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m7038(s sVar, Context context, String str) {
        int i10 = f3021 + 31;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7029(context, str, true, false, true);
        int i12 = f3021 + 5;
        f3024 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7039(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i10 = f3021 + 55;
        f3024 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 14 : '\"') != '\"') {
            int i11 = 44 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m7040(boolean z10) {
        int i10 = f3021 + 31;
        f3024 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        this.f3043 = true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m7041(String str) {
        if ((m7054() ? '^' : '\b') == '^') {
            k.m6890(m7046((char) (KeyEvent.keyCodeFromString("") + 12436), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 74, 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m7046((char) (TextUtils.getOffsetAfter("", 0) + 51589), 621 - (ViewConfiguration.getScrollBarSize() >> 8), 52 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            int i10 = f3021 + 53;
            f3024 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!(!m7004())) {
            if (!(TextUtils.isEmpty(str))) {
                return true;
            }
            k.m6890(m7046((char) (12436 - Color.green(0)), MotionEvent.axisFromString("") + 75, 12 - View.combineMeasuredStates(0, 0)).intern(), m7046((char) (Process.myPid() >> 22), 737 - TextUtils.lastIndexOf("", '0', 0), 33 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
            return false;
        }
        k.m6890(m7046((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12436), 74 - (KeyEvent.getMaxKeyCode() >> 16), 11 - ImageFormat.getBitsPerPixel(0)).intern(), m7046((char) KeyEvent.keyCodeFromString(""), 672 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.getOffsetBefore("", 0) + 65).intern());
        int i12 = f3021 + 83;
        f3024 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        int i13 = 40 / 0;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ al m7042(s sVar) {
        int i10 = f3024;
        int i11 = i10 + 109;
        f3021 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 2 : (char) 19;
        al alVar = sVar.f3033;
        if (c10 == 2) {
            int i12 = 5 / 0;
        }
        int i13 = i10 + 77;
        f3021 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return alVar;
        }
        int i14 = 41 / 0;
        return alVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m7043(boolean z10) {
        int i10 = f3021 + 25;
        int i11 = i10 % 128;
        f3024 = i11;
        if ((i10 % 2 != 0 ? '[' : '\r') != '\r') {
            this.f3040 = z10;
            throw null;
        }
        this.f3040 = z10;
        int i12 = i11 + 97;
        f3021 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 15 : '0') != '0') {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ am m7044(s sVar, am amVar) {
        int i10 = f3024 + 3;
        f3021 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        sVar.f3029 = amVar;
        if (!z10) {
            return amVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ an m7045(s sVar, an anVar) {
        int i10 = f3024;
        int i11 = i10 + 55;
        f3021 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3027 = anVar;
        int i13 = i10 + 39;
        f3021 = i13 % 128;
        if ((i13 % 2 == 0 ? '!' : (char) 24) == 24) {
            return anVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7046(char c10, int i10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f3023[i10 + i12]) ^ (((long) i12) * f3022)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m7047(Application application, Activity activity, String str, @Nullable ISAdQualityConfig iSAdQualityConfig) {
        String strIntern = m7046((char) ((ViewConfiguration.getTapTimeout() >> 16) + 12436), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, (ViewConfiguration.getScrollBarSize() >> 8) + 12).intern();
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (bc.m4871().isEmpty()) {
            String strIntern2 = m7046((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 86, ((byte) KeyEvent.getModifierMetaStateMask()) + 58).intern();
            k.m6901(strIntern, strIntern2);
            m7039(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.NO_AD_NETWORKS, strIntern2);
            return;
        }
        if (!m7051(iSAdQualityConfig)) {
            int i10 = f3024 + 15;
            f3021 = i10 % 128;
            int i11 = i10 % 2;
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f3041, iSAdQualityConfig);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfig;
        if ((m7001() ? 'I' : (char) 11) != 11) {
            String strIntern3 = m7046((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 143 - Gravity.getAbsoluteGravity(0, 0), 40 - TextUtils.getOffsetBefore("", 0)).intern();
            k.m6901(strIntern, strIntern3);
            m7039(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern3);
            return;
        }
        if (m7004()) {
            String strIntern4 = m7046((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12940), (Process.myPid() >> 22) + 183, 'k' - AndroidCharacter.getMirror('0')).intern();
            k.m6901(strIntern, strIntern4);
            m7039(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern4);
            return;
        }
        if (m7054()) {
            String strIntern5 = m7046((char) Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 242, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48).intern();
            k.m6890(strIntern, strIntern5);
            m7039(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern5);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig2.getUserId())) {
            if ((iSAdQualityConfig2.isUserIdSet() ? (char) 20 : '7') == 20) {
                int i12 = f3024 + 65;
                f3021 = i12 % 128;
                int i13 = i12 % 2;
                String strIntern6 = m7046((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 290, 60 - TextUtils.indexOf("", "")).intern();
                k.m6890(strIntern, strIntern6);
                m7039(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern6);
                return;
            }
        }
        if ((TextUtils.isEmpty(str) ? 'Q' : '\r') == '\r') {
            this.f3030.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
            m7024(true);
            jj.m6752().mo6758(application, activity);
            jd.m6691().m6700();
            jf.m6732().m6738();
            t.m7071(new AnonymousClass5(iSAdQualityConfig2, str, application, activity));
            return;
        }
        int i14 = f3021 + 45;
        f3024 = i14 % 128;
        int i15 = i14 % 2;
        String strIntern7 = m7046((char) (TextUtils.getCapsMode("", 0, 0) + 23578), 350 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 48 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
        k.m6890(strIntern, strIntern7);
        m7039(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern7);
        int i16 = f3021 + 67;
        f3024 = i16 % 128;
        if ((i16 % 2 != 0 ? (char) 27 : (char) 30) != 30) {
            int i17 = 84 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m7048(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3024 + 79;
        f3021 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 11 : '*';
        m7047(application, null, str, iSAdQualityConfig);
        if (c10 == 11) {
            int i11 = 75 / 0;
        }
        int i12 = f3024 + 89;
        f3021 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m7049(ISAdQualityInitError iSAdQualityInitError, String str) {
        int i10 = f3024 + 61;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        m7039(this.f3030, iSAdQualityInitError, str);
        int i12 = f3021 + 125;
        f3024 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:14|(1:16)|17|18|(1:20)(1:21)|(4:23|24|(1:26)(1:27)|(9:29|53|34|35|(1:37)|38|39|40|41)(1:30))(1:32)|31|53|34|35|(0)|38|39|40|41) */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e6 A[Catch: all -> 0x0270, Exception -> 0x0272, TryCatch #2 {Exception -> 0x0272, blocks: (B:4:0x0008, B:6:0x000e, B:9:0x0057, B:11:0x005d, B:14:0x00a4, B:16:0x00c8, B:17:0x00f8, B:29:0x0117, B:34:0x0173, B:35:0x0195, B:37:0x01e6, B:38:0x0217, B:30:0x0139, B:31:0x0152, B:32:0x0157), top: B:52:0x0008, outer: #0 }] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m7050(boolean r14) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.s.m7050(boolean):void");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m7051(ISAdQualityConfig iSAdQualityConfig) {
        if (this.f3041 == null) {
            int i10 = f3021 + 39;
            f3024 = i10 % 128;
            return !(i10 % 2 != 0);
        }
        try {
            String str = iSAdQualityConfig.getMetaData().get(m7046((char) (Process.getGidForName("") + 1), 1032 - TextUtils.getOffsetBefore("", 0), 13 - KeyEvent.getDeadChar(0, 0)).intern());
            if (!TextUtils.isEmpty(str)) {
                return IronSourceVideoBridge.jsonObjectInit(str).optBoolean(m7046((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 50909), TextUtils.indexOf("", "") + 1632, 22 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            }
            int i11 = f3021 + 45;
            f3024 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable unused) {
        }
        int i13 = f3024 + 115;
        f3021 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7052(s sVar) {
        int i10 = f3021 + 57;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM7009 = sVar.m7009();
        int i12 = f3024 + 9;
        f3021 = i12 % 128;
        int i13 = i12 % 2;
        return zM7009;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        try {
            if (m7041(str)) {
                boolean z10 = !(str.equals(m7012().m4543()));
                boolean zMo6757 = jj.m6752().mo6757();
                if ((z10 ? (char) 22 : 'P') == 22) {
                    if ((zMo6757 ? ':' : (char) 14) == ':') {
                        this.f3034.m4443();
                        int i10 = f3024 + 33;
                        f3021 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
                m7029(this.f3036, str, z10, true, zMo6757);
                int i12 = f3024 + 39;
                f3021 = i12 % 128;
                int i13 = i12 % 2;
            }
        } catch (Exception e10) {
            String strIntern = m7046((char) (12436 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7046((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 599 - ExpandableListView.getPackedPositionChild(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20).intern());
            sb2.append(str);
            kd.m6956(strIntern, sb2.toString(), e10, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        int i10 = f3024 + 43;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        initialize(context, str, null);
        int i12 = f3024 + 29;
        f3021 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3021 + 45;
        int i11 = i10 % 128;
        f3024 = i11;
        int i12 = i10 % 2;
        if ((context instanceof Application ? (char) 28 : (char) 29) == 28) {
            int i13 = i11 + 35;
            f3021 = i13 % 128;
            char c10 = i13 % 2 == 0 ? 'c' : (char) 0;
            m7048((Application) context, str, iSAdQualityConfig);
            if (c10 != 0) {
                int i14 = 68 / 0;
                return;
            }
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m7048((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        if ((context instanceof Activity ? 'S' : '@') != 'S') {
            String strIntern = m7046((char) (30239 - Drawable.resolveOpacity(0, 0)), ViewConfiguration.getTouchSlop() >> 8, (ViewConfiguration.getJumpTapTimeout() >> 16) + 74).intern();
            k.m6890(m7046((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12436), 73 - ExpandableListView.getPackedPositionChild(0L), (KeyEvent.getMaxKeyCode() >> 16) + 12).intern(), strIntern);
            m7039(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
            int i15 = f3021 + 121;
            f3024 = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        int i17 = f3024 + 119;
        f3021 = i17 % 128;
        if (i17 % 2 != 0) {
            m7035((Activity) context, str, iSAdQualityConfig);
        } else {
            m7035((Activity) context, str, iSAdQualityConfig);
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i10 = f3024 + 103;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        if ((m7054() ? (char) 1 : 'Z') == 1) {
            int i12 = f3024 + 53;
            f3021 = i12 % 128;
            int i13 = i12 % 2;
            k.m6890(m7046((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12436), View.MeasureSpec.getMode(0) + 74, 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m7046((char) TextUtils.getCapsMode("", 0, 0), 1337 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 67).intern());
            return;
        }
        if (!(m7004())) {
            k.m6890(m7046((char) (12435 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "", 0, 0) + 74, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m7046((char) (36416 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1404 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 73).intern());
            return;
        }
        this.f3029.m4527(iSAdQualityCustomMediationRevenue);
        int i14 = f3024 + 57;
        f3021 = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f3024 + 87;
        f3021 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m7054();
            throw null;
        }
        if (!m7054()) {
            this.f3035 = iSAdQualityAdListener;
            return;
        }
        k.m6890(m7046((char) (12484 - AndroidCharacter.getMirror('0')), 74 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 12).intern(), m7046((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1285, TextUtils.getCapsMode("", 0, 0) + 53).intern());
        int i11 = f3024 + 95;
        f3021 = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3021 + 95;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        if (!(!m7054())) {
            int i12 = f3024 + 71;
            f3021 = i12 % 128;
            int i13 = i12 % 2;
            k.m6890(m7046((char) (KeyEvent.keyCodeFromString("") + 12436), 74 - View.MeasureSpec.getMode(0), 12 - TextUtils.indexOf("", "")).intern(), m7046((char) (TextUtils.lastIndexOf("", '0', 0) + 23236), 1526 - View.getDefaultSize(0, 0), 48 - (Process.myTid() >> 22)).intern());
            return;
        }
        if (!(!m7001())) {
            k.m6890(m7046((char) (12436 - KeyEvent.keyCodeFromString("")), 74 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 13).intern(), m7046((char) Color.red(0), 1573 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 58).intern());
            return;
        }
        this.f3041 = iSAdQualityConfig;
        int i14 = f3024 + 21;
        f3021 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 22 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        int i10 = f3021 + 73;
        f3024 = i10 % 128;
        int i11 = i10 % 2;
        if (m7054()) {
            int i12 = f3021 + 55;
            f3024 = i12 % 128;
            int i13 = i12 % 2;
            k.m6890(m7046((char) (12436 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "", 0) + 74, Gravity.getAbsoluteGravity(0, 0) + 12).intern(), m7046((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1476, (ViewConfiguration.getTouchSlop() >> 8) + 49).intern());
            return;
        }
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.4

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f3070 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f3071 = -1054491529785472550L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f3072;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m7061(String str, int i14) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2041) {
                    f.f2039 = i14;
                    char[] cArr2 = new char[cArr.length];
                    f.f2040 = 0;
                    while (true) {
                        int i15 = f.f2040;
                        if (i15 < cArr.length) {
                            cArr2[i15] = (char) (((long) (cArr[i15] ^ (f.f2039 * i15))) ^ f3071);
                            f.f2040++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (!s.m7005(s.this)) {
                    int i14 = f3072 + 109;
                    f3070 = i14 % 128;
                    int i15 = i14 % 2;
                    k.m6890(m7061("覛쥥࠽䬾諗췱\u0c91䱓轻츺Đ䃸", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16602).intern(), m7061("覙琌狚烘署絩篣禾搖投悏潢洩毼榽名勞僝弩嵯察妊䐡䋏䂣佰䴭䯻䦷㐕㋑ビ㽩㴉㯟㧿␏⋚⃐⽕ⴭ⯡⧼ᐎዀ႘ὌᴪᯫᦱЍ˕\u0093ཝ൮", 64951 - TextUtils.getOffsetBefore("", 0)).intern());
                    return;
                }
                if ((s.m6999(s.this) != null ? (char) 26 : '`') != '`') {
                    s.m6999(s.this).m4532(iSAdQualitySegment);
                }
                int i16 = f3072 + 49;
                f3070 = i16 % 128;
                int i17 = i16 % 2;
            }
        });
        int i14 = f3024 + 119;
        f3021 = i14 % 128;
        if ((i14 % 2 == 0 ? '_' : (char) 27) == 27) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z10) {
        int i10 = f3021 + 75;
        f3024 = i10 % 128;
        if ((i10 % 2 != 0 ? '\t' : ')') == ')') {
            m7012().m4548(z10);
        } else {
            m7012().m4548(z10);
            int i11 = 87 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        int i10 = f3024 + 123;
        f3021 = i10 % 128;
        int i11 = i10 % 2;
        m7050(false);
        int i12 = f3021 + 73;
        f3024 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized at m7053() {
        at atVar;
        int i10 = f3021 + 53;
        int i11 = i10 % 128;
        f3024 = i11;
        int i12 = i10 % 2;
        atVar = this.f3032;
        int i13 = i11 + 103;
        f3021 = i13 % 128;
        int i14 = i13 % 2;
        return atVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m7054() {
        boolean z10;
        int i10 = f3021 + 89;
        f3024 = i10 % 128;
        if ((i10 % 2 != 0 ? ';' : '\"') != ';') {
            z10 = this.f3039;
        } else {
            z10 = this.f3039;
            int i11 = 80 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m7055() {
        boolean z10;
        int i10 = f3021;
        int i11 = i10 + 45;
        f3024 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            throw null;
        }
        z10 = this.f3038;
        int i12 = i10 + 37;
        f3024 = i12 % 128;
        if ((i12 % 2 != 0 ? 'S' : '\b') != '\b') {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m7056() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i10 = f3021 + 117;
        f3024 = i10 % 128;
        if ((i10 % 2 != 0 ? '%' : 'G') != 'G') {
            iSAdQualityLogLevel = this.f3037;
            int i11 = 82 / 0;
        } else {
            iSAdQualityLogLevel = this.f3037;
        }
        return iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m7057() {
        int i10 = f3024 + 27;
        f3021 = i10 % 128;
        if ((i10 % 2 == 0 ? '&' : ',') == '&') {
            m7054();
            throw null;
        }
        if (!(!m7054())) {
            k.m6890(m7046((char) (12436 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 74, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m7046((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.blue(0) + 1104, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60).intern());
            return;
        }
        if (!m7004()) {
            this.f3038 = true;
            return;
        }
        int i11 = f3021 + 117;
        f3024 = i11 % 128;
        int i12 = i11 % 2;
        k.m6890(m7046((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12436), 74 - View.getDefaultSize(0, 0), 12 - (Process.myPid() >> 22)).intern(), m7046((char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + e.a.f32493j, 49 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
        int i13 = f3024 + 5;
        f3021 = i13 % 128;
        int i14 = i13 % 2;
    }
}
