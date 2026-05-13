package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4670b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f66416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4748e5 f66417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f66418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5059qa f66419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f66420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4876j4 f66421f;

    public C4670b4(Context context, C4748e5 c4748e5) {
        this(context, c4748e5, new C4876j4());
    }

    public C4670b4(Context context, C4748e5 c4748e5, C4876j4 c4876j4) {
        this.f66416a = new Object();
        this.f66418c = new HashMap();
        this.f66419d = new C5059qa();
        this.f66420e = context.getApplicationContext();
        this.f66417b = c4748e5;
        this.f66421f = c4876j4;
    }

    public final InterfaceC4799g4 a(Q3 q32, C5053q4 c5053q4) {
        InterfaceC4799g4 interfaceC4799g4A;
        synchronized (this.f66416a) {
            interfaceC4799g4A = (InterfaceC4799g4) this.f66418c.get(q32);
            if (interfaceC4799g4A == null) {
                this.f66421f.getClass();
                interfaceC4799g4A = C4876j4.a(q32).a(this.f66420e, this.f66417b, q32, c5053q4);
                this.f66418c.put(q32, interfaceC4799g4A);
                this.f66419d.a(new C4644a4(q32.f65784b, q32.f65785c, q32.f65786d), q32);
            }
        }
        return interfaceC4799g4A;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f66416a) {
            C5059qa c5059qa = this.f66419d;
            Collection collection = (Collection) c5059qa.f67572a.remove(new C4644a4(str, num, str2));
            if (!mo.a(collection)) {
                collection.size();
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC4799g4) this.f66418c.remove((Q3) it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC4799g4) it2.next()).a();
                }
            }
        }
    }
}
