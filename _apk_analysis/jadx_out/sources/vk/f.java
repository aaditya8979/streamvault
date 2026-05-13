package vk;

import androidx.core.app.NotificationCompat;
import gl.m;
import gl.x;
import io.ktor.http.Url;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements cl.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.b f86103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f86104c;

    public f(@NotNull e eVar, @NotNull cl.b bVar) {
        p.k(eVar, NotificationCompat.CATEGORY_CALL);
        p.k(bVar, "origin");
        this.f86103b = bVar;
        this.f86104c = eVar;
    }

    @Override // cl.b
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e L() {
        return this.f86104c;
    }

    @Override // cl.b
    @NotNull
    public kl.b getAttributes() {
        return this.f86103b.getAttributes();
    }

    @Override // cl.b, p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f86103b.getCoroutineContext();
    }

    @Override // gl.u
    @NotNull
    public m getHeaders() {
        return this.f86103b.getHeaders();
    }

    @Override // cl.b
    @NotNull
    public x getMethod() {
        return this.f86103b.getMethod();
    }

    @Override // cl.b
    @NotNull
    public Url getUrl() {
        return this.f86103b.getUrl();
    }
}
