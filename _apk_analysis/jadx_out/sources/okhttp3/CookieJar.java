package okhttp3;

import cn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface CookieJar {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* JADX INFO: compiled from: CookieJar.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: CookieJar.kt */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            @NotNull
            public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
                p.k(httpUrl, "url");
                return w.m();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) {
                p.k(httpUrl, "url");
                p.k(list, "cookies");
            }
        }

        private Companion() {
        }
    }

    @NotNull
    List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl);

    void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list);
}
