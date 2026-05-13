package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C1046a> f83873a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C1046a> f83874b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.core.f.a.a$a, reason: collision with other inner class name */
    public static final class C1046a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f83877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f83878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f83879e;

        public C1046a(String str, int i10, int i11, @Nullable String str2, String str3) {
            this.f83876b = str;
            this.f83877c = i10;
            this.f83878d = i11;
            this.f83879e = str2;
            this.f83875a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.f83876b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.f83879e) || "image/png".equalsIgnoreCase(this.f83879e);
        }

        public final boolean c() {
            return "image/gif".equalsIgnoreCase(this.f83879e);
        }
    }

    public static C1046a a(List<C1046a> list) {
        if (list == null) {
            return null;
        }
        for (C1046a c1046a : list) {
            if (c1046a != null) {
                return c1046a;
            }
        }
        return null;
    }

    @Nullable
    public final C1046a a() {
        return a(this.f83873a);
    }
}
