package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class ij {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f2571 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f2572 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2573 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f2574;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2575;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static final Object f2576;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2577;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2578;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static ij f2579;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final Handler f2580;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final Context f2585;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2582 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2581 = new HashMap<>();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<d>> f2583 = new HashMap<>();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ArrayList<c> f2584 = new ArrayList<>();

    public static class c {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final Intent f2587;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final ArrayList<d> f2588;

        public c(Intent intent, ArrayList<d> arrayList) {
            this.f2587 = intent;
            this.f2588 = arrayList;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2589 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2590 = {-556830778, 932449610, -1252989743, -383555838, -527990239, -814091228, 1077649869, 1558196944, 546267028, -1488607256, -296181962, 439121835, -1134356724, -1964092877, 1684898287, 114805547, -1230078455, -2068352558};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2591;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public boolean f2592;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final IntentFilter f2593;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final BroadcastReceiver f2594;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m6580(int[] iArr, int i10) {
            String str;
            synchronized (e.f1934) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2590.clone();
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

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(m6580(new int[]{-1347683896, -766209396, -1016868116, 1920920811, -545763817, -15719272}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9).intern());
            sb2.append(this.f2594);
            sb2.append(m6580(new int[]{-297060969, 1552993991, 421836887, 902492426}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8).intern());
            sb2.append(this.f2593);
            sb2.append(m6580(new int[]{703596050, 754565513}, (ViewConfiguration.getEdgeSlop() >> 16) + 1).intern());
            String string = sb2.toString();
            int i10 = f2591 + 119;
            f2589 = i10 % 128;
            if (i10 % 2 != 0) {
                return string;
            }
            throw null;
        }
    }

    static {
        m6575();
        f2576 = new Object();
        int i10 = f2574 + 113;
        f2573 = i10 % 128;
        if ((i10 % 2 == 0 ? 'A' : (char) 27) != 'A') {
        } else {
            throw null;
        }
    }

    private ij(Context context) {
        this.f2585 = context;
        this.f2580 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ij.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    ij.m6572(ij.this);
                }
            }
        };
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6569(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2572)) ^ ((c11 >>> 5) + f2571)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2578) ^ ((c12 + i12) ^ ((c12 << 4) + f2577))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6570() {
        int size;
        c[] cVarArr;
        while (true) {
            synchronized (this.f2581) {
                size = this.f2584.size();
                if (size <= 0) {
                    return;
                }
                cVarArr = new c[size];
                this.f2584.toArray(cVarArr);
                this.f2584.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = cVarArr[i10];
                for (int i11 = 0; i11 < cVar.f2588.size(); i11++) {
                    cVar.f2588.get(i11).f2594.onReceive(this.f2585, cVar.f2587);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6571() {
        synchronized (this.f2581) {
            Iterator it = new HashMap(this.f2581).keySet().iterator();
            while (it.hasNext()) {
                m6576((BroadcastReceiver) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m6572(ij ijVar) {
        int i10 = f2573 + 73;
        f2574 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\'' : (char) 17;
        ijVar.m6570();
        if (c10 == 17) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ij m6573(Context context) {
        ij ijVar;
        synchronized (f2576) {
            if (f2579 == null) {
                f2579 = new ij(context.getApplicationContext());
            }
            ijVar = f2579;
        }
        return ijVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6574(String str, int i10, boolean z10, int i11, int i12) {
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
                cArr2[i14] = (char) (cArr2[i14] - f2575);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m6575() {
        f2572 = (char) 59581;
        f2578 = (char) 17809;
        f2571 = (char) 50599;
        f2577 = (char) 29743;
        f2575 = 118;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6576(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2581) {
            ArrayList<IntentFilter> arrayListRemove = this.f2581.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int i10 = 0; i10 < arrayListRemove.size(); i10++) {
                IntentFilter intentFilter = arrayListRemove.get(i10);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList<d> arrayList = this.f2583.get(action);
                    if (arrayList != null) {
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            if (arrayList.get(i12).f2594 == broadcastReceiver) {
                                arrayList.remove(i12);
                                i12--;
                            }
                            i12++;
                        }
                        if (arrayList.size() <= 0) {
                            this.f2583.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m6577() {
        int i10 = f2573 + 13;
        f2574 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            this.f2582 = true;
        } else {
            this.f2582 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6578(Intent intent) {
        int i10;
        ArrayList<d> arrayList;
        ArrayList arrayList2;
        String str;
        boolean z10;
        String str2;
        String strIntern = m6569("ᦌ㙕䫌綮关缠䯺㉩픸ㄑ䫌綮齊鉣ꝸ점\uf66aꋗ沤痌큇馔", 21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        int i11 = 0;
        if (!this.f2582) {
            return false;
        }
        synchronized (this.f2581) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2585.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z11 = true;
            Object[] objArr = (intent.getFlags() & 8) != 0;
            if (objArr != false) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6574("\r\b\u0015\u000b\u000e\u0012\u0004\ufff1\uffbf\u0004\u000f\u0018\u0013\uffbf\u0006", TextUtils.lastIndexOf("", '0', 0, 0) + 16, true, 8 - View.MeasureSpec.getSize(0), 214 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                sb2.append(strResolveTypeIfNeeded);
                sb2.append(m6574("\u0017\u000f\u0012\r\u001dￊￊ\u000f", 7 - ExpandableListView.getPackedPositionChild(0L), true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6, TextUtils.indexOf("", "", 0, 0) + 204).intern());
                sb2.append(scheme);
                sb2.append(m6574("\u0017\u000e\u001d\u0017\u0012\uffc9\u000f\u0018\uffc9\uffc9\u001d", KeyEvent.normalizeMetaState(0) + 11, true, 9 - (Process.myTid() >> 22), TextUtils.getTrimmedLength("") + 205).intern());
                sb2.append(intent);
                Log.v(strIntern, sb2.toString());
            }
            ArrayList<d> arrayList3 = this.f2583.get(intent.getAction());
            if (arrayList3 != null) {
                if (objArr != false) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m6574("\t\uffe7ￆ￠\u001a\u0019\u000f\u0012ￆ\u0014\u0015\u000f\u001a", 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, 208 - (Process.myPid() >> 22)).intern());
                    sb3.append(arrayList3);
                    Log.v(strIntern, sb3.toString());
                }
                ArrayList arrayList4 = null;
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    d dVar = arrayList3.get(i12);
                    if (objArr != false) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(m6569("ꝸ점聧䵸똰쐔䒦ⱌⅮ飏姁脖캞㬜齊鉣㷧쎆왁㭁\udc7a⺿땽\ued57", 24 - (TypedValue.complexToFloat(i11) > 0.0f ? 1 : (TypedValue.complexToFloat(i11) == 0.0f ? 0 : -1))).intern());
                        sb4.append(dVar.f2593);
                        Log.v(strIntern, sb4.toString());
                    }
                    if (!dVar.f2592) {
                        i10 = i12;
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        str = action;
                        z10 = true;
                        str2 = scheme;
                        int iMatch = dVar.f2593.match(action, strResolveTypeIfNeeded, scheme, data, categories, strIntern);
                        if (iMatch >= 0) {
                            if (objArr != false) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(m6574("\u0019\r \u000f\u0014\u0011\u0010ￍￌￌ\u0019\r \u000f\u0014￩ￜ$ￌￌ\ufff2\u0015\u0018 \u0011\u001eￌ", 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 203).intern());
                                sb5.append(Integer.toHexString(iMatch));
                                Log.v(strIntern, sb5.toString());
                            }
                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList4.add(dVar);
                            dVar.f2592 = true;
                            i12 = i10 + 1;
                            z11 = z10;
                            arrayList3 = arrayList;
                            action = str;
                            scheme = str2;
                            i11 = 0;
                        } else if (objArr != false) {
                            String strIntern2 = iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? m6574("\r\u0006\u0007\u000b\ufff9�\nﾸ\u0006\u000f\u0007\u0006\u0003\u0006", TextUtils.indexOf((CharSequence) "", '0') + 15, true, -ExpandableListView.getPackedPositionChild(0L), 223 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern() : m6569("☲툑쿆\uea0f", 4 - Color.argb(0, 0, 0, 0)).intern() : m6574("\u000e\ufffb\ufffe\ufffb", KeyEvent.normalizeMetaState(0) + 4, true, (ViewConfiguration.getLongPressTimeout() >> 16) + 3, 220 - View.getDefaultSize(0, 0)).intern() : m6574("\u0004\ufff7\ufff9\n\uffff\u0005", View.MeasureSpec.makeMeasureSpec(0, 0) + 6, false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 225).intern() : m6574("\u0007\u0004￼\ufffa\t\ufff6\ufff8\u000e", TextUtils.getOffsetAfter("", 0) + 8, true, 7 - (Process.myPid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 224).intern();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(m6569("\ueebc镵䝉ᡨ\ue353ퟛ↣녷ᢪ\ue4c4\uf2edࣁ䶥轜꾋퉜\udf40琔ꌸ\uf542咼졀\uf8fb㷽", 24 - View.resolveSize(0, 0)).intern());
                            sb6.append(strIntern2);
                            Log.v(strIntern, sb6.toString());
                        }
                    } else if (objArr == true) {
                        Log.v(strIntern, m6574("\u001f\n\u0007\u000b\u0018\u0012\u0007ￆ\u001a\u000b\r\u0018\u0007\u001aￆ\u0019ￍ\u0018\u000b\u001a\u0012\u000f￬ￆￆ\n\u000b\n\n\u0007ￆ", ExpandableListView.getPackedPositionType(0L) + 31, true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25, 208 - View.combineMeasuredStates(i11, i11)).intern());
                        arrayList = arrayList3;
                        i10 = i12;
                        str2 = scheme;
                        str = action;
                        z10 = true;
                        arrayList2 = arrayList4;
                    } else {
                        arrayList = arrayList3;
                        i10 = i12;
                        arrayList2 = arrayList4;
                        str2 = scheme;
                        str = action;
                        z10 = true;
                    }
                    arrayList4 = arrayList2;
                    i12 = i10 + 1;
                    z11 = z10;
                    arrayList3 = arrayList;
                    action = str;
                    scheme = str2;
                    i11 = 0;
                }
                ArrayList arrayList5 = arrayList4;
                boolean z12 = z11;
                if (arrayList5 != null) {
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        ((d) arrayList5.get(i13)).f2592 = false;
                    }
                    this.f2584.add(new c(intent, arrayList5));
                    if (!this.f2580.hasMessages(z12 ? 1 : 0)) {
                        this.f2580.sendEmptyMessage(z12 ? 1 : 0);
                    }
                    return z12;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m6579() {
        int i10 = f2574 + 67;
        f2573 = i10 % 128;
        if ((i10 % 2 == 0 ? 'I' : ',') != 'I') {
            this.f2582 = false;
        } else {
            this.f2582 = false;
        }
        m6571();
    }
}
