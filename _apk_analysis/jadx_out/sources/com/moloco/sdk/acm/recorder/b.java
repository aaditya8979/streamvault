package com.moloco.sdk.acm.recorder;

import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.acm.AndroidClientMetrics;
import com.moloco.sdk.acm.e;
import com.moloco.sdk.acm.recorder.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f45878a;

    public b(@Nullable String str) {
        this.f45878a = str;
    }

    public /* synthetic */ b(String str, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    @Override // com.moloco.sdk.acm.recorder.a
    public void a(@NotNull e eVar) {
        p.k(eVar, "event");
        String str = this.f45878a;
        if (str == null || str.length() == 0) {
            AndroidClientMetrics.f45708a.u(eVar);
        } else {
            AndroidClientMetrics.f45708a.u(eVar.f("mediator", this.f45878a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.a
    public void b(@NotNull com.moloco.sdk.acm.b bVar) {
        p.k(bVar, "event");
        String str = this.f45878a;
        if (str == null || str.length() == 0) {
            AndroidClientMetrics.f45708a.t(bVar);
        } else {
            AndroidClientMetrics.f45708a.t(bVar.e("mediator", this.f45878a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.a
    @NotNull
    public e c(@NotNull String str) {
        return a.b.a(this, str);
    }
}
