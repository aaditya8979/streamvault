package p0;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f76949f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f76951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f76945b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static String f76946c = "DLNA_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f76947d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f76948e = 30;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static InterfaceC0921b f76950g = new InterfaceC0921b() { // from class: p0.a
        @Override // p0.b.InterfaceC0921b
        public final void a(int i10, String str, CharSequence charSequence, Throwable th2) {
            b.g(i10, str, charSequence, th2);
        }
    };

    /* JADX INFO: compiled from: Logger.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final b a(@NotNull String str) {
            p.k(str, "tag");
            return new b(str);
        }
    }

    /* JADX INFO: renamed from: p0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Logger.kt */
    public interface InterfaceC0921b {
        void a(int i10, @NotNull String str, @NotNull CharSequence charSequence, @Nullable Throwable th2);
    }

    public b(@NotNull String str) {
        p.k(str, "tag");
        this.f76951a = str;
    }

    public static /* synthetic */ void c(b bVar, CharSequence charSequence, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        bVar.b(charSequence, th2);
    }

    public static /* synthetic */ void f(b bVar, CharSequence charSequence, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        bVar.e(charSequence, th2);
    }

    public static final void g(int i10, String str, CharSequence charSequence, Throwable th2) {
        p.k(str, "tag");
        p.k(charSequence, "message");
        if (th2 != null) {
            if (i10 == 10) {
                Log.v(str, charSequence.toString(), th2);
                return;
            }
            if (i10 == 20) {
                Log.d(str, charSequence.toString(), th2);
                return;
            }
            if (i10 == 30) {
                Log.i(str, charSequence.toString(), th2);
                return;
            } else if (i10 == 40) {
                Log.w(str, charSequence.toString(), th2);
                return;
            } else {
                if (i10 != 50) {
                    return;
                }
                Log.e(str, charSequence.toString(), th2);
                return;
            }
        }
        if (i10 == 10) {
            Log.v(str, charSequence.toString());
            return;
        }
        if (i10 == 20) {
            Log.d(str, charSequence.toString());
            return;
        }
        if (i10 == 30) {
            Log.i(str, charSequence.toString());
        } else if (i10 == 40) {
            Log.w(str, charSequence.toString());
        } else {
            if (i10 != 50) {
                return;
            }
            Log.e(str, charSequence.toString());
        }
    }

    public static /* synthetic */ void i(b bVar, CharSequence charSequence, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        bVar.h(charSequence, th2);
    }

    public final void b(@NotNull CharSequence charSequence, @Nullable Throwable th2) {
        p.k(charSequence, "message");
        if (!f76947d || 50 < f76948e) {
            return;
        }
        f76950g.a(50, d(), charSequence, th2);
    }

    public final String d() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f76946c);
        sb2.append(this.f76951a);
        if (f76949f) {
            str = '[' + Thread.currentThread().getName() + ']';
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void e(@NotNull CharSequence charSequence, @Nullable Throwable th2) {
        p.k(charSequence, "message");
        if (!f76947d || 30 < f76948e) {
            return;
        }
        f76950g.a(30, d(), charSequence, th2);
    }

    public final void h(@NotNull CharSequence charSequence, @Nullable Throwable th2) {
        p.k(charSequence, "message");
        if (!f76947d || 40 < f76948e) {
            return;
        }
        f76950g.a(40, d(), charSequence, th2);
    }
}
