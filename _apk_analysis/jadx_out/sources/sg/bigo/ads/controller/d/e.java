package sg.bigo.ads.controller.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.controller.a.b f83224a;

    public static class a implements k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f83225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f83226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f83227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f83228d;

        public a(@Nullable String str, @Nullable j jVar) {
            this.f83225a = str;
            if (jVar != null) {
                boolean zC = jVar.c();
                this.f83227c = zC;
                this.f83226b = jVar.a();
                str = sg.bigo.ads.controller.a.d.a(str, zC ? jVar.b() : jVar.a());
            } else {
                this.f83227c = false;
                this.f83226b = "";
            }
            this.f83228d = str;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String a() {
            return this.f83228d;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String b() {
            return this.f83225a;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String c() {
            return this.f83226b;
        }

        @Override // sg.bigo.ads.common.k.b
        public final boolean d() {
            return this.f83227c;
        }
    }

    public e(@Nullable sg.bigo.ads.controller.a.b bVar) {
        this.f83224a = bVar;
    }

    @Override // sg.bigo.ads.common.k
    @NonNull
    public final k.b a(@Nullable String str) {
        sg.bigo.ads.controller.a.b bVar = this.f83224a;
        return new a(str, bVar != null ? bVar.f82891a.f82820i.f82832b : null);
    }
}
