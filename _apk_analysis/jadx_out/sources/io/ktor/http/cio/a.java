package io.ktor.http.cio;

import android.support.v4.media.session.PlaybackStateCompat;
import fo.o;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CIOMultipartDataBase.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements jl.a, l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f71188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final o<b> f71189c;

    public a(@NotNull d dVar, @NotNull io.ktor.utils.io.a aVar, @NotNull CharSequence charSequence, @Nullable Long l10, long j10) {
        p.k(dVar, "coroutineContext");
        p.k(aVar, "channel");
        p.k(charSequence, "contentType");
        this.f71188b = dVar;
        this.f71189c = MultipartKt.j(this, aVar, charSequence, l10, j10);
    }

    public /* synthetic */ a(d dVar, io.ktor.utils.io.a aVar, CharSequence charSequence, Long l10, long j10, int i10, i iVar) {
        this(dVar, aVar, charSequence, l10, (i10 & 16) != 0 ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH : j10);
    }

    @Override // p000do.l0
    @NotNull
    public d getCoroutineContext() {
        return this.f71188b;
    }
}
