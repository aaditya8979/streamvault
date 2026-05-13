package io.ktor.client.content;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gl.f;
import gl.m;
import io.ktor.client.utils.ByteChannelUtilsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import jl.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.m1;
import tn.p;
import wk.a;

/* JADX INFO: compiled from: ObservableContent.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ObservableContent extends c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f71068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f71069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f71070c;

    public ObservableContent(@NotNull c cVar, @NotNull d dVar, @NotNull a aVar) {
        p.k(cVar, "delegate");
        p.k(dVar, "callContext");
        p.k(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f71068a = cVar;
        this.f71069b = dVar;
        this.f71070c = aVar;
    }

    @Override // jl.c
    @Nullable
    public Long a() {
        return this.f71068a.a();
    }

    @Override // jl.c
    @Nullable
    public f b() {
        return this.f71068a.b();
    }

    @Override // jl.c
    @NotNull
    public m c() {
        return this.f71068a.c();
    }

    @Override // jl.c.d
    @NotNull
    public io.ktor.utils.io.a d() {
        return ByteChannelUtilsKt.a(e(this.f71068a), this.f71069b, a(), this.f71070c);
    }

    public final io.ktor.utils.io.a e(c cVar) {
        if (cVar instanceof c.b) {
            return e(((c.b) cVar).d());
        }
        if (cVar instanceof c.a) {
            return sl.a.c(((c.a) cVar).d(), 0, 0, 6, null);
        }
        if (cVar instanceof c.AbstractC0854c) {
            return io.ktor.utils.io.a.f71266a.a();
        }
        if (cVar instanceof c.d) {
            return ((c.d) cVar).d();
        }
        if (cVar instanceof c.e) {
            return ByteWriteChannelOperationsKt.h(m1.f59865b, this.f71069b, true, new ObservableContent$getContent$1(cVar, null)).b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
