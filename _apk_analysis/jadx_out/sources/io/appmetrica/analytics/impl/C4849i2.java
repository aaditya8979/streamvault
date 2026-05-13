package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4849i2 extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f66951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Yj f66952c;

    public C4849i2(@NonNull Y4 y42) {
        this(y42, y42.u(), Yj.c());
    }

    public C4849i2(Y4 y42, yo yoVar, Yj yj2) {
        super(y42);
        this.f66951b = yoVar;
        this.f66952c = yj2;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        Y4 y42 = this.f65880a;
        if (!this.f66951b.c() && !this.f66951b.d()) {
            if (((C4941lh) y42.f66224k.a()).f67216e) {
                this.f66952c.b();
            }
            N8 n82 = this.f65880a.f66225l;
            if (n82.f65631c == null) {
                n82.a();
            }
            P8 p82 = n82.f65631c;
            p82.getClass();
            p82.f65742b = new HashSet();
            p82.f65744d = 0;
            P8 p83 = n82.f65631c;
            p83.f65741a = true;
            S8 s82 = n82.f65630b;
            IBinaryDataHelper iBinaryDataHelper = s82.f65872c;
            R8 r82 = s82.f65871b;
            s82.f65870a.getClass();
            iBinaryDataHelper.insert("event_hashes", r82.toByteArray(Q8.a(p83)));
        }
        return false;
    }
}
