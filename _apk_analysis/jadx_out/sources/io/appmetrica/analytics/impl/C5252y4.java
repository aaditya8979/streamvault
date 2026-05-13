package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5252y4 implements Fa, Rl, Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f68011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f68012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bm f68013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ah f68014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F4 f68015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4972mn f68016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f68017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S4 f68018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4965mg f68019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U3 f68020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5089rg f68021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f68022l;

    public C5252y4(Context context, Il il2, R4 r42, C5053q4 c5053q4, Ah ah2, C4965mg c4965mg, S4 s42, A4 a42, C5089rg c5089rg) {
        this.f68017g = new ArrayList();
        this.f68022l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f68011a = applicationContext;
        this.f68012b = r42;
        this.f68014d = ah2;
        this.f68018h = s42;
        this.f68015e = A4.a(this);
        b(c5053q4);
        Bm bmA = il2.a(applicationContext, r42, c5053q4.f67559a);
        this.f68013c = bmA;
        this.f68020j = V3.a(bmA, C5009oa.k().c());
        this.f68016f = a42.a(this, bmA);
        this.f68019i = c4965mg;
        this.f68021k = c5089rg;
        il2.a(r42, this);
    }

    public C5252y4(@NonNull Context context, @NonNull Il il2, @NonNull R4 r42, @NonNull C5053q4 c5053q4, @NonNull C4965mg c4965mg) {
        this(context, il2, r42, c5053q4, new Ah(c5053q4.f67560b), c4965mg, new S4(), new A4(), new C5089rg());
    }

    public static void b(C5053q4 c5053q4) {
        C5009oa.I.c().b(!Boolean.FALSE.equals(c5053q4.f67560b.f67503n));
    }

    @NonNull
    public final U3 a() {
        return this.f68020j;
    }

    public final void a(@Nullable ResultReceiver resultReceiver) {
        this.f68021k.a(new C5227x4(resultReceiver));
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(@NonNull Kl kl2, @Nullable C4817gm c4817gm) {
        synchronized (this.f68022l) {
            for (Ya ya2 : this.f68017g) {
                C6.a(ya2.f66255a, kl2, this.f68020j.a(ya2.f66257c));
            }
            this.f68017g.clear();
        }
    }

    public final void a(@NonNull Q5 q52, @NonNull C5177v4 c5177v4) {
        F4 f42 = this.f68015e;
        f42.getClass();
        f42.a(q52, new E4(c5177v4));
    }

    public final void a(@Nullable Ya ya2) {
        ResultReceiver resultReceiver;
        HashMap map = new HashMap();
        List<String> list = null;
        if (ya2 != null) {
            list = ya2.f66256b;
            resultReceiver = ya2.f66255a;
            map = ya2.f66257c;
        } else {
            resultReceiver = null;
        }
        boolean zA = this.f68013c.a(list, map);
        if (!zA) {
            C6.a(resultReceiver, this.f68020j.a(map));
        }
        if (!this.f68013c.g()) {
            if (zA) {
                C6.a(resultReceiver, this.f68020j.a(map));
                return;
            }
            return;
        }
        synchronized (this.f68022l) {
            if (zA && ya2 != null) {
                this.f68017g.add(ya2);
            }
        }
        this.f68016f.c();
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(@NonNull C4817gm c4817gm) {
        synchronized (this.f68022l) {
            for (C5177v4 c5177v4 : this.f68018h.f65864a) {
                C6.a(c5177v4.f67806c, this.f68020j.a(Gm.a(c4817gm.f66857l)));
            }
            ArrayList arrayList = new ArrayList();
            for (Ya ya2 : this.f68017g) {
                if (AbstractC4740dm.a(c4817gm, ya2.f66256b, ya2.f66257c, new Wa())) {
                    C6.a(ya2.f66255a, this.f68020j.a(ya2.f66257c));
                } else {
                    arrayList.add(ya2);
                }
            }
            this.f68017g = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f68016f.c();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(@NonNull C5028p4 c5028p4) {
        Ah ah2 = this.f68014d;
        ah2.f64979a = ah2.f64979a.mergeFrom(c5028p4);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(@NonNull C5053q4 c5053q4) {
        this.f68013c.a(c5053q4.f67559a);
        a(c5053q4.f67560b);
    }

    public final synchronized void a(@NonNull C5177v4 c5177v4) {
        this.f68018h.f65864a.add(c5177v4);
        C6.a(c5177v4.f67806c, this.f68020j.a(Gm.a(this.f68013c.e().f66857l)));
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final R4 b() {
        return this.f68012b;
    }

    public final synchronized void b(@NonNull C5177v4 c5177v4) {
        this.f68018h.f65864a.remove(c5177v4);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final C5028p4 d() {
        return this.f68014d.f64979a;
    }

    @NonNull
    public final C4965mg e() {
        return this.f68019i;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Context getContext() {
        return this.f68011a;
    }
}
