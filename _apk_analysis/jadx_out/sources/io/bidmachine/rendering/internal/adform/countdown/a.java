package io.bidmachine.rendering.internal.adform.countdown;

import android.content.Context;
import android.view.View;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.internal.view.b;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.utils.Utils;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f70045r;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.countdown.a$a, reason: collision with other inner class name */
    public final class C0815a implements b.d {
        public C0815a() {
        }

        @Override // io.bidmachine.rendering.internal.view.b.d
        public void a() {
            a.this.q().a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, io.bidmachine.rendering.internal.event.b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar, "repository");
        p.k(adElementParams, "adElementParams");
        p.k(cVar, "adFormListener");
        p.k(bVar, "eventCallback");
        b bVar2 = new b(context);
        bVar2.setListener(new C0815a());
        this.f70045r = bVar2;
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.x
    public void a(String str) {
        if (Utils.toIntOrNull(str) == null) {
            o.a("Can't obtain time to start", new Object[0]);
        } else {
            this.f70045r.setDuration(r4.intValue());
            this.f70045r.f();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        t().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void d() {
        this.f70045r.e();
        super.d();
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void f() {
        super.f();
        this.f70045r.g();
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f70045r;
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void z() {
        this.f70045r.b();
    }
}
