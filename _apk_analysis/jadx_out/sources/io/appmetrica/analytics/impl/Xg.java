package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Xg extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f66176b;

    public Xg(@NonNull Y4 y42) {
        this(y42, y42.u());
    }

    public Xg(Y4 y42, yo yoVar) {
        super(y42);
        this.f66176b = yoVar;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        Y4 y42 = this.f65880a;
        if (this.f66176b.c()) {
            return false;
        }
        if (!this.f66176b.d()) {
            C4933l9 c4933l9 = y42.f66227n;
            c4933l9.f67197c.b(Q5.a(q52, EnumC4703cb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        yo yoVar = this.f66176b;
        synchronized (yoVar) {
            zo zoVar = yoVar.f68052a;
            zoVar.a(zoVar.a().put("first_event_done", true));
        }
        return false;
    }
}
