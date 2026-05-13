package ed;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import com.mgs.carparking.netbean.UpdateEvent;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GsonUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f61084a = new k();

    /* JADX INFO: compiled from: GsonUtils.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f61085a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Gson f61086b = new Gson();

        @NotNull
        public final Gson a() {
            return f61086b;
        }
    }

    /* JADX INFO: compiled from: GsonUtils.kt */
    public static final class b extends j8.a<List<? extends DownloadInfoEntry>> {
    }

    /* JADX INFO: compiled from: GsonUtils.kt */
    public static final class c extends j8.a<UpdateEvent> {
    }

    public static final <T> T b(@Nullable String str, @Nullable Class<T> cls) throws JsonSyntaxException, JsonIOException {
        return (T) f61084a.a().fromJson(str, (Class) cls);
    }

    public static final <T> T c(@Nullable String str, @Nullable Type type) {
        return (T) f61084a.a().fromJson(str, type);
    }

    public static final boolean d(@Nullable String str, @Nullable Class<?> cls) {
        if (zp.o.b(str)) {
            return false;
        }
        try {
            c(str, new b().getType());
            return true;
        } catch (JsonSyntaxException unused) {
            return false;
        }
    }

    public static final boolean e(@Nullable String str, @Nullable Class<?> cls) {
        if (zp.o.b(str)) {
            return false;
        }
        try {
            c(str, new c().getType());
            return true;
        } catch (JsonSyntaxException unused) {
            return false;
        }
    }

    public final Gson a() {
        return a.f61085a.a();
    }
}
