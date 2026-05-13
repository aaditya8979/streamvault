package n7;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TextEmphasis.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f75183d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableSet<String> f75184e = ImmutableSet.of("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableSet<String> f75185f = ImmutableSet.of("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ImmutableSet<String> f75186g = ImmutableSet.of("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ImmutableSet<String> f75187h = ImmutableSet.of("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75190c;

    public b(int i10, int i11, int i12) {
        this.f75188a = i10;
        this.f75189b = i11;
        this.f75190c = i12;
    }

    @Nullable
    public static b a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strE = y7.a.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(ImmutableSet.copyOf(TextUtils.split(strE, f75183d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n7.b b(com.google.common.collect.ImmutableSet<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.b.b(com.google.common.collect.ImmutableSet):n7.b");
    }
}
