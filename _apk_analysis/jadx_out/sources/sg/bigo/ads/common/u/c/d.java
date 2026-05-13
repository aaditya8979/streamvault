package sg.bigo.ads.common.u.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f82450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82451b;

    public d(@NonNull a aVar) {
        this.f82450a = aVar;
        this.f82451b = g.a(aVar.f82443b);
    }

    @NonNull
    public final String a() {
        return this.f82451b;
    }

    @Nullable
    public final String a(String str) {
        return this.f82450a.a(str);
    }
}
