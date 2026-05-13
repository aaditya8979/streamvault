package io.ktor.utils.io;

import bn.r;
import hn.c;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.y0;
import sl.f;
import sl.g;
import sl.i;
import sl.s;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ByteWriteChannelOperations.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ByteWriteChannelOperationsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f71257a = new a();

    /* JADX INFO: compiled from: ByteWriteChannelOperations.kt */
    public static final class a implements c<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f71258b = EmptyCoroutineContext.INSTANCE;

        @Override // hn.c
        public d getContext() {
            return this.f71258b;
        }

        @Override // hn.c
        public void resumeWith(Object obj) {
        }
    }

    public static final void b(@NotNull f fVar, @Nullable Throwable th2) {
        p.k(fVar, "<this>");
        if (th2 == null) {
            c(new ByteWriteChannelOperationsKt$close$1(fVar));
        } else {
            fVar.a(th2);
        }
    }

    public static final <R> void c(@NotNull l<? super c<? super R>, ? extends Object> lVar) {
        p.k(lVar, "<this>");
        jo.a.c(lVar, f71257a);
    }

    @NotNull
    public static final y0 d(@NotNull i iVar, @NotNull l<? super Throwable, r> lVar) {
        p.k(iVar, "<this>");
        p.k(lVar, "block");
        return iVar.a().f(lVar);
    }

    @Nullable
    public static final Object e(@NotNull f fVar, byte b10, @NotNull c<? super r> cVar) {
        fVar.e().q(b10);
        Object objA = g.a(fVar, cVar);
        return objA == in.a.g() ? objA : r.f5635a;
    }

    @Nullable
    public static final Object f(@NotNull f fVar, @NotNull byte[] bArr, int i10, int i11, @NotNull c<? super r> cVar) {
        fVar.e().write(bArr, i10, i11);
        Object objA = g.a(fVar, cVar);
        return objA == in.a.g() ? objA : r.f5635a;
    }

    @NotNull
    public static final sl.r g(@NotNull l0 l0Var, @NotNull d dVar, @NotNull final ByteChannel byteChannel, @NotNull sn.p<? super s, ? super c<? super r>, ? extends Object> pVar) {
        p.k(l0Var, "<this>");
        p.k(dVar, "coroutineContext");
        p.k(byteChannel, "channel");
        p.k(pVar, "block");
        kotlinx.coroutines.g gVarD = p000do.i.d(l0Var, dVar, null, new ByteWriteChannelOperationsKt$writer$job$1(pVar, byteChannel, null), 2, null);
        gVarD.f(new l() { // from class: sl.h
            @Override // sn.l
            public final Object invoke(Object obj) {
                return ByteWriteChannelOperationsKt.j(byteChannel, (Throwable) obj);
            }
        });
        return new sl.r(byteChannel, gVarD);
    }

    @NotNull
    public static final sl.r h(@NotNull l0 l0Var, @NotNull d dVar, boolean z10, @NotNull sn.p<? super s, ? super c<? super r>, ? extends Object> pVar) {
        p.k(l0Var, "<this>");
        p.k(dVar, "coroutineContext");
        p.k(pVar, "block");
        return g(l0Var, dVar, new ByteChannel(false, 1, null), pVar);
    }

    public static /* synthetic */ sl.r i(l0 l0Var, d dVar, boolean z10, sn.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h(l0Var, dVar, z10, pVar);
    }

    public static final r j(ByteChannel byteChannel, Throwable th2) {
        if (th2 != null && !byteChannel.o()) {
            byteChannel.a(th2);
        }
        return r.f5635a;
    }
}
