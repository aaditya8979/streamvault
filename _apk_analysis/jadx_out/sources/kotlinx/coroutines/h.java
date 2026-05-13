package kotlinx.coroutines;

import ao.i;
import bn.r;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.a2;
import p000do.q;
import p000do.s;
import p000do.y0;
import sn.l;

/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class h extends kotlin.coroutines.a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f73417b = new h();

    public h() {
        super(g.H8);
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public CancellationException B() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.g
    @Nullable
    public Object C(@NotNull hn.c<? super r> cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public q H(@NotNull s sVar) {
        return a2.f59823b;
    }

    @Override // kotlinx.coroutines.g, fo.o
    public void cancel(@Nullable CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.g
    public boolean d() {
        return false;
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public y0 f(@NotNull l<? super Throwable, r> lVar) {
        return a2.f59823b;
    }

    @Override // kotlinx.coroutines.g
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.g
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public i<g> k() {
        return ao.r.i();
    }

    @Override // kotlinx.coroutines.g
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public y0 w(boolean z10, boolean z11, @NotNull l<? super Throwable, r> lVar) {
        return a2.f59823b;
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public lo.a x() {
        throw new UnsupportedOperationException("This job is always active");
    }
}
