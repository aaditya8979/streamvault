package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class M1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static B1 f65553d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A1 f65555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BinderC5274z1 f65556c;

    public M1(@NotNull Context context, @NotNull A1 a12) {
        this.f65554a = context;
        this.f65555b = a12;
    }

    public final int a(@NotNull Intent intent, int i10, int i11) {
        B1 b12 = f65553d;
        if (b12 == null) {
            return 2;
        }
        ((C5148u0) ((C1) b12).f65079c).f67757a.stopSelf(i11);
        return 2;
    }

    @NotNull
    public final IBinder a(@NotNull Intent intent) {
        B1 b12 = f65553d;
        if (b12 != null) {
            ((C1) b12).a(intent);
        }
        String action = intent.getAction();
        if (action != null && bo.a0.W(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, null)) {
            return new Do();
        }
        BinderC5274z1 binderC5274z1 = this.f65556c;
        if (binderC5274z1 != null) {
            return binderC5274z1;
        }
        tn.p.C("coreBinder");
        return null;
    }

    public final void a(@NotNull Intent intent, int i10) {
        B1 b12 = f65553d;
        if (b12 != null) {
            ((C5148u0) ((C1) b12).f65079c).f67757a.stopSelf(i10);
        }
    }

    public final void a(@NotNull Configuration configuration) {
        if (f65553d != null) {
            C5009oa.I.v().a(configuration);
        }
    }

    public final void b() {
        C5009oa.a(this.f65554a);
        PublicLogger.INSTANCE.init(this.f65554a);
        Context context = this.f65554a;
        A1 a12 = this.f65555b;
        if (f65553d == null) {
            C1 c12 = new C1(context, a12, new C4748e5(context));
            C4789fk c4789fk = C5009oa.I.f67439v;
            F1 f12 = new F1(c12);
            LinkedHashMap linkedHashMap = c4789fk.f66794a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(f12);
            f65553d = c12;
        }
        B1 b12 = f65553d;
        if (b12 != null) {
            this.f65556c = new BinderC5274z1(b12);
            C5009oa c5009oa = C5009oa.I;
            c5009oa.f67423f = new C4993nj(c5009oa.f67418a, new C5018oj(b12));
            ((C1) b12).onCreate();
        }
    }

    public final void b(@NotNull Intent intent) {
        B1 b12 = f65553d;
        if (b12 != null) {
            ((C1) b12).c(intent);
        }
    }

    public final void c() {
        B1 b12 = f65553d;
        if (b12 != null) {
            ((C1) b12).onDestroy();
        }
    }

    public final boolean c(@NotNull Intent intent) {
        B1 b12 = f65553d;
        if (b12 != null) {
            ((C1) b12).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !bo.a0.W(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, null)) && intent.getData() == null;
    }

    @VisibleForTesting
    public final void d() {
        f65553d = null;
    }
}
