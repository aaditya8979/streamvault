package ro;

import no.m;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UnsafeBufferOperations.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ro.b f78922a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ro.c f78923b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ro.a f78924c = new a();

    /* JADX INFO: compiled from: UnsafeBufferOperations.kt */
    public static final class a implements ro.a {
        @Override // ro.b
        public byte a(m mVar, int i10) {
            p.k(mVar, "segment");
            return e.f78922a.a(mVar, i10);
        }
    }

    /* JADX INFO: compiled from: UnsafeBufferOperations.kt */
    public static final class b implements ro.b {
        @Override // ro.b
        public byte a(m mVar, int i10) {
            p.k(mVar, "segment");
            return mVar.k(i10);
        }
    }

    /* JADX INFO: compiled from: UnsafeBufferOperations.kt */
    public static final class c implements ro.c {
    }
}
