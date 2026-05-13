package io.bidmachine.rendering.internal.state;

import io.bidmachine.rendering.internal.h;
import io.bidmachine.rendering.internal.state.a;
import p000do.j2;
import p000do.l0;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements l0, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f70581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlin.coroutines.d f70582b;

    public b(a aVar, h hVar) {
        p.k(aVar, "adState");
        p.k(hVar, "coroutineDispatchers");
        this.f70581a = aVar;
        this.f70582b = j2.b(null, 1, null).plus(hVar.e());
        if (aVar.h()) {
            kotlinx.coroutines.d.e(this, null, 1, null);
        } else {
            aVar.a(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a.b
    public void a(a aVar, a.EnumC0839a enumC0839a) {
        p.k(aVar, "source");
        p.k(enumC0839a, "event");
        if (enumC0839a == a.EnumC0839a.Destroyed && p.f(this.f70581a, aVar)) {
            kotlinx.coroutines.d.e(this, null, 1, null);
            aVar.b(this);
        }
    }

    @Override // p000do.l0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f70582b;
    }
}
