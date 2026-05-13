package sg.bigo.ads.common.x;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f82807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1033a f82808b = new C1033a();

        /* JADX INFO: renamed from: sg.bigo.ads.common.x.c$a$a, reason: collision with other inner class name */
        public static class C1033a {
            public static void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (f82807a == null) {
                f82807a = new a();
            }
            return f82807a;
        }
    }
}
