package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.adqualitysdk.sdk.i.ah;
import com.ironsource.adqualitysdk.sdk.i.ja;
import com.ironsource.adqualitysdk.sdk.i.je;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class af {

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f164 = 1;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f166;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private String f168;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private q f169;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Context f170;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ae f171;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private iu f172;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private jo f173;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f175;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Handler f176;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f177;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private iw f180;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ja f181;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private al f182;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f183;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ah f184;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int[] f165 = {-1469469176, -974809611, -2002033642, 666463242, -211924936, 80851235, 1695927819, -277586470, 1209384732, -2064262749, 671764510, 1304361333, 73267262, -2075817937, -1343380381, 1170773375, -1004242352, 1285275974};

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char[] f167 = {'9', 'k', 'f', 'n', 'v', 'r', 'f', 'g', 'g', 'J', '0', 'P', 'l', 'k', 'j', 'd', 'l', 'P', 'G', 'f', 'l', 'n', 'o', 'q', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', 'W', 'X', 'p', 'b', 'a', 'X', 'Q', 'b', 'g', 'i', 'l', 'p', 'r', 'q', 'i', '9', 'm', 'f', 'k', 'o', 'R', 186, 209, 207, 207, 168, 159, 193, 195, 197, 202, 201, 162, 161, 202, 209, 207, 207, 168, 165, 200, 203, 210, 201, 195, 197, 185, 200, 201};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<ag> f179 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<je.d> f178 = new ArrayList();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f174 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$2, reason: invalid class name */
    public class AnonymousClass2 implements iy, ja.a {
        public AnonymousClass2() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo4463(iq iqVar) {
            af.m4410(af.this);
            af.m4435(af.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo4464(iq iqVar, String str) {
            af.m4410(af.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ja.a
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void mo4465(List<jb> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<jb> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new ai(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ai aiVar = (ai) priorityQueue.poll(); aiVar != null; aiVar = (ai) priorityQueue.poll()) {
                            if (af.m4425(af.this, aiVar)) {
                                if (TextUtils.isEmpty(aiVar.m4496())) {
                                    aiVar.m4495(af.m4397(af.this).m6790().m4543());
                                }
                                arrayList.add(aiVar);
                            } else {
                                af.m4401(af.this).m6667(aiVar.m4497());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        af.m4428(af.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    af.m4410(af.this);
                    return;
                }
            }
            af.m4410(af.this);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$3, reason: invalid class name */
    public class AnonymousClass3 implements ah.a {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final /* synthetic */ iy f212;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final /* synthetic */ JSONArray f214;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final /* synthetic */ List f215;

        public AnonymousClass3(JSONArray jSONArray, List list, iy iyVar) {
            this.f214 = jSONArray;
            this.f215 = list;
            this.f212 = iyVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ah.a
        public void onEventGenerated(JSONObject jSONObject) {
            af.m4430(af.this).m4391(jSONObject);
            af.m4394(af.this).m6616(af.m4405(af.this).m4515(af.m4400(af.this)), jSONObject, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f216 = 1;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f217 = 0;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static short[] f218 = null;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static int f219 = -1825032449;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static byte[] f220 = {-36, 54, 57, 55, -63, -57, 63, ExifInterface.MARKER_APP1, -68, 23, 24, -2, 32, -16, -25, 24, -29, 66, -65, 18, 24, 87, -86, -29, 20, -18, -18, -20, 31, -30, 67, -68, 17, 31, 19, 17, -1, 19, 66, -82, 80, -67, 20, 57, 104, 91, 124, -117, 113, 113, 115, -128, 125, -36, 34, -117, -90, -87, 124, 52, -120, -121, 97, -65, 111, 120, -121, 124, -35, 54, 122, -123, 124, ExifInterface.MARKER_EOI, 55, 119, 113, 115, 117, ExifInterface.MARKER_EOI, 34, -120, -121, 96, ExifInterface.MARKER_EOI, 55, 119, -117, -113, 122, -127, 118, 112, -110, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f221 = 70;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f222 = -1800214918;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static String m4466(int i10, short s10, int i11, byte b10, int i12) {
                    String string;
                    synchronized (o.f3015) {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f221;
                        int i14 = i12 + i13;
                        boolean z10 = i14 == -1;
                        if (z10) {
                            byte[] bArr = f220;
                            i14 = bArr != null ? (byte) (bArr[f222 + i10] + i13) : (short) (f218[f222 + i10] + i13);
                        }
                        if (i14 > 0) {
                            o.f3016 = ((i10 + i14) - 2) + f222 + (z10 ? 1 : 0);
                            o.f3017 = b10;
                            char c10 = (char) (i11 + f219);
                            o.f3019 = c10;
                            sb2.append(c10);
                            o.f3018 = o.f3019;
                            o.f3020 = 1;
                            while (o.f3020 < i14) {
                                byte[] bArr2 = f220;
                                if (bArr2 != null) {
                                    int i15 = o.f3016;
                                    o.f3016 = i15 - 1;
                                    o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                                } else {
                                    short[] sArr = f218;
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

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4463(final iq iqVar) {
                    final int iM6593 = iqVar.m6590().m6593();
                    final String strM6594 = iqVar.m6590().m6594();
                    boolean z10 = false;
                    if (iM6593 >= 200 && iM6593 <= 299) {
                        k.m6887(m4466(1800214917 - TextUtils.lastIndexOf("", '0', 0, 0), (short) TextUtils.getCapsMode("", 0, 0), TextUtils.getCapsMode("", 0, 0) + 1825032514, (byte) (TextUtils.getOffsetBefore("", 0) - 52), (-61) - Color.green(0)).intern(), m4466(ExpandableListView.getPackedPositionType(0L) + 1800214926, (short) View.combineMeasuredStates(0, 0), 1825032520 - ExpandableListView.getPackedPositionGroup(0L), (byte) (16 - TextUtils.lastIndexOf("", '0', 0, 0)), (-33) - (Process.myTid() >> 22)).intern(), AnonymousClass3.this.f214);
                        z10 = true;
                    } else if (iM6593 == 403) {
                        synchronized (af.this) {
                            for (final je.d dVar : af.m4403(af.this)) {
                                t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.2
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo4352() {
                                        dVar.mo6719();
                                    }
                                });
                            }
                        }
                    } else {
                        String strIntern = m4466((ViewConfiguration.getWindowTouchSlop() >> 8) + 1800214918, (short) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 1825032514, (byte) (View.MeasureSpec.getSize(0) - 52), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 61).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m4466(1800214962 - TextUtils.getOffsetAfter("", 0), (short) View.getDefaultSize(0, 0), 1825032532 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((-114) - (Process.myPid() >> 22)), TextUtils.indexOf("", "", 0) - 19).intern());
                        sb2.append(iM6593);
                        sb2.append(m4466((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1800215012, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 1825032480 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53), (-69) - KeyEvent.normalizeMetaState(0)).intern());
                        sb2.append(strM6594);
                        k.m6901(strIntern, sb2.toString());
                    }
                    if (!z10) {
                        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.4

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static boolean f228 = true;

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f229 = 87;

                            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                            private static int f230 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static int f231 = 1;

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static boolean f232 = true;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static char[] f233 = {170, 198, 196, 188, 203, 191, 192, 197, 190, 'w', 206, 201, 202, 187, 156, 205, 133, 158, 199, 145};

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static String m4467(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                                    char[] cArr2 = f233;
                                    int i11 = f229;
                                    if (f232) {
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
                                    if (f228) {
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

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4352() {
                                iy iyVar = AnonymousClass3.this.f212;
                                iq iqVar2 = iqVar;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(m4467(null, TextUtils.indexOf("", "", 0, 0) + 127, null, "\u008a\u0094\u0084\u008d\u0088\u0082\u0093\u008d\u0084\u008c\u008a\u0085\u0082\u0092\u008a\u0091\u0085\u0088\u0084\u0090\u008f\u008e\u0088\u0084\u008d\u008a\u0086\u0085\u0087\u008b\u008a\u0089\u0088\u0082\u008c\u008b\u008a\u0085\u0088\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                                sb3.append(iM6593);
                                sb3.append(m4467(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008a").intern());
                                sb3.append(strM6594);
                                iyVar.mo4464(iqVar2, sb3.toString());
                                int i10 = f230 + 15;
                                f231 = i10 % 128;
                                int i11 = i10 % 2;
                            }
                        });
                        return;
                    }
                    Iterator it = AnonymousClass3.this.f215.iterator();
                    while (it.hasNext()) {
                        af.m4401(af.this).m6667(((ai) it.next()).m4497());
                    }
                    t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            AnonymousClass3.this.f212.mo4463(iqVar);
                        }
                    });
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4464(final iq iqVar, final String str) {
                    t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            AnonymousClass3.this.f212.mo4464(iqVar, str);
                        }
                    });
                    int i10 = f216 + 121;
                    f217 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }
            });
        }
    }

    public af(Context context, ao aoVar, al alVar, boolean z10, String str, q qVar) {
        this.f169 = qVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.af.5

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f242 = 167;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f243 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f244;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m4468(String str2, int i10, boolean z11, int i11, int i12) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
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
                        cArr2[i14] = (char) (cArr2[i14] - f242);
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
                    if (z11) {
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
                    str3 = new String(cArr2);
                }
                return str3;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                int i10 = f244 + 33;
                f243 = i10 % 128;
                int i11 = i10 % 2;
                kd.m6954(m4468("\u000b\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb", 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, ExpandableListView.getPackedPositionType(0L) + 271).intern(), m4468("�\ufffb\u000f\u0001\u0002\u000eﾺ\uffff\u0012�\uffff\n\u000e\u0003\t\b\uffef\b", ImageFormat.getBitsPerPixel(0) + 19, false, TextUtils.getOffsetAfter("", 0) + 16, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 269).intern(), m4468("\b\ufff1\u000f\ufffe\u0000\u0002\uffff\ufffe\u0000", 9 - (Process.myPid() >> 22), false, -TextUtils.lastIndexOf("", '0', 0, 0), 266 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th2);
                af.this.m4448();
                af.m4421(af.this).uncaughtException(thread, th2);
                int i12 = f244 + 113;
                f243 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 7 : 'R') == 'R') {
                } else {
                    throw null;
                }
            }
        });
        this.f182 = alVar;
        this.f170 = context;
        je jeVar = new je(context, m4434(new int[]{2142473509, 959875332, -974896525, 1353679588, -383335320, 509482092, 246021949, -1597145402, -1660798854, 916120805, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25).intern(), m4418(new int[]{0, 24, 0, 24}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true).intern());
        this.f181 = new ja(m4434(new int[]{-1566622052, -1321266843, -1680295992, 1459105824}, TextUtils.indexOf("", "") + 8).intern(), m4434(new int[]{285523246, 2125077745, 529671218, 1081736530}, 5 - MotionEvent.axisFromString("")).intern(), jeVar);
        int iM4420 = m4420(jeVar);
        this.f184 = new ah(context, aoVar, iM4420, m4417(jeVar), ar.m4559().mo4564());
        this.f180 = new iw(context);
        this.f183 = false;
        HandlerThread handlerThread = new HandlerThread(m4434(new int[]{-911160412, 496095674, 444534958, 1214402569, 1847194611, 1965971865, -1123958610, -841576584}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14).intern());
        handlerThread.start();
        this.f176 = new Handler(handlerThread.getLooper());
        this.f171 = new ae(iM4420);
        this.f175 = !z10;
        this.f168 = str;
        m4419(true);
        m4409();
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static /* synthetic */ iw m4394(af afVar) {
        int i10 = f166;
        int i11 = i10 + 23;
        f164 = i11 % 128;
        int i12 = i11 % 2;
        iw iwVar = afVar.f180;
        int i13 = i10 + 71;
        f164 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 17 : 'V') == 'V') {
            return iwVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.ar.m4559().mo4576()) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m4559().mo4576() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r0 = m4399().m4632();
        r1 = com.ironsource.adqualitysdk.sdk.i.af.f166 + 33;
        com.ironsource.adqualitysdk.sdk.i.af.f164 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return m4399().m4631();
     */
    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m4395() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.af.f166
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f164 = r1
            int r0 = r0 % 2
            r1 = 88
            if (r0 != 0) goto L11
            r0 = 25
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == r1) goto L28
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m4559()
            boolean r0 = r0.mo4576()
            r1 = 2
            r2 = 0
            int r1 = r1 / r2
            if (r0 != 0) goto L22
            goto L23
        L22:
            r2 = 1
        L23:
            if (r2 == 0) goto L32
            goto L45
        L26:
            r0 = move-exception
            throw r0
        L28:
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m4559()
            boolean r0 = r0.mo4576()
            if (r0 != 0) goto L45
        L32:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r3.m4399()
            java.lang.String r0 = r0.m4632()
            int r1 = com.ironsource.adqualitysdk.sdk.i.af.f166
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f164 = r2
            int r1 = r1 % 2
            return r0
        L45:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r3.m4399()
            java.lang.String r0 = r0.m4631()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m4395():java.lang.String");
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private int m4396() {
        int i10 = f164 + 1;
        f166 = i10 % 128;
        if ((i10 % 2 != 0 ? '*' : (char) 23) != 23) {
            m4399();
            throw null;
        }
        if (!(m4399() == null) && !ar.m4559().mo4576()) {
            return m4399().m4640();
        }
        int i11 = f166 + 81;
        f164 = i11 % 128;
        if (i11 % 2 != 0) {
            return 100;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ ah m4397(af afVar) {
        int i10 = f166 + 63;
        int i11 = i10 % 128;
        f164 = i11;
        int i12 = i10 % 2;
        ah ahVar = afVar.f184;
        int i13 = i11 + 99;
        f166 = i13 % 128;
        int i14 = i13 % 2;
        return ahVar;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m4398() {
        boolean z10;
        int i10 = f166;
        int i11 = i10 + 47;
        f164 = i11 % 128;
        int i12 = i11 % 2;
        z10 = this.f183;
        int i13 = i10 + 77;
        f164 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized as m4399() {
        as asVarMo4572;
        int i10 = f164 + 9;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        asVarMo4572 = ar.m4559().mo4572();
        int i12 = f164 + 71;
        f166 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return asVarMo4572;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ String m4400(af afVar) {
        int i10 = f164 + 3;
        f166 = i10 % 128;
        if (i10 % 2 != 0) {
            afVar.m4395();
            throw null;
        }
        String strM4395 = afVar.m4395();
        int i11 = f166 + 99;
        f164 = i11 % 128;
        int i12 = i11 % 2;
        return strM4395;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ ja m4401(af afVar) {
        int i10 = f166 + 97;
        int i11 = i10 % 128;
        f164 = i11;
        int i12 = i10 % 2;
        ja jaVar = afVar.f181;
        int i13 = i11 + 105;
        f166 = i13 % 128;
        if (i13 % 2 == 0) {
            return jaVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m4402() {
        int i10 = f166 + 109;
        f164 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        m4431(0);
        int i11 = f166 + 11;
        f164 = i11 % 128;
        if (!(i11 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ List m4403(af afVar) {
        int i10 = f164 + 45;
        int i11 = i10 % 128;
        f166 = i11;
        char c10 = i10 % 2 != 0 ? (char) 22 : '\"';
        List<je.d> list = afVar.f178;
        if (c10 == 22) {
            int i12 = 26 / 0;
        }
        int i13 = i11 + 29;
        f164 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m4404() {
        int i10 = f166 + 69;
        f164 = i10 % 128;
        if ((i10 % 2 == 0 ? '\f' : (char) 27) == '\f') {
            throw null;
        }
        return this.f177;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ al m4405(af afVar) {
        int i10 = f164 + 95;
        int i11 = i10 % 128;
        f166 = i11;
        int i12 = i10 % 2;
        al alVar = afVar.f182;
        int i13 = i11 + 55;
        f164 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        return alVar;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized void m4406() {
        int i10 = f164 + 31;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        if ((m4398() ? '8' : 'C') == '8') {
            int i12 = f164 + 79;
            f166 = i12 % 128;
            int i13 = i12 % 2;
            if (!TextUtils.isEmpty(this.f184.m6790().m4543())) {
                int i14 = f164 + 69;
                f166 = i14 % 128;
                if (i14 % 2 != 0) {
                    m4404();
                    throw null;
                }
                if (!m4404()) {
                    m4440(true);
                    k.m6901(m4434(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, View.getDefaultSize(0, 0) + 9).intern(), m4434(new int[]{82263556, 2010123041, -389681155, 835751152, 285523246, 2125077745, 161422540, 1021833377, 426856860, -1468095046, -2077565810, -1220588072, 83087957, 956410176}, (Process.myPid() >> 22) + 25).intern());
                    this.f181.m6664(m4399().m4639(), new AnonymousClass2());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ int m4407(af afVar) {
        int i10 = f166 + 71;
        f164 = i10 % 128;
        int i11 = i10 % 2;
        int iM4396 = afVar.m4396();
        int i12 = f166 + 73;
        f164 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : '\\') == '\\') {
            return iM4396;
        }
        int i13 = 53 / 0;
        return iM4396;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m4408() {
        int i10 = f164 + 3;
        f166 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        m4419(false);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m4409() {
        this.f172 = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4470() {
                af.m4427(af.this);
            }
        };
        this.f180.m6618().m6610(this.f172);
        this.f173 = new jo(new jm() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f191 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f192 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f193 = 32422;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f194 = 57520;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f195 = 53499;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f196 = 1063;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static JSONObject m4453(Activity activity) {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                try {
                    jSONObjectJsonObjectInit.put(m4455("ꢕ\ue8e5⧺쳸\ue1d0ᕌ\n斦", 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), activity.getClass().getName());
                    int i10 = f191 + 47;
                    f192 = i10 % 128;
                    int i11 = i10 % 2;
                } catch (JSONException unused) {
                    k.m6886(m4455("鮱猗\udc15銙ԫ㓆\uf685৺旡\uda2a", View.combineMeasuredStates(0, 0) + 9).intern(), m4455("떊쨳✠秥L࿖\uf488甧럌鄐ೄ쑺\u0e73\uf191ሥ︋\ud88e溎⧫憌ࠍ薶\ue601\udce2㿙곲", 25 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                }
                int i12 = f191 + 51;
                f192 = i12 % 128;
                int i13 = i12 % 2;
                return jSONObjectJsonObjectInit;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public static /* synthetic */ JSONObject m4454(Activity activity) {
                int i10 = f191 + 7;
                f192 = i10 % 128;
                int i11 = i10 % 2;
                JSONObject jSONObjectM4453 = m4453(activity);
                int i12 = f191 + 99;
                f192 = i12 % 128;
                if (!(i12 % 2 == 0)) {
                    return jSONObjectM4453;
                }
                int i13 = 84 / 0;
                return jSONObjectM4453;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4455(String str, int i10) {
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
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f194)) ^ ((c11 >>> 5) + f195)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f196) ^ ((c12 + i12) ^ ((c12 << 4) + f193))));
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

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo4456(final Activity activity) {
                t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.3

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f198 = 139;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f199 = 0;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f200 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m4458(String str, int i10, boolean z10, int i11, int i12) {
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
                                cArr2[i14] = (char) (cArr2[i14] - f198);
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        int i10 = f199 + 5;
                        f200 = i10 % 128;
                        int i11 = i10 % 2;
                        af.m4416(af.this).onEvent(m4458("\ufff7\t\u0007\ufff3\u0000\u0003\u0007\b\ufffa\u0003", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, false, TextUtils.indexOf((CharSequence) "", '0') + 9, 247 - Color.argb(0, 0, 0, 0)).intern());
                        af.this.m4444(m4458("\ufff7\t\u0007\ufff3\u0000\u0003\u0007\b\ufffa\u0003", Drawable.resolveOpacity(0, 0) + 10, false, 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 247).intern(), AnonymousClass10.m4454(activity));
                        int i12 = f199 + 87;
                        f200 = i12 % 128;
                        if ((i12 % 2 == 0 ? '.' : '\t') == '\t') {
                        } else {
                            throw null;
                        }
                    }
                });
                int i10 = f192 + 95;
                f191 = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo4457(final Activity activity) {
                t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.5

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f203 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f204 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static long f205 = -7819346487344341121L;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m4459(String str, int i10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (h.f2306) {
                            char[] cArrM6319 = h.m6319(f205, cArr, i10);
                            h.f2307 = 4;
                            while (true) {
                                int i11 = h.f2307;
                                if (i11 < cArrM6319.length) {
                                    h.f2305 = i11 - 4;
                                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f205));
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
                        int i10 = f204 + 11;
                        f203 = i10 % 128;
                        int i11 = i10 % 2;
                        af.m4416(af.this).onEvent(m4459("㣳ヿ笊儯㢕濯얗伧䕼\ueddb䞂촳썸毼솓䬨䅢\ue9e8", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                        af.this.m4444(m4459("㣳ヿ笊儯㢕濯얗伧䕼\ueddb䞂촳썸毼솓䬨䅢\ue9e8", 1 - Drawable.resolveOpacity(0, 0)).intern(), AnonymousClass10.m4454(activity));
                        int i12 = f203 + 25;
                        f204 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 14 / 0;
                        }
                    }
                });
                int i10 = f192 + 91;
                f191 = i10 % 128;
                if (!(i10 % 2 != 0)) {
                    return;
                }
                int i11 = 90 / 0;
            }
        });
        jj.m6752().m6755(new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.af.12
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo4460(Activity activity) {
                af.this.m4448();
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo4461(Activity activity) {
                af.m4415(af.this);
            }
        });
        ar.m4559().mo4583(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.af.11
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4393() {
                af.m4412(af.this);
            }
        });
        int i10 = f166 + 103;
        f164 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ void m4410(af afVar) {
        int i10 = f164 + 85;
        f166 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            afVar.m4440(false);
        } else {
            afVar.m4440(true);
        }
        int i11 = f166 + 125;
        f164 = i11 % 128;
        if (!(i11 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m4411() {
        if (this.f172 != null) {
            int i10 = f164 + 17;
            f166 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                this.f180.m6618().m6608(this.f172);
                throw null;
            }
            this.f180.m6618().m6608(this.f172);
        }
        this.f173.m6780();
        this.f173 = null;
        int i11 = f166 + 27;
        f164 = i11 % 128;
        if ((i11 % 2 == 0 ? '\t' : 'U') != '\t') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m4412(af afVar) {
        int i10 = f164 + 23;
        f166 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        afVar.m4433(true);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ void m4413(af afVar) {
        int i10 = f166 + 71;
        f164 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '\t' : (char) 27;
        afVar.m4406();
        if (c10 != '\t') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m4414() {
        if ((this.f175 ? (char) 17 : 'W') == 17) {
            int i10 = f164 + 7;
            f166 = i10 % 128;
            int i11 = i10 % 2;
            m4445();
            int i12 = f166 + 69;
            f164 = i12 % 128;
            int i13 = i12 % 2;
        }
        this.f175 = false;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ void m4415(af afVar) {
        int i10 = f166 + 1;
        f164 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '$' : '\"';
        afVar.m4414();
        if (c10 == '\"') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ q m4416(af afVar) {
        int i10 = f164;
        int i11 = i10 + 61;
        f166 = i11 % 128;
        int i12 = i11 % 2;
        q qVar = afVar.f169;
        int i13 = i10 + 23;
        f166 = i13 % 128;
        if (i13 % 2 == 0) {
            return qVar;
        }
        int i14 = 52 / 0;
        return qVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4417(je jeVar) {
        int i10 = f164 + 83;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        String strM6713 = jeVar.m6713(m4434(new int[]{880499219, 219661264, 1061739848, -731476431, 541997271, 1086220609, 2040148884, 1234529969}, (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern());
        if ((TextUtils.isEmpty(strM6713) ? '!' : '.') == '.') {
            return strM6713;
        }
        int i12 = f164 + 23;
        f166 = i12 % 128;
        int i13 = i12 % 2;
        String string = UUID.randomUUID().toString();
        jeVar.m6714(m4434(new int[]{880499219, 219661264, 1061739848, -731476431, 541997271, 1086220609, 2040148884, 1234529969}, 16 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), string);
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4418(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f167, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m4419(boolean z10) {
        int i10 = f164 + 109;
        int i11 = i10 % 128;
        f166 = i11;
        int i12 = i10 % 2;
        if (!z10) {
            this.f181.m6665(new ja.d() { // from class: com.ironsource.adqualitysdk.sdk.i.af.14
                @Override // com.ironsource.adqualitysdk.sdk.i.ja.d
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo4462(int i13) {
                    af.m4436(af.this, af.m4429(af.this, i13) ? 0 : af.m4407(af.this));
                }
            });
            return;
        }
        int i13 = i11 + 47;
        f164 = i13 % 128;
        if (i13 % 2 == 0) {
            m4402();
            throw null;
        }
        m4402();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int m4420(je jeVar) {
        String strM6713 = jeVar.m6713(m4434(new int[]{-1627444297, 1930145964, 216365417, -156356161, -753046412, 1138589857}, 10 - Color.alpha(0)).intern());
        int i10 = 1;
        if (!(TextUtils.isEmpty(strM6713))) {
            int i11 = f166 + 109;
            f164 = i11 % 128;
            boolean z10 = i11 % 2 == 0;
            int i12 = Integer.parseInt(strM6713);
            i10 = z10 ? i12 / 0 : i12 + 1;
        }
        jeVar.m6714(m4434(new int[]{-1627444297, 1930145964, 216365417, -156356161, -753046412, 1138589857}, 9 - TextUtils.lastIndexOf("", '0', 0)).intern(), String.valueOf(i10));
        int i13 = f164 + 15;
        f166 = i13 % 128;
        int i14 = i13 % 2;
        return i10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Thread.UncaughtExceptionHandler m4421(af afVar) {
        int i10 = f166 + 59;
        f164 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 16 : '(';
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = afVar.f174;
        if (c10 != 16) {
            return uncaughtExceptionHandler;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m4422(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(m4434(new int[]{-1967768556, -1946163968, 81328616, 1125925523}, (-16777211) - Color.rgb(0, 0, 0)).intern(), str);
            jSONObjectJsonObjectInit.put(m4418(new int[]{50, 5, 0, 2}, "\u0001\u0000\u0000\u0001\u0001", false).intern(), str2);
            jSONObjectJsonObjectInit.put(m4434(new int[]{551549932, 1373315991, -1205271376, 2138843809}, View.resolveSizeAndState(0, 0, 0) + 6).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObjectJsonObjectInit.put(m4434(new int[]{-389804321, -275172463, -1757591635, -1094520480}, KeyEvent.keyCodeFromString("") + 5).intern(), str4);
            }
            if ((jSONObject != null ? 'c' : '<') != '<') {
                int i10 = f166 + 1;
                f164 = i10 % 128;
                if (!(i10 % 2 == 0)) {
                    jz.m6871(jSONObjectJsonObjectInit, jSONObject);
                } else {
                    jz.m6871(jSONObjectJsonObjectInit, jSONObject);
                    int i11 = 15 / 0;
                }
            }
        } catch (JSONException e10) {
            k.m6906(m4434(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9).intern(), m4418(new int[]{55, 26, 95, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false).intern(), e10);
        }
        int i12 = f164 + 57;
        f166 = i12 % 128;
        if (i12 % 2 == 0) {
            return jSONObjectJsonObjectInit;
        }
        int i13 = 15 / 0;
        return jSONObjectJsonObjectInit;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[EXC_TOP_SPLITTER, PHI: r2 r10
      0x007f: PHI (r2v16 com.ironsource.adqualitysdk.sdk.i.ai) = (r2v15 com.ironsource.adqualitysdk.sdk.i.ai), (r2v20 com.ironsource.adqualitysdk.sdk.i.ai) binds: [B:24:0x007d, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r10v1 org.json.JSONObject) = (r10v0 org.json.JSONObject), (r10v3 org.json.JSONObject) binds: [B:24:0x007d, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4423(java.util.List<com.ironsource.adqualitysdk.sdk.i.ai> r14, com.ironsource.adqualitysdk.sdk.i.iy r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m4423(java.util.List, com.ironsource.adqualitysdk.sdk.i.iy):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4424(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (s.m7027().m7055()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f179);
            }
            t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.4
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ag) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4425(af afVar, ai aiVar) {
        int i10 = f166 + 21;
        f164 = i10 % 128;
        if ((i10 % 2 == 0 ? '+' : (char) 7) == '+') {
            afVar.m4426(aiVar);
            throw null;
        }
        boolean zM4426 = afVar.m4426(aiVar);
        int i11 = f164 + 57;
        f166 = i11 % 128;
        int i12 = i11 % 2;
        return zM4426;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m4426(ai aiVar) {
        int i10 = f164 + 123;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        boolean zMo4589 = ar.m4559().mo4589(aiVar.m4494(), this.f168);
        int i12 = f166 + 35;
        f164 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 15 : 'P') != 15) {
            return zMo4589;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m4427(af afVar) {
        int i10 = f166 + 109;
        f164 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m4408();
        int i12 = f166 + 41;
        f164 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : (char) 27) == 27) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m4428(af afVar, List list, iy iyVar) {
        int i10 = f164 + 121;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m4423((List<ai>) list, iyVar);
        int i12 = f164 + 89;
        f166 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4429(af afVar, int i10) {
        int i11 = f164 + 103;
        f166 = i11 % 128;
        int i12 = i11 % 2;
        boolean zM4441 = afVar.m4441(i10);
        int i13 = f164 + 23;
        f166 = i13 % 128;
        if ((i13 % 2 != 0 ? (char) 14 : (char) 26) == 26) {
            return zM4441;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ae m4430(af afVar) {
        int i10 = f166;
        int i11 = i10 + 105;
        f164 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        ae aeVar = afVar.f171;
        if (z10) {
            throw null;
        }
        int i12 = i10 + 3;
        f164 = i12 % 128;
        if (i12 % 2 != 0) {
            return aeVar;
        }
        int i13 = 61 / 0;
        return aeVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4431(int i10) {
        this.f176.removeCallbacksAndMessages(null);
        this.f176.postDelayed(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.1

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f185 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f186 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f187 = 3506;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f188;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f189;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4452(String str, char c10, String str2, int i11, String str3) {
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
                    cArr5[2] = (char) (cArr5[2] + ((char) i11));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    j.f2697 = 0;
                    while (true) {
                        int i12 = j.f2697;
                        if (i12 < length) {
                            int i13 = (i12 + 2) % 4;
                            int i14 = (i12 + 3) % 4;
                            int i15 = cArr4[i12 % 4] * 32718;
                            char c11 = cArr5[i13];
                            char c12 = (char) ((i15 + c11) % 65535);
                            j.f2696 = c12;
                            cArr5[i14] = (char) (((cArr4[i14] * 32718) + c11) / 65535);
                            cArr4[i14] = c12;
                            int i16 = j.f2697;
                            cArr6[i16] = (char) (((((long) (c12 ^ cArr3[i16])) ^ f189) ^ ((long) f186)) ^ ((long) f187));
                            j.f2697 = i16 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                int i11 = f185 + 95;
                f188 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        af.m4413(af.this);
                    } else {
                        af.m4413(af.this);
                        int i12 = 26 / 0;
                    }
                } catch (Throwable th2) {
                    k.m6892(m4452("壶쉠㫖⫩㫪ଶ彐ｚ뇫", (char) (Process.getGidForName("") + 1), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1842376590, "狺⾐쒒о").intern(), m4452("㊠ᕲ擇뱩祜崢ꈢꗹ덃멦꺙\uf637슟쁕⡄ㅎ㹴깕뿇魲\uf289⎧ꀪ褩숩폩永ⵉ낽\uf4e8Ⲓ", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 9590), "\u0000\u0000\u0000\u0000", 1189248938 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "ꫳ\ue27f癆줥").intern(), th2);
                    af.m4410(af.this);
                }
            }
        }, i10);
        int i11 = f164 + 85;
        f166 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4432(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f166 + 3;
        f164 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m4451(str, jSONObject, jSONObject2, null);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m4433(boolean z10) {
        int i10 = f164 + 123;
        f166 = i10 % 128;
        if ((i10 % 2 != 0 ? '\f' : 'W') != 'W') {
            this.f183 = true;
            m4419(false);
        } else {
            this.f183 = true;
            m4419(true);
        }
        int i11 = f164 + 3;
        f166 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4434(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f165.clone();
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4435(af afVar) {
        int i10 = f164 + 111;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m4419(false);
        int i12 = f166 + 121;
        f164 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 3 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4436(af afVar, int i10) {
        int i11 = f164 + 17;
        f166 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        afVar.m4431(i10);
        if (!z10) {
            return;
        }
        int i12 = 38 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4437(af afVar, JSONObject jSONObject, ir irVar) {
        int i10 = f166 + 117;
        f164 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m4439(jSONObject, irVar);
        int i12 = f166 + 107;
        f164 = i12 % 128;
        if ((i12 % 2 == 0 ? ']' : 'S') != ']') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4438(JSONObject jSONObject) {
        int i10 = f166 + 113;
        f164 = i10 % 128;
        if (i10 % 2 == 0) {
            m4399().m4638().iterator();
            throw null;
        }
        Iterator<String> it = m4399().m4638().iterator();
        while (true) {
            if (!it.hasNext()) {
                return;
            }
            int i11 = f166 + 73;
            f164 = i11 % 128;
            if (!(i11 % 2 != 0)) {
                jSONObject.remove(it.next());
                throw null;
            }
            jSONObject.remove(it.next());
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4439(JSONObject jSONObject, ir irVar) {
        m4438(jSONObject);
        ai aiVar = new ai(ja.m6655(jSONObject));
        aiVar.m4493(m4399().m4637());
        this.f181.m6666(aiVar.m4497(), irVar);
        m4424(aiVar.m4492());
        t.m7076(irVar);
        int i10 = f166 + 31;
        f164 = i10 % 128;
        if ((i10 % 2 == 0 ? '/' : '0') != '/') {
            return;
        }
        int i11 = 3 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m4440(boolean z10) {
        int i10 = f166 + 117;
        f164 = i10 % 128;
        if ((i10 % 2 == 0 ? 'X' : 'R') != 'R') {
            this.f177 = z10;
            throw null;
        }
        this.f177 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r5 >= m4399().m4639()) != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r5 >= m4399().m4639()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.i.af.f166 + 51;
        com.ironsource.adqualitysdk.sdk.i.af.f164 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r5 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m4441(int r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.af.f164
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f166 = r1
            int r0 = r0 % 2
            r1 = 19
            if (r0 == 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 88
        L12:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L26
            com.ironsource.adqualitysdk.sdk.i.as r0 = r4.m4399()
            int r0 = r0.m4639()
            if (r5 < r0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r3
        L23:
            if (r5 == r2) goto L33
            goto L41
        L26:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r4.m4399()
            int r0 = r0.m4639()
            r1 = 67
            int r1 = r1 / r3
            if (r5 < r0) goto L41
        L33:
            int r5 = com.ironsource.adqualitysdk.sdk.i.af.f166
            int r5 = r5 + 51
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f164 = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L40
            r2 = r3
        L40:
            return r2
        L41:
            return r3
        L42:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m4441(int):boolean");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m4442() {
        String strM4417 = m4417(new je(this.f170, m4434(new int[]{2142473509, 959875332, -974896525, 1353679588, -383335320, 509482092, 246021949, -1597145402, -1660798854, 916120805, -803478886, -227126831, -1523557290, 1147115770}, 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m4418(new int[]{0, 24, 0, 24}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true).intern()));
        int i10 = f166 + 113;
        f164 = i10 % 128;
        int i11 = i10 % 2;
        return strM4417;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4443() {
        t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.9

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f263 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f264 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static boolean f265 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f266 = {221, 217, 200, 220, 206, 215, 205};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static boolean f267 = true;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f268 = 105;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m4472(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f266;
                    int i11 = f268;
                    if (f265) {
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
                    if (f267) {
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

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                af.m4416(af.this).onEvent(m4472(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern());
                af.this.m4444(m4472(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern(), IronSourceVideoBridge.jsonObjectInit());
                int i10 = f264 + 71;
                f263 = i10 % 128;
                if (i10 % 2 == 0) {
                } else {
                    throw null;
                }
            }
        });
        int i10 = f166 + 61;
        f164 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4444(String str, JSONObject jSONObject) {
        int i10 = f166 + 67;
        f164 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m4432(str, jSONObject, null);
        if (!z10) {
            int i11 = 4 / 0;
        }
        int i12 = f164 + 91;
        f166 = i12 % 128;
        if ((i12 % 2 != 0 ? '>' : (char) 21) == 21) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4445() {
        t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.8

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f257 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f258 = 8001735609835121508L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f259;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f260;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f261;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m4471(String str, char c10, String str2, int i10, String str3) {
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f258) ^ ((long) f259)) ^ ((long) f261));
                            j.f2697 = i15 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                af.m4416(af.this).onEvent(m4471("\uf018펥므ㄘ纫\u0ff2餫\udcca䅾\udf18쨧⺏\ue747", (char) (11543 - (KeyEvent.getMaxKeyCode() >> 16)), "\ueb64拐\ue024漋", (-383233332) - ((Process.getThreadPriority(0) + 20) >> 6), "챤⡒៩भ").intern());
                af.this.m4444(m4471("\uf018펥므ㄘ纫\u0ff2餫\udcca䅾\udf18쨧⺏\ue747", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 11543), "\ueb64拐\ue024漋", TextUtils.indexOf("", "", 0, 0) - 383233332, "챤⡒៩भ").intern(), IronSourceVideoBridge.jsonObjectInit());
                int i10 = f257 + 95;
                f260 = i10 % 128;
                if ((i10 % 2 != 0 ? '9' : 'a') != '9') {
                } else {
                    throw null;
                }
            }
        });
        int i10 = f164 + 59;
        f166 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 21 : 'N') == 'N') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m4446(je.d dVar) {
        int i10 = f164 + 35;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        this.f178.add(dVar);
        int i12 = f164 + 105;
        f166 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m4447() {
        int i10 = f166 + 61;
        f164 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = false;
        this.f183 = false;
        Handler handler = this.f176;
        if (handler == null) {
            z10 = true;
        }
        if (!z10) {
            handler.removeCallbacksAndMessages(null);
            int i12 = f166 + 19;
            f164 = i12 % 128;
            int i13 = i12 % 2;
        }
        this.f180.m6617();
        m4411();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4448() {
        int i10 = f164 + 11;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f175 = true;
            m4443();
            m4450();
            int i12 = f164 + 65;
            f166 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception e10) {
            kd.m6948(m4434(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, TextUtils.getOffsetAfter("", 0) + 9).intern(), m4418(new int[]{24, 26, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", false).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m4449(ag agVar) {
        int i10 = f166 + 117;
        f164 = i10 % 128;
        int i11 = i10 % 2;
        this.f179.add(agVar);
        int i12 = f166 + 75;
        f164 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4450() {
        synchronized (this) {
            Handler handler = this.f176;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            m4419(true);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4451(String str, JSONObject jSONObject, JSONObject jSONObject2, final ir irVar) {
        String strIntern = m4434(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, TextUtils.getTrimmedLength("") + 9).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m4434(new int[]{83096655, 245550014, 289056553, -1579412729, -640605648, -181917106, 1761504619, 1903179779, 285092908, -348226072, 1376643555, 797126243}, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        sb2.append(str);
        sb2.append(m4434(new int[]{1849786485, 1620937760, 930804328, 1175772035, 793480345, 1919279341, -757807160, 1382205472, 953336447, -1759961253}, 17 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        k.m6887(strIntern, sb2.toString(), jSONObject);
        try {
            if (!m4399().m4636().contains(str)) {
                String strIntern2 = m4434(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, '9' - AndroidCharacter.getMirror('0')).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m4434(new int[]{83096655, 245550014, 289056553, -1579412729, -640605648, -181917106, 1761504619, 1903179779, 285092908, -348226072, 1849786485, 1620937760, -1334808229, -277208604, 21539249, 1861875140}, TextUtils.indexOf((CharSequence) "", '0', 0) + 33).intern());
                sb3.append(str);
                k.m6901(strIntern2, sb3.toString());
                this.f184.m4482(str, jSONObject, jSONObject2, this.f180.m6618().m6606(), new ah.a() { // from class: com.ironsource.adqualitysdk.sdk.i.af.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.ah.a
                    public void onEventGenerated(JSONObject jSONObject3) {
                        af.m4430(af.this).m4391(jSONObject3);
                        af.m4437(af.this, jSONObject3, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.6.3

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static short[] f248 = null;

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f249 = 1;

                            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                            private static int f250 = 0;

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static byte[] f251 = {-88, 66, 77, 67, -75, -77, 75, -107, -86, 83, -96, 90, -84, -87, 86, -85, 121, -128, -86, 26, -77, -109, 83, 92, -70, 100, -76, -93, 92, -89, 6, -25, 80, 28, -5, 86, -88, 85, 120, 0, 0};

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static int f252 = 167662927;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static int f253 = 27;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static int f254 = -284125767;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static String m4469(int i10, short s10, int i11, byte b10, int i12) {
                                String string;
                                synchronized (o.f3015) {
                                    StringBuilder sb4 = new StringBuilder();
                                    int i13 = f253;
                                    int i14 = i12 + i13;
                                    boolean z10 = i14 == -1;
                                    if (z10) {
                                        byte[] bArr = f251;
                                        i14 = bArr != null ? (byte) (bArr[f254 + i10] + i13) : (short) (f248[f254 + i10] + i13);
                                    }
                                    if (i14 > 0) {
                                        o.f3016 = ((i10 + i14) - 2) + f254 + (z10 ? 1 : 0);
                                        o.f3017 = b10;
                                        char c10 = (char) (i11 + f252);
                                        o.f3019 = c10;
                                        sb4.append(c10);
                                        o.f3018 = o.f3019;
                                        o.f3020 = 1;
                                        while (o.f3020 < i14) {
                                            byte[] bArr2 = f251;
                                            if (bArr2 != null) {
                                                int i15 = o.f3016;
                                                o.f3016 = i15 - 1;
                                                o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                                            } else {
                                                short[] sArr = f248;
                                                int i16 = o.f3016;
                                                o.f3016 = i16 - 1;
                                                o.f3019 = (char) (o.f3018 + (((short) (sArr[i16] + s10)) ^ o.f3017));
                                            }
                                            sb4.append(o.f3019);
                                            o.f3018 = o.f3019;
                                            o.f3020++;
                                        }
                                    }
                                    string = sb4.toString();
                                }
                                return string;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4352() {
                                int i10 = f249 + 111;
                                f250 = i10 % 128;
                                int i11 = i10 % 2;
                                af.m4435(af.this);
                                ir irVar2 = irVar;
                                if ((irVar2 != null ? 'N' : '(') != '(') {
                                    int i12 = f250 + 109;
                                    f249 = i12 % 128;
                                    int i13 = i12 % 2;
                                    try {
                                        irVar2.mo4352();
                                    } catch (Exception e10) {
                                        kd.m6956(m4469(TextUtils.indexOf("", "", 0, 0) + 284125767, (short) Color.green(0), (-167662862) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (Color.red(0) - 72), Color.blue(0) - 18).intern(), m4469(Color.blue(0) + 284125775, (short) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) - 167662857, (byte) (TextUtils.indexOf("", "", 0) + 85), 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), e10, false, false, true);
                                    }
                                }
                            }
                        });
                    }
                });
                return;
            }
            String strIntern3 = m4434(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getEdgeSlop() >> 16) + 9).intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m4434(new int[]{-950026680, -1992704577, 1373818390, 1537277856, -389681155, 835751152, 285523246, 2125077745, 1548619636, -186787108, -406479645, 1509108356, 1077145615, -1077114738, 1513703436, -1612471642}, 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
            sb4.append(str);
            sb4.append(m4434(new int[]{1145460262, 2124375549, 1922823439, -364277260, -1940569395, 1856846010, 1976509113, -1978719714, 2048614725, 1304313963, -1874846112, -2043772260}, 21 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
            k.m6901(strIntern3, sb4.toString());
            int i10 = f166 + 27;
            f164 = i10 % 128;
            if (i10 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Exception e10) {
            kd.m6956(m4434(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m4434(new int[]{-125987093, 2062639908, 2049619959, -170090790, 2075892157, -122529565, -40209718, -175130338, 1982882234, -2045069041}, 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), e10, false, false, true);
        }
    }
}
