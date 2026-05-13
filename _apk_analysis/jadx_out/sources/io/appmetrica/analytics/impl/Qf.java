package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f65813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f65814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f65815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f65816d;

    static {
        HashMap map = new HashMap();
        Wk wk2 = Wk.FOREGROUND;
        map.put(wk2, 0);
        Wk wk3 = Wk.BACKGROUND;
        map.put(wk3, 1);
        f65813a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, wk2);
        sparseArray.put(1, wk3);
        f65814b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_INIT;
        map2.put(enumC4703cb, 1);
        EnumC4703cb enumC4703cb2 = EnumC4703cb.EVENT_TYPE_REGULAR;
        map2.put(enumC4703cb2, 4);
        EnumC4703cb enumC4703cb3 = EnumC4703cb.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC4703cb3, 5);
        EnumC4703cb enumC4703cb4 = EnumC4703cb.EVENT_TYPE_ALIVE;
        map2.put(enumC4703cb4, 7);
        EnumC4703cb enumC4703cb5 = EnumC4703cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC4703cb5, 26);
        EnumC4703cb enumC4703cb6 = EnumC4703cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC4703cb6, 26);
        EnumC4703cb enumC4703cb7 = EnumC4703cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC4703cb7, 26);
        EnumC4703cb enumC4703cb8 = EnumC4703cb.EVENT_TYPE_ANR;
        map2.put(enumC4703cb8, 25);
        EnumC4703cb enumC4703cb9 = EnumC4703cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4703cb9, 26);
        EnumC4703cb enumC4703cb10 = EnumC4703cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4703cb10, 26);
        EnumC4703cb enumC4703cb11 = EnumC4703cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC4703cb11, 27);
        EnumC4703cb enumC4703cb12 = EnumC4703cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC4703cb12, 27);
        EnumC4703cb enumC4703cb13 = EnumC4703cb.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC4703cb13, 13);
        EnumC4703cb enumC4703cb14 = EnumC4703cb.EVENT_TYPE_START;
        map2.put(enumC4703cb14, 2);
        EnumC4703cb enumC4703cb15 = EnumC4703cb.EVENT_TYPE_APP_OPEN;
        map2.put(enumC4703cb15, 16);
        EnumC4703cb enumC4703cb16 = EnumC4703cb.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC4703cb16, 17);
        EnumC4703cb enumC4703cb17 = EnumC4703cb.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC4703cb17, 18);
        EnumC4703cb enumC4703cb18 = EnumC4703cb.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC4703cb18, 19);
        EnumC4703cb enumC4703cb19 = EnumC4703cb.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC4703cb19, 20);
        EnumC4703cb enumC4703cb20 = EnumC4703cb.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC4703cb20, 21);
        EnumC4703cb enumC4703cb21 = EnumC4703cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC4703cb21, 40);
        EnumC4703cb enumC4703cb22 = EnumC4703cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC4703cb22, 35);
        map2.put(EnumC4703cb.EVENT_TYPE_CLEANUP, 29);
        EnumC4703cb enumC4703cb23 = EnumC4703cb.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC4703cb23, 38);
        EnumC4703cb enumC4703cb24 = EnumC4703cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC4703cb24, 42);
        f65815c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C5231x8 c5231x8 = new C5231x8();
        D8 d82 = new D8(new I8());
        C5256y8 c5256y8 = new C5256y8();
        C4721d3 c4721d3 = new C4721d3(new I8());
        Qn qn2 = new Qn(new I8());
        Mf mf2 = new Mf();
        U8 u8A = V8.a();
        u8A.f65983b = mf2;
        u8A.f65984c = mf2;
        V8 v82 = new V8(u8A);
        U8 u8A2 = V8.a();
        u8A2.f65983b = d82;
        V8 v83 = new V8(u8A2);
        U8 u8A3 = V8.a();
        u8A3.f65983b = c4721d3;
        V8 v84 = new V8(u8A3);
        U8 u8A4 = V8.a();
        u8A4.f65983b = qn2;
        V8 v85 = new V8(u8A4);
        U8 u8A5 = V8.a();
        u8A5.f65982a = c5231x8;
        V8 v86 = new V8(u8A5);
        U8 u8A6 = V8.a();
        u8A6.f65983b = new vo(new D8());
        V8 v87 = new V8(u8A6);
        map3.put(enumC4703cb2, v83);
        U8 u8A7 = V8.a();
        u8A7.f65983b = new Of();
        map3.put(enumC4703cb3, new V8(u8A7));
        U8 u8A8 = V8.a();
        u8A8.f65982a = c5231x8;
        u8A8.f65983b = c5256y8;
        u8A8.f65986e = new X7();
        u8A8.f65987f = new Y7();
        map3.put(enumC4703cb4, new V8(u8A8));
        map3.put(enumC4703cb9, v82);
        map3.put(enumC4703cb10, v82);
        map3.put(enumC4703cb11, v84);
        map3.put(enumC4703cb12, v84);
        map3.put(enumC4703cb5, v84);
        map3.put(enumC4703cb6, v84);
        map3.put(enumC4703cb7, v84);
        map3.put(enumC4703cb8, v84);
        U8 u8A9 = V8.a();
        u8A9.f65982a = new C5231x8();
        u8A9.f65983b = c4721d3;
        map3.put(enumC4703cb14, new V8(u8A9));
        EnumC4703cb enumC4703cb25 = EnumC4703cb.EVENT_TYPE_CUSTOM_EVENT;
        U8 u8A10 = V8.a();
        u8A10.f65985d = new Pf();
        map3.put(enumC4703cb25, new V8(u8A10));
        map3.put(enumC4703cb15, v83);
        map3.put(enumC4703cb17, v86);
        map3.put(enumC4703cb18, v86);
        map3.put(enumC4703cb19, v84);
        map3.put(enumC4703cb20, v84);
        map3.put(enumC4703cb21, v84);
        map3.put(enumC4703cb22, v85);
        map3.put(enumC4703cb, v87);
        map3.put(enumC4703cb16, v87);
        map3.put(enumC4703cb13, v83);
        map3.put(enumC4703cb23, v83);
        map3.put(enumC4703cb24, v84);
        f65816d = Collections.unmodifiableMap(map3);
    }

    public static C4881j9 a(Long l10, Long l11, Boolean bool) {
        C4881j9 c4881j9 = new C4881j9();
        if (l10 != null) {
            c4881j9.f67024a = l10.longValue();
            c4881j9.f67025b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l10.longValue() * 1000) / 1000;
        }
        if (l11 != null) {
            c4881j9.f67026c = l11.longValue();
        }
        if (bool != null) {
            c4881j9.f67027d = bool.booleanValue();
        }
        return c4881j9;
    }

    public static void a(C4830h9 c4830h9) {
        C4778f9[] c4778f9Arr = c4830h9.f66914c;
        if (c4778f9Arr != null) {
            for (C4778f9 c4778f9 : c4778f9Arr) {
            }
        }
    }
}
