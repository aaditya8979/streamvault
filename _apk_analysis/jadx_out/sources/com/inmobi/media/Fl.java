package com.inmobi.media;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.inmobi.media.Fl;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public final class Fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f25463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3617nl f25464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3605n9 f25465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f25470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f25471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f25474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f25475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f25476n;

    public Fl(AdConfig.VastVideoConfig vastVideoConfig, C3617nl c3617nl, C3605n9 c3605n9) {
        tn.p.k(vastVideoConfig, "vastVideoConfig");
        tn.p.k(c3617nl, "vastEventProcessor");
        this.f25463a = vastVideoConfig;
        this.f25464b = c3617nl;
        this.f25465c = c3605n9;
        this.f25468f = "";
        this.f25469g = "";
        this.f25470h = new ArrayList();
        this.f25471i = new ArrayList();
        this.f25472j = "";
        this.f25473k = "";
        this.f25474l = new ArrayList();
        this.f25475m = new ArrayList();
        this.f25476n = new ArrayList();
    }

    public static final bn.r a(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (tn.p.f(xmlPullParser.getName(), VastTagName.VERIFICATION)) {
            fl2.p(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(XmlPullParser xmlPullParser, Fl fl2, List list) throws XmlPullParserException, IOException {
        if (tn.p.f(xmlPullParser.getName(), VastTagName.TRACKING)) {
            C3809ve c3809veB = fl2.b(xmlPullParser);
            if (c3809veB != null) {
                list.add(c3809veB);
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r a(org.xmlpull.v1.XmlPullParser r3, com.inmobi.media.Fl r4, java.util.List r5, kotlin.jvm.internal.Ref$ObjectRef r6, java.util.List r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = r3.getName()
            if (r0 == 0) goto La2
            int r1 = r0.hashCode()
            r2 = -348198615(0xffffffffeb3ee929, float:-2.3079697E26)
            if (r1 == r2) goto L69
            r6 = 611554000(0x247392d0, float:5.281658E-17)
            if (r1 == r6) goto L58
            r6 = 676623548(0x285474bc, float:1.1793677E-14)
            if (r1 == r6) goto L4b
            r5 = 1877773523(0x6fec8cd3, float:1.4641742E29)
            if (r1 == r5) goto L20
            goto La2
        L20:
            java.lang.String r5 = "CompanionClickTracking"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L2a
            goto La2
        L2a:
            java.lang.String r3 = r4.v(r3)
            java.lang.String r3 = com.inmobi.media.AbstractC3642ol.b(r3)
            boolean r4 = com.inmobi.media.AbstractC3642ol.a(r3)
            r5 = 0
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            r3 = r5
        L3b:
            if (r3 != 0) goto L3e
            goto L45
        L3e:
            com.inmobi.media.ve r5 = new com.inmobi.media.ve
            java.lang.String r4 = "click"
            r5.<init>(r3, r4)
        L45:
            if (r5 == 0) goto La8
            r7.add(r5)
            goto La8
        L4b:
            java.lang.String r6 = "StaticResource"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L54
            goto La2
        L54:
            r4.a(r3, r5)
            goto La8
        L58:
            java.lang.String r5 = "TrackingEvents"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L61
            goto La2
        L61:
            java.util.ArrayList r3 = r4.o(r3)
            r7.addAll(r3)
            goto La8
        L69:
            java.lang.String r5 = "CompanionClickThrough"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L72
            goto La2
        L72:
            java.lang.String r5 = r4.v(r3)
            java.lang.String r5 = com.inmobi.media.AbstractC3642ol.b(r5)
            boolean r7 = com.inmobi.media.AbstractC3642ol.a(r5)
            if (r7 == 0) goto L83
            r6.element = r5
            goto La8
        L83:
            com.inmobi.media.n9 r4 = r4.f25465c
            if (r4 == 0) goto La8
            java.lang.String r3 = r3.getText()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid ClickThrough URL: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "VastParser"
            r4.b(r5, r3)
            goto La8
        La2:
            r4.getClass()
            w(r3)
        La8:
            bn.r r3 = bn.r.f5635a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, java.util.List, kotlin.jvm.internal.Ref$ObjectRef, java.util.List):bn.r");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r a(org.xmlpull.v1.XmlPullParser r2, com.inmobi.media.Fl r3, kotlin.jvm.internal.Ref$BooleanRef r4) throws org.xmlpull.v1.XmlPullParserException, com.inmobi.media.C3766tl, java.io.IOException {
        /*
            java.lang.String r0 = r2.getName()
            if (r0 == 0) goto L71
            int r1 = r0.hashCode()
            switch(r1) {
                case -2077435339: goto L64;
                case -1692490108: goto L54;
                case -1499090620: goto L40;
                case 67232232: goto L29;
                case 184043572: goto L1c;
                case 2114088489: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L71
        Lf:
            java.lang.String r4 = "Impression"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L18
            goto L71
        L18:
            r3.f(r2)
            goto L77
        L1c:
            java.lang.String r4 = "Extensions"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L25
            goto L71
        L25:
            r3.e(r2)
            goto L77
        L29:
            java.lang.String r4 = "Error"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L32
            goto L71
        L32:
            java.lang.String r4 = "error"
            com.inmobi.media.ve r2 = r3.a(r4, r2)
            if (r2 == 0) goto L77
            java.util.ArrayList r3 = r3.f25471i
            r3.add(r2)
            goto L77
        L40:
            java.lang.String r4 = "AdServingId"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L49
            goto L71
        L49:
            java.lang.String r2 = r3.v(r2)
            if (r2 != 0) goto L51
            java.lang.String r2 = ""
        L51:
            r3.f25469g = r2
            goto L77
        L54:
            java.lang.String r1 = "Creatives"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L71
        L5d:
            r0 = 1
            r4.element = r0
            r3.k(r2)
            goto L77
        L64:
            java.lang.String r4 = "AdVerifications"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L6d
            goto L71
        L6d:
            r3.c(r2)
            goto L77
        L71:
            r3.getClass()
            w(r2)
        L77:
            bn.r r2 = bn.r.f5635a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$BooleanRef):bn.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r a(org.xmlpull.v1.XmlPullParser r4, com.inmobi.media.Fl r5, kotlin.jvm.internal.Ref$BooleanRef r6, kotlin.jvm.internal.Ref$BooleanRef r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = r4.getName()
            if (r0 == 0) goto L67
            int r1 = r0.hashCode()
            r2 = -2049897434(0xffffffff85d10c26, float:-1.9658728E-35)
            r3 = 1
            if (r1 == r2) goto L5a
            r2 = -1927368268(0xffffffff8d1eb1b4, float:-4.890141E-31)
            if (r1 == r2) goto L48
            r6 = -385055469(0xffffffffe90c8513, float:-1.0617377E25)
            if (r1 == r6) goto L33
            r6 = 611554000(0x247392d0, float:5.281658E-17)
            if (r1 == r6) goto L20
            goto L67
        L20:
            java.lang.String r6 = "TrackingEvents"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L29
            goto L67
        L29:
            java.util.ArrayList r6 = r5.f25471i
            java.util.ArrayList r4 = r5.o(r4)
            r6.addAll(r4)
            goto L6d
        L33:
            java.lang.String r6 = "MediaFiles"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L3c
            goto L67
        L3c:
            r7.element = r3
            java.util.ArrayList r6 = r5.f25474l
            java.util.ArrayList r4 = r5.m(r4)
            r6.addAll(r4)
            goto L6d
        L48:
            java.lang.String r7 = "Duration"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L51
            goto L67
        L51:
            java.lang.String r4 = r5.a(r4)
            r5.f25473k = r4
            r6.element = r3
            goto L6d
        L5a:
            java.lang.String r6 = "VideoClicks"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L63
            goto L67
        L63:
            r5.a(r4, r3)
            goto L6d
        L67:
            r5.getClass()
            w(r4)
        L6d:
            bn.r r4 = bn.r.f5635a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.internal.Ref$BooleanRef):bn.r");
    }

    public static final bn.r a(XmlPullParser xmlPullParser, Fl fl2, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, List list) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        int i12;
        if (!tn.p.f(xmlPullParser.getName(), VastTagName.MEDIA_FILE)) {
            fl2.getClass();
            w(xmlPullParser);
            return bn.r.f5635a;
        }
        ref$BooleanRef.element = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, VastAttributes.BITRATE);
            tn.p.j(attributeValue3, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            C3605n9 c3605n9 = fl2.f25465c;
            if (c3605n9 != null) {
                c3605n9.b("VastParser", "Invalid Value for BitRate.");
            }
            i10 = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            tn.p.j(attributeValue4, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            C3605n9 c3605n92 = fl2.f25465c;
            if (c3605n92 != null) {
                c3605n92.b("VastParser", "Invalid Value for Media Width.");
            }
            i11 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            tn.p.j(attributeValue5, "getAttributeValue(...)");
            i12 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            C3605n9 c3605n93 = fl2.f25465c;
            if (c3605n93 != null) {
                c3605n93.b("VastParser", "Invalid Value for Media Height.");
            }
            i12 = 0;
        }
        String strB = AbstractC3642ol.b(fl2.v(xmlPullParser));
        if (!fl2.a(i11, i12, strB, attributeValue, i10)) {
            return bn.r.f5635a;
        }
        if (attributeValue2 != null) {
            List<String> allowedContentType = fl2.f25463a.getAllowedContentType();
            if (!(allowedContentType instanceof Collection) || !allowedContentType.isEmpty()) {
                Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (bo.a0.J((String) it.next(), attributeValue2, true)) {
                        tn.p.h(attributeValue);
                        tn.p.h(attributeValue2);
                        list.add(new C3667pl(i11, i12, strB, attributeValue, attributeValue2, i10));
                        return bn.r.f5635a;
                    }
                }
            }
        }
        C3605n9 c3605n94 = fl2.f25465c;
        if (c3605n94 != null) {
            c3605n94.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (F3.a(attributeValue2)) {
            ref$BooleanRef2.element = true;
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(XmlPullParser xmlPullParser, Fl fl2, Ref$IntRef ref$IntRef) throws XmlPullParserException, IOException {
        int i10;
        if (!tn.p.f(xmlPullParser.getName(), VastTagName.COMPANION)) {
            fl2.getClass();
            w(xmlPullParser);
            return bn.r.f5635a;
        }
        ref$IntRef.element++;
        int i11 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            tn.p.j(attributeValue, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            C3605n9 c3605n9 = fl2.f25465c;
            if (c3605n9 != null) {
                c3605n9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i10 = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            tn.p.j(attributeValue2, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            C3605n9 c3605n92 = fl2.f25465c;
            if (c3605n92 != null) {
                c3605n92.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i10 <= 0 || i11 <= 0) {
            return bn.r.f5635a;
        }
        fl2.h(xmlPullParser);
        return bn.r.f5635a;
    }

    public static final bn.r a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, Fl fl2, Ref$BooleanRef ref$BooleanRef2) throws XmlPullParserException, IOException {
        if (tn.p.f(xmlPullParser.getName(), VastTagName.CREATIVE)) {
            ref$BooleanRef.element = true;
            if (fl2.j(xmlPullParser)) {
                ref$BooleanRef2.element = true;
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r a(org.xmlpull.v1.XmlPullParser r3, kotlin.jvm.internal.Ref$BooleanRef r4, com.inmobi.media.Fl r5, kotlin.jvm.internal.Ref$ObjectRef r6, kotlin.jvm.internal.Ref$ObjectRef r7, java.util.List r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = r3.getName()
            if (r0 == 0) goto L76
            int r1 = r0.hashCode()
            r2 = 611554000(0x247392d0, float:5.281658E-17)
            if (r1 == r2) goto L65
            r8 = 1561251035(0x5d0eccdb, float:6.43115E17)
            if (r1 == r8) goto L2e
            r4 = 1749252741(0x68437a85, float:3.6924862E24)
            if (r1 == r4) goto L1a
            goto L76
        L1a:
            java.lang.String r4 = "VerificationParameters"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L23
            goto L76
        L23:
            java.lang.String r3 = r5.v(r3)
            java.lang.String r3 = com.inmobi.media.AbstractC3642ol.b(r3)
            r7.element = r3
            goto L7c
        L2e:
            java.lang.String r7 = "JavaScriptResource"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L37
            goto L76
        L37:
            boolean r7 = r4.element
            if (r7 == 0) goto L44
            r5.getClass()
            w(r3)
            bn.r r3 = bn.r.f5635a
            return r3
        L44:
            r7 = 0
            java.lang.String r8 = "apiFramework"
            java.lang.String r8 = r3.getAttributeValue(r7, r8)
            if (r8 == 0) goto L7c
            r0 = 0
            r1 = 2
            java.lang.String r2 = "omid"
            boolean r7 = bo.a0.W(r8, r2, r0, r1, r7)
            if (r7 == 0) goto L7c
            r7 = 1
            r4.element = r7
            java.lang.String r3 = r5.v(r3)
            java.lang.String r3 = com.inmobi.media.AbstractC3642ol.b(r3)
            r6.element = r3
            goto L7c
        L65:
            java.lang.String r4 = "TrackingEvents"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L6e
            goto L76
        L6e:
            java.util.ArrayList r3 = r5.o(r3)
            r8.addAll(r3)
            goto L7c
        L76:
            r5.getClass()
            w(r3)
        L7c:
            bn.r r3 = bn.r.f5635a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, kotlin.jvm.internal.Ref$BooleanRef, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$ObjectRef, java.util.List):bn.r");
    }

    public static final bn.r a(XmlPullParser xmlPullParser, boolean z10, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (tn.p.f(name, VastTagName.CLICK_THROUGH)) {
            if (z10) {
                String strB = AbstractC3642ol.b(fl2.v(xmlPullParser));
                if (AbstractC3642ol.a(strB)) {
                    fl2.f25472j = strB;
                }
            }
        } else if (tn.p.f(name, VastTagName.CLICK_TRACKING)) {
            C3809ve c3809veA = fl2.a("click", xmlPullParser);
            if (c3809veA != null) {
                fl2.f25471i.add(c3809veA);
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.Fl r6, org.xmlpull.v1.XmlPullParser r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws com.inmobi.media.C3766tl {
        /*
            java.lang.String r0 = "video"
            r6.getClass()
            boolean r1 = r8 instanceof com.inmobi.media.C3841wl
            if (r1 == 0) goto L18
            r1 = r8
            com.inmobi.media.wl r1 = (com.inmobi.media.C3841wl) r1
            int r2 = r1.f28467d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f28467d = r2
            goto L1d
        L18:
            com.inmobi.media.wl r1 = new com.inmobi.media.wl
            r1.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r1.f28465b
            java.lang.Object r2 = in.a.g()
            int r3 = r1.f28467d
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            kotlin.jvm.internal.Ref$BooleanRef r6 = r1.f28464a
            kotlin.c.b(r8)
            goto L66
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.c.b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            r3 = 0
            java.lang.String r5 = "adType"
            java.lang.String r5 = r7.getAttributeValue(r3, r5)     // Catch: java.lang.Exception -> L4c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4c:
            r5 = r0
        L4d:
            boolean r0 = tn.p.f(r5, r0)
            if (r0 == 0) goto L75
            com.inmobi.media.xl r0 = new com.inmobi.media.xl
            r0.<init>(r6, r3, r8, r7)
            r1.f28464a = r8
            r1.f28467d = r4
            java.lang.String r3 = "Ad"
            java.lang.Object r6 = r6.a(r7, r3, r0, r1)
            if (r6 != r2) goto L65
            goto L6c
        L65:
            r6 = r8
        L66:
            boolean r6 = r6.element
            if (r6 == 0) goto L6d
            bn.r r2 = bn.r.f5635a
        L6c:
            return r2
        L6d:
            com.inmobi.media.tl r6 = new com.inmobi.media.tl
            r7 = 1101(0x44d, float:1.543E-42)
            r6.<init>(r7)
            throw r6
        L75:
            com.inmobi.media.tl r6 = new com.inmobi.media.tl
            r7 = 1125(0x465, float:1.576E-42)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(com.inmobi.media.Fl, org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final bn.r b(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (tn.p.f(xmlPullParser.getName(), "AdVerifications")) {
            fl2.c(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r b(org.xmlpull.v1.XmlPullParser r3, com.inmobi.media.Fl r4, kotlin.jvm.internal.Ref$BooleanRef r5) throws org.xmlpull.v1.XmlPullParserException, com.inmobi.media.C3766tl, java.io.IOException {
        /*
            java.lang.String r0 = r3.getName()
            if (r0 == 0) goto L4b
            int r1 = r0.hashCode()
            r2 = -2018804923(0xffffffff87ab7b45, float:-2.5801672E-34)
            if (r1 == r2) goto L3b
            r5 = 1150879268(0x44990624, float:1224.1919)
            if (r1 == r5) goto L2e
            r5 = 1539775849(0x5bc71d69, float:1.12091714E17)
            if (r1 == r5) goto L1a
            goto L4b
        L1a:
            java.lang.String r5 = "UniversalAdId"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L23
            goto L4b
        L23:
            java.lang.String r3 = r4.v(r3)
            if (r3 != 0) goto L2b
            java.lang.String r3 = ""
        L2b:
            r4.f25468f = r3
            goto L51
        L2e:
            java.lang.String r5 = "CompanionAds"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L37
            goto L4b
        L37:
            r4.i(r3)
            goto L51
        L3b:
            java.lang.String r1 = "Linear"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L4b
        L44:
            r0 = 1
            r5.element = r0
            r4.l(r3)
            goto L51
        L4b:
            r4.getClass()
            w(r3)
        L51:
            bn.r r3 = bn.r.f5635a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.b(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$BooleanRef):bn.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.inmobi.media.Fl r11, org.xmlpull.v1.XmlPullParser r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws com.inmobi.media.C3766tl {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof com.inmobi.media.Al
            if (r0 == 0) goto L16
            r0 = r13
            com.inmobi.media.Al r0 = (com.inmobi.media.Al) r0
            int r1 = r0.f25177e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f25177e = r1
            goto L1b
        L16:
            com.inmobi.media.Al r0 = new com.inmobi.media.Al
            r0.<init>(r11, r13)
        L1b:
            java.lang.Object r13 = r0.f25175c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25177e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.jvm.internal.Ref$BooleanRef r11 = r0.f25174b
            kotlin.jvm.internal.Ref$BooleanRef r12 = r0.f25173a
            kotlin.c.b(r13)
            goto L61
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            kotlin.c.b(r13)
            kotlin.jvm.internal.Ref$BooleanRef r13 = new kotlin.jvm.internal.Ref$BooleanRef
            r13.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            com.inmobi.media.Bl r10 = new com.inmobi.media.Bl
            r9 = 0
            r4 = r10
            r5 = r12
            r6 = r11
            r7 = r2
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f25173a = r13
            r0.f25174b = r2
            r0.f25177e = r3
            java.lang.String r3 = "VAST"
            java.lang.Object r11 = r11.a(r12, r3, r10, r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            r12 = r13
            r11 = r2
        L61:
            boolean r12 = r12.element
            if (r12 == 0) goto L68
            bn.r r11 = bn.r.f5635a
            return r11
        L68:
            boolean r11 = r11.element
            if (r11 == 0) goto L74
            com.inmobi.media.tl r11 = new com.inmobi.media.tl
            r12 = 1124(0x464, float:1.575E-42)
            r11.<init>(r12)
            throw r11
        L74:
            com.inmobi.media.tl r11 = new com.inmobi.media.tl
            r12 = 1102(0x44e, float:1.544E-42)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.b(com.inmobi.media.Fl, org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final bn.r c(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String attributeValue;
        if (tn.p.f(xmlPullParser.getName(), VastTagName.EXTENSION)) {
            try {
                attributeValue = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                attributeValue = "";
            }
            if (tn.p.f(attributeValue, "AdVerifications")) {
                fl2.d(xmlPullParser);
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.inmobi.media.Fl r5, org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.inmobi.media.C3766tl {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.inmobi.media.Dl
            if (r0 == 0) goto L16
            r0 = r7
            com.inmobi.media.Dl r0 = (com.inmobi.media.Dl) r0
            int r1 = r0.f25343d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f25343d = r1
            goto L1b
        L16:
            com.inmobi.media.Dl r0 = new com.inmobi.media.Dl
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f25341b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25343d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.jvm.internal.Ref$BooleanRef r5 = r0.f25340a
            kotlin.c.b(r7)
            goto L5f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.c.b(r7)
            int r7 = r5.f25466d
            int r7 = r7 + r3
            r5.f25466d = r7
            com.inmobi.media.core.config.models.AdConfig$VastVideoConfig r2 = r5.f25463a
            int r2 = r2.getMaxWrapperLimit()
            if (r7 > r2) goto L6e
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            com.inmobi.media.El r2 = new com.inmobi.media.El
            r4 = 0
            r2.<init>(r5, r4, r7, r6)
            r0.f25340a = r7
            r0.f25343d = r3
            java.lang.String r3 = "Wrapper"
            java.lang.Object r5 = r5.a(r6, r3, r2, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            r5 = r7
        L5f:
            boolean r5 = r5.element
            if (r5 == 0) goto L66
            bn.r r5 = bn.r.f5635a
            return r5
        L66:
            com.inmobi.media.tl r5 = new com.inmobi.media.tl
            r6 = 1121(0x461, float:1.571E-42)
            r5.<init>(r6)
            throw r5
        L6e:
            com.inmobi.media.tl r5 = new com.inmobi.media.tl
            r6 = 1107(0x453, float:1.551E-42)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.c(com.inmobi.media.Fl, org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final bn.r d(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (tn.p.f(name, VastTagName.COMPANION_CLICK_TRACKING)) {
            String strB = AbstractC3642ol.b(fl2.v(xmlPullParser));
            if (!AbstractC3642ol.a(strB)) {
                strB = null;
            }
            C3809ve c3809ve = strB != null ? new C3809ve(strB, "click") : null;
            if (c3809ve != null) {
                fl2.f25475m.add(c3809ve);
            }
        } else if (tn.p.f(name, VastTagName.TRACKING_EVENTS)) {
            fl2.f25475m.addAll(fl2.o(xmlPullParser));
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    public static final bn.r e(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (tn.p.f(xmlPullParser.getName(), VastTagName.COMPANION)) {
            fl2.q(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    public static final bn.r f(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (tn.p.f(name, VastTagName.LINEAR)) {
            fl2.u(xmlPullParser);
        } else if (tn.p.f(name, VastTagName.COMPANION_ADS)) {
            fl2.r(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    public static final bn.r g(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (tn.p.f(xmlPullParser.getName(), VastTagName.CREATIVE)) {
            fl2.s(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    public static final bn.r h(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (tn.p.f(name, VastTagName.TRACKING_EVENTS)) {
            fl2.f25471i.addAll(fl2.o(xmlPullParser));
        } else if (tn.p.f(name, VastTagName.VIDEO_CLICKS)) {
            fl2.a(xmlPullParser, false);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return bn.r.f5635a;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public final C3809ve a(String str, XmlPullParser xmlPullParser) {
        String strB = AbstractC3642ol.b(v(xmlPullParser));
        if (AbstractC3642ol.a(strB)) {
            return new C3809ve(strB, str);
        }
        C3605n9 c3605n9 = this.f25465c;
        if (c3605n9 == null) {
            return null;
        }
        c3605n9.b("VastParser", "Vast Tracker Error: " + str + com.ironsource.Z7.f30794r + strB);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.inmobi.media.Fl] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, java.util.ArrayList r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws com.inmobi.media.C3766tl {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(java.lang.String, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws com.inmobi.media.C3766tl {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0068 -> B:31:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0076 -> B:31:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser r7, java.lang.String r8, sn.l r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3791ul
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.ul r0 = (com.inmobi.media.C3791ul) r0
            int r1 = r0.f28291f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28291f = r1
            goto L18
        L13:
            com.inmobi.media.ul r0 = new com.inmobi.media.ul
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f28289d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28291f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            sn.l r7 = r0.f28288c
            java.lang.String r8 = r0.f28287b
            org.xmlpull.v1.XmlPullParser r9 = r0.f28286a
            kotlin.c.b(r10)
            r10 = r6
            r5 = r9
            r9 = r7
            r7 = r5
            goto L79
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.c.b(r10)
            r6.n(r7)
            r10 = r6
        L42:
            int r2 = r7.getEventType()
            if (r2 != r3) goto L49
            goto L60
        L49:
            java.lang.String r2 = r7.getName()
            if (r2 == 0) goto L63
            java.lang.String r2 = r7.getName()
            boolean r2 = tn.p.f(r2, r8)
            if (r2 == 0) goto L63
            int r2 = r7.getEventType()
            r4 = 3
            if (r2 != r4) goto L63
        L60:
            bn.r r7 = bn.r.f5635a
            return r7
        L63:
            int r2 = r7.getEventType()
            r4 = 2
            if (r2 != r4) goto L79
            r0.f28286a = r7
            r0.f28287b = r8
            r0.f28288c = r9
            r0.f28291f = r3
            java.lang.Object r2 = r9.invoke(r0)
            if (r2 != r1) goto L79
            return r1
        L79:
            r10.n(r7)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, java.lang.String, sn.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.inmobi.media.C3766tl {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.C3891yl
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.yl r0 = (com.inmobi.media.C3891yl) r0
            int r1 = r0.f28609d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28609d = r1
            goto L18
        L13:
            com.inmobi.media.yl r0 = new com.inmobi.media.yl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f28607b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28609d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$BooleanRef r6 = r0.f28606a
            kotlin.c.b(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            com.inmobi.media.zl r2 = new com.inmobi.media.zl
            r4 = 0
            r2.<init>(r5, r4, r7, r6)
            r0.f28606a = r7
            r0.f28609d = r3
            java.lang.String r3 = "VAST"
            java.lang.Object r6 = r5.a(r6, r3, r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            boolean r6 = r6.element
            if (r6 == 0) goto L56
            bn.r r6 = bn.r.f5635a
            return r6
        L56:
            com.inmobi.media.tl r6 = new com.inmobi.media.tl
            r7 = 1103(0x44f, float:1.546E-42)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String a(XmlPullParser xmlPullParser) throws XmlPullParserException, C3766tl {
        String strV = v(xmlPullParser);
        if (strV != null) {
            if (TextUtils.isEmpty(strV) ? false : new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(strV)) {
                return strV;
            }
        }
        C3605n9 c3605n9 = this.f25465c;
        if (c3605n9 != null) {
            c3605n9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new C3766tl((short) 1115);
    }

    public final void a(XmlPullParser xmlPullParser, String str, sn.a aVar) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && tn.p.f(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                aVar.invoke();
            }
            n(xmlPullParser);
        }
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String strB = AbstractC3642ol.b(v(xmlPullParser));
        if (!AbstractC3642ol.a(strB)) {
            C3605n9 c3605n9 = this.f25465c;
            if (c3605n9 != null) {
                c3605n9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || bo.d0.u0(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.f25463a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof Collection) || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (bo.a0.J((String) it.next(), attributeValue, true)) {
                    list.add(new C3813vi(strB));
                    return;
                }
            }
        }
        C3605n9 c3605n92 = this.f25465c;
        if (c3605n92 != null) {
            c3605n92.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.f25467e = true;
    }

    public final void a(final XmlPullParser xmlPullParser, final boolean z10) {
        a(xmlPullParser, VastTagName.VIDEO_CLICKS, new sn.a() { // from class: n9.f0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, z10, this);
            }
        });
    }

    public final boolean a(int i10, int i11, String str, String str2, int i12) {
        if (!AbstractC3642ol.a(str) || i10 <= 0 || i11 <= 0) {
            C3605n9 c3605n9 = this.f25465c;
            if (c3605n9 != null) {
                c3605n9.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + com.ironsource.Z7.f30794r + i10 + ", " + i11);
            }
            return false;
        }
        if (this.f25463a.getBitRate().getBitrate_mandatory() && i12 <= 0) {
            C3605n9 c3605n92 = this.f25465c;
            if (c3605n92 != null) {
                c3605n92.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i12);
            }
            return false;
        }
        if (bo.a0.J(str2, "Progressive", true)) {
            return true;
        }
        C3605n9 c3605n93 = this.f25465c;
        if (c3605n93 != null) {
            c3605n93.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
        }
        return false;
    }

    public final C3809ve b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, TypedValues.CycleType.S_WAVE_OFFSET);
        String strB = AbstractC3642ol.b(v(xmlPullParser));
        if (!AbstractC3642ol.a(strB)) {
            return null;
        }
        if (tn.p.f(attributeValue, "progress")) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(attributeValue2) || new Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").matches(attributeValue2)) {
                return new O5(strB, attributeValue2);
            }
            C3605n9 c3605n9 = this.f25465c;
            if (c3605n9 != null) {
                c3605n9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
            }
        } else {
            if (Gl.f25550a.contains(attributeValue)) {
                tn.p.h(attributeValue);
                return new C3809ve(strB, attributeValue);
            }
            C3605n9 c3605n92 = this.f25465c;
            if (c3605n92 != null) {
                c3605n92.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    public final void c(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new sn.a() { // from class: n9.k0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this);
            }
        });
    }

    public final void d(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.EXTENSION, new sn.a() { // from class: n9.j0
            @Override // sn.a
            public final Object invoke() {
                return Fl.b(xmlPullParser, this);
            }
        });
    }

    public final void e(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.EXTENSIONS, new sn.a() { // from class: n9.l0
            @Override // sn.a
            public final Object invoke() {
                return Fl.c(xmlPullParser, this);
            }
        });
    }

    public final void f(XmlPullParser xmlPullParser) {
        String strB = AbstractC3642ol.b(v(xmlPullParser));
        if (strB.length() != 0) {
            if (!AbstractC3642ol.a(strB)) {
                strB = null;
            }
            if (strB == null) {
                return;
            }
            this.f25471i.add(new C3809ve(strB, VastTagName.IMPRESSION));
            return;
        }
        C3605n9 c3605n9 = this.f25465c;
        if (c3605n9 != null) {
            c3605n9.b("VastParser", "Vast Tracker Error: " + VastTagName.IMPRESSION);
        }
    }

    public final void g(final XmlPullParser xmlPullParser) throws C3766tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.IN_LINE, new sn.a() { // from class: n9.s0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3766tl((short) 1122);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        a(xmlPullParser, VastTagName.COMPANION, new sn.a() { // from class: n9.p0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList, ref$ObjectRef, arrayList2);
            }
        });
        if (!arrayList.isEmpty()) {
            this.f25476n.add(new C3592ml(arrayList, arrayList2, this.f25475m));
        } else {
            C3605n9 c3605n9 = this.f25465c;
            if (c3605n9 != null) {
                c3605n9.b("VastParser", "VAST Companion Error: No Companion resources found");
            }
        }
    }

    public final void i(final XmlPullParser xmlPullParser) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        a(xmlPullParser, VastTagName.COMPANION_ADS, new sn.a() { // from class: n9.m0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$IntRef);
            }
        });
        if (this.f25476n.size() != 0) {
            if (this.f25467e) {
                C3605n9 c3605n9 = this.f25465c;
                if (c3605n9 != null) {
                    c3605n9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map mapA = AbstractC3491ik.a(this.f25464b.f27707a);
                mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1152);
                Wj wj2 = Wj.f26549a;
                Wj.b("VastParseEvent", mapA, EnumC3287ak.f26805a);
                return;
            }
            return;
        }
        if (this.f25467e) {
            HashMap map = new HashMap();
            map.put("[ERRORCODE]", String.valueOf(604));
            map.put("[ADSERVINGID]", this.f25469g);
            map.put("[UNIVERSALADID]", this.f25468f);
            C3617nl.a(map, this.f25471i, this.f25465c);
            Map mapA2 = AbstractC3491ik.a(this.f25464b.f27707a);
            mapA2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1150);
            Wj wj3 = Wj.f26549a;
            Wj.b("VastParseEvent", mapA2, EnumC3287ak.f26805a);
            return;
        }
        if (ref$IntRef.element > 0) {
            HashMap map2 = new HashMap();
            map2.put("[ERRORCODE]", String.valueOf(600));
            map2.put("[ADSERVINGID]", this.f25469g);
            map2.put("[UNIVERSALADID]", this.f25468f);
            C3617nl.a(map2, this.f25471i, this.f25465c);
            Map mapA3 = AbstractC3491ik.a(this.f25464b.f27707a);
            mapA3.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1151);
            Wj wj4 = Wj.f26549a;
            Wj.b("VastParseEvent", mapA3, EnumC3287ak.f26805a);
        }
    }

    public final boolean j(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.CREATIVE, new sn.a() { // from class: n9.t0
            @Override // sn.a
            public final Object invoke() {
                return Fl.b(xmlPullParser, this, ref$BooleanRef);
            }
        });
        return ref$BooleanRef.element;
    }

    public final void k(final XmlPullParser xmlPullParser) throws C3766tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.CREATIVES, new sn.a() { // from class: n9.n0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3766tl((short) 1112);
        }
        if (!ref$BooleanRef2.element) {
            throw new C3766tl((short) 1111);
        }
    }

    public final void l(final XmlPullParser xmlPullParser) throws C3766tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.LINEAR, new sn.a() { // from class: n9.h0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3766tl((short) 1116);
        }
        if (!ref$BooleanRef2.element) {
            throw new C3766tl((short) 1117);
        }
    }

    public final ArrayList m(final XmlPullParser xmlPullParser) throws C3766tl {
        final ArrayList arrayList = new ArrayList();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.MEDIA_FILES, new sn.a() { // from class: n9.g0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef2, ref$BooleanRef, arrayList);
            }
        });
        if (!ref$BooleanRef2.element) {
            throw new C3766tl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new C3766tl((short) 1119);
        }
        if (ref$BooleanRef.element) {
            Map mapA = AbstractC3491ik.a(this.f25464b.f27707a);
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1153);
            Wj wj2 = Wj.f26549a;
            Wj.b("VastParseEvent", mapA, EnumC3287ak.f26805a);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            C3605n9 c3605n9 = this.f25465c;
            if (c3605n9 == null) {
                return -1;
            }
            c3605n9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            C3605n9 c3605n92 = this.f25465c;
            if (c3605n92 == null) {
                return -1;
            }
            c3605n92.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, VastTagName.TRACKING_EVENTS, new sn.a() { // from class: n9.u0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(final XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        if (attributeValue == null) {
            C3605n9 c3605n9 = this.f25465c;
            if (c3605n9 != null) {
                c3605n9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, VastTagName.VERIFICATION, new sn.a() { // from class: n9.o0
            @Override // sn.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$ObjectRef, ref$ObjectRef2, arrayList);
            }
        });
        if (!ref$BooleanRef.element) {
            HashMap map = new HashMap();
            map.put("[REASON]", String.valueOf(2));
            map.put("[ADSERVINGID]", this.f25469g);
            map.put("[UNIVERSALADID]", this.f25468f);
            C3617nl.a(map, arrayList, this.f25465c);
            return;
        }
        if (!AbstractC3642ol.a((String) ref$ObjectRef.element)) {
            HashMap map2 = new HashMap();
            map2.put("[REASON]", String.valueOf(3));
            map2.put("[ADSERVINGID]", this.f25469g);
            map2.put("[UNIVERSALADID]", this.f25468f);
            C3617nl.a(map2, arrayList, this.f25465c);
            return;
        }
        this.f25471i.add(new C3910zf(attributeValue, (String) ref$ObjectRef2.element, (String) ref$ObjectRef.element));
        C3605n9 c3605n92 = this.f25465c;
        if (c3605n92 != null) {
            c3605n92.a("VastParser", "OMID ADVerification URL : " + ref$ObjectRef.element);
        }
    }

    public final void q(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.COMPANION, new sn.a() { // from class: n9.r0
            @Override // sn.a
            public final Object invoke() {
                return Fl.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.COMPANION_ADS, new sn.a() { // from class: n9.v0
            @Override // sn.a
            public final Object invoke() {
                return Fl.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.CREATIVE, new sn.a() { // from class: n9.q0
            @Override // sn.a
            public final Object invoke() {
                return Fl.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.CREATIVES, new sn.a() { // from class: n9.i0
            @Override // sn.a
            public final Object invoke() {
                return Fl.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.LINEAR, new sn.a() { // from class: n9.e0
            @Override // sn.a
            public final Object invoke() {
                return Fl.h(xmlPullParser, this);
            }
        });
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int iN = n(xmlPullParser);
        if ((iN == 4 || iN == 5) && (text = xmlPullParser.getText()) != null && F3.a(text)) {
            return text;
        }
        return null;
    }
}
