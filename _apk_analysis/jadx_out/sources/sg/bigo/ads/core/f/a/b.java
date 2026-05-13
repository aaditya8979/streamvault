package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f83903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f83904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f83906g;

    public b(int i10, int i11, int i12, int i13, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.f83900a = i10;
        this.f83901b = i11;
        this.f83906g = i13;
        this.f83902c = str;
        this.f83905f = i12;
        this.f83903d = str2;
        this.f83904e = str3;
    }

    public final boolean a() {
        return TextUtils.equals(this.f83903d, "application/javascript");
    }
}
