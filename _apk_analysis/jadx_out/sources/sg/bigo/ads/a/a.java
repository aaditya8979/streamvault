package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColorInt
    private final int f79746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColorInt
    private final int f79747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f79748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f79749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f79750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f79751g;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a$a, reason: collision with other inner class name */
    public static class C0956a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f79752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f79753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f79754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ColorInt
        private int f79755d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ColorInt
        private int f79756e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f79757f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f79758g;

        public final a a() {
            return new a(this.f79752a, this.f79755d, this.f79756e, this.f79757f, this.f79758g, this.f79753b, this.f79754c);
        }
    }

    public interface b {
        void a(Context context, String str, int i10, @Nullable String str2);

        void a(String str, String str2, String str3);
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public a(String str, int i10, int i11, boolean z10, Bitmap bitmap, c cVar, b bVar) {
        this.f79745a = str;
        this.f79746b = i10;
        this.f79747c = i11;
        this.f79748d = z10;
        this.f79749e = bitmap;
        this.f79750f = cVar;
        this.f79751g = bVar;
    }

    public final void a(Context context) {
        sg.bigo.ads.a.c.a(context, this.f79745a, this.f79746b, this.f79747c, this.f79748d, this.f79749e, this.f79750f, this.f79751g);
    }
}
