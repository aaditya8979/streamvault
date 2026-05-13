package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C4723d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4671b5 f66570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4697c5 f66571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Context f66572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R4 f66573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5028p4 f66574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final W4 f66575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final C4817gm f66576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4863ih f66577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final I8 f66578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f66579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Gb f66580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC5132t9 f66581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f66582m;

    public C4723d5(Context context, R4 r42, C5028p4 c5028p4, W4 w42, C4817gm c4817gm, InterfaceC4863ih interfaceC4863ih, ICommonExecutor iCommonExecutor, int i10, Gb gb2, InterfaceC5132t9 interfaceC5132t9) {
        this(context, r42, c5028p4, w42, c4817gm, interfaceC4863ih, iCommonExecutor, new I8(), i10, new C4671b5(c5028p4.f67490a), new C4697c5(context, r42), gb2, interfaceC5132t9);
    }

    public C4723d5(Context context, R4 r42, C5028p4 c5028p4, W4 w42, C4817gm c4817gm, InterfaceC4863ih interfaceC4863ih, ICommonExecutor iCommonExecutor, I8 i82, int i10, C4671b5 c4671b5, C4697c5 c4697c5, Gb gb2, InterfaceC5132t9 interfaceC5132t9) {
        this.f66572c = context;
        this.f66573d = r42;
        this.f66574e = c5028p4;
        this.f66575f = w42;
        this.f66576g = c4817gm;
        this.f66577h = interfaceC4863ih;
        this.f66579j = iCommonExecutor;
        this.f66578i = i82;
        this.f66582m = i10;
        this.f66570a = c4671b5;
        this.f66571b = c4697c5;
        this.f66580k = gb2;
        this.f66581l = interfaceC5132t9;
    }

    public static Sk a(Y4 y42, yo yoVar, X4 x42) {
        Rk rk2 = new Rk(yoVar);
        return new Sk(y42, rk2, x42, new C4857ia(y42, rk2, new Vk(y42.h(), "foreground"), AbstractC5249y1.a(), new SystemTimeProvider()), new A2(y42, rk2, new Vk(y42.h(), A2.f64965g), AbstractC5249y1.a(), new SystemTimeProvider()));
    }

    public static C5166ui a(Y4 y42, Y8 y82) {
        return new C5166ui(y82, y42);
    }

    public static T4 b() {
        return new T4();
    }

    public static Y8 c(Y4 y42) {
        return new Y8(y42);
    }

    public final N8 a() {
        Context context = this.f66572c;
        R4 r42 = this.f66573d;
        return new N8(new S8(context, r42), this.f66582m);
    }

    public final Rg a(Y4 y42) {
        return new Rg(new C4889jh(y42, this.f66577h, new D3()), this.f66576g, new C4812gh(this.f66574e));
    }

    public final C4933l9 a(Xe xe2, yo yoVar, Sk sk2, M6 m62, C4872j0 c4872j0, Kk kk2, C5216wi c5216wi) {
        return new C4933l9(xe2, yoVar, sk2, m62, c4872j0, this.f66578i, kk2, this.f66582m, new C4645a5(c5216wi), new SystemTimeProvider());
    }

    public final C5051q2 a(Xe xe2) {
        return new C5051q2(this.f66573d, xe2);
    }

    public InterfaceC5082r9 a(InterfaceC5207w9 interfaceC5207w9, M6 m62, Rg rg2, C5028p4 c5028p4, R4 r42, Xe xe2) {
        return this.f66581l.a(interfaceC5207w9, m62, rg2, c5028p4, r42, xe2).a();
    }

    public final M6 b(Y4 y42) {
        return new M6(y42, C5009oa.I.B().c(this.f66572c, this.f66573d), new I6(y42.c()), new C4802g7());
    }

    public final C4977n3 b(Xe xe2) {
        Context context = this.f66572c;
        return new C4977n3(context, xe2, context.getPackageName(), new SafePackageManager());
    }

    public final Kk c() {
        return new Kk(this.f66572c, this.f66573d);
    }

    public final C4671b5 d() {
        return this.f66570a;
    }

    public final C5216wi d(Y4 y42) {
        C5216wi c5216wi = new C5216wi(y42, this.f66575f.a(), this.f66579j);
        Gb gb2 = this.f66580k;
        synchronized (gb2) {
            gb2.f65279c.add(c5216wi);
        }
        return c5216wi;
    }

    public final C4697c5 e() {
        return this.f66571b;
    }

    public final yo f() {
        yo yoVar;
        Co c4702ca;
        Bo boD = C5009oa.I.D();
        R4 r42 = this.f66573d;
        synchronized (boD) {
            String strValueOf = String.valueOf(r42);
            LinkedHashMap linkedHashMap = boD.f65060b;
            Object yoVar2 = linkedHashMap.get(strValueOf);
            if (yoVar2 == null) {
                Xe xe2 = new Xe(C5009oa.I.B().b(boD.f65059a, r42));
                if (r42.d()) {
                    String str = "appmetrica_vital_" + r42.f65832b + ".dat";
                    c4702ca = new C4826h5(cn.w.p(bn.h.a(str, new C4702ca(boD.f65059a, str)), bn.h.a("appmetrica_vital_main.dat", new C4702ca(boD.f65059a, "appmetrica_vital_main.dat"))));
                } else {
                    c4702ca = new C4702ca(boD.f65059a, "appmetrica_vital_" + r42.f65832b + ".dat");
                }
                yoVar2 = new yo(xe2, c4702ca, strValueOf);
                linkedHashMap.put(strValueOf, yoVar2);
            }
            yoVar = (yo) yoVar2;
        }
        return yoVar;
    }
}
