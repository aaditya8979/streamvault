package sg.bigo.ads.common.u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.u.b.c;
import sg.bigo.ads.common.u.c.c;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b<Req extends sg.bigo.ads.common.u.b.c, Res extends sg.bigo.ads.common.u.c.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.a> f82419d = new a();

    public static class a<Req extends sg.bigo.ads.common.u.b.c> extends b<Req, sg.bigo.ads.common.u.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Req f82420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sg.bigo.ads.common.u.c.a f82421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f82422c;

        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar) {
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
            this.f82420a = cVar;
            this.f82421b = (sg.bigo.ads.common.u.c.a) cVar2;
        }

        @Override // sg.bigo.ads.common.u.b
        public final void a(@NonNull Req req, @NonNull h hVar) {
            this.f82420a = req;
            this.f82422c = hVar;
        }
    }

    public abstract Res a(@NonNull sg.bigo.ads.common.u.c.a aVar);

    public void a(@NonNull Req req) {
    }

    public void a(@NonNull Req req, @Nullable String str, int i10) {
    }

    public abstract void a(@NonNull Req req, @NonNull Res res);

    public abstract void a(@NonNull Req req, @NonNull h hVar);

    public boolean a(@NonNull Req req, int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
