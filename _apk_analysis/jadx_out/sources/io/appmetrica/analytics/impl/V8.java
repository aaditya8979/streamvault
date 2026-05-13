package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class V8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f66025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final V8 f66026i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5261yd f66027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo f66028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5281z8 f66029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5157u9 f66030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Wb f66031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vd f66032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O9 f66033g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC4753ea.FIRST_OCCURRENCE, 1);
        map.put(EnumC4753ea.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC4753ea.UNKNOWN, -1);
        f66025h = Collections.unmodifiableMap(map);
        f66026i = new V8(new Si(), new C4663an(), new C4732de(), new Ri(), new C4908ka(), new C4934la(), new C4882ja());
    }

    public V8(U8 u82) {
        this(u82.f65982a, u82.f65983b, u82.f65984c, u82.f65985d, u82.f65986e, u82.f65987f, u82.f65988g);
    }

    public V8(InterfaceC5261yd interfaceC5261yd, uo uoVar, InterfaceC5281z8 interfaceC5281z8, InterfaceC5157u9 interfaceC5157u9, Wb wb2, Vd vd2, O9 o92) {
        this.f66027a = interfaceC5261yd;
        this.f66028b = uoVar;
        this.f66029c = interfaceC5281z8;
        this.f66030d = interfaceC5157u9;
        this.f66031e = wb2;
        this.f66032f = vd2;
        this.f66033g = o92;
    }

    public static U8 a() {
        return new U8(f66026i);
    }

    public final C4778f9 a(O8 o82, C4941lh c4941lh) {
        C4778f9 c4778f9 = new C4778f9();
        C4752e9 c4752e9A = this.f66032f.a(o82.f65699l, o82.f65700m);
        C4649a9 c4649a9A = this.f66031e.a(o82.f65694g);
        if (c4752e9A != null) {
            c4778f9.f66755g = c4752e9A;
        }
        if (c4649a9A != null) {
            c4778f9.f66754f = c4649a9A;
        }
        String strA = this.f66027a.a(o82.f65688a);
        if (strA != null) {
            c4778f9.f66752d = strA;
        }
        c4778f9.f66753e = this.f66028b.a(o82, c4941lh);
        String str = o82.f65697j;
        if (str != null) {
            c4778f9.f66756h = str;
        }
        Integer numA = this.f66030d.a(o82);
        if (numA != null) {
            c4778f9.f66751c = numA.intValue();
        }
        Long l10 = o82.f65690c;
        if (l10 != null) {
            c4778f9.f66749a = l10.longValue();
        }
        Long l11 = o82.f65691d;
        if (l11 != null) {
            c4778f9.f66762n = l11.longValue();
        }
        Long l12 = o82.f65692e;
        if (l12 != null) {
            c4778f9.f66763o = l12.longValue();
        }
        Long l13 = o82.f65693f;
        if (l13 != null) {
            c4778f9.f66750b = l13.longValue();
        }
        Integer num = o82.f65698k;
        if (num != null) {
            c4778f9.f66757i = num.intValue();
        }
        c4778f9.f66758j = this.f66029c.a(o82.f65702o);
        C4879j7 c4879j7 = o82.f65694g;
        c4778f9.f66759k = c4879j7 != null ? new C4853i6().a(c4879j7.f67010a) : -1;
        String str2 = o82.f65701n;
        if (str2 != null) {
            c4778f9.f66760l = str2.getBytes();
        }
        EnumC4753ea enumC4753ea = o82.f65703p;
        Integer num2 = enumC4753ea != null ? (Integer) f66025h.get(enumC4753ea) : null;
        if (num2 != null) {
            c4778f9.f66761m = num2.intValue();
        }
        EnumC4983n9 enumC4983n9 = o82.f65704q;
        if (enumC4983n9 != null) {
            int iOrdinal = enumC4983n9.ordinal();
            if (iOrdinal == 0) {
                c4778f9.f66764p = 0;
            } else if (iOrdinal == 1) {
                c4778f9.f66764p = 1;
            } else if (iOrdinal == 2) {
                c4778f9.f66764p = 2;
            }
        }
        Boolean bool = o82.f65705r;
        if (bool != null) {
            c4778f9.f66765q = bool.booleanValue();
        }
        if (o82.f65706s != null) {
            c4778f9.f66766r = r6.intValue();
        }
        c4778f9.f66767s = ((C4882ja) this.f66033g).a(o82.f65707t);
        return c4778f9;
    }
}
