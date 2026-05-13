package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f81808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f81809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final a f81810h = new a(0);

    public static class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f81811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f81812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f81813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f81814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f81815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f81816f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f81817g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f81818h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f81819i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f81820j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f81821k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f81822l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f81823m;

        private a() {
            this.f81812b = UUID.randomUUID().toString();
            this.f81811a = "";
            this.f81813c = "";
            this.f81814d = "";
            this.f81815e = "";
            this.f81817g = 0;
            this.f81819i = 0;
            this.f81818h = "";
            this.f81820j = 0L;
            this.f81821k = 0L;
            this.f81822l = 0L;
            this.f81823m = 0L;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public final void a() {
            if (this.f81822l == 0) {
                this.f81822l = System.currentTimeMillis();
            }
        }

        public final void b() {
            if (this.f81823m == 0) {
                this.f81823m = System.currentTimeMillis();
            }
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String c() {
            return this.f81812b;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String d() {
            return this.f81813c;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String e() {
            return this.f81814d;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String f() {
            return this.f81815e;
        }

        @Override // sg.bigo.ads.api.core.g
        public final String g() {
            return this.f81811a;
        }

        @Override // sg.bigo.ads.api.core.g
        public final int h() {
            return this.f81817g;
        }

        @Override // sg.bigo.ads.api.core.g
        public final String i() {
            return this.f81818h;
        }

        @Override // sg.bigo.ads.api.core.g
        public final int j() {
            return this.f81819i;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long k() {
            return this.f81816f;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long l() {
            return this.f81820j;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long m() {
            return this.f81821k;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long n() {
            return this.f81822l;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long o() {
            return this.f81823m;
        }
    }

    public b(String str, @Nullable String str2) {
        this.f81803a = str;
        this.f81804b = str2;
    }

    @Nullable
    public T a() {
        return null;
    }

    public final void a(String str) {
        this.f81810h.f81811a = str;
    }

    public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        a aVar = this.f81810h;
        aVar.f81813c = str;
        aVar.f81814d = str2;
        aVar.f81815e = str3;
    }

    public boolean a(int i10) {
        return i10 != c();
    }

    @Nullable
    public sg.bigo.ads.api.core.c b() {
        if (q.a((CharSequence) this.f81803a)) {
            return new sg.bigo.ads.api.core.c(1019, 10001, "Please pass slot id when constructing an ad request");
        }
        return null;
    }

    public final void b(int i10) {
        a aVar = this.f81810h;
        if (aVar.f81820j == 0) {
            aVar.f81819i = i10;
            aVar.f81820j = System.currentTimeMillis();
        }
    }

    public final void b(String str) {
        a aVar = this.f81810h;
        if (aVar != null) {
            aVar.f81818h = str;
        }
    }

    public abstract int c();

    public final void c(int i10) {
        this.f81810h.f81817g = i10;
    }

    @Nullable
    public Map<String, Object> d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public l h() {
        return null;
    }
}
