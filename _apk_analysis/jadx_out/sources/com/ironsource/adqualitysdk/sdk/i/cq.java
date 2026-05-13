package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.i.jn;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class cq {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1415 = -2696279443224279490L;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1416 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f1417 = {'/', 'a', 'c', 't', 'i', 'v', 'y', 'w', 'n', 'd', 'o', 'L', 'f', 'e', 'l', 'p', 'F', 'u', 's', 'M', 'h', ' ', 'r', 'A', 'N', 'm', 'V', 'C', 'j', 'P', 'x', 'T', 'I', 'E', 'J', 'S', 'B', '.', '_', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1418 = 7;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1419;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private x f1420;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private cm f1421;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private jo f1422;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1423;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jh f1424 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private du f1425;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ch f1426;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hs f1427;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private db f1428;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bd f1429;

    public class a<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$a$1, reason: invalid class name */
        public class AnonymousClass1 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1499;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1500;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ r f1501;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1502;

            public AnonymousClass1(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1501 = rVar;
                this.f1499 = jSONObject;
                this.f1502 = obj;
                this.f1500 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1501.mo4338(this.f1499, this.f1502, this.f1500);
            }
        }
    }

    public class b<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$b$3, reason: invalid class name */
        public class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ r f1503;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1504;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1505;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1506;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1507;

            public AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1503 = rVar;
                this.f1506 = jSONObject;
                this.f1507 = obj;
                this.f1504 = obj2;
                this.f1505 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1503.mo5780(this.f1506, this.f1507, this.f1504, this.f1505);
            }
        }
    }

    public class c<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$c$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1508;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1509;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1510;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1511;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1509 = rVar;
                this.f1510 = jSONObject;
                this.f1508 = obj;
                this.f1511 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1509.mo5782(this.f1510, this.f1508, this.f1511);
            }
        }
    }

    public class d<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$d$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1512;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1513;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1514;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1515;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ r f1516;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1516 = rVar;
                this.f1512 = jSONObject;
                this.f1515 = obj;
                this.f1513 = obj2;
                this.f1514 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1516.mo5789(this.f1512, this.f1515, this.f1513, this.f1514);
            }
        }
    }

    public class e<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$e$3, reason: invalid class name */
        public class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1517;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1518;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1519;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1520;

            public AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1518 = rVar;
                this.f1517 = jSONObject;
                this.f1519 = obj;
                this.f1520 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1518.mo4343(this.f1517, this.f1519, this.f1520);
            }
        }
    }

    public class f<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$f$4, reason: invalid class name */
        public class AnonymousClass4 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1521;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1522;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1523;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ r f1524;

            public AnonymousClass4(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1524 = rVar;
                this.f1523 = jSONObject;
                this.f1521 = obj;
                this.f1522 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1524.mo5788(this.f1523, this.f1521, this.f1522);
            }
        }
    }

    public class h<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$h$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1525;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1526;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1527;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1528;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1526 = rVar;
                this.f1525 = jSONObject;
                this.f1527 = obj;
                this.f1528 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1526.mo5779(this.f1525, this.f1527, this.f1528);
            }
        }
    }

    public class j<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$j$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1529;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1530;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1531;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1532;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1533;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1531 = rVar;
                this.f1530 = jSONObject;
                this.f1529 = obj;
                this.f1533 = obj2;
                this.f1532 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                this.f1531.mo5785(this.f1530, this.f1529, this.f1533, this.f1532);
            }
        }
    }

    public cq(cm cmVar, db dbVar, bd bdVar, hs hsVar, du duVar) {
        this.f1427 = hsVar;
        du duVar2 = new du(new HashMap(), duVar, true);
        this.f1425 = duVar2;
        duVar2.m6183(m5764().m6416());
        duVar.m6185(hsVar.m6414(), this);
        this.f1428 = dbVar;
        this.f1429 = bdVar;
        this.f1426 = m5713();
        this.f1421 = cmVar;
        this.f1420 = new x();
        m5731(m5735("왬釮椹셎颞烒졁ꎩ篚팊ꭟʍ\uda27뉡ල\ue5d7뵀ᕒ\uecea䐸ᱮ\uf78e俑✑ﺯ囩⸹", 22453 - (Process.myTid() >> 22)).intern(), new ArrayList());
        m5717();
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private ch m5713() {
        ch chVar = new ch() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ch
            /* JADX INFO: renamed from: ﻐ */
            public final void mo5620(final String str, final List<Object> list) {
                final boolean z10 = true;
                final boolean z11 = false;
                cq.m5728(cq.this, str, true, false, list);
                cq.m5753(cq.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        cq.m5728(cq.this, str, false, z11, list);
                    }
                }, false);
                cq.m5753(cq.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        cq.m5728(cq.this, str, false, z10, list);
                    }
                }, true);
            }
        };
        int i10 = f1419 + 119;
        f1416 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 27 : (char) 25) != 27) {
            return chVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private jh m5714() {
        jh jhVar = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                cq cqVar = cq.this;
                cqVar.m5768(ih.f2530, cq.m5745(cqVar, activity, (Bundle) null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                cq cqVar = cq.this;
                cqVar.m5768(ih.f2531, cq.m5745(cqVar, activity, (Bundle) null));
            }
        };
        int i10 = f1416 + 75;
        f1419 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jhVar;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private void m5715() {
        int i10 = f1416 + 67;
        f1419 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f1420.m7138();
            int i11 = 85 / 0;
        } else {
            this.f1420.m7138();
        }
        int i12 = f1416 + 11;
        f1419 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private void m5716() {
        int i10 = f1416 + 105;
        f1419 = i10 % 128;
        if ((i10 % 2 != 0 ? '_' : (char) 30) != '_') {
            this.f1420.m7136();
        } else {
            this.f1420.m7136();
            int i11 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m5717() {
        int i10 = f1419 + 19;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        for (Cdo cdo : m5764().m6411()) {
            if (m5756(cdo)) {
                int i12 = f1416 + 45;
                f1419 = i12 % 128;
                char c10 = i12 % 2 != 0 ? 'J' : 'B';
                m5729(cdo);
                if (c10 != 'B') {
                    int i13 = 89 / 0;
                } else {
                    continue;
                }
            }
            int i14 = f1416 + 33;
            f1419 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m5718() {
        int i10 = f1416 + 101;
        f1419 = i10 % 128;
        if ((i10 % 2 != 0 ? 'V' : 'X') != 'X') {
            this.f1420.m7134();
            int i11 = 76 / 0;
        } else {
            this.f1420.m7134();
        }
        int i12 = f1416 + 69;
        f1419 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private dp m5719() {
        int i10 = f1419 + 91;
        f1416 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5771().m5677();
        }
        m5771().m5677();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private v m5720(final boolean z10) {
        v vVar = new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.12

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1445 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1446 = -343192624284133648L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1447;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m5792(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2041) {
                    com.ironsource.adqualitysdk.sdk.i.f.f2039 = i10;
                    char[] cArr2 = new char[cArr.length];
                    com.ironsource.adqualitysdk.sdk.i.f.f2040 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2040;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2039 * i11))) ^ f1446);
                            com.ironsource.adqualitysdk.sdk.i.f.f2040++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m5793(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5792("隧暘皜䚗嚛⚂㚷ړᚴ\ue690\uf689욏횙ꚓ뚛蚍雎", 61440 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                sb2.append(str);
                cq.m5728(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, webView, obj, view));
                int i10 = f1445 + 55;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5788(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1445 + 11;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                m5793(m5792("隓\udfe6х䪭댓\uf872⻧霳\udd8d˥䭚", 18787 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), jSONObject, webView, null, view);
                int i12 = f1447 + 105;
                f1445 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5789(JSONObject jSONObject, WebView webView, Object obj, View view) {
                long packedPositionForChild;
                long j10;
                int i10 = f1445 + 35;
                f1447 = i10 % 128;
                if ((i10 % 2 != 0 ? '1' : '\'') != '1') {
                    packedPositionForChild = ExpandableListView.getPackedPositionForChild(0, 0);
                    j10 = 0;
                } else {
                    packedPositionForChild = ExpandableListView.getPackedPositionForChild(1, 0);
                    j10 = 1;
                }
                m5793(m5792("隑⍩﵉띫䅭᭢핵潾㥼", 46588 - (packedPositionForChild > j10 ? 1 : (packedPositionForChild == j10 ? 0 : -1))).intern(), jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5779(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1445 + 23;
                f1447 = i10 % 128;
                char c10 = i10 % 2 != 0 ? '\b' : (char) 30;
                mo5779(jSONObject, webView, view);
                if (c10 != '\b') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5780(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1445 + 81;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                mo5780(jSONObject, webView, obj, view);
                int i12 = f1445 + 13;
                f1447 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4343(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1447 + 117;
                f1445 = i10 % 128;
                m5793((!(i10 % 2 != 0) ? m5792("隑㰕쎶椚㲇숅榚㼖슁栜㾞씾梄㸉얌欞", 43650 << (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))) : m5792("隑㰕쎶椚㲇숅榚㼖슁栜㾞씾梄㸉얌欞", 43650 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), jSONObject, webView, null, view);
                int i11 = f1445 + 23;
                f1447 = i11 % 128;
                if ((i11 % 2 != 0 ? 'U' : (char) 23) != 'U') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5782(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1445 + 105;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                mo5782(jSONObject, webView, view);
                int i12 = f1445 + 101;
                f1447 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5779(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1445 + 19;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                m5793(m5792("隆煜够⇈থၝ\uf81a샲ꢻ덵鬧揣", ExpandableListView.getPackedPositionType(0L) + 59333).intern(), jSONObject, webView, null, view);
                int i12 = f1445 + 59;
                f1447 = i12 % 128;
                if ((i12 % 2 != 0 ? 'D' : '[') == '[') {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5780(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1447 + 21;
                f1445 = i10 % 128;
                m5793(m5792("隑\uf061孙ꉃ്鑚Ｅ䘦ꄼࠫ錐礼䗡곋㟥", (i10 % 2 == 0 ? 'P' : '=') != '=' ? 25776 / (ViewConfiguration.getMinimumFlingVelocity() * 77) : 26357 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4338(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1447 + 97;
                f1445 = i10 % 128;
                int i11 = i10 % 2;
                mo4338(jSONObject, webView, view);
                int i12 = f1447 + 53;
                f1445 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5785(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1447 + 79;
                f1445 = i10 % 128;
                int i11 = i10 % 2;
                mo5785(jSONObject, webView, obj, view);
                int i12 = f1445 + 85;
                f1447 = i12 % 128;
                if ((i12 % 2 != 0 ? (char) 20 : (char) 5) != 5) {
                    int i13 = 10 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5782(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1445 + 91;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                m5793(m5792("隑亻⛭ḑ\uf623깨螏翝", (ViewConfiguration.getFadingEdgeLength() >> 16) + 55343).intern(), jSONObject, webView, null, view);
                int i12 = f1445 + 79;
                f1447 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5785(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1447 + 103;
                f1445 = i10 % 128;
                int i11 = i10 % 2;
                m5793(m5792("隇Ղ넼ⴶ\ud9c4疱\ue195鱼࠭ꐼ僺첤碁\u1775荆㼬꯶䟒\uf380湱", 37847 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), jSONObject, webView, obj, view);
                int i12 = f1445 + 105;
                f1447 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5788(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1447 + 117;
                f1445 = i10 % 128;
                boolean z11 = i10 % 2 == 0;
                mo5788(jSONObject, webView, view);
                if (!z11) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5789(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1447 + 89;
                f1445 = i10 % 128;
                char c10 = i10 % 2 == 0 ? (char) 5 : '!';
                mo5789(jSONObject, webView, obj, view);
                if (c10 != 5) {
                    return;
                }
                int i11 = 94 / 0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4338(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1445 + 47;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                m5793(m5792("隑ᐥ鏖Ẋ鱇\u1bf5蚺ц茁ຬ豾", TextUtils.indexOf((CharSequence) "", '0') + 33458).intern(), jSONObject, webView, null, view);
                int i12 = f1447 + 99;
                f1445 = i12 % 128;
                if (i12 % 2 != 0) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4343(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1445 + 115;
                f1447 = i10 % 128;
                char c10 = i10 % 2 != 0 ? '8' : G5.T;
                mo4343(jSONObject, webView, view);
                if (c10 != '8') {
                } else {
                    throw null;
                }
            }
        };
        int i10 = f1416 + 21;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        return vVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5721(String str, JSONObject jSONObject) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493) {
                    if ((str.equals(m5735("왈湒陑㹆", View.MeasureSpec.makeMeasureSpec(0, 0) + 43013).intern()) ? 'M' : ')') == 'M') {
                        int i10 = f1416 + 87;
                        f1419 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            } else if (str.equals(m5736("\u000b\u0000\t\n\u000b\b", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, (byte) (7 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                int i12 = f1416 + 9;
                f1419 = i12 % 128;
                b10 = i12 % 2 == 0 ? (byte) 2 : (byte) 5;
            }
        } else if (str.equals(m5736("\u0002\u0003\u0004\u0005\u0006\u0005\u0004\u0000", 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0') + 78)).intern())) {
            int i13 = f1419 + 51;
            f1416 = i13 % 128;
            b10 = i13 % 2 == 0 ? (byte) 1 : (byte) 0;
        }
        if (b10 == 0) {
            return jSONObject.optString(m5736("\u0002\b\u001e\t\u0004\u0005\u0006\u0005\u0004\u0000\u0016\u0003\u001b\u000b", 14 - TextUtils.indexOf("", "", 0, 0), (byte) View.resolveSize(0, 0)).intern(), null);
        }
        if (b10 == 1) {
            return jSONObject.optString(m5736("\u0002\b\u0019\u0005\u0007\b\u0015\u0014\u0004\u000f\u0011\u0019\u0004\u0016l", 14 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (7 - View.resolveSizeAndState(0, 0, 0))).intern(), null);
        }
        if (b10 != 2) {
            return null;
        }
        return jSONObject.optString(m5735("왈揾贉㚲僙﨟➩䇒\ueb05ᒁ뻅\ud810ַ", 42409 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), null);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5722(Cdo cdo) {
        int i10 = f1419 + 35;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM5752 = m5752(cdo.m6101());
        if ((jSONObjectM5752 != null ? '3' : 'L') != 'L') {
            int i12 = f1416 + 1;
            f1419 = i12 % 128;
            int i13 = i12 % 2;
            final String strM6100 = cdo.m6100();
            is isVar = null;
            if ((TextUtils.isEmpty(strM6100) ? '<' : '3') != '<') {
                int i14 = f1416 + 17;
                f1419 = i14 % 128;
                int i15 = i14 % 2;
                final ds dsVarM5763 = m5763(strM6100);
                if (dsVarM5763 != null) {
                    isVar = new is() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.5

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f1473 = 1;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f1474 = 0;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static char[] f1475 = {'R', 'e', 'm', 'o', 't', 'A', 'd', 'L', 'i', 's', 'n', 'r', 'E', ' ', 'g', 'w', 'b', 'V', 'f', 'S', 'T', 'U', 'W', 'X', 'Y'};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static char f1476 = 5;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m5812(String str, int i16, byte b10) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (g.f2151) {
                                char[] cArr2 = f1475;
                                char c10 = f1476;
                                char[] cArr3 = new char[i16];
                                if (i16 % 2 != 0) {
                                    i16--;
                                    cArr3[i16] = (char) (cArr[i16] - b10);
                                }
                                if (i16 > 1) {
                                    g.f2156 = 0;
                                    while (true) {
                                        int i17 = g.f2156;
                                        if (i17 >= i16) {
                                            break;
                                        }
                                        g.f2155 = cArr[i17];
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
                                                int i18 = (g.f2154 * c10) + g.f2152;
                                                int i19 = (g.f2157 * c10) + g.f2150;
                                                int i20 = g.f2156;
                                                cArr3[i20] = cArr2[i18];
                                                cArr3[i20 + 1] = cArr2[i19];
                                            } else if (g.f2154 == g.f2157) {
                                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                                g.f2150 = ((g.f2150 + c10) - 1) % c10;
                                                int i21 = (g.f2154 * c10) + g.f2152;
                                                int i22 = (g.f2157 * c10) + g.f2150;
                                                int i23 = g.f2156;
                                                cArr3[i23] = cArr2[i21];
                                                cArr3[i23 + 1] = cArr2[i22];
                                            } else {
                                                int i24 = (g.f2154 * c10) + g.f2150;
                                                int i25 = (g.f2157 * c10) + g.f2152;
                                                int i26 = g.f2156;
                                                cArr3[i26] = cArr2[i24];
                                                cArr3[i26 + 1] = cArr2[i25];
                                            }
                                        }
                                        g.f2156 += 2;
                                    }
                                }
                                str2 = new String(cArr3);
                            }
                            return str2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.is
                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        public final List<WebView> mo5813(Object obj) {
                            List<WebView> list;
                            int i16 = f1474 + 121;
                            f1473 = i16 % 128;
                            try {
                                if ((i16 % 2 == 0 ? 'Q' : (char) 24) != 'Q') {
                                    list = (List) dsVarM5763.m6173(cq.m5742(cq.this), cq.this, Collections.singletonList(obj)).m6165();
                                } else {
                                    list = (List) dsVarM5763.m6173(cq.m5742(cq.this), cq.this, Collections.singletonList(obj)).m6165();
                                    int i17 = 55 / 0;
                                }
                                return list;
                            } catch (Exception unused) {
                                String strIntern = m5812("\u0001\u0002\u0003\u0004\u0000\u0002\u0006\u0007\b\t\u000e\t\u0000\u000b\u0006\u0010", 15 - Process.getGidForName(""), (byte) (KeyEvent.keyCodeFromString("") + 123)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m5812("\r\f\r\u0001\f\u000e\u000b\u0004ÐÐ\u0005\r\n\u000e\u0010\u0000\u0011\u0012\u0006\u0003\u0013\u0005\u0012\u0017\r\u0001\u0003\f", 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (91 - ImageFormat.getBitsPerPixel(0))).intern());
                                sb2.append(strM6100);
                                k.m6886(strIntern, sb2.toString());
                                return null;
                            }
                        }
                    };
                } else {
                    String strM5759 = m5759();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5736("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", 22 - Color.blue(0), (byte) (MotionEvent.axisFromString("") + 105)).intern());
                    sb2.append(strM6100);
                    sb2.append(m5735("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", (KeyEvent.getMaxKeyCode() >> 16) + 41443).intern());
                    co.m5699(strM5759, sb2.toString(), null);
                }
            }
            m5740(jSONObjectM5752, m5749(false), m5749(true), isVar);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5723(String str, boolean z10, boolean z11, List<Object> list) {
        int i10 = f1419 + 71;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        try {
            dl dlVarM6415 = this.f1427.m6415(str);
            if (!(dlVarM6415 == null)) {
                ds dsVarM6413 = this.f1427.m6413(dlVarM6415.m6085());
                if (dsVarM6413 == null) {
                    String strM5759 = m5759();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5736("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", Color.rgb(0, 0, 0) + 16777238, (byte) (104 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern());
                    sb2.append(dlVarM6415.m6085());
                    sb2.append(m5735("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", 41443 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                    co.m5699(strM5759, sb2.toString(), null);
                    return;
                }
                int i12 = f1416 + 93;
                f1419 = i12 % 128;
                int i13 = i12 % 2;
                if (z10 == dlVarM6415.m6083()) {
                    if ((z11 == dlVarM6415.m6084() ? '?' : '2') != '?') {
                        return;
                    }
                    if (s.m7027().m7055()) {
                        co.m5702(m5759(), str);
                    }
                    dsVarM6413.m6173(this.f1425, this, list);
                }
            }
        } catch (Throwable th2) {
            String strM57592 = m5759();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m5735("왻灵\uaa3e\ue4faẨ䤃茀㷐瞘깛\ud868ሤ䳼蚼\u3100欌ꗘ\udf92ᙒ䁱頻", TextUtils.getCapsMode("", 0, 0) + 46649).intern());
            sb3.append(str);
            co.m5699(strM57592, sb3.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5724(JSONObject jSONObject, v vVar, v vVar2) {
        int i10 = f1416 + 3;
        f1419 = i10 % 128;
        if ((i10 % 2 != 0 ? '1' : ';') == '1') {
            this.f1420.m7140(jSONObject, m5743(vVar, vVar2));
            throw null;
        }
        this.f1420.m7140(jSONObject, m5743(vVar, vVar2));
        int i11 = f1416 + 15;
        f1419 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m5725(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        try {
            if ((objOpt instanceof String ? (char) 21 : (char) 22) != 22) {
                int i10 = f1416 + 97;
                f1419 = i10 % 128;
                int i11 = i10 % 2;
                String str2 = (String) objOpt;
                if ((m5741(str2) ? 'Y' : '_') == '_') {
                    return true;
                }
                String strM5744 = m5744(str2);
                if ((strM5744 != null ? '3' : '-') == '-') {
                    String strM5759 = m5759();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5735("왽䚭잡䒰얱䋥", 33023 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                    sb2.append(str2);
                    sb2.append(m5735("옞㿩㔣⭡\u20fa⛅ᰇቄ\u0b98Ǜܤ糠犲栺湂枆巜匃䥕仫䐭먳뎴꧈꼕ꕛ骑郓陧边薰שׁ\uf17b\uf693\uecd9\ue205", 63929 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                    co.m5702(strM5759, sb2.toString());
                    return false;
                }
                int i12 = f1419 + 125;
                f1416 = i12 % 128;
                int i13 = i12 % 2;
                jSONObject.put(str, strM5744);
            } else {
                if (!(objOpt instanceof JSONArray)) {
                    return true;
                }
                jSONObject.put(str, new JSONArray((Collection) m5737(jz.m6866((JSONArray) objOpt))));
            }
            return true;
        } catch (JSONException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jm m5726(final List<String> list) {
        jm jmVar = new jm() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.1

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1430 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1431 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f1432 = -6294769124750872179L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m5773(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2306) {
                    char[] cArrM6319 = com.ironsource.adqualitysdk.sdk.i.h.m6319(f1432, cArr, i10);
                    com.ironsource.adqualitysdk.sdk.i.h.f2307 = 4;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.h.f2307;
                        if (i11 < cArrM6319.length) {
                            com.ironsource.adqualitysdk.sdk.i.h.f2305 = i11 - 4;
                            cArrM6319[com.ironsource.adqualitysdk.sdk.i.h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) com.ironsource.adqualitysdk.sdk.i.h.f2305) * f1432));
                            com.ironsource.adqualitysdk.sdk.i.h.f2307++;
                        } else {
                            str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                        }
                    }
                }
                return str2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m5774(String str, final Activity activity, List<String> list2) {
                int i10 = f1430 + 45;
                f1431 = i10 % 128;
                if ((i10 % 2 != 0 ? (char) 5 : ';') == 5) {
                    cq.m5755(activity, list2);
                    throw null;
                }
                if (cq.m5755(activity, list2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5773("鹯鸮䋸審\uf305㢃屉䢨場㕚狒鈀ቋ罤되\ue9d3첖䚿\uee3a⾙蚑", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern());
                    sb2.append(str);
                    final String string = sb2.toString();
                    cq.m5728(cq.this, string, true, false, Collections.singletonList(activity));
                    t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            cq.m5728(cq.this, string, false, false, Collections.singletonList(activity));
                        }
                    });
                }
                int i11 = f1431 + 61;
                f1430 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ｋ */
            public final void mo4456(Activity activity) {
                int i10 = f1430 + 1;
                f1431 = i10 % 128;
                m5774((i10 % 2 == 0 ? m5773("\uea72\uea1d᩵ￏꮖ鲓퉥욭Ⱕ淁훲\u1c3a晵⟳္", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))) : m5773("\uea72\uea1d᩵ￏꮖ鲓퉥욭Ⱕ淁훲\u1c3a晵⟳္", (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)) * 0)).intern(), activity, list);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ﾇ */
            public final void mo4457(Activity activity) {
                int i10 = f1431 + 11;
                f1430 = i10 % 128;
                int i11 = i10 % 2;
                m5774(m5773("\ud90c\ud963\uf69a쨿䝹ꥣ㺷⩿Ὓ脮\ue302\uf0f6唁쬜◉謟询\uf2d6翭", 1 - (Process.myPid() >> 22)).intern(), activity, list);
                int i12 = f1431 + 103;
                f1430 = i12 % 128;
                int i13 = i12 % 2;
            }
        };
        int i10 = f1416 + 101;
        f1419 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return jmVar;
        }
        int i11 = 16 / 0;
        return jmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.l m5727(final com.ironsource.adqualitysdk.sdk.i.l r3, final com.ironsource.adqualitysdk.sdk.i.l r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1416
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1419 = r1
            int r0 = r0 % 2
            r1 = 59
            if (r0 == 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 91
        L12:
            if (r0 == r1) goto L17
            if (r3 != 0) goto L2c
            goto L1d
        L17:
            r0 = 27
            int r0 = r0 / 0
            if (r3 != 0) goto L2c
        L1d:
            com.ironsource.adqualitysdk.sdk.i.l r3 = new com.ironsource.adqualitysdk.sdk.i.l
            r3.<init>()
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1416
            int r0 = r0 + 7
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1419 = r1
            int r0 = r0 % 2
        L2c:
            if (r4 != 0) goto L33
            com.ironsource.adqualitysdk.sdk.i.l r4 = new com.ironsource.adqualitysdk.sdk.i.l
            r4.<init>()
        L33:
            com.ironsource.adqualitysdk.sdk.i.cq$13 r0 = new com.ironsource.adqualitysdk.sdk.i.cq$13
            r0.<init>()
            return r0
        L39:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5727(com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.l):com.ironsource.adqualitysdk.sdk.i.l");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m5728(cq cqVar, String str, boolean z10, boolean z11, List list) {
        int i10 = f1416 + 77;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        cqVar.m5723(str, z10, z11, list);
        int i12 = f1419 + 67;
        f1416 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5729(com.ironsource.adqualitysdk.sdk.i.Cdo r18) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5729(com.ironsource.adqualitysdk.sdk.i.do):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r4 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.t.m7069(new com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass7());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.t.m7071(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r3 = com.ironsource.adqualitysdk.sdk.i.cq.f1416 + 123;
        com.ironsource.adqualitysdk.sdk.i.cq.f1419 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 != false) goto L12;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5730(final com.ironsource.adqualitysdk.sdk.i.im r3, boolean r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1419
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1416 = r1
            int r0 = r0 % 2
            r1 = 50
            if (r0 != 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 82
        L12:
            if (r0 == r1) goto L17
            if (r4 == 0) goto L26
            goto L1d
        L17:
            r0 = 85
            int r0 = r0 / 0
            if (r4 == 0) goto L26
        L1d:
            com.ironsource.adqualitysdk.sdk.i.cq$7 r4 = new com.ironsource.adqualitysdk.sdk.i.cq$7     // Catch: java.lang.Throwable -> L33
            r4.<init>()     // Catch: java.lang.Throwable -> L33
            com.ironsource.adqualitysdk.sdk.i.t.m7069(r4)     // Catch: java.lang.Throwable -> L33
            return
        L26:
            com.ironsource.adqualitysdk.sdk.i.t.m7071(r3)     // Catch: java.lang.Throwable -> L33
            int r3 = com.ironsource.adqualitysdk.sdk.i.cq.f1416
            int r3 = r3 + 123
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1419 = r4
            int r3 = r3 % 2
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5730(com.ironsource.adqualitysdk.sdk.i.im, boolean):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5731(final String str, final List<Object> list) {
        t.m7067(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                cq.m5728(cq.this, str, false, false, list);
            }
        });
        t.m7076(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                cq.m5728(cq.this, str, true, false, list);
            }
        });
        m5730(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                cq.m5728(cq.this, str, false, true, list);
            }
        }, true);
        int i10 = f1416 + 29;
        f1419 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5732(JSONObject jSONObject, p pVar, p pVar2, it itVar) {
        int i10 = f1416 + 41;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        this.f1420.m7139(jSONObject, m5750(pVar, pVar2), itVar);
        int i12 = f1419 + 67;
        f1416 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            int i13 = 83 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m5733(Activity activity, List<String> list) {
        int i10 = f1419 + 109;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        if ((!list.isEmpty() ? '@' : 'A') == 'A' || list.contains(activity.getClass().getName())) {
            return true;
        }
        int i12 = f1416 + 13;
        f1419 = i12 % 128;
        if ((i12 % 2 != 0 ? ',' : 'O') != ',') {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private p m5734(final boolean z10) {
        p pVar = new p() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.14

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1453 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1454 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f1455 = 181509955685428323L;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m5802(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5803("땗ဖ딁발엫鵈ᕺဤҚ䶝靖ꎦ혼Ἑ⛳絕ꆖ텣\uf00c", 1 - View.MeasureSpec.getMode(0)).intern());
                sb2.append(str);
                cq.m5728(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, view, obj, activity));
                int i10 = f1453 + 59;
                f1454 = i10 % 128;
                int i11 = i10 % 2;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m5803(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2306) {
                    char[] cArrM6319 = com.ironsource.adqualitysdk.sdk.i.h.m6319(f1455, cArr, i10);
                    com.ironsource.adqualitysdk.sdk.i.h.f2307 = 4;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.h.f2307;
                        if (i11 < cArrM6319.length) {
                            com.ironsource.adqualitysdk.sdk.i.h.f2305 = i11 - 4;
                            cArrM6319[com.ironsource.adqualitysdk.sdk.i.h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) com.ironsource.adqualitysdk.sdk.i.h.f2305) * f1455));
                            com.ironsource.adqualitysdk.sdk.i.h.f2307++;
                        } else {
                            str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                        }
                    }
                }
                return str2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo4343(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1453 + 95;
                f1454 = i10 % 128;
                int i11 = i10 % 2;
                m5802(m5803("븺\u007f빛걸瑸⳺꧊겊࿅巠⛄\u1f1e\udd5bཡ靀쇎ꫦ섌䇢끦", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), jSONObject, view, null, activity);
                int i12 = f1454 + 9;
                f1453 = i12 % 128;
                if (i12 % 2 == 0) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5779(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1454 + 125;
                f1453 = i10 % 128;
                int i11 = i10 % 2;
                mo5779(jSONObject, view, activity);
                int i12 = f1454 + 29;
                f1453 = i12 % 128;
                if ((i12 % 2 != 0 ? (char) 18 : '\n') == '\n') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5780(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1454 + 67;
                f1453 = i10 % 128;
                char c10 = i10 % 2 != 0 ? (char) 0 : '@';
                mo5780(jSONObject, view, obj, activity);
                if (c10 != 0) {
                    return;
                }
                int i11 = 53 / 0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5779(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1453 + 121;
                f1454 = i10 % 128;
                m5802(m5803("ꞃ멹Ꟶᙳ‴碗遹锧ᙎ\ue7e2犱⚭쓸땪쌬\uf85c", i10 % 2 != 0 ? 1 - TextUtils.getCapsMode("", 0, 0) : 0 % TextUtils.getCapsMode("", 0, 1)).intern(), jSONObject, view, null, activity);
                int i11 = f1454 + 81;
                f1453 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5785(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1453 + 23;
                f1454 = i10 % 128;
                int i11 = i10 % 2;
                m5802(m5803("\uef0e誑\uef79⚗걝\uf4f9ʰߚ廪휌ﻄ둨豳薩佋檘\ufbcf䯸駧ᬸ⥈\uf867\uea61증", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObject, view, obj, activity);
                int i12 = f1454 + 107;
                f1453 = i12 % 128;
                if (!(i12 % 2 != 0)) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5782(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1454 + 19;
                f1453 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo5782(jSONObject, view, activity);
                if (z11) {
                    throw null;
                }
                int i11 = f1453 + 87;
                f1454 = i11 % 128;
                int i12 = i11 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5788(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1453 + 11;
                f1454 = i10 % 128;
                int i11 = i10 % 2;
                m5802(m5803("ᩬ沃ᨏ삕偛࣮㈥㝸ꮏ\u3101˹蓦礑掖덄", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), jSONObject, view, null, activity);
                int i12 = f1454 + 73;
                f1453 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4338(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1454 + 117;
                f1453 = i10 % 128;
                char c10 = i10 % 2 != 0 ? '/' : (char) 26;
                mo4338(jSONObject, view, activity);
                if (c10 == '/') {
                    throw null;
                }
                int i11 = f1454 + 83;
                f1453 = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                int i12 = 97 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5785(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1454 + 41;
                f1453 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo5785(jSONObject, view, obj, activity);
                if (z11) {
                    int i11 = 16 / 0;
                }
                int i12 = f1453 + 55;
                f1454 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 11 : (char) 28) != 28) {
                    int i13 = 83 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo4338(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1453 + 15;
                f1454 = i10 % 128;
                int i11 = i10 % 2;
                m5802(m5803("诶ø讗곿ᤧ䆥ᑾᄾ㨉嵧䮛ꊪ\ue897\u0fe6﨟", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jSONObject, view, null, activity);
                int i12 = f1453 + 29;
                f1454 = i12 % 128;
                if (i12 % 2 != 0) {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5780(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1454 + 55;
                f1453 = i10 % 128;
                int i11 = i10 % 2;
                m5802(m5803("翽퍳羜罴䳮ᑫ癷猲츘軿Ṓ삧ᲁ\udc4e꿇ṙ欴ሾ祲", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jSONObject, view, obj, activity);
                int i12 = f1453 + 73;
                f1454 = i12 % 128;
                if ((i12 % 2 == 0 ? '2' : 'K') != '2') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5788(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1454 + 47;
                f1453 = i10 % 128;
                boolean z11 = i10 % 2 == 0;
                mo5788(jSONObject, view, activity);
                if (!z11) {
                    throw null;
                }
                int i11 = f1454 + 17;
                f1453 = i11 % 128;
                if ((i11 % 2 != 0 ? (char) 20 : ')') != 20) {
                    return;
                }
                int i12 = 79 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5789(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1453 + 95;
                f1454 = i10 % 128;
                int i11 = i10 % 2;
                mo5789(jSONObject, view, obj, activity);
                int i12 = f1453 + 119;
                f1454 = i12 % 128;
                if ((i12 % 2 == 0 ? 'J' : '\\') != 'J') {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5782(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1454 + 89;
                f1453 = i10 % 128;
                m5802(m5803("컸蝥캙⭢ꖨﴭ\u218dⓈ缛\udaf9\uf71a靜", (i10 % 2 != 0 ? 'R' : 'F') != 'F' ? 0 % (ViewConfiguration.getScrollDefaultDelay() << 9) : (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern(), jSONObject, view, null, activity);
                int i11 = f1453 + 61;
                f1454 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5789(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1454 + 65;
                f1453 = i10 % 128;
                int i11 = i10 % 2;
                m5802(m5803("黂ꢮ麣ҩ杧㿢ꐀꅅ⼧\uf522㗛ዐﶾ", AndroidCharacter.getMirror('0') - '/').intern(), jSONObject, view, obj, activity);
                int i12 = f1453 + 123;
                f1454 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4343(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1453 + 13;
                f1454 = i10 % 128;
                int i11 = i10 % 2;
                mo4343(jSONObject, view, activity);
                int i12 = f1454 + 69;
                f1453 = i12 % 128;
                if ((i12 % 2 != 0 ? '%' : 'T') != '%') {
                    return;
                }
                int i13 = 92 / 0;
            }
        };
        int i10 = f1419 + 123;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        return pVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5735(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2041) {
            com.ironsource.adqualitysdk.sdk.i.f.f2039 = i10;
            char[] cArr2 = new char[cArr.length];
            com.ironsource.adqualitysdk.sdk.i.f.f2040 = 0;
            while (true) {
                int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2040;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2039 * i11))) ^ f1415);
                    com.ironsource.adqualitysdk.sdk.i.f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5736(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f1417;
            char c10 = f1418;
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> m5737(java.util.List<java.lang.String> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
            int r1 = com.ironsource.adqualitysdk.sdk.i.cq.f1416
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1419 = r2
            int r1 = r1 % 2
        L13:
            boolean r1 = r6.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d
            r1 = r2
            goto L1e
        L1d:
            r1 = r3
        L1e:
            if (r1 == r3) goto L5b
            int r1 = com.ironsource.adqualitysdk.sdk.i.cq.f1419
            int r1 = r1 + 65
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1416 = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L2d
            r3 = r2
        L2d:
            if (r3 == 0) goto L3c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = m5741(r1)
            if (r2 == 0) goto L55
            goto L4b
        L3c:
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = m5741(r1)
            r4 = 31
            int r4 = r4 / r2
            if (r3 == 0) goto L55
        L4b:
            java.lang.String r1 = r5.m5744(r1)
            if (r1 == 0) goto L13
            r0.add(r1)
            goto L13
        L55:
            r0.add(r1)
            goto L13
        L59:
            r6 = move-exception
            throw r6
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5737(java.util.List):java.util.List");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m5738(JSONObject jSONObject) {
        int i10 = f1419 + 31;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM5762 = m5762();
        jz.m6871(jSONObjectM5762, jSONObject);
        int i12 = f1419 + 99;
        f1416 = i12 % 128;
        if ((i12 % 2 == 0 ? 'Y' : (char) 29) != 'Y') {
            return jSONObjectM5762;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r4 = m5763(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        m5732(r0, r2, r1, new com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass10(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r0 = m5759();
        r1 = new java.lang.StringBuilder();
        r1.append(m5736("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", android.graphics.Color.green(0) + 22, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0) + 104)).intern());
        r1.append(r7);
        r1.append(m5735("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", 41443 - android.view.View.resolveSize(0, 0)).intern());
        com.ironsource.adqualitysdk.sdk.i.co.m5699(r0, r1.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        m5747(r0, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5739(com.ironsource.adqualitysdk.sdk.i.Cdo r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1419
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1416 = r1
            int r0 = r0 % 2
            org.json.JSONObject r0 = r7.m6101()
            org.json.JSONObject r0 = r6.m5752(r0)
            r1 = 30
            if (r0 == 0) goto L18
            r2 = r1
            goto L1a
        L18:
            r2 = 44
        L1a:
            if (r2 == r1) goto L1e
            goto Lae
        L1e:
            int r1 = com.ironsource.adqualitysdk.sdk.i.cq.f1416
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1419 = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            r1 = r3
            goto L2f
        L2e:
            r1 = r2
        L2f:
            if (r1 == 0) goto L44
            java.lang.String r7 = r7.m6102()
            com.ironsource.adqualitysdk.sdk.i.p r1 = r6.m5734(r2)
            com.ironsource.adqualitysdk.sdk.i.p r2 = r6.m5734(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto Lab
            goto L56
        L44:
            java.lang.String r7 = r7.m6102()
            com.ironsource.adqualitysdk.sdk.i.p r1 = r6.m5734(r2)
            com.ironsource.adqualitysdk.sdk.i.p r2 = r6.m5734(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto Lab
        L56:
            com.ironsource.adqualitysdk.sdk.i.ds r4 = r6.m5763(r7)
            if (r4 == 0) goto L65
            com.ironsource.adqualitysdk.sdk.i.cq$10 r7 = new com.ironsource.adqualitysdk.sdk.i.cq$10
            r7.<init>()
            r6.m5732(r0, r2, r1, r7)
            return
        L65:
            java.lang.String r0 = r6.m5759()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = android.graphics.Color.green(r3)
            int r2 = r2 + 22
            r4 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionGroup(r4)
            int r4 = r4 + 104
            byte r4 = (byte) r4
            java.lang.String r5 = "\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016"
            java.lang.String r2 = m5736(r5, r2, r4)
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            r1.append(r7)
            r7 = 41443(0xa1e3, float:5.8074E-41)
            int r2 = android.view.View.resolveSize(r3, r3)
            int r7 = r7 - r2
            java.lang.String r2 = "옞枳薗⏣䆒\uef37ഃꭾ쥈皡"
            java.lang.String r7 = m5735(r2, r7)
            java.lang.String r7 = r7.intern()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r1 = 0
            com.ironsource.adqualitysdk.sdk.i.co.m5699(r0, r7, r1)
            return
        Lab:
            r6.m5747(r0, r2, r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5739(com.ironsource.adqualitysdk.sdk.i.do):void");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m5740(JSONObject jSONObject, l lVar, l lVar2, is isVar) {
        int i10 = f1419 + 59;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        this.f1420.m7135(jSONObject, m5727(lVar, lVar2), m5714(), isVar);
        int i12 = f1416 + 17;
        f1419 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m5741(String str) {
        int i10 = f1416 + 95;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        boolean zEndsWith = str.endsWith(m5735("옐٬䘰蛌욉ڸ", View.getDefaultSize(0, 0) + 49201).intern());
        int i12 = f1419 + 3;
        f1416 = i12 % 128;
        int i13 = i12 % 2;
        return zEndsWith;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ du m5742(cq cqVar) {
        int i10 = f1416 + 35;
        int i11 = i10 % 128;
        f1419 = i11;
        int i12 = i10 % 2;
        du duVar = cqVar.f1425;
        int i13 = i11 + 41;
        f1416 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return duVar;
        }
        int i14 = 58 / 0;
        return duVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private v m5743(final v vVar, final v vVar2) {
        int i10 = f1419 + 115;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        if (vVar == null) {
            vVar = new v();
        }
        if (vVar2 == null) {
            vVar2 = new v();
            int i12 = f1416 + 37;
            f1419 = i12 % 128;
            int i13 = i12 % 2;
        }
        return new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo5788(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5788(jSONObject, webView, view);
                t.m7067(new f.AnonymousClass4(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo5789(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5789(jSONObject, webView, obj, view);
                t.m7067(new d.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5779(JSONObject jSONObject, WebView webView, View view) {
                mo5779(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5780(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5780(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻛ */
            public final void mo4343(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo4343(jSONObject, webView, view);
                t.m7067(new e.AnonymousClass3(vVar, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5782(JSONObject jSONObject, WebView webView, View view) {
                mo5782(jSONObject, webView, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ */
            public final void mo5779(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5779(jSONObject, webView, view);
                t.m7067(new h.AnonymousClass2(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ */
            public final void mo5780(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5780(jSONObject, webView, obj, view);
                t.m7067(new b.AnonymousClass3(vVar, jSONObject, webView, obj, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4338(JSONObject jSONObject, WebView webView, View view) {
                mo4338(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5785(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5785(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo5782(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5782(jSONObject, webView, view);
                t.m7067(new c.AnonymousClass2(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo5785(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5785(jSONObject, webView, obj, view);
                t.m7067(new j.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5788(JSONObject jSONObject, WebView webView, View view) {
                mo5788(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5789(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5789(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4338(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo4338(jSONObject, webView, view);
                t.m7067(new a.AnonymousClass1(vVar, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4343(JSONObject jSONObject, WebView webView, View view) {
                mo4343(jSONObject, webView, view);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if ((r6 != null) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((r6 != null ? 30 : 'V') != 30) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1419 + 99;
        com.ironsource.adqualitysdk.sdk.i.cq.f1416 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r6.getName();
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m5744(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1419
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1416 = r1
            int r0 = r0 % 2
            r1 = 40
            if (r0 != 0) goto L11
            r0 = 29
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 49201(0xc031, float:6.8945E-41)
            java.lang.String r3 = "옐٬䘰蛌욉ڸ"
            r4 = 0
            if (r0 == r1) goto L39
            com.ironsource.adqualitysdk.sdk.i.bd r0 = r5.m5769()
            int r1 = android.view.View.combineMeasuredStates(r4, r4)
            int r2 = r2 % r1
            java.lang.String r1 = m5735(r3, r2)
            java.lang.String r1 = r1.intern()
            java.lang.String r6 = com.ironsource.adqualitysdk.sdk.i.kc.m6940(r6, r1)
            java.lang.Class r6 = r0.m4892(r6)
            if (r6 == 0) goto L36
            r4 = 1
        L36:
            if (r4 == 0) goto L5c
            goto L68
        L39:
            com.ironsource.adqualitysdk.sdk.i.bd r0 = r5.m5769()
            int r1 = android.view.View.combineMeasuredStates(r4, r4)
            int r2 = r2 - r1
            java.lang.String r1 = m5735(r3, r2)
            java.lang.String r1 = r1.intern()
            java.lang.String r6 = com.ironsource.adqualitysdk.sdk.i.kc.m6940(r6, r1)
            java.lang.Class r6 = r0.m4892(r6)
            r0 = 30
            if (r6 == 0) goto L58
            r1 = r0
            goto L5a
        L58:
            r1 = 86
        L5a:
            if (r1 == r0) goto L68
        L5c:
            r6 = 0
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1419
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1416 = r1
            int r0 = r0 % 2
            return r6
        L68:
            java.lang.String r6 = r6.getName()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5744(java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m5745(cq cqVar, Activity activity, Bundle bundle) {
        int i10 = f1419 + 39;
        f1416 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '\"' : (char) 15;
        JSONObject jSONObjectM5751 = cqVar.m5751(activity, bundle);
        if (c10 == '\"') {
            int i11 = 47 / 0;
        }
        int i12 = f1416 + 53;
        f1419 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectM5751;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m5746(Cdo cdo) {
        JSONObject jSONObjectM5752 = m5752(cdo.m6101());
        if (jSONObjectM5752 == null) {
            return;
        }
        int i10 = f1419 + 55;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        m5724(jSONObjectM5752, m5720(false), m5720(true));
        int i12 = f1416 + 77;
        f1419 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m5747(JSONObject jSONObject, p pVar, p pVar2) {
        int i10 = f1419 + 47;
        f1416 = i10 % 128;
        if ((i10 % 2 == 0 ? '#' : 'D') == '#') {
            this.f1420.m7137(jSONObject, m5750(pVar, pVar2));
            throw null;
        }
        this.f1420.m7137(jSONObject, m5750(pVar, pVar2));
        int i11 = f1416 + 5;
        f1419 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jh m5748(final List<String> list) {
        jh jhVar = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.6

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static char f1480 = 5;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char[] f1481 = {'o', 'n', 'A', 'c', 't', 'i', 'v', 'y', 'C', 'r', 'e', 'a', 'd', 'S', 'P', 'u', 's', 'I', 'L', 'f', 'l', '.', 'p', 'q', 'w'};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1482 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1483 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1484 = -7895666258947269960L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1485;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1486;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m5814(String str, char c10, String str2, int i10, String str3) {
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
                synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2695) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
                    cArr4[0] = (char) (c10 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i10));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    com.ironsource.adqualitysdk.sdk.i.j.f2697 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.j.f2697;
                        if (i11 < length) {
                            int i12 = (i11 + 2) % 4;
                            int i13 = (i11 + 3) % 4;
                            int i14 = cArr4[i11 % 4] * 32718;
                            char c11 = cArr5[i12];
                            char c12 = (char) ((i14 + c11) % 65535);
                            com.ironsource.adqualitysdk.sdk.i.j.f2696 = c12;
                            cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                            cArr4[i13] = c12;
                            int i15 = com.ironsource.adqualitysdk.sdk.i.j.f2697;
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1484) ^ ((long) f1486)) ^ ((long) f1485));
                            com.ironsource.adqualitysdk.sdk.i.j.f2697 = i15 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                }
                return str4;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m5815(String str, Activity activity) {
                int i10 = f1483 + 83;
                f1482 = i10 % 128;
                int i11 = i10 % 2;
                m5819(str, Collections.singletonList(activity));
                int i12 = f1482 + 63;
                f1483 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m5816(String str, Activity activity, Bundle bundle) {
                int i10 = f1482 + 93;
                f1483 = i10 % 128;
                int i11 = i10 % 2;
                m5819(str, Arrays.asList(activity, bundle));
                int i12 = f1482 + 63;
                f1483 = i12 % 128;
                if ((i12 % 2 != 0 ? 'C' : '.') != 'C') {
                    return;
                }
                int i13 = 39 / 0;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m5817(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2151) {
                    char[] cArr2 = f1481;
                    char c10 = f1480;
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

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public static /* synthetic */ void m5818(AnonymousClass6 anonymousClass6, String str, List list2) {
                int i10 = f1482 + 87;
                f1483 = i10 % 128;
                if (i10 % 2 != 0) {
                }
                anonymousClass6.m5820(str, false, (List<Object>) list2);
                int i11 = f1483 + 63;
                f1482 = i11 % 128;
                int i12 = i11 % 2;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m5819(final String str, final List<Object> list2) {
                m5820(str, true, list2);
                t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.6.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        AnonymousClass6.m5818(AnonymousClass6.this, str, list2);
                    }
                });
                int i10 = f1482 + 95;
                f1483 = i10 % 128;
                if (i10 % 2 == 0) {
                } else {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m5820(String str, boolean z10, List<Object> list2) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5817("\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000f\b\u000f\u000e\u0002\b\u0000\u0017\u000b\u0014", TextUtils.getOffsetBefore("", 0) + 18, (byte) (34 - TextUtils.indexOf("", "", 0))).intern());
                sb2.append(str);
                cq.m5728(cqVar, sb2.toString(), z10, false, list2);
                int i10 = f1483 + 83;
                f1482 = i10 % 128;
                if (!(i10 % 2 == 0)) {
                    return;
                }
                int i11 = 36 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (!(cq.m5755(activity, list))) {
                    return;
                }
                int i10 = f1483 + 95;
                f1482 = i10 % 128;
                int i11 = i10 % 2;
                m5816(m5817("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\t\u0005\u000b\f\u0000\u000e\u0092", 16 - TextUtils.lastIndexOf("", '0', 0), (byte) (46 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), activity, bundle);
                int i12 = f1482 + 73;
                f1483 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onActivityDestroyed(android.app.Activity r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1483
                    r1 = 89
                    int r0 = r0 + r1
                    int r2 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1482 = r2
                    int r0 = r0 % 2
                    r2 = 44
                    if (r0 != 0) goto L12
                    r0 = 16
                    goto L13
                L12:
                    r0 = r2
                L13:
                    if (r0 == r2) goto L2c
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5755(r6, r0)
                    r1 = 64
                    int r1 = r1 / 0
                    r1 = 34
                    if (r0 == 0) goto L25
                    r0 = r1
                    goto L27
                L25:
                    r0 = 79
                L27:
                    if (r0 == r1) goto L3a
                    goto L5e
                L2a:
                    r6 = move-exception
                    throw r6
                L2c:
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5755(r6, r0)
                    r2 = 63
                    if (r0 == 0) goto L37
                    goto L38
                L37:
                    r1 = r2
                L38:
                    if (r1 == r2) goto L5e
                L3a:
                    java.lang.String r0 = ""
                    r1 = 48
                    int r0 = android.text.TextUtils.lastIndexOf(r0, r1)
                    int r0 = r0 + 29985
                    char r0 = (char) r0
                    r2 = -480198943(0xffffffffe360bee1, float:-4.145825E21)
                    char r1 = android.text.AndroidCharacter.getMirror(r1)
                    int r1 = r1 + r2
                    java.lang.String r2 = "◞ᑶ䲫髙⚴瑝尟按씌\uf679봨앒淙\ue6d9ꄖ坯⮝\uf29e汪"
                    java.lang.String r3 = "᪸\uda69\uf55e鉬"
                    java.lang.String r4 = "ᆂ悿⃣蝵"
                    java.lang.String r0 = m5814(r2, r0, r3, r1, r4)
                    java.lang.String r0 = r0.intern()
                    r5.m5815(r0, r6)
                L5e:
                    int r6 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1482
                    int r6 = r6 + 111
                    int r0 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1483 = r0
                    int r6 = r6 % 2
                    if (r6 != 0) goto L6b
                    return
                L6b:
                    r6 = 0
                    throw r6     // Catch: java.lang.Throwable -> L6d
                L6d:
                    r6 = move-exception
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.onActivityDestroyed(android.app.Activity):void");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                int fadingEdgeLength;
                int iResolveSize;
                int i10 = f1483 + 47;
                f1482 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 27 / 0;
                    if (!cq.m5755(activity, list)) {
                        return;
                    }
                } else {
                    if (!cq.m5755(activity, list)) {
                        return;
                    }
                }
                int i12 = f1483 + 37;
                f1482 = i12 % 128;
                if (i12 % 2 == 0) {
                    fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() << 15) + 123;
                    iResolveSize = 87 >>> View.resolveSize(1, 0);
                } else {
                    fadingEdgeLength = 16 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    iResolveSize = 44 - View.resolveSize(0, 0);
                }
                m5815(m5817("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\n\f\u0010\u0011\u000b\r", fadingEdgeLength, (byte) iResolveSize).intern(), activity);
                int i13 = f1483 + 89;
                f1482 = i13 % 128;
                int i14 = i13 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onActivityResumed(android.app.Activity r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1482
                    int r0 = r0 + 19
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1483 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    if (r0 == 0) goto Lf
                    r0 = r1
                    goto L10
                Lf:
                    r0 = 1
                L10:
                    if (r0 == 0) goto L23
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5755(r6, r0)
                    r2 = 85
                    if (r0 == 0) goto L1e
                    r0 = r2
                    goto L20
                L1e:
                    r0 = 69
                L20:
                    if (r0 == r2) goto L37
                    goto L5b
                L23:
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5755(r6, r0)
                    r2 = 94
                    int r2 = r2 / r1
                    r2 = 22
                    if (r0 == 0) goto L32
                    r0 = r2
                    goto L34
                L32:
                    r0 = 26
                L34:
                    if (r0 == r2) goto L37
                    goto L5b
                L37:
                    r0 = 58341(0xe3e5, float:8.1753E-41)
                    int r2 = android.view.ViewConfiguration.getWindowTouchSlop()
                    int r2 = r2 >> 8
                    int r2 = r2 + r0
                    char r0 = (char) r2
                    r2 = -1081474287(0xffffffffbf8a0311, float:-1.0782186)
                    int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                    int r1 = r1 + r2
                    java.lang.String r2 = "騮\ue0e4陑칳ଔ\u171c䒍젠◉吠ꟊ敖뉵靬\ue732Ꝑ䘬"
                    java.lang.String r3 = "᪸\uda69\uf55e鉬"
                    java.lang.String r4 = "ᄀ訃\ue5bf口"
                    java.lang.String r0 = m5814(r2, r0, r3, r1, r4)
                    java.lang.String r0 = r0.intern()
                    r5.m5815(r0, r6)
                L5b:
                    int r6 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1482
                    int r6 = r6 + 67
                    int r0 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1483 = r0
                    int r6 = r6 % 2
                    return
                L66:
                    r6 = move-exception
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.onActivityResumed(android.app.Activity):void");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i10 = f1482 + 79;
                f1483 = i10 % 128;
                int i11 = i10 % 2;
                if (cq.m5755(activity, list)) {
                    int i12 = f1482 + 93;
                    f1483 = i12 % 128;
                    int i13 = i12 % 2;
                    m5816(m5817("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000e\f\u0005\u000b\u0010\u0002\u0013\u0001\u0010\u0006\u0000\r\u000e\u0003\u000e\u0001à", 27 - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 123)).intern(), activity, bundle);
                    int i14 = f1483 + 119;
                    f1482 = i14 % 128;
                    int i15 = i14 % 2;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i10 = f1483 + 5;
                f1482 = i10 % 128;
                int i11 = i10 % 2;
                if (cq.m5755(activity, list)) {
                    int i12 = f1483 + 53;
                    f1482 = i12 % 128;
                    int i13 = i12 % 2;
                    m5815(m5817("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000e\u0003\u000e\u0006\u0000\u000e\u0090", View.combineMeasuredStates(0, 0) + 17, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 44)).intern(), activity);
                }
                int i14 = f1482 + 55;
                f1483 = i14 % 128;
                int i15 = i14 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onActivityStopped(android.app.Activity r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1482
                    int r0 = r0 + 83
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1483 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L10
                    r0 = r1
                    goto L11
                L10:
                    r0 = r2
                L11:
                    if (r0 == r2) goto L29
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5755(r6, r0)
                    r2 = 88
                    int r2 = r2 / r1
                    r1 = 31
                    if (r0 == 0) goto L22
                    r0 = r1
                    goto L24
                L22:
                    r0 = 60
                L24:
                    if (r0 == r1) goto L35
                    goto L5b
                L27:
                    r6 = move-exception
                    throw r6
                L29:
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5755(r6, r0)
                    if (r0 == 0) goto L32
                    goto L33
                L32:
                    r1 = r2
                L33:
                    if (r1 == r2) goto L5b
                L35:
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    int r0 = r0 + 7996
                    char r0 = (char) r0
                    r1 = 1332154649(0x4f671119, float:3.8766574E9)
                    java.lang.String r2 = ""
                    int r2 = android.view.MotionEvent.axisFromString(r2)
                    int r1 = r1 - r2
                    java.lang.String r2 = "溮쯏봉㜣⫑\udbcc鸩鳣╾ﾁ睏\uebae\uf425\uf648\udf19᠙Ꝉ"
                    java.lang.String r3 = "᪸\uda69\uf55e鉬"
                    java.lang.String r4 = "᪴朑㵏縟"
                    java.lang.String r0 = m5814(r2, r0, r3, r1, r4)
                    java.lang.String r0 = r0.intern()
                    r5.m5815(r0, r6)
                L5b:
                    int r6 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1482
                    int r6 = r6 + 95
                    int r0 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1483 = r0
                    int r6 = r6 % 2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.onActivityStopped(android.app.Activity):void");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻐ */
            public final void mo4460(Activity activity) {
                char c10;
                int jumpTapTimeout;
                int i10 = f1483 + 67;
                f1482 = i10 % 128;
                if (i10 % 2 != 0) {
                    c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                } else {
                    c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() - 90;
                }
                m5815(m5814("魭饝੪㖗4隸舙쩐澲馘\ue92b躪\ue7cb៤軘遼ₐ䓌괰ᮠ蠷", c10, "᪸\uda69\uf55e鉬", (-192277445) - jumpTapTimeout, "㮢訔ᓴ洴").intern(), activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ｋ */
            public final void mo4461(Activity activity) {
                int i10 = f1482 + 1;
                f1483 = i10 % 128;
                int i11 = i10 % 2;
                m5815(m5814("봝흇龃\ue27aヌ鹹䫛㠙䍮脋Ἧ䠀榯鿵\udd21⫖\uf639閡\ue871襾왴錏ℑ탩뢉", (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "᪸\uda69\uf55e鉬", (-1126885650) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\ued57픖펼˻").intern(), activity);
                int i12 = f1483 + 59;
                f1482 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }
        };
        int i10 = f1416 + 65;
        f1419 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jhVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private l m5749(final boolean z10) {
        l lVar = new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.11

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f1440 = -3526982931227970902L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1441 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1442 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m5776(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5777("狫壚⛸\u0cfa\uda90ꂜ躬呖≳ࡥ환밒訽倩㿅י폿릛蟒", 10770 - MotionEvent.axisFromString("")).intern());
                sb2.append(str);
                cq.m5728(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, webView, obj, activity));
                int i10 = f1442 + 83;
                f1441 = i10 % 128;
                if ((i10 % 2 != 0 ? ',' : (char) 11) == 11) {
                } else {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m5777(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2041) {
                    com.ironsource.adqualitysdk.sdk.i.f.f2039 = i10;
                    char[] cArr2 = new char[cArr.length];
                    com.ironsource.adqualitysdk.sdk.i.f.f2040 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2040;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2039 * i11))) ^ f1440);
                            com.ironsource.adqualitysdk.sdk.i.f.f2040++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5788(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1441 + 47;
                f1442 = i10 % 128;
                m5776((!(i10 % 2 == 0) ? m5777("狉\ud966▫燵\udc21⡚璹샓⼇筅쟤", 43961 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)) : m5777("狉\ud966▫燵\udc21⡚璹샓⼇筅쟤", 43961 >>> (ViewConfiguration.getScrollBarFadeDuration() >>> 19))).intern(), jSONObject, webView, null, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* synthetic */ void mo5779(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1441 + 123;
                f1442 = i10 % 128;
                int i11 = i10 % 2;
                mo5779(jSONObject, webView, activity);
                int i12 = f1442 + 13;
                f1441 = i12 % 128;
                if ((i12 % 2 != 0 ? 'D' : 'C') != 'D') {
                    return;
                }
                int i13 = 42 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* synthetic */ void mo5780(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1442 + 75;
                f1441 = i10 % 128;
                int i11 = i10 % 2;
                mo5780(jSONObject, webView, obj, activity);
                int i12 = f1442 + 119;
                f1441 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4343(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1442 + 13;
                f1441 = i10 % 128;
                m5776(m5777("狋方尀㒦⼅މ︌횊쥫ꇠ顨烲歆䏕㩚ⴲ", (i10 % 2 != 0 ? '+' : 'I') != '+' ? 6007 - (ViewConfiguration.getWindowTouchSlop() >> 8) : (ViewConfiguration.getWindowTouchSlop() * 37) + 20166).intern(), jSONObject, webView, null, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ void mo5782(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1442 + 93;
                f1441 = i10 % 128;
                int i11 = i10 % 2;
                mo5782(jSONObject, webView, activity);
                int i12 = f1442 + 89;
                f1441 = i12 % 128;
                if ((i12 % 2 != 0 ? 'L' : (char) 20) != 'L') {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5779(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1442 + 19;
                f1441 = i10 % 128;
                m5776(m5777("狜赪趝谦豏貓輨轔辁踳蹕躍", !(i10 % 2 == 0) ? 65448 / ((byte) KeyEvent.getModifierMetaStateMask()) : 65448 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), jSONObject, webView, null, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5785(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1442 + 79;
                f1441 = i10 % 128;
                int i11 = i10 % 2;
                m5776(m5777("狝⸘쭦摬ƞꋫ忏ﬦ鑷ㅦ튠迾⣛쐯愜ɶ뾬墈\uf5da鄫", TextUtils.lastIndexOf("", '0') + 23768).intern(), jSONObject, webView, obj, activity);
                int i12 = f1442 + 71;
                f1441 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4338(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1441 + 101;
                f1442 = i10 % 128;
                int i11 = i10 % 2;
                mo4338(jSONObject, webView, activity);
                int i12 = f1442 + 67;
                f1441 = i12 % 128;
                if ((i12 % 2 != 0 ? 'O' : (char) 27) != 'O') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* synthetic */ void mo5785(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1441 + 43;
                f1442 = i10 % 128;
                int i11 = i10 % 2;
                mo5785(jSONObject, webView, obj, activity);
                int i12 = f1441 + 47;
                f1442 = i12 % 128;
                if (!(i12 % 2 == 0)) {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5782(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1442 + 67;
                f1441 = i10 % 128;
                m5776(m5777("狋ꤥ씿\ue107ᵩ㥎啍熣", (i10 % 2 != 0 ? ':' : '&') != '&' ? (KeyEvent.getMaxKeyCode() << 120) * 56299 : (KeyEvent.getMaxKeyCode() >> 16) + 56299).intern(), jSONObject, webView, null, activity);
                int i11 = f1441 + 45;
                f1442 = i11 % 128;
                if (i11 % 2 != 0) {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5780(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1441 + 69;
                f1442 = i10 % 128;
                int i11 = i10 % 2;
                m5776(m5777("狋\uda33⌓蠱턷㸸蜯\uec24㔦舉\ueb3a〚餛\ue639伏", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43261).intern(), jSONObject, webView, obj, activity);
                int i12 = f1441 + 69;
                f1442 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 5 : (char) 17) != 5) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo5788(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1441 + 79;
                f1442 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo5788(jSONObject, webView, activity);
                if (!z11) {
                    throw null;
                }
                int i11 = f1442 + 55;
                f1441 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo5789(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1441 + 35;
                f1442 = i10 % 128;
                int i11 = i10 % 2;
                mo5789(jSONObject, webView, obj, activity);
                int i12 = f1441 + 87;
                f1442 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4338(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1441 + 73;
                f1442 = i10 % 128;
                m5776(m5777("狋솹᐀梦뼅\uf389䘌骊\ue96b㷠灨", (i10 % 2 == 0 ? (char) 26 : (char) 23) != 26 ? MotionEvent.axisFromString("") + 45944 : 45944 >>> MotionEvent.axisFromString("")).intern(), jSONObject, webView, null, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5789(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1442 + 65;
                f1441 = i10 % 128;
                m5776((!(i10 % 2 != 0) ? m5777("狋엧\u1cbb垽깧\ue104㠷烐쮆", 46889 - ExpandableListView.getPackedPositionType(0L)) : m5777("狋엧\u1cbb垽깧\ue104㠷烐쮆", 46889 >>> ExpandableListView.getPackedPositionType(0L))).intern(), jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4343(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1441 + 55;
                f1442 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo4343(jSONObject, webView, activity);
                if (z11) {
                } else {
                    throw null;
                }
            }
        };
        int i10 = f1416 + 47;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        return lVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private p m5750(final p pVar, final p pVar2) {
        int i10 = f1416 + 81;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        if (pVar == null) {
            pVar = new p();
            int i12 = f1419 + 91;
            f1416 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (pVar2 == null) {
            pVar2 = new p();
            int i14 = f1419 + 27;
            f1416 = i14 % 128;
            int i15 = i14 % 2;
        }
        return new p() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final void mo4343(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo4343(jSONObject, view, activity);
                t.m7067(new e.AnonymousClass3(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5779(JSONObject jSONObject, View view, Activity activity) {
                mo5779(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5780(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5780(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo5779(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo5779(jSONObject, view, activity);
                t.m7067(new h.AnonymousClass2(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo5785(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo5785(jSONObject, view, obj, activity);
                t.m7067(new j.AnonymousClass2(pVar, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5782(JSONObject jSONObject, View view, Activity activity) {
                mo5782(jSONObject, view, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final void mo5788(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo5788(jSONObject, view, activity);
                t.m7067(new f.AnonymousClass4(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4338(JSONObject jSONObject, View view, Activity activity) {
                mo4338(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5785(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5785(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo4338(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo4338(jSONObject, view, activity);
                t.m7067(new a.AnonymousClass1(pVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo5780(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo5780(jSONObject, view, obj, activity);
                t.m7067(new b.AnonymousClass3(pVar, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5788(JSONObject jSONObject, View view, Activity activity) {
                mo5788(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo5789(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5789(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo5782(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo5782(jSONObject, view, activity);
                t.m7067(new c.AnonymousClass2(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo5789(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo5789(jSONObject, view, obj, activity);
                t.m7067(new d.AnonymousClass2(pVar, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4343(JSONObject jSONObject, View view, Activity activity) {
                mo4343(jSONObject, view, activity);
            }
        };
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m5751(Activity activity, Bundle bundle) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(ih.f2566, m5771().m5688());
            jSONObjectJsonObjectInit.put(ih.f2519, m5771().m5687());
            jSONObjectJsonObjectInit.put(ih.f2521, m5771().m5678());
            jSONObjectJsonObjectInit.put(m5736("\u0002\u0003\n\u001f\u0004\u0016³", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, (byte) (78 - KeyEvent.getDeadChar(0, 0))).intern(), activity.getClass().getName());
            if ((bundle != null ? '.' : '>') == '.') {
                int i10 = f1416 + 19;
                f1419 = i10 % 128;
                int i11 = i10 % 2;
                jSONObjectJsonObjectInit.put(m5736("\u0002\u0003\u0000&\u0004\u0002\u0006\n", (ViewConfiguration.getTapTimeout() >> 16) + 8, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 7)).intern(), true);
            }
            int i12 = f1419 + 59;
            f1416 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
            k.m6886(m5735("왬ဘ櫕䒘齆\ue914쏭ᶏ瑪丌飓\uf2ab쵿✷燱䮡", (ViewConfiguration.getWindowTouchSlop() >> 8) + 54851).intern(), m5735("왻噛\ue662瘔蘐᙭ꛗ㛭䛣횐暬\uf6aa݄靲❜뜆윭埍\ue780矡螁ឲꞪ㐏䑹푣搂\uf436ә铑", ExpandableListView.getPackedPositionGroup(0L) + 36887).intern());
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m5752(JSONObject jSONObject) {
        dp dpVarM5719;
        int i10 = f1416 + 77;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = jSONObject.optString(m5736(" \u000e$\u001d\u0007\r\u0002 ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (byte) (88 - TextUtils.indexOf("", ""))).intern());
        jSONObject.remove(m5736(" \u000e$\u001d\u0007\r\u0002 ", AndroidCharacter.getMirror('0') - '(', (byte) (88 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern());
        if ((jSONObject.optBoolean(m5735("왗珗굚\ue6ce၁䷩蝞ー", 46471 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? 'E' : 'M') == 'E' && (dpVarM5719 = m5719()) != null) {
            if (!TextUtils.isEmpty(dpVarM5719.m6111())) {
                jSONObject.remove(m5735("왗珗굚\ue6ce၁䷩蝞ー", TextUtils.indexOf((CharSequence) "", '0') + 46472).intern());
                try {
                    String strIntern = m5736(" \u000e&\u0011\u001d\u000b\"\u0007\u0003\u0004", 10 - Color.red(0), (byte) (60 - Color.green(0))).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString);
                    sb2.append(dpVarM5719.m6111());
                    jSONObject.put(strIntern, sb2.toString());
                } catch (JSONException unused) {
                }
            }
            if (dpVarM5719.m6109()) {
                int i12 = f1419 + 61;
                f1416 = i12 % 128;
                try {
                    if (i12 % 2 == 0) {
                        jSONObject.put(m5736("\u0012\u0013\f\"\u001f\u0002\u001d\b \u0014", 127 / TextUtils.getTrimmedLength(""), (byte) (2 % KeyEvent.normalizeMetaState(1))).intern(), false);
                    } else {
                        jSONObject.put(m5736("\u0012\u0013\f\"\u001f\u0002\u001d\b \u0014", 10 - TextUtils.getTrimmedLength(""), (byte) (82 - KeyEvent.normalizeMetaState(0))).intern(), true);
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        do {
            if (!itKeys.hasNext()) {
                return jSONObject;
            }
        } while ((!m5725(jSONObject, itKeys.next()) ? '>' : '1') != '>');
        int i13 = f1416 + 39;
        f1419 = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m5753(cq cqVar, im imVar, boolean z10) {
        int i10 = f1416 + 5;
        f1419 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'M' : '5';
        cqVar.m5730(imVar, z10);
        if (c10 == 'M') {
            int i11 = 52 / 0;
        }
        int i12 = f1419 + 53;
        f1416 = i12 % 128;
        if ((i12 % 2 == 0 ? 'P' : 'T') == 'T') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m5754(String str, Cdo cdo) {
        JSONObject jSONObjectM5752 = m5752(cdo.m6101());
        if (jSONObjectM5752 != null) {
            if ((jSONObjectM5752.has(m5735("왊ꯠᴩ轎炒\ue20f命㦝ꯓᵤ躠烌\ue21d垭㧄\uab18ᵞ躚", 28082 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) ? 'J' : (char) 28) != 28) {
                jn.e eVarM6773 = jn.e.m6773(jSONObjectM5752.optString(m5735("왊ꯠᴩ轎炒\ue20f命㦝ꯓᵤ躠烌\ue21d垭㧄\uab18ᵞ躚", 28081 - View.getDefaultSize(0, 0)).intern(), null));
                String strM5721 = m5721(str, jSONObjectM5752);
                if (eVarM6773 != null) {
                    int i10 = f1416 + 79;
                    f1419 = i10 % 128;
                    int i11 = i10 % 2;
                    jn.m6764().m6769(strM5721, eVarM6773);
                }
            }
        }
        int i12 = f1419 + 119;
        f1416 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5755(Activity activity, List list) {
        int i10 = f1416 + 49;
        f1419 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5733(activity, (List<String>) list);
        }
        m5733(activity, (List<String>) list);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5756(Cdo cdo) {
        List listMo4561 = ar.m4559().mo4561();
        ISAdQualityAdType iSAdQualityAdTypeM6103 = cdo.m6103();
        if ((listMo4561 != null ? (char) 2 : 'F') == 2) {
            int i10 = f1419 + 93;
            f1416 = i10 % 128;
            int i11 = i10 % 2;
            if (iSAdQualityAdTypeM6103 != ISAdQualityAdType.UNKNOWN) {
                int i12 = f1419 + 111;
                f1416 = i12 % 128;
                int i13 = i12 % 2;
                if ((!listMo4561.contains(iSAdQualityAdTypeM6103) ? 'W' : '0') != '0') {
                    return true;
                }
                int i14 = f1416 + 123;
                f1419 = i14 % 128;
                if ((i14 % 2 != 0 ? 'P' : 'K') == 'K') {
                    return false;
                }
                throw null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final void m5757() {
        int i10 = f1419 + 31;
        f1416 = i10 % 128;
        int i11 = i10 % 2;
        m5715();
        m5716();
        m5718();
        if ((this.f1424 != null ? (char) 0 : 'a') != 'a') {
            jj.m6752().m6754(this.f1424);
            this.f1424 = null;
        }
        jo joVar = this.f1422;
        if ((joVar != null ? (char) 15 : 'U') == 15) {
            int i12 = f1416 + 125;
            f1419 = i12 % 128;
            int i13 = i12 % 2;
            joVar.m6780();
            this.f1422 = null;
            int i14 = f1416 + 77;
            f1419 = i14 % 128;
            int i15 = i14 % 2;
        }
        this.f1426 = null;
        int i16 = f1416 + 13;
        f1419 = i16 % 128;
        if (!(i16 % 2 != 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final db m5758() {
        int i10 = f1419 + 119;
        int i11 = i10 % 128;
        f1416 = i11;
        if ((i10 % 2 == 0 ? '?' : '!') == '?') {
            throw null;
        }
        db dbVar = this.f1428;
        int i12 = i11 + 121;
        f1419 = i12 % 128;
        if ((i12 % 2 != 0 ? 'K' : '_') != 'K') {
            return dbVar;
        }
        int i13 = 81 / 0;
        return dbVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m5759() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5771().m5684());
        sb2.append(m5736("\u0093", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 100)).intern());
        sb2.append(m5764().m6414());
        String string = sb2.toString();
        int i10 = f1419 + 21;
        f1416 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final ch m5760() {
        int i10 = f1419 + 69;
        int i11 = i10 % 128;
        f1416 = i11;
        int i12 = i10 % 2;
        ch chVar = this.f1426;
        int i13 = i11 + 107;
        f1419 = i13 % 128;
        int i14 = i13 % 2;
        return chVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final du m5761() {
        int i10 = f1419 + 87;
        f1416 = i10 % 128;
        if ((i10 % 2 == 0 ? '@' : '6') == '6') {
            return this.f1425;
        }
        int i11 = 0 / 0;
        return this.f1425;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final JSONObject m5762() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(ih.f2566, m5771().m5688());
            jSONObjectJsonObjectInit.put(ih.f2521, m5771().m5678());
            jSONObjectJsonObjectInit.put(ih.f2519, m5771().m5687());
        } catch (JSONException e10) {
            String strIntern = m5735("왬ဘ櫕䒘齆\ue914쏭ᶏ瑪丌飓\uf2ab쵿✷燱䮡", (ViewConfiguration.getPressedStateDuration() >> 16) + 54851).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m5735("왻썅챞쥊퉨\udf33\ud86b\ue573\uee13\ueb0e\uf410\uf134屮蜬聠跜雘鏂鳲駡ꊪ꿩ꢋ떞뺈믥䓴", View.resolveSizeAndState(0, 0, 0) + 1289).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m6886(strIntern, sb2.toString());
        }
        int i10 = f1419 + 49;
        f1416 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ds m5763(String str) {
        int i10 = f1419 + 103;
        f1416 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        ds dsVarM6413 = m5764().m6413(str);
        int i11 = f1419 + 107;
        f1416 = i11 % 128;
        int i12 = i11 % 2;
        return dsVarM6413;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hs m5764() {
        hs hsVar;
        int i10 = f1416;
        int i11 = i10 + 97;
        f1419 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 6 : (char) 25) != 6) {
            hsVar = this.f1427;
        } else {
            hsVar = this.f1427;
            int i12 = 98 / 0;
        }
        int i13 = i10 + 49;
        f1419 = i13 % 128;
        int i14 = i13 % 2;
        return hsVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Context m5765() {
        int i10 = f1416 + 59;
        f1419 = i10 % 128;
        int i11 = i10 % 2;
        Context contextM5675 = m5771().m5675();
        int i12 = f1419 + 95;
        f1416 = i12 % 128;
        if (i12 % 2 != 0) {
            return contextM5675;
        }
        int i13 = 99 / 0;
        return contextM5675;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m5766(JSONObject jSONObject) {
        int i10 = f1416 + 43;
        f1419 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        this.f1423 = jz.m6882(jSONObject, true);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m5767() {
        int i10 = f1419 + 37;
        int i11 = i10 % 128;
        f1416 = i11;
        int i12 = i10 % 2;
        JSONObject jSONObject = this.f1423;
        int i13 = i11 + 123;
        f1419 = i13 % 128;
        int i14 = i13 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5768(String str, JSONObject jSONObject) {
        if (str.equals(m5736("\u0002\b%\n\u000b\u0019\u0010\u000f\u0002\u0000\u0007\n", ExpandableListView.getPackedPositionType(0L) + 12, (byte) (ExpandableListView.getPackedPositionType(0L) + 108)).intern())) {
            this.f1421.m5676().m4837(jSONObject);
        } else if (str.equals(m5735("왟黍睏쾘ꐎ粢헇ꩺˢ", TextUtils.lastIndexOf("", '0', 0) + 22680).intern())) {
            this.f1421.m5676().m4843(jSONObject);
        }
        JSONObject jSONObjectM6870 = jz.m6870(m5738(jSONObject));
        if (str.equals(ih.f2524)) {
            this.f1421.m5676().m4845(jSONObjectM6870);
            return;
        }
        if (str.equals(ih.f2525)) {
            this.f1421.m5676().m4838(jSONObjectM6870);
            int i10 = f1419 + 69;
            f1416 = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        if ((str.equals(ih.f2531) ? 'X' : (char) 14) == 'X') {
            this.f1421.m5676().m4842(jSONObjectM6870);
            return;
        }
        if ((str.equals(ih.f2530) ? '$' : '.') != '.') {
            this.f1421.m5676().m4834(jSONObjectM6870);
            return;
        }
        if (str.equals(ih.f2523)) {
            this.f1421.m5676().m4833(jSONObjectM6870);
            return;
        }
        if (!str.equals(ih.f2526)) {
            if (str.equals(ih.f2522)) {
                this.f1421.m5676().m4832(jSONObjectM6870);
                return;
            } else {
                this.f1421.m5676().m4841(str, jSONObject);
                return;
            }
        }
        int i12 = f1416 + 39;
        f1419 = i12 % 128;
        if (i12 % 2 == 0) {
            this.f1421.m5676().m4835(jSONObjectM6870);
        } else {
            this.f1421.m5676().m4835(jSONObjectM6870);
            int i13 = 52 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final bd m5769() {
        bd bdVar;
        int i10 = f1419 + 27;
        int i11 = i10 % 128;
        f1416 = i11;
        if ((i10 % 2 == 0 ? '=' : 'W') != '=') {
            bdVar = this.f1429;
        } else {
            bdVar = this.f1429;
            int i12 = 26 / 0;
        }
        int i13 = i11 + 105;
        f1419 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return bdVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m5770(String str, List<Object> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5736("&\u0007\u000b\u0018\u000f\u0000+\u001d\b\u0003\u0010\t\u0004\u000f\u0002&", 15 - ExpandableListView.getPackedPositionChild(0L), (byte) (Gravity.getAbsoluteGravity(0, 0) + 39)).intern());
        sb2.append(str);
        m5731(sb2.toString(), list);
        int i10 = f1419 + 25;
        f1416 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return;
        }
        int i11 = 42 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final cm m5771() {
        int i10 = f1419 + 43;
        int i11 = i10 % 128;
        f1416 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        cm cmVar = this.f1421;
        int i12 = i11 + 89;
        f1419 = i12 % 128;
        int i13 = i12 % 2;
        return cmVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m5772(il ilVar) {
        int i10 = f1416 + 21;
        f1419 = i10 % 128;
        if ((i10 % 2 != 0 ? '<' : ';') == ';') {
            this.f1421.m5676().m4836(ilVar);
        } else {
            this.f1421.m5676().m4836(ilVar);
            throw null;
        }
    }
}
