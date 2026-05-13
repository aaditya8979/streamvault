package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f82986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f82987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82988c;

    public j(String str, @Nullable String str2, int i10) {
        this.f82986a = str;
        this.f82987b = str2;
        this.f82988c = i10;
    }

    @NonNull
    public final String a() {
        return this.f82986a;
    }

    @Nullable
    public final String b() {
        return this.f82987b;
    }

    public final boolean c() {
        return d.a(this.f82987b);
    }

    public final int d() {
        return this.f82988c;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
