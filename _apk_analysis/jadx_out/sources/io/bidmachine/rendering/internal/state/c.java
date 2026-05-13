package io.bidmachine.rendering.internal.state;

import bn.g;
import io.bidmachine.rendering.internal.h;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h f70583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g f70584o;

    public static final class a extends Lambda implements sn.a {
        public a() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            c cVar = c.this;
            return new b(cVar, cVar.n());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, h hVar) {
        super(str);
        p.k(str, "parent");
        p.k(hVar, "coroutineDispatchers");
        this.f70583n = hVar;
        this.f70584o = kotlin.b.a(LazyThreadSafetyMode.PUBLICATION, new a());
    }

    public final h n() {
        return this.f70583n;
    }

    public final b o() {
        return (b) this.f70584o.getValue();
    }
}
