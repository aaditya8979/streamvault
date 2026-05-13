package p000do;

import bn.r;
import hn.c;
import jo.a;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends g2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c<r> f59909e;

    public x1(@NotNull d dVar, @NotNull p<? super l0, ? super c<? super r>, ? extends Object> pVar) {
        super(dVar, false);
        this.f59909e = IntrinsicsKt__IntrinsicsJvmKt.b(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void P0() throws Throwable {
        a.b(this.f59909e, this);
    }
}
