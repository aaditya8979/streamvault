package vk;

import androidx.core.app.NotificationCompat;
import gl.a0;
import gl.m;
import gl.z;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends dl.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f86105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f86106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a0 f86107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final z f86108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final nl.c f86109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final nl.c f86110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final m f86111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f86112i;

    public g(@NotNull e eVar, @NotNull byte[] bArr, @NotNull dl.c cVar) {
        p.k(eVar, NotificationCompat.CATEGORY_CALL);
        p.k(bArr, "body");
        p.k(cVar, "origin");
        this.f86105b = eVar;
        this.f86106c = bArr;
        this.f86107d = cVar.d();
        this.f86108e = cVar.e();
        this.f86109f = cVar.b();
        this.f86110g = cVar.c();
        this.f86111h = cVar.getHeaders();
        this.f86112i = cVar.getCoroutineContext();
    }

    @Override // dl.c
    @NotNull
    public io.ktor.utils.io.a a() {
        return sl.a.c(this.f86106c, 0, 0, 6, null);
    }

    @Override // dl.c
    @NotNull
    public nl.c b() {
        return this.f86109f;
    }

    @Override // dl.c
    @NotNull
    public nl.c c() {
        return this.f86110g;
    }

    @Override // dl.c
    @NotNull
    public a0 d() {
        return this.f86107d;
    }

    @Override // dl.c
    @NotNull
    public z e() {
        return this.f86108e;
    }

    @Override // dl.c
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e L() {
        return this.f86105b;
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f86112i;
    }

    @Override // gl.u
    @NotNull
    public m getHeaders() {
        return this.f86111h;
    }
}
