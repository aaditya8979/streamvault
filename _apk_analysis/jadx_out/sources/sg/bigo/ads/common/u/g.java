package sg.bigo.ads.common.u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.u.b;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f82458a;

    @NonNull
    public static c<sg.bigo.ads.common.u.c.a> a(@NonNull sg.bigo.ads.common.u.b.c cVar) {
        b.a aVar = new b.a();
        f82458a.c(cVar, aVar);
        return new c<>(aVar.f82421b, aVar.f82422c);
    }

    public static void a(@NonNull sg.bigo.ads.common.u.b.a aVar, @Nullable b bVar) {
        if (bVar == null) {
            bVar = b.f82419d;
        }
        f82458a.b(aVar, bVar);
    }
}
