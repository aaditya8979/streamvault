package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gf f65273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa f65274b;

    public G2(Gf gf2, Fa fa2) {
        this.f65273a = gf2;
        this.f65274b = fa2;
    }

    public final Fa a() {
        return this.f65274b;
    }

    public final boolean a(@NonNull Q5 q52, @NonNull F2 f22) {
        Iterator it = ((W8) this.f65273a.a(q52.f65791d)).f66094a.iterator();
        while (it.hasNext()) {
            if (f22.a(it.next(), q52)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 5)
    public final Gf b() {
        return this.f65273a;
    }
}
