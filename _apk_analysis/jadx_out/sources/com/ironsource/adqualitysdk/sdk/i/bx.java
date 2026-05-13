package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class bx extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1135 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1136;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1137;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1138;

    public class b extends VideoAdListener implements hg<VideoAdListener> {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f1177 = 1;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1178 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static boolean f1181 = true;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static boolean f1182 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f1186 = 201;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ch f1187;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private VideoAdListener f1188;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f1185 = {287, 306, 301, 302, 312, 266, 277, 316, 317, 311, 315, 247, 298, 284, 318, 300, 271, 309, 269, 310, 288, 305, 281, 304, 268, 308, 283, 270, 321, 313, 322, 303, 320, 285};

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f1183 = 36968;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f1184 = 635;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static char f1179 = 61018;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f1180 = 8246;

        public b(VideoAdListener videoAdListener, ch chVar) {
            this.f1188 = videoAdListener;
            this.f1187 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private VideoAdListener m5428() {
            int i10 = f1178 + 115;
            f1177 = i10 % 128;
            if ((i10 % 2 == 0 ? 'K' : (char) 5) != 'K') {
                return this.f1188;
            }
            int i11 = 27 / 0;
            return this.f1188;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m5429(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1185;
                int i11 = f1186;
                if (f1181) {
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
                if (f1182) {
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5430(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1183)) ^ ((c11 >>> 5) + f1179)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1184) ^ ((c12 + i12) ^ ((c12 << 4) + f1180))));
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

        public void onAdClicked() {
            int i10 = f1178 + 93;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5429(null, MotionEvent.axisFromString("") + 128, null, "\u0083\u0084\u009a\u0090\u0082\u0092\u0099\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if (!(videoAdListener == null)) {
                videoAdListener.onAdClicked();
            }
            int i12 = f1178 + 51;
            f1177 = i12 % 128;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public void onAdCustomEndCardFound() {
            bx.this.m4894(this, this.f1187, m5429(null, (KeyEvent.getMaxKeyCode() >> 16) + 127, null, "\u0083\u008a\u008f\u0085\u0091\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u0094\u0085\u0089\u0088\u008f\u0099\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if (!(videoAdListener != null)) {
                return;
            }
            int i10 = f1178 + 99;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            videoAdListener.onAdCustomEndCardFound();
            int i12 = f1178 + 103;
            f1177 = i12 % 128;
            int i13 = i12 % 2;
        }

        public void onAdDidReachEnd() {
            bx.this.m4894(this, this.f1187, m5429(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0083\u008a\u009c\u0096\u0090\u008d\u0084\u009b\u0083\u0082\u0093\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if (videoAdListener != null) {
                int i10 = f1177 + 101;
                f1178 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onAdDidReachEnd();
            }
            int i12 = f1178 + 37;
            f1177 = i12 % 128;
            int i13 = i12 % 2;
        }

        public void onAdDismissed() {
            int i10 = f1178 + 97;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5429(null, TextUtils.getTrimmedLength("") + 127, null, "\u0083\u0084\u0088\u0088\u0082\u0094\u0088\u0082\u0093\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if (!(videoAdListener != null)) {
                return;
            }
            int i12 = f1178 + 91;
            f1177 = i12 % 128;
            int i13 = i12 % 2;
            videoAdListener.onAdDismissed();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onAdDismissed(int r9) {
            /*
                r8 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1177
                int r0 = r0 + 87
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1178 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "\u0088\u0088\u0084\u008b\u0098\u0085\u008b\u0097\u0096\u0089\u0082\u0095\u0083\u0084\u0088\u0088\u0082\u0094\u0088\u0082\u0093\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081"
                r2 = 0
                r3 = 0
                r4 = 1
                if (r0 == 0) goto L3a
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r5 = r8.f1187
                int r6 = android.view.ViewConfiguration.getLongPressTimeout()
                int r6 = r6 % 107
                int r6 = r6 * 20
                java.lang.String r1 = m5429(r3, r6, r3, r1)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r6[r2] = r7
                r0.m4894(r8, r5, r1, r6)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                if (r0 == 0) goto L36
                r0 = r2
                goto L37
            L36:
                r0 = r4
            L37:
                if (r0 == r4) goto L62
                goto L5d
            L3a:
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r5 = r8.f1187
                int r6 = android.view.ViewConfiguration.getLongPressTimeout()
                int r6 = r6 >> 16
                int r6 = 127 - r6
                java.lang.String r1 = m5429(r3, r6, r3, r1)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r6[r2] = r7
                r0.m4894(r8, r5, r1, r6)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                if (r0 == 0) goto L62
            L5d:
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                r0.onAdDismissed(r9)
            L62:
                int r9 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1178
                int r9 = r9 + 3
                int r0 = r9 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1177 = r0
                int r9 = r9 % 2
                if (r9 != 0) goto L6f
                goto L70
            L6f:
                r2 = r4
            L70:
                if (r2 != r4) goto L73
                return
            L73:
                throw r3     // Catch: java.lang.Throwable -> L74
            L74:
                r9 = move-exception
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bx.b.onAdDismissed(int):void");
        }

        public void onAdExpired() {
            int i10 = f1178 + 45;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5429(null, 127 - (Process.myTid() >> 22), null, "\u0083\u0084\u008b\u0082\u009e\u009d\u009c\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if (videoAdListener != null) {
                int i12 = f1178 + 103;
                f1177 = i12 % 128;
                int i13 = i12 % 2;
                videoAdListener.onAdExpired();
            }
        }

        public void onAdLoadFail(PlayerInfo playerInfo) {
            int i10 = f1177 + 33;
            f1178 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5429(null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, null, "\u0092\u0082\u008d\u0091\u0083\u008d\u0085\u0087\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), playerInfo);
            VideoAdListener videoAdListener = this.f1188;
            if (videoAdListener != null) {
                videoAdListener.onAdLoadFail(playerInfo);
                int i12 = f1178 + 77;
                f1177 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = f1178 + 15;
            f1177 = i14 % 128;
            int i15 = i14 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onAdLoadSuccess() {
            /*
                r7 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1177
                int r0 = r0 + 65
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1178 = r1
                int r0 = r0 % 2
                r1 = 24
                if (r0 == 0) goto L10
                r0 = r1
                goto L12
            L10:
                r0 = 31
            L12:
                java.lang.String r2 = "\u0088\u0088\u0084\u0090\u0090\u008f\u008e\u0083\u008d\u0085\u0087\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081"
                r3 = 0
                r4 = 0
                if (r0 == r1) goto L3c
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r1 = r7.f1187
                int r5 = android.view.View.MeasureSpec.getMode(r3)
                int r5 = 127 - r5
                java.lang.String r2 = m5429(r4, r5, r4, r2)
                java.lang.String r2 = r2.intern()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r0.m4894(r7, r1, r2, r3)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r7.f1188
                r1 = 78
                if (r0 == 0) goto L37
                r0 = r1
                goto L39
            L37:
                r0 = 48
            L39:
                if (r0 == r1) goto L57
                goto L5c
            L3c:
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r1 = r7.f1187
                r5 = 5
                int r6 = android.view.View.MeasureSpec.getMode(r3)
                int r5 = r5 >> r6
                java.lang.String r2 = m5429(r4, r5, r4, r2)
                java.lang.String r2 = r2.intern()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r0.m4894(r7, r1, r2, r3)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r7.f1188
                if (r0 == 0) goto L5c
            L57:
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r7.f1188
                r0.onAdLoadSuccess()
            L5c:
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1178
                int r0 = r0 + 103
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1177 = r1
                int r0 = r0 % 2
                if (r0 == 0) goto L69
                return
            L69:
                throw r4     // Catch: java.lang.Throwable -> L6a
            L6a:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bx.b.onAdLoadSuccess():void");
        }

        public void onAdSkipped() {
            int i10 = f1177 + 111;
            f1178 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5429(null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, "\u0083\u0084\u009e\u009e\u0082\u009a\u008e\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if (!(videoAdListener == null)) {
                int i12 = f1177 + 33;
                f1178 = i12 % 128;
                char c10 = i12 % 2 != 0 ? (char) 15 : '#';
                videoAdListener.onAdSkipped();
                if (c10 != '#') {
                    int i13 = 9 / 0;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onAdStarted() {
            /*
                r8 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1178
                int r0 = r0 + 119
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1177 = r1
                int r0 = r0 % 2
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L10
                r0 = r1
                goto L11
            L10:
                r0 = r2
            L11:
                java.lang.String r3 = "\u0083\u0084\u0089\u008b\u008d\u0089\u008e\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081"
                r4 = -16777089(0xffffffffff00007f, float:-1.7014376E38)
                r5 = 0
                if (r0 == r1) goto L3c
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r1 = r8.f1187
                int r6 = android.graphics.Color.rgb(r2, r2, r2)
                int r4 = r4 - r6
                java.lang.String r3 = m5429(r5, r4, r5, r3)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.m4894(r8, r1, r3, r2)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                r1 = 26
                if (r0 == 0) goto L37
                r0 = r1
                goto L39
            L37:
                r0 = 37
            L39:
                if (r0 == r1) goto L5a
                goto L5f
            L3c:
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r6 = r8.f1187
                int r7 = android.graphics.Color.rgb(r2, r2, r2)
                int r7 = r7 + r4
                java.lang.String r3 = m5429(r5, r7, r5, r3)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m4894(r8, r6, r3, r4)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                if (r0 == 0) goto L57
                goto L58
            L57:
                r1 = r2
            L58:
                if (r1 == 0) goto L5f
            L5a:
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                r0.onAdStarted()
            L5f:
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1177
                int r0 = r0 + 3
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1178 = r1
                int r0 = r0 % 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bx.b.onAdStarted():void");
        }

        public void onCustomCTACLick(boolean z10) {
            bx.this.m4894(this, this.f1187, m5429(null, TextUtils.getTrimmedLength("") + 127, null, "\u009a\u0090\u0082\u0087\u0099\u0086¢\u0099\u0094\u0085\u0089\u0088\u008f\u0099\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), Boolean.valueOf(z10));
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? 'U' : '>') != '>') {
                int i10 = f1177 + 1;
                f1178 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onCustomCTACLick(z10);
            }
            int i12 = f1178 + 55;
            f1177 = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            int i13 = 91 / 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCustomCTALoadFail() {
            /*
                r8 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1177
                int r0 = r0 + 13
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1178 = r1
                int r0 = r0 % 2
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L10
                r0 = r2
                goto L11
            L10:
                r0 = r1
            L11:
                java.lang.String r3 = "\u0092\u0082\u008d\u0091\u0083\u008d\u0085\u0087\u0086¢\u0099\u0094\u0085\u0089\u0088\u008f\u0099\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081"
                r4 = 0
                if (r0 == r2) goto L34
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r2 = r8.f1187
                int r5 = android.view.ViewConfiguration.getScrollBarFadeDuration()
                int r5 = r5 >> 16
                int r5 = 127 - r5
                java.lang.String r3 = m5429(r4, r5, r4, r3)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.m4894(r8, r2, r3, r1)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                if (r0 == 0) goto L5b
                goto L56
            L34:
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r5 = r8.f1187
                r6 = 21
                int r7 = android.view.ViewConfiguration.getScrollBarFadeDuration()
                int r7 = r7 + 14
                int r6 = r6 / r7
                java.lang.String r3 = m5429(r4, r6, r4, r3)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m4894(r8, r5, r3, r4)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                if (r0 == 0) goto L53
                goto L54
            L53:
                r1 = r2
            L54:
                if (r1 == r2) goto L5b
            L56:
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r8.f1188
                r0.onCustomCTALoadFail()
            L5b:
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1178
                int r0 = r0 + 89
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1177 = r1
                int r0 = r0 % 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bx.b.onCustomCTALoadFail():void");
        }

        public void onCustomCTAShow() {
            int i10 = f1178 + 37;
            f1177 = i10 % 128;
            if (i10 % 2 == 0) {
                bx.this.m4894(this, this.f1187, m5430("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈ꋻ甬忧攉\uf322儠㍖៥\ue84a昸⥸릺⮳獓", 114 / Process.getGidForName("")).intern(), new Object[1]);
                if ((this.f1188 != null ? (char) 23 : '+') != 23) {
                    return;
                }
            } else {
                bx.this.m4894(this, this.f1187, m5430("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈ꋻ甬忧攉\uf322儠㍖៥\ue84a昸⥸릺⮳獓", Process.getGidForName("") + 32).intern(), new Object[0]);
                if (!(this.f1188 != null)) {
                    return;
                }
            }
            int i11 = f1177 + 107;
            f1178 = i11 % 128;
            int i12 = i11 % 2;
            this.f1188.onCustomCTAShow();
        }

        public void onCustomEndCardClick(String str) {
            bx.this.m4894(this, this.f1187, m5429(null, TextUtils.getOffsetBefore("", 0) + 127, null, "\u009a\u0090\u0082\u0092\u0099\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u0094\u0085\u0089\u0088\u008f\u0099\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), str);
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? '>' : '(') == '>') {
                int i10 = f1178 + 45;
                f1177 = i10 % 128;
                char c10 = i10 % 2 == 0 ? '@' : '*';
                videoAdListener.onCustomEndCardClick(str);
                if (c10 != '*') {
                    int i11 = 27 / 0;
                }
            }
            int i12 = f1177 + 81;
            f1178 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 60 / 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCustomEndCardShow(java.lang.String r7) {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1177
                int r0 = r0 + 35
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1178 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈ꋻ甬忧攉\uf322儠៚ㅃ돟緶戉쿺誱榲⥸릺⮳獓"
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L34
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r6.f1187
                int r5 = android.view.ViewConfiguration.getKeyRepeatDelay()
                int r5 = r5 >> 47
                int r5 = r5 * 97
                java.lang.String r1 = m5430(r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r3] = r7
                r0.m4894(r6, r4, r1, r5)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r6.f1188
                if (r0 == 0) goto L30
                goto L31
            L30:
                r2 = r3
            L31:
                if (r2 == r3) goto L5d
                goto L58
            L34:
                com.ironsource.adqualitysdk.sdk.i.bx r0 = com.ironsource.adqualitysdk.sdk.i.bx.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r6.f1187
                int r5 = android.view.ViewConfiguration.getKeyRepeatDelay()
                int r5 = r5 >> 16
                int r5 = 35 - r5
                java.lang.String r1 = m5430(r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r2] = r7
                r0.m4894(r6, r4, r1, r5)
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r6.f1188
                if (r0 == 0) goto L54
                goto L55
            L54:
                r2 = r3
            L55:
                if (r2 == 0) goto L58
                goto L5d
            L58:
                net.pubnative.lite.sdk.vpaid.VideoAdListener r0 = r6.f1188
                r0.onCustomEndCardShow(r7)
            L5d:
                int r7 = com.ironsource.adqualitysdk.sdk.i.bx.b.f1178
                int r7 = r7 + 37
                int r0 = r7 % 128
                com.ironsource.adqualitysdk.sdk.i.bx.b.f1177 = r0
                int r7 = r7 % 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bx.b.onCustomEndCardShow(java.lang.String):void");
        }

        public void onDefaultEndCardClick(String str) {
            int i10 = f1177 + 63;
            f1178 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5430("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈脇쳟쨗媭⦧搝ද\uf722\udec2遪ᱨ꧰ꧻ\uda64⤊䠷喎㲍㥝ꭆ", TextUtils.indexOf((CharSequence) "", '0', 0) + 38).intern(), str);
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? 'N' : '/') != 'N') {
                return;
            }
            int i12 = f1177 + 53;
            f1178 = i12 % 128;
            int i13 = i12 % 2;
            videoAdListener.onDefaultEndCardClick(str);
            int i14 = f1178 + 89;
            f1177 = i14 % 128;
            int i15 = i14 % 2;
        }

        public void onDefaultEndCardShow(String str) {
            bx.this.m4894(this, this.f1187, m5429(null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, "¡\u0085\u0096\u008e\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u0089\u0092\u008f\u008d \u0084\u0093\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), str);
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? '@' : (char) 18) != 18) {
                int i10 = f1177 + 101;
                f1178 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onDefaultEndCardShow(str);
            }
            int i12 = f1178 + 79;
            f1177 = i12 % 128;
            int i13 = i12 % 2;
        }

        public void onEndCardClosed(Boolean bool) {
            int i10 = f1178 + 71;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5429(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0083\u0084\u0088\u0085\u0092\u0099\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), bool);
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? (char) 26 : 'C') != 26) {
                return;
            }
            videoAdListener.onEndCardClosed(bool);
            int i12 = f1178 + 65;
            f1177 = i12 % 128;
            int i13 = i12 % 2;
        }

        public void onEndCardLoadFail(Boolean bool) {
            int i10 = f1178 + 31;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5430("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈៚ㅃ돟緶戉쿺䘧ꆝ\ue4bf㲨\uea2fኢ섡䢋㕭\udaf2", 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), bool);
            VideoAdListener videoAdListener = this.f1188;
            if (!(videoAdListener != null)) {
                return;
            }
            int i12 = f1177 + 25;
            f1178 = i12 % 128;
            int i13 = i12 % 2;
            videoAdListener.onEndCardLoadFail(bool);
            int i14 = f1178 + 15;
            f1177 = i14 % 128;
            int i15 = i14 % 2;
        }

        public void onEndCardLoadSuccess(Boolean bool) {
            bx.this.m4894(this, this.f1187, m5429(null, 127 - Color.green(0), null, "\u0088\u0088\u0084\u0090\u0090\u008f\u008e\u0083\u008d\u0085\u0087\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), bool);
            VideoAdListener videoAdListener = this.f1188;
            if (!(videoAdListener == null)) {
                int i10 = f1177 + 109;
                f1178 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onEndCardLoadSuccess(bool);
                int i12 = f1178 + 71;
                f1177 = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        public void onEndCardSkipped(Boolean bool) {
            int i10 = f1178 + 59;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5430("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈៚ㅃ돟緶戉쿺誱榲蓨つꔻ孯컝ᐆ", Color.red(0) + 32).intern(), bool);
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? '1' : (char) 6) != '1') {
                return;
            }
            videoAdListener.onEndCardSkipped(bool);
            int i12 = f1177 + 79;
            f1178 = i12 % 128;
            int i13 = i12 % 2;
        }

        public void onLeaveApp() {
            int i10 = f1177 + 23;
            f1178 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5430("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈氵袗\ud7a8\uf634철地ꔻ孯", 26 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? '(' : 'b') != '(') {
                return;
            }
            int i12 = f1177 + 49;
            f1178 = i12 % 128;
            int i13 = i12 % 2;
            videoAdListener.onLeaveApp();
            int i14 = f1177 + 65;
            f1178 = i14 % 128;
            int i15 = i14 % 2;
        }

        public void onReplay() {
            int i10 = f1178 + 49;
            f1177 = i10 % 128;
            int i11 = i10 % 2;
            bx.this.m4894(this, this.f1187, m5430("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈鯙\udc5f娸㖣䝉܇", ExpandableListView.getPackedPositionChild(0L) + 25).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if (videoAdListener != null) {
                int i12 = f1178 + 49;
                f1177 = i12 % 128;
                boolean z10 = i12 % 2 == 0;
                videoAdListener.onReplay();
                if (z10) {
                    int i13 = 42 / 0;
                }
                int i14 = f1178 + 1;
                f1177 = i14 % 128;
                int i15 = i14 % 2;
            }
        }

        public void onReplayFinish() {
            bx.this.m4894(this, this.f1187, m5429(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0096\u0088\u0082\u008a\u0082\u0091\u009f\u008d\u0092\u009e\u0084\u009b\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1188;
            if ((videoAdListener != null ? 'S' : '\r') == 'S') {
                int i10 = f1177 + 93;
                f1178 = i10 % 128;
                char c10 = i10 % 2 != 0 ? ' ' : '\r';
                videoAdListener.onReplayFinish();
                if (c10 == ' ') {
                    int i11 = 13 / 0;
                }
            }
            int i12 = f1177 + 107;
            f1178 = i12 % 128;
            if (i12 % 2 == 0) {
            } else {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ VideoAdListener mo4818() {
            int i10 = f1177 + 125;
            f1178 = i10 % 128;
            int i11 = i10 % 2;
            VideoAdListener videoAdListenerM5428 = m5428();
            int i12 = f1178 + 27;
            f1177 = i12 % 128;
            int i13 = i12 % 2;
            return videoAdListenerM5428;
        }
    }

    static {
        char[] cArr = new char[2355];
        ByteBuffer.wrap("VA\u0087ãõm\"Ù\u0010!\u0017UÆã´qcÌQ;\u0000£þ\u0003Xm\u0089Øû{,ó\u001e0O\u0086±>ã\\Ôí\u0006rwèY\b\u008a»ü*.@î\u0082?5M\u009d\u009a\u0000¨âùg\u0007ÊU§b<°\u008eÁ8ïû<AJÝ\u0098¦©3÷\u0089\u0000RÑö£WtÌF)\u0017¬é\u0006»H\u008cù^E/ß\u00016Ò\u0081¤\u0005\u0000AÑ÷£utÖF9\u0017\u00adé\u0011»`\u008cÛ^D/Ð\u00017Ò\u008d¤\u0010\u0000HÑê£dtÐF(\u0017\u009eé\u0016»V\u008c÷^^/Ì\u00012Ò\u0081/Mþé\u008cN[Öi\u00038¥Æ\u000e\u0094_£çqc\u0000Ê.?ý\u008d\u008b\u000fYt\u0000AÑæ£EtÍF%\u0017°é\u001c\u0000BÑò£Ht×F)\u0017\u00adé\"»w\u008cý^X/Û\u0001?Ò\u0090¤\u0012vxGÛ\u0019Qê ¼\"\u008d\u0086_\u000e1v\u0000MÑá£GtÐF(\u0017\u009eé\u0016»U\u008cê^N/Í\u00014Ò\u008a¤\u0003voGï\u0000VÑò£UtÍF\r\u0017»é\"»w\u008cý^X/Û\u0001?Ò\u0090¤\u0012vx\u0000BÑá£ItÎF?\u0017ºé\u0000»H\u008cù^E/ß\u00016Ò\u0081¤\u00056uç×\u0095YBíp\u0015!«ß!\u008dLºÀhd\u0019ð7\u0018ä°\u0092>@^qÁ/aÜ¿\u008a\u000f½\u009fl=\u001e³É\u0007ûÿªATË\u0006¦1*ã\u008e\u0092\u001a¼òoZ\u0019ÔË´ú+¤\u008bWV\u0001ó0QâÊ\u008c¼¿\u0016i\u0083\u0018lÊøõk§3Q \u0000\u00152\u0084Ýl\u008fÒ¾VNu\u009f×íY:í\b\u0015Y«§!õLÂÀ\u0010daðO\u0018\u009c°ê>8^\tÁWa¤¼ò\u0019Ã»\u0011 \u007fVLü\u009aië\u00869\u0012\u0006\u0080TÙ¢GóþÁb.\u0082¯\u0089~\u0004\f¶Û\u000eéá¸cFÙ\u0014¯#5ñ\u009b\u0080\u0013®á}\\\u000bÂÙ\u0092è ÀÃ\u0011wcØ´V\u0086´×&)\u008c{æLf\u009eÈïUÁ·\u0012>d\u008f¶å\u0087dÙß*'|¨M\u0006\u009f\u0084ñÁÂM\u0014Üe-·£\u0088\u0005Ú\u007f,ñ}_\u000f\u008eÞ:¬\u0095{\u001bIù\u0018kæÁ´«\u0083+Q\u0085 \u0018\u000eúÝs«Ây¨H)\u0016\u0092åj³å\u0082KPÉ>\u008e\r\u0004Û\u0091ª{xóG[\u0015?\u0000MÑá£GtÐF(\u0017\u0096é\u001c»q\u008cý^Y/Í\u0001%Ò\u008d¤\u0003vcGü\u0019\\ê\u0093¼$\u008d\u008c_\u000f1j\u0002ÌÔA¥\u00adw)\u0000VÑò£UtÍF\u0005\u0017±é\u0006»`\u008cê^X/Ê\u00018Ò\u0090¤\u001evkGñ\u0019`ê±¼3\u008d\u009a_\u00191a\u0002ÖÔP¥ºfÃ·[Åÿ\u0012: \u0091q\u0007\u008f½ÝÆêT8òIzg\u008a´,Âô\u0010Ë!Y\u007fé\u008c\u000bÚÕë79µWÉd!²ñÃ\u000b\u0011\u0082.&|^\u008aÊÛ~éþ\u0006\u0014T¤e?³GÁ\u009a\u001e`,ñ}\u000b\u008b¡Ø#öO\u0004ÇUecÇ°2Î¾\u001f\u0012-T{ê\u0088R¦\u008a÷\u0005\u0005§SÝ`K¾ñÏ\u007f\u001d\u0097*%x¸\u0096Æ§võã\u0002\u0019P\u0097a=¿½ÍÕ\u001aK\u0000$Ñ\u0086£\bt¼FD\u0017úép»\u001d\u008c\u0091^5/¡\u0001IÒá¤ov\u000fG\u0090\u00190êî¼Y\u008dñ_y1\u0015\u0002§Ô-¥Ý\u000böÚn¨Ê\u007f\u000fM¤\u001c2â\u0088°ó\u0087aUÇ$O\n¿Ù\u0019¯Á}þLl\u0012Üá>·à\u0086\u0002T\u0080:ü\t\u0014ßÄ®>|·C\u0013\u0011kçÿ¶K\u0084Ëk!9\u0091\b\nÞr¬¯sUAÄ\u0010>æ\u0094µ\u0016\u009bziò8P\u000eòÝ\u0002£\u0080r\u0004@a\u0016ßågË¿\u009a0h\u0092>è\r~ÓÄ¢Jp¢G\u0010\u0015\u008dûóÊC\u0098Öo,=¢\f\bÒ\u0088 àw~¯¶~\u001a\f¼Û+éÓ¸mFç\u0014\u008a#\u0006ñ¢\u00806®Þ}v\u000bøÙ\u0098è\u0007¶§Ey\u0013Î\"fðî\u009e\u0082\u00ad0{º\nJ\u0000nÑö£Rt\u0097F<\u0017ªé\u0010»k\u008cù^_/×\u0001'Ò\u0081¤YvfGô\u0019Dê¦¼x\u008d\u009a_\u00181d\u0002\u008cÔ\\¥¦w/H\u008b\u001aóìg½Ó\u008fS`¹2\t\u0003\u0092Õê§7xÍJ\\\u001b¦í\f¾\u008e\u0090âbj3È\u0005jÖ\u0081¨\u000by\u008eKä\u001djîØÀ=\u0091¹c\u001d5q\u0006áØA©Ï{'L\u0080\u001e\u0018ðFÁù\u0093Yd©6%\u0007\u008fÙ\r«u\u0000VÑò£UtÍF\u0005\u0017±é\u0006»`\u008cê^X/Ê\u00018Ò\u0090¤\u001evkGñ\u0019qê ¼\"\u008d\u0080_\n1f\u0002ÖÔL\u001e\u0015Ï£¨Çyq\u000bäÜ^î¾¿8\u0000AÑ÷£ctÁF8\u0018ÒÉd»çlO^¬\u000f<ñ\u008e£ø\u0094xFÝ\u0000AÑ÷£PtÜF>\u0017«é\u001b»v\u008cñ^E/Ù\u0001\u0018Ò\u008a¤\u0011ve\u0094ÆEb7ßàBÒ¬\u0083.}¥/þ\u0018bÊÙ»C\u0095¢F10\u0093âîÓ@\u008dÊ~1(\u00ad\\\u0005\u008d\u0081ÿ&(¾\u001akKíµF\u0000MÑÁ£gtðF\b\u0017\u0089é\u001b»`\u008cï\u0000MÑÁ£gtðF\b\u0017\u0096é\u001c»q\u008cý^Y/Í\u0001%Ò\u008d¤\u0003vcGü\u0019\\\u0000MÑÁ£gtðF\b\u0017\u009dé\u0013»k\u008cö^N/ÌµhdÞ\u0016_Áâó\u0000¢\u0085\\>\u000eB9Åëg\u009aå´<g¨\u0011=ÃLòÆ¬x_\u009e\t\u00108²è»9\nK¨\u009c!®ÂÿZ\u0001íS\u008bd\u0001¶\u0086Ç4éÙ:{Ló\u009e\u0093¯\u000f\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤6vn\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤5vxGò\u0019Qê§¼5\u008d\u0088_\u000f1{\u0002ðÔP¥«w>H\u0087\u001a÷ìq½Õ¦\u0084w&\u0005¨Ò\u001càä±AOÛ\u001d¾*5ø\u0095\u0089\u0016§øtL\u0002ùÐ´á>¿\u009dLk\u001aù+DùÃ\u0097·¤=r\u009c\u0003jÑóîG¼?\u0000RÑö£QtØF>\u0017»é\u0017»a\u008cÈ^Y/Û\u0001\"Ò\u0081¤\u0019v~Gø\u0019Bê\u0087¼3\u008d\u008a_\u00131}\u0002ÃÔA¥§w)\u0000RÑö£QtØF>\u0017»é\u0017»a\u008cÈ^Y/Û\u0001\"Ò\u0081¤\u0019v~Gø\u0019Bê\u0085¼7\u008d\u008a_\b1`\u0002ÐÔL\u0098jIÎ;iìñÞ\"\u008f\u0086q9#X\u0014ÖÆs·ç\u0099\tJ\u0088<9îSßÒ\u0081ir\u0091$\u001e\u0015°Ç2\u0000nÑö£Rt\u0097F<\u0017ªé\u0010»k\u008cù^_/×\u0001'Ò\u0081¤YvfGô\u0019Dê¦¼x\u008d\u009a_\u00181d\u0002\u008cÔG¥\u00adw,H\u008f\u001aóìp½Â\u008f^`ã2\u0001\u0003\u0090Õò§pxÚJV\u001b¦í\u001c¾Ö\u0090Ãbg3ó\u0005-Ö³¨8y\u0098Kç\u001dBîÄÀ-\u0091¹c\u000b5C\u0006öØ\\©Ò{8L\u0088\u001e\u0000ð~\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤6viGé\u0019Yêµ¼?\u008d\u009d_\u0005\u0000nÑö£Rt\u0097F<\u0017ªé\u0010»k\u008cù^_/×\u0001'Ò\u0081¤YvfGô\u0019Dê¦¼x\u008d\u009a_\u00181d\u0002\u008cÔG¥\u00adw,H\u008f\u001aóìp½Â\u008f^`ã2\u0001\u0003\u0090Õò§pxÚJV\u001b¦í\u001c¾Ö\u0090Ýb\u007f3Â\u00050Ö\u0085¨\u000fy\u008aKñ\u001dQîÒÀ,\u0091¸c.5a\u0006áØA©Í{'L\u0095\u001e\r\u0000VÑò£UtÍF\u001e\u0017ºé\u0005»d\u008cê^O/Û\u00015Ò¥¤\u0014v~Gô\u0019Fêª¼\"\u008d\u0090\u0000PÑÝ£gtÝF\u001a\u0017¶é\u0017»r\u0000HÑê£dtÐF(\u0017\u009eé\u0016»S\u008cñ^N/ÉTð\u0085R÷Ü h\u0012\u0090C%½«ïÓØN\nö{tU¨\u00868ð\u0099\"Û\u0013@Mÿ\u0000HÑê£dtÐF(\u0017\u0093é\u0017»d\u008cü^N/Ì\u00013Ò\u008b¤\u0016vxGù\u0019qê§¼\u0000\u008d\u0080_\u00191x\u0000HÑê£dtÐF(\u0017\u0092é »`\u008cû^_/ÿ\u00015Ò²¤\u001evoGê\u0080SQÞ#dôêÆ\u0006\u0097\u009fi\u001e;h\fïÞM¯Ó\u0081&R®$\u001aöoÇñ\u0099ej©<0\r\u009dB\u0000\u0093\u008dá46\u0088\u0004rUá«Gù'Î\u0089\u001c\u001fm¸Ch\u0090ÑæP\u0012\u0012Ã\u009f±)f©Tk\u0005þûD©\u0006\u009e¾L?=\u0095\u0013vÀÑÉå\u0018hjÄ½i\u008f\u009bÞ< ®rÕEZ\u0000VÑú£BtÜF#\u0017\u009eé\u0016\u0000VÑú£BtÜF#\u0017\u009eé\u0016»I\u008cñ^X/Ê\u00014Ò\u008a¤\u0012vx\u0000VÑú£BtÜF#\u0017\u009eé\u0016»S\u008cñ^N/É\u0000VÑò£UtÍF\u001c\u0017\u00adé\u001d»f\u008cý^X/Í\u0001>Ò\u0096\u0083\u001eR± \t÷\u008eÅg\u0094ãju8%\u000f°Ý\n;âê@\u0098ÎOz}\u0082,<Ò¶\u0080Û·Weó\u0014g:\u008fé'\u009f©MÉ|V\"öÑ(\u0087\u0098¶\u000fd¿\nÖ9|ïú\u009e\fL\u0094s6\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤6vnGÑ\u0019Yê°¼\"\u008d\u008c_\u00121j\u0002Ð\u0000HÑê£dtÐF(\u0017\u009eé\u0016»S\u008cñ^N/É\u0001\u001dÒ\u008d¤\u0004v~Gø\u0019^ê¦¼$\u0000TÑÑ£ptÐF(\u0017ºé\u001d»D\u008cü^g/×\u0001\"Ò\u0090¤\u0012vdGø\u0019Bè@9öKw\u009cÙ®?ÿ¿\u0001\u001eSw\u0000VÑú£CtÎF\u000f\u0017°é\u001c»q\u008cê^D/Ò\u0001=Ò\u0081¤\u0005v\\Gü\u0019Cê·\u0000VÑú£BtÜF#\u0017\u009eé\u0016»F\u008c÷^E/Ê\u0001#Ò\u008b¤\u001bvfGø\u0019BS\u009f\u00823ð\u008b'\u0015\u0015êDUº×è¥ß2\r\u0089|\u0004\u0000CÑÿ£OtÚF'\u0017\u008bé\u001a»w\u008c÷^^/Ù\u00019\u0000CÑÿ£OtÚF'\u0017\u008bé\u0000»d\u008cû^@/×\u0001?Ò\u0083\u0000CÑü£KtÉF-\u0017±é\u001b»j\u008cöÉé\u0018Vjá½c\u008f\u0087Þ\u001b ±rÀE\\\u0097ÀæpÈ\u0088\u0000CÑü£KtÉF-\u0017±é\u001b»j\u008cö^h/Ò\u00018Ò\u0087¤\u001cv^Gõ\u0019Bê¬¼#\u008d\u008e_\u0014\u0000CÑü£KtÉF-\u0017±é\u001b»j\u008cö^h/Ò\u00018Ò\u0087¤\u001cv^Gï\u0019Qê ¼=\u008d\u0080_\u00121h\u0000CÑá£CtØF8\u0017¶é\u0004»`z\u0090«2Ù\u0090\u000e\u000b<ëme\u0093×Á³ö8&9÷\u008d\u0085\u001aR `R1Êæì7HEï\u0092w ·ñ\u0001\u000f\u009b]ÐjW¸ãÉgç\u008e1Zàá\u0092UEÇw:&\u008eØ\f\u008a~½ê\u0000MÑö£BtÐF-\u0017\u0099é\u001b»i\u008cý^X\u0000SÑç£GtÍF%\u0017¼é »`\u008cë^D/Ë\u0001#Ò\u0087¤\u0012 Yñý\u0083ZTÂ\u0000WÑá£GtÉF<\u0017ºé\u0000~\u0081¯\u0005Ý¢\n:8Úil\u0097ñÅ³ò( ©Q;\u007fÏ9\u0018èº\u009a\u0018M\u0083\u007fc.íÐ_\u0082;µ\u0093g\u0011\u0016\u00978këÒ\u009d_¿\u008bn\u001a\u001c¾Ë\u0014ùÐ¨CVÊ\u0004\u00863\u001fá¢\u0090<Â¯\u0013&a²¶\u001a\u0084ýÕx+Æy§N;\u009c\u0089í.Ãþ\u0010FfÔ´£\u0085\u001aÛ\u0092\u0000sÑö£RtïF%\u0017»é\u0017»j\u008cÙ^O/ò\u00018Ò\u0097¤\u0003voGó\u0019Uê±\u0000gÑö£RtøF(\u0017\u0095é\u0001»j\u008cöã\u00842\u0015@±\u0097\u001b¥Ëô\u007f\nãX\u0083o\u001a½¼Ì4âÄ1bGÝ\u0095\u008d\u0000gÑö£RtøF(\u0017\u0089é\u0013»v\u008cìD/\u0095¾ç\u001a0°\u0002`SÍ\u00adUÿ#Èµ\u001a*k\u0092\u0000gÑö£RtøF(\u0017\u0092é\u0017»q\u008cù\u0000gÑö£RtøF(\u0017\u009eé\u0001»v\u008cý^_[w\u008aæøB/è\u001d8L\u008d²\u0007àt×ë\u0005TtÀZ2\u0000gÑö£RtøF(\u0017\u009eé\u0001»v\u008cý^_/ë\u0001#Ò\u0088ó3\"¢P\u0006\u0087¬µ|äÏ\u001aGH%\u007f\u00ad\u00ad7Ü\u009eòh!ÜK\u009e\u009a\u000fè«?\u0001\rÑ\\b¢êð\u0088Ç\u0000\u0015\u0098d4Õá\u0004pvÔ¡~\u0093®Â\u001d<\u0095n÷Y\u007f\u008bøúJÔ»\u0000gÑö£RtøF(\u0017\u009bé\u0013»q\u008cù^x/Ê\u0001#Ò\u008d¤\u0019vmGÛ\u0019Yê¦¼:\u008d\u008dFO\u0097Íåo2ô\u0000\u0014Q\u0096¯\nýkÊâ\u0018niöG\u0018\u0094§â\u001a0B\u0001ý_u¬\u009cú\u000eË \u0019>wFDü\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0002Ò\u0090¤\u0005vcGó\u0019W¸`iñ\u001bUÌÿþ/¯\u0088Q\u0014\u0003p4þæA\u0097Ê¹\u001fj\u0087\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0007Ò\u008d¤\u0013voGò\u0019bê¦¼2\u008d\u0080_\u000e1j\u0002ÁÔA¥\u009dw)H\u0082\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0014Ò\u008a¤\u0013vIGü\u0019Bê§¼\u0004\u008d\u008c_\u00181f\u0002ÐÔP¥«w/H»\u001aóìxÃ\u0090\u0012\u0001`¥·\u000f\u0085ßÔx*äx\u0080O\u000e\u009d±ì:Âð\u0011zgäµ\u0098\u0084\u0005Ú\u0084)X\u007fÈN}\u009càò\u008b\u0096WGÆ5bâÈÐ\u0018\u0081¿\u007f#-G\u001aÉÈv¹ý\u0097$Dº2#àyÑÌ\u008fr|\u0097*%\u001bµÉ%§\\\u0094ùBv\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0007Ò\u008d¤\u0013voGò\u0019vêª¼:\u008d\u008c_)1}\u0002ÎÔF¥\u0084w2H\u009d\u001aõ\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0014Ò\u008a¤\u0013vIGü\u0019Bê§¼\u0003\u008d\u009b_\u00101C\u0002ËÔF¥¼\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0000gÑö£RtïF%\u0017»é\u0017»j\u008cÛ^G/×\u00012Ò\u008f¤\u0004vIGñ\u0019Yê ¼=\u008d½_\u00141}\u0002ÍÔ@¥¯w3\u0000gÑö£RtïF%\u0017»é\u0017»j\u008cÛ^G/×\u00012Ò\u008f¤\u0004vIGñ\u0019Yê ¼=\u008d½_\u000e1n\u0002ÁÔ^¥¡w5H\u0089\u001aÍì}½Ô\u008fN\u0000gÑö£RtúF#\u0017²é\u0002»d\u008cö^B/Ñ\u0001?Ò§¤\u001bvcGþ\u0019[ê\u0097¼>\u008d\u009b_\u00131z\u0002ÅÔ]\u0000gÑö£RtúF>\u0017ºé\u0013»q\u008cñ^]/Û\u0001\u0012Ò\u008b¤\u001avzGü\u0019^êª¼9\u008d\u0087_=1k\u0002ÑJ±\u009b é\u0084>&\fô]e£Íñ½Æ+\u0014¾e\u001aKâ\u0098SîÕ<µ\r=S\u0083 f\u0000gÑö£RtïF-\u0017¬é\u0006»D\u008cü^x/Ñ\u0001$Ò\u0096¤\u0014voGÞ\u0019Bê¦¼7\u008d\u009d_\u00151y\u0002ÇÔF\u0000gÑö£RtôF)\u0017»é\u001b»d\u008cÞ^B/Ò\u00014Ò°¤\u0012vrGé\u0000gÑö£RtêF8\u0017¾é\u0006»l\u008cû^y/Û\u0001\"Ò\u008b¤\u0002vxGþ\u0019Uê\u0097¼3\u008d\u0091_\b\u0000gÑö£RtêF8\u0017¾é\u0006»l\u008cû^y/Û\u0001\"Ò\u008b¤\u0002vxGþ\u0019Uê\u0080¼$\u008d\u008c_\u001d1{\u0002ËÔC¥\u00adw\u000fH\u0097\u001añìq¿énx\u001cÜË`ù°¨0V\u008c\u0004û3sá×\u0090s¾\u00adm\u000f\u001b\u0098Éðøz¦ÈU(\u0003«üp-á_E\u0088ùº)ë©\u0015\u0015Gbpê¢NÓÿý\u0007. X4\u008a\\»îås\u0016µ@&q«£9ÍQ%òôc\u0086ÇQoc«2/Ì\u0086\u009eä©d{È\nN$\u0094÷\u0010\u0081\u0090Sþbe<ÖÏ\u0015\u0099±¨\u0019z\u0088\u0014î'^ñÖ\u00808R\u008am\u001a?`Éà\u0000gÑö£RtúF>\u0017ºé\u0013»q\u008cñ^]/Û\u0001\u0001Ò\u0085¤\u0005vkGð\u0019Cê\u0086¼8\u008d\u009f_\u00151}\u0002ÍÔ[¥¥w>H\u0080\u001aõìB½Æ\u008fH`¾".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2355);
        f1136 = cArr;
        f1138 = 5763815259003539859L;
    }

    public bx(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static List<String> m5351(AdParams adParams) {
        int i10 = f1135 + 107;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        List<String> endCardUrlList = adParams.getEndCardUrlList();
        int i12 = f1135 + 75;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return endCardUrlList;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m5352(AdParams adParams) {
        int i10 = f1135 + 69;
        f1137 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            adParams.getEndCardRedirectUrl();
            throw null;
        }
        String endCardRedirectUrl = adParams.getEndCardRedirectUrl();
        int i11 = f1135 + 107;
        f1137 = i11 % 128;
        if ((i11 % 2 != 0 ? '\r' : '+') == '+') {
            return endCardRedirectUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static List<String> m5353(AdParams adParams) {
        int i10 = f1135 + 119;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        List<String> videoClicks = adParams.getVideoClicks();
        int i12 = f1137 + 3;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
        return videoClicks;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static List<String> m5354(AdParams adParams) {
        int i10 = f1135 + 5;
        f1137 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            adParams.getVideoFileUrlsList();
            throw null;
        }
        List<String> videoFileUrlsList = adParams.getVideoFileUrlsList();
        int i11 = f1135 + 125;
        f1137 = i11 % 128;
        if ((i11 % 2 != 0 ? 'A' : '%') == '%') {
            return videoFileUrlsList;
        }
        int i12 = 29 / 0;
        return videoFileUrlsList;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static List<String> m5355(AdParams adParams) {
        int i10 = f1137 + 125;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        List<String> endCardClicks = adParams.getEndCardClicks();
        int i12 = f1135 + 63;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return endCardClicks;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m5356(AdParams adParams) {
        int i10 = f1135 + 87;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        String videoRedirectUrl = adParams.getVideoRedirectUrl();
        int i12 = f1135 + 71;
        f1137 = i12 % 128;
        if ((i12 % 2 != 0 ? '\r' : (char) 16) != '\r') {
            return videoRedirectUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m5357() {
        int i10 = f1137 + 41;
        f1135 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5360();
        }
        m5360();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m5358(AdParams adParams) {
        int i10 = f1137 + 25;
        f1135 = i10 % 128;
        if ((i10 % 2 == 0 ? '\f' : (char) 22) != 22) {
            adParams.getId();
            throw null;
        }
        String id2 = adParams.getId();
        int i11 = f1137 + 13;
        f1135 = i11 % 128;
        int i12 = i11 % 2;
        return id2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static List<AdData> m5359(Ad ad2, String str) {
        int i10 = f1135 + 27;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        List<AdData> beacons = ad2.getBeacons(str);
        int i12 = f1135 + 15;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return beacons;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m5360() {
        int i10 = f1135 + 83;
        f1137 = i10 % 128;
        if (i10 % 2 != 0) {
            HyBid.getAppToken();
            throw null;
        }
        String appToken = HyBid.getAppToken();
        int i11 = f1137 + 115;
        f1135 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 14 : (char) 7) != 14) {
            return appToken;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m5361(Ad ad2) {
        int i10 = f1135 + 61;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = ad2.getCreativeId();
        int i12 = f1135 + 3;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ List m5362(AdParams adParams) {
        int i10 = f1137 + 47;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        List<String> listM5354 = m5354(adParams);
        int i12 = f1137 + 69;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
        return listM5354;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m5363(Ad ad2) {
        int i10 = f1137 + 83;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String vast = ad2.getVast();
        int i12 = f1137 + 55;
        f1135 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return vast;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ List m5364(AdParams adParams) {
        int i10 = f1137 + 15;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        List<String> listM5351 = m5351(adParams);
        int i12 = f1137 + 101;
        f1135 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return listM5351;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5365(Ad ad2, String str) {
        int i10 = f1137 + 81;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String assetUrl = ad2.getAssetUrl(str);
        int i12 = f1135 + 101;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return assetUrl;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5366(AdData adData) {
        int i10 = f1137 + 37;
        f1135 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'X' : '$';
        String url = adData.getURL();
        if (c10 == 'X') {
            int i11 = 40 / 0;
        }
        return url;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5367(AdParams adParams) {
        int i10 = f1137 + 7;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String adParams2 = adParams.getAdParams();
        int i12 = f1135 + 11;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return adParams2;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m5368(Ad ad2) {
        int i10 = f1135 + 113;
        f1137 = i10 % 128;
        if (i10 % 2 != 0) {
            ad2.getZoneId();
            throw null;
        }
        String zoneId = ad2.getZoneId();
        int i11 = f1135 + 1;
        f1137 = i11 % 128;
        int i12 = i11 % 2;
        return zoneId;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ List m5369(AdParams adParams) {
        int i10 = f1137 + 47;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        List<String> listM5355 = m5355(adParams);
        int i12 = f1137 + 43;
        f1135 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 3 : 'D') == 'D') {
            return listM5355;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AdData m5370(Ad ad2, String str) {
        int i10 = f1135 + 107;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        AdData asset = ad2.getAsset(str);
        int i12 = f1135 + 15;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return asset;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5371(Ad ad2) {
        int i10 = f1135 + 83;
        f1137 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 16 : 'H') == 'H') {
            return m5361(ad2);
        }
        m5361(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5372(AdData adData) {
        int i10 = f1137 + 83;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String strM5405 = m5405(adData);
        int i12 = f1135 + 125;
        f1137 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM5405;
        }
        int i13 = 34 / 0;
        return strM5405;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5373(MediaFile mediaFile) {
        int i10 = f1137 + 65;
        f1135 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '[' : '3';
        String strM5418 = m5418(mediaFile);
        if (c10 == '[') {
            int i11 = 36 / 0;
        }
        return strM5418;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5374(StaticResource staticResource) {
        int i10 = f1137 + 125;
        f1135 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5419(staticResource);
        }
        m5419(staticResource);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5375(CreativeParams creativeParams) {
        int i10 = f1137 + 63;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String strM5386 = m5386(creativeParams);
        int i12 = f1137 + 41;
        f1135 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return strM5386;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5376(AdParams adParams) {
        int i10 = f1135 + 85;
        f1137 = i10 % 128;
        if ((i10 % 2 != 0 ? '^' : '\\') == '^') {
            m5356(adParams);
            throw null;
        }
        String strM5356 = m5356(adParams);
        int i11 = f1137 + 107;
        f1135 = i11 % 128;
        int i12 = i11 % 2;
        return strM5356;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<ClickTracking> m5377(VideoClicks videoClicks) {
        int i10 = f1137 + 13;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        List<ClickTracking> clickTrackingList = videoClicks.getClickTrackingList();
        int i12 = f1137 + 77;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
        return clickTrackingList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdData m5378(Ad ad2, String str) {
        int i10 = f1135 + 15;
        f1137 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m5370(ad2, str);
            throw null;
        }
        AdData adDataM5370 = m5370(ad2, str);
        int i11 = f1137 + 73;
        f1135 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 15 : (char) 21) != 15) {
            return adDataM5370;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static CompanionAds m5379(Creative creative) {
        int i10 = f1135 + 75;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        CompanionAds companionAds = creative.getCompanionAds();
        int i12 = f1137 + 79;
        f1135 = i12 % 128;
        if (i12 % 2 != 0) {
            return companionAds;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m5380(VastAdSource vastAdSource) {
        int i10 = f1135 + 65;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        Creatives creativesM5390 = m5390(vastAdSource);
        int i12 = f1137 + 55;
        f1135 = i12 % 128;
        if ((i12 % 2 == 0 ? '(' : (char) 26) != '(') {
            return creativesM5390;
        }
        int i13 = 52 / 0;
        return creativesM5390;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ VASTAdTagURI m5381(Wrapper wrapper) {
        int i10 = f1137 + 21;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        VASTAdTagURI vASTAdTagURIM5391 = m5391(wrapper);
        int i12 = f1135 + 37;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return vASTAdTagURIM5391;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5382(Ad ad2) {
        int i10 = f1137 + 3;
        f1135 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5368(ad2);
        }
        m5368(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5383(AdData adData) {
        int i10 = f1135 + 95;
        f1137 = i10 % 128;
        if (i10 % 2 == 0) {
            return adData.getJS();
        }
        adData.getJS();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5384(AdData adData, String str) {
        int i10 = f1135 + 21;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        String strM5398 = m5398(adData, str);
        int i12 = f1135 + 81;
        f1137 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return strM5398;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5385(StaticResource staticResource) {
        int i10 = f1137 + 15;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String creativeType = staticResource.getCreativeType();
        int i12 = f1135 + 43;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return creativeType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5386(CreativeParams creativeParams) {
        int i10 = f1135 + 33;
        f1137 = i10 % 128;
        if (i10 % 2 == 0) {
            return creativeParams.getCreativeData();
        }
        creativeParams.getCreativeData();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m5387(AdParams adParams) {
        int i10 = f1135 + 81;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        List<String> listM5353 = m5353(adParams);
        int i12 = f1135 + 113;
        f1137 = i12 % 128;
        if ((i12 % 2 != 0 ? '+' : '\n') == '\n') {
            return listM5353;
        }
        int i13 = 36 / 0;
        return listM5353;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdData m5388(Ad ad2, String str) {
        int i10 = f1135 + 77;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        AdData adDataM5400 = m5400(ad2, str);
        int i12 = f1135 + 85;
        f1137 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 7 : (char) 21) != 7) {
            return adDataM5400;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ClickThrough m5389(VideoClicks videoClicks) {
        int i10 = f1135 + 107;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        ClickThrough clickThroughM5422 = m5422(videoClicks);
        int i12 = f1137 + 25;
        f1135 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return clickThroughM5422;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Creatives m5390(VastAdSource vastAdSource) {
        int i10 = f1135 + 51;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        Creatives creatives = vastAdSource.getCreatives();
        int i12 = f1137 + 55;
        f1135 = i12 % 128;
        if (i12 % 2 != 0) {
            return creatives;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static VASTAdTagURI m5391(Wrapper wrapper) {
        int i10 = f1135 + 119;
        f1137 = i10 % 128;
        if ((i10 % 2 != 0 ? 'X' : (char) 23) == 'X') {
            wrapper.getVastAdTagURI();
            throw null;
        }
        VASTAdTagURI vastAdTagURI = wrapper.getVastAdTagURI();
        int i11 = f1137 + 119;
        f1135 = i11 % 128;
        if ((i11 % 2 == 0 ? ',' : '(') != ',') {
            return vastAdTagURI;
        }
        int i12 = 82 / 0;
        return vastAdTagURI;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdParams m5392(VideoAdController videoAdController) {
        int i10 = f1137 + 75;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        AdParams adParamsM5425 = m5425(videoAdController);
        int i12 = f1137 + 35;
        f1135 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return adParamsM5425;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m5393(VideoAd videoAd, VideoAdListener videoAdListener) {
        int i10 = f1135 + 109;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        m5403(videoAd, videoAdListener);
        int i12 = f1135 + 67;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m5394(VideoAd videoAd) {
        int i10 = f1135 + 71;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsRewarded = videoAd.isRewarded();
        int i12 = f1135 + 13;
        f1137 = i12 % 128;
        if (i12 % 2 == 0) {
            return zIsRewarded;
        }
        int i13 = 76 / 0;
        return zIsRewarded;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ b m5395(bx bxVar, VideoAdListener videoAdListener, ch chVar) {
        int i10 = f1137 + 79;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        b bVarM5415 = bxVar.m5415(videoAdListener, chVar);
        int i12 = f1137 + 89;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
        return bVarM5415;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5396(Ad ad2) {
        int i10 = f1137 + 117;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String strM5363 = m5363(ad2);
        int i12 = f1137 + 77;
        f1135 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM5363;
        }
        int i13 = 0 / 0;
        return strM5363;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5397(AdData adData) {
        int i10 = f1135 + 45;
        f1137 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '0' : '.';
        String strM5366 = m5366(adData);
        if (c10 != '.') {
            int i11 = 50 / 0;
        }
        return strM5366;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5398(AdData adData, String str) {
        int i10 = f1137 + 35;
        f1135 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return adData.getStringField(str);
        }
        adData.getStringField(str);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5399(AdParams adParams) {
        int i10 = f1137 + 45;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String strM5352 = m5352(adParams);
        int i12 = f1135 + 119;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return strM5352;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdData m5400(Ad ad2, String str) {
        int i10 = f1135 + 69;
        f1137 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return ad2.getMeta(str);
        }
        ad2.getMeta(str);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static CompanionClickThrough m5401(Companion companion) {
        int i10 = f1137 + 97;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        CompanionClickThrough companionClickThrough = companion.getCompanionClickThrough();
        int i12 = f1137 + 95;
        f1135 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return companionClickThrough;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m5402(Wrapper wrapper) {
        int i10 = f1137 + 65;
        f1135 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Creatives creativesM5424 = m5424(wrapper);
        if (z10) {
            int i11 = 7 / 0;
        }
        int i12 = f1135 + 73;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return creativesM5424;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m5403(VideoAd videoAd, VideoAdListener videoAdListener) {
        int i10 = f1135 + 103;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        videoAd.setAdListener(videoAdListener);
        int i12 = f1137 + 79;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5404(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1136[i10 + i12]) ^ (((long) i12) * f1138)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5405(AdData adData) {
        int i10 = f1135 + 111;
        f1137 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String html = adData.getHtml();
        if (z10) {
            int i11 = 46 / 0;
        }
        int i12 = f1137 + 81;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
        return html;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5406(StaticResource staticResource) {
        int i10 = f1137 + 27;
        f1135 = i10 % 128;
        if ((i10 % 2 == 0 ? 'A' : '\f') != '\f') {
            m5385(staticResource);
            throw null;
        }
        String strM5385 = m5385(staticResource);
        int i11 = f1137 + 3;
        f1135 = i11 % 128;
        if ((i11 % 2 == 0 ? '7' : (char) 6) == 6) {
            return strM5385;
        }
        int i12 = 34 / 0;
        return strM5385;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5407(CreativeParams creativeParams) {
        int i10 = f1135 + 27;
        f1137 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5420(creativeParams);
        }
        m5420(creativeParams);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5408(AdParams adParams) {
        int i10 = f1137 + 61;
        f1135 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 6 : (char) 19;
        String strM5358 = m5358(adParams);
        if (c10 == 6) {
            int i11 = 92 / 0;
        }
        return strM5358;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m5409(Ad ad2, String str) {
        int i10 = f1135 + 9;
        f1137 = i10 % 128;
        if ((i10 % 2 != 0 ? 'c' : (char) 14) != 'c') {
            return m5359(ad2, str);
        }
        m5359(ad2, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m5410(VideoClicks videoClicks) {
        int i10 = f1135 + 95;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        List<ClickTracking> listM5377 = m5377(videoClicks);
        int i12 = f1137 + 119;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
        return listM5377;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ CompanionAds m5411(Creative creative) {
        int i10 = f1135 + 33;
        f1137 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'O' : ']';
        CompanionAds companionAdsM5379 = m5379(creative);
        if (c10 == 'O') {
            int i11 = 22 / 0;
        }
        int i12 = f1137 + 69;
        f1135 = i12 % 128;
        int i13 = i12 % 2;
        return companionAdsM5379;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ CompanionClickThrough m5412(Companion companion) {
        int i10 = f1135 + 9;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        CompanionClickThrough companionClickThroughM5401 = m5401(companion);
        int i12 = f1135 + 121;
        f1137 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 1 : ';') == ';') {
            return companionClickThroughM5401;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m5413(InLine inLine) {
        int i10 = f1137 + 9;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        Creatives creativesM5423 = m5423(inLine);
        int i12 = f1135 + 93;
        f1137 = i12 % 128;
        if (i12 % 2 == 0) {
            return creativesM5423;
        }
        int i13 = 53 / 0;
        return creativesM5423;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m5414(Ad ad2) {
        int i10 = f1135 + 33;
        f1137 = i10 % 128;
        if ((i10 % 2 != 0 ? '1' : 'Q') == 'Q') {
            return m5426(ad2);
        }
        m5426(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private b m5415(VideoAdListener videoAdListener, ch chVar) {
        b bVar = new b(videoAdListener, chVar);
        int i10 = f1137 + 113;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        return bVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5416(Ad ad2, String str) {
        int i10 = f1135 + 117;
        f1137 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m5365(ad2, str);
            throw null;
        }
        String strM5365 = m5365(ad2, str);
        int i11 = f1135 + 117;
        f1137 = i11 % 128;
        int i12 = i11 % 2;
        return strM5365;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5417(AdData adData) {
        int i10 = f1135 + 25;
        f1137 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 27 : 'R';
        String strM5383 = m5383(adData);
        if (c10 == 27) {
            int i11 = 32 / 0;
        }
        int i12 = f1135 + 65;
        f1137 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 7 : (char) 30) != 7) {
            return strM5383;
        }
        int i13 = 46 / 0;
        return strM5383;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5418(MediaFile mediaFile) {
        int i10 = f1137 + 85;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        String text = mediaFile.getText();
        int i12 = f1137 + 35;
        f1135 = i12 % 128;
        if ((i12 % 2 == 0 ? 'N' : 'c') != 'N') {
            return text;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5419(StaticResource staticResource) {
        int i10 = f1135 + 125;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        String text = staticResource.getText();
        int i12 = f1135 + 23;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return text;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5420(CreativeParams creativeParams) {
        int i10 = f1135 + 69;
        f1137 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String environmentVars = creativeParams.getEnvironmentVars();
        if (z10) {
            int i11 = 98 / 0;
        }
        int i12 = f1135 + 3;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return environmentVars;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5421(AdParams adParams) {
        int i10 = f1137 + 29;
        f1135 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String strM5367 = m5367(adParams);
        if (!z10) {
            int i11 = 90 / 0;
        }
        int i12 = f1135 + 7;
        f1137 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return strM5367;
        }
        int i13 = 23 / 0;
        return strM5367;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ClickThrough m5422(VideoClicks videoClicks) {
        int i10 = f1135 + 65;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        ClickThrough clickThrough = videoClicks.getClickThrough();
        int i12 = f1135 + 71;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return clickThrough;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Creatives m5423(InLine inLine) {
        int i10 = f1135 + 81;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        Creatives creatives = inLine.getCreatives();
        int i12 = f1137 + 59;
        f1135 = i12 % 128;
        if ((i12 % 2 == 0 ? ' ' : 'M') == 'M') {
            return creatives;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Creatives m5424(Wrapper wrapper) {
        int i10 = f1135 + 3;
        f1137 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Creatives creatives = wrapper.getCreatives();
        if (z10) {
            int i11 = 47 / 0;
        }
        int i12 = f1137 + 63;
        f1135 = i12 % 128;
        if ((i12 % 2 == 0 ? '#' : '!') != '#') {
            return creatives;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdParams m5425(VideoAdController videoAdController) {
        int i10 = f1137 + 11;
        f1135 = i10 % 128;
        int i11 = i10 % 2;
        AdParams adParams = videoAdController.getAdParams();
        int i12 = f1135 + 91;
        f1137 = i12 % 128;
        int i13 = i12 % 2;
        return adParams;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m5426(Ad ad2) {
        int i10 = f1137 + 39;
        f1135 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? '<' : ']') == '<') {
                ad2.toJson();
                throw null;
            }
            JSONObject json = ad2.toJson();
            int i11 = f1135 + 71;
            f1137 = i11 % 128;
            if (i11 % 2 == 0) {
                return json;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5427(VideoAd videoAd) {
        int i10 = f1137 + 95;
        f1135 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        boolean zM5394 = m5394(videoAd);
        if (z10) {
            int i11 = 53 / 0;
        }
        return zM5394;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5404(1632 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (49132 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5357();
            }
        });
        map.put(m5404(TextUtils.indexOf("", "") + 1643, (char) (49863 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bx.m5427((VideoAd) list.get(0)));
            }
        });
        map.put(m5404((ViewConfiguration.getJumpTapTimeout() >> 16) + 1660, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bx.m5393((VideoAd) list.get(0), (VideoAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5404(1726 - AndroidCharacter.getMirror('0'), (char) ExpandableListView.getPackedPositionType(0L), 9 - View.resolveSize(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.35
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5414((Ad) list.get(0));
            }
        });
        map.put(m5404((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1687, (char) (58339 - (ViewConfiguration.getEdgeSlop() >> 16)), 15 - TextUtils.indexOf("", "", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.32
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5371((Ad) list.get(0));
            }
        });
        map.put(m5404(1702 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.31
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5396((Ad) list.get(0));
            }
        });
        map.put(m5404((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1711, (char) (17480 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.getDefaultSize(0, 0) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.39
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5382((Ad) list.get(0));
            }
        });
        map.put(m5404(Color.argb(0, 0, 0, 0) + IronSourceConstants.errorCode_TEST_SUITE_DISABLED, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 8 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.40
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5388((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m5404((Process.myTid() >> 22) + 1731, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.38
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5378((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m5404((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1740, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 23312), 12 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5409((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m5404((KeyEvent.getMaxKeyCode() >> 16) + 1753, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 13 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5416((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m5404(Process.getGidForName("") + 1767, (char) (62292 - (Process.myTid() >> 22)), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5372((AdData) list.get(0));
            }
        });
        map.put(m5404((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1779, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 19449), 11 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5417((AdData) list.get(0));
            }
        });
        map.put(m5404(1790 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (54661 - Process.getGidForName("")), View.MeasureSpec.getMode(0) + 12).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5397((AdData) list.get(0));
            }
        });
        map.put(m5404(1802 - Drawable.resolveOpacity(0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.MeasureSpec.getMode(0) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5384((AdData) list.get(0), (String) list.get(1));
            }
        });
        map.put(m5404(1822 - TextUtils.indexOf("", "", 0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 17964), 22 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5395(bx.this, (VideoAdListener) list.get(0), chVar);
            }
        });
        map.put(m5404(ExpandableListView.getPackedPositionGroup(0L) + 1845, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - Color.blue(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5421((AdParams) list.get(0));
            }
        });
        map.put(m5404(TextUtils.getOffsetBefore("", 0) + 1862, (char) (47111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5408((AdParams) list.get(0));
            }
        });
        map.put(m5404((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1875, (char) ('0' - AndroidCharacter.getMirror('0')), 27 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5376((AdParams) list.get(0));
            }
        });
        map.put(m5404(1901 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 29 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5399((AdParams) list.get(0));
            }
        });
        map.put(m5404((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1930, (char) (50167 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 21 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5387((AdParams) list.get(0));
            }
        });
        map.put(m5404(KeyEvent.getDeadChar(0, 0) + 1953, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 38448), 23 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5369((AdParams) list.get(0));
            }
        });
        map.put(m5404((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1977, (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5362((AdParams) list.get(0));
            }
        });
        map.put(m5404(2005 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5364((AdParams) list.get(0));
            }
        });
        map.put(m5404(2031 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5392((VideoAdController) list.get(0));
            }
        });
        map.put(m5404(2041 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5389((VideoClicks) list.get(0));
            }
        });
        map.put(m5404(2067 - Color.blue(0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 31).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5410((VideoClicks) list.get(0));
            }
        });
        map.put(m5404(2099 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5412((Companion) list.get(0));
            }
        });
        map.put(m5404((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2121, (char) (Process.myPid() >> 22), Color.red(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.25
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5411((Creative) list.get(0));
            }
        });
        map.put(m5404(2145 - ExpandableListView.getPackedPositionGroup(0L), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 19158), View.MeasureSpec.getSize(0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5413((InLine) list.get(0));
            }
        });
        map.put(m5404(2163 - TextUtils.indexOf("", "", 0), (char) (Color.rgb(0, 0, 0) + 16777216), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5380((VastAdSource) list.get(0));
            }
        });
        map.put(m5404(2187 - Color.red(0), (char) View.getDefaultSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.28
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5373((MediaFile) list.get(0));
            }
        });
        map.put(m5404((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE, (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.27
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5374((StaticResource) list.get(0));
            }
        });
        map.put(m5404(TextUtils.getOffsetBefore("", 0) + 2224, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-16777187) - Color.rgb(0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.30
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5406((StaticResource) list.get(0));
            }
        });
        map.put(m5404((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2252, (char) (Color.blue(0) + 49038), 19 - View.resolveSizeAndState(0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.29
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5402((Wrapper) list.get(0));
            }
        });
        map.put(m5404((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2272, (char) (ExpandableListView.getPackedPositionGroup(0L) + 64535), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.26
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5381((Wrapper) list.get(0));
            }
        });
        map.put(m5404(KeyEvent.normalizeMetaState(0) + 2294, (char) (TextUtils.lastIndexOf("", '0') + 9622), TextUtils.indexOf("", "") + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.33
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5375((CreativeParams) list.get(0));
            }
        });
        map.put(m5404(View.resolveSizeAndState(0, 0, 0) + 2323, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 32 - View.MeasureSpec.getMode(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.34
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bx.m5407((CreativeParams) list.get(0));
            }
        });
        int i10 = f1135 + 3;
        f1137 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f1137 + 71;
        f1135 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            HyBid.getHyBidVersion();
            throw null;
        }
        String hyBidVersion = HyBid.getHyBidVersion();
        int i11 = f1135 + 41;
        f1137 = i11 % 128;
        int i12 = i11 % 2;
        return hyBidVersion;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c88 A[PHI: r3
      0x0c88: PHI (r3v42 char) = (r3v31 char), (r3v0 char) binds: [B:276:0x0c86, B:264:0x0be9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 4452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bx.mo4814(java.lang.String):java.lang.Class");
    }
}
