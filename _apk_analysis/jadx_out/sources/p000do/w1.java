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
public final class w1<T> extends q0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c<r> f59902e;

    public w1(@NotNull d dVar, @NotNull p<? super l0, ? super c<? super T>, ? extends Object> pVar) {
        super(dVar, false);
        this.f59902e = IntrinsicsKt__IntrinsicsJvmKt.b(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void P0() throws Throwable {
        a.b(this.f59902e, this);
    }
}
