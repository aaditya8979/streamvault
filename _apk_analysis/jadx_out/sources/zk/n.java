package zk;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Charset f98314c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<Charset> f98312a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Charset, Float> f98313b = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Charset f98315d = bo.c.f5639b;

    @NotNull
    public final Map<Charset, Float> a() {
        return this.f98313b;
    }

    @NotNull
    public final Set<Charset> b() {
        return this.f98312a;
    }

    @NotNull
    public final Charset c() {
        return this.f98315d;
    }

    @Nullable
    public final Charset d() {
        return this.f98314c;
    }
}
