package xk;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements d.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f86974c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f86975b;

    /* JADX INFO: compiled from: Utils.kt */
    public static final class a implements d.c<i> {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public i(@NotNull kotlin.coroutines.d dVar) {
        p.k(dVar, "callContext");
        this.f86975b = dVar;
    }

    @NotNull
    public final kotlin.coroutines.d a() {
        return this.f86975b;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    public d.c<?> getKey() {
        return f86974c;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar) {
        return d.b.a.d(this, dVar);
    }
}
