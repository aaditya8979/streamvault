package cl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpRequestPipeline.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends ql.b<Object, d> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f6719h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final ql.g f6720i = new ql.g("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ql.g f6721j = new ql.g("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final ql.g f6722k = new ql.g("Monitoring");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ql.g f6723l = new ql.g("Engine");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final ql.g f6724m = new ql.g("Receive");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6725g;

    /* JADX INFO: compiled from: HttpRequestPipeline.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final ql.g a() {
            return i.f6723l;
        }

        @NotNull
        public final ql.g b() {
            return i.f6724m;
        }
    }

    public i(boolean z10) {
        super(f6720i, f6721j, f6722k, f6723l, f6724m);
        this.f6725g = z10;
    }

    public /* synthetic */ i(boolean z10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ql.b
    public boolean g() {
        return this.f6725g;
    }
}
