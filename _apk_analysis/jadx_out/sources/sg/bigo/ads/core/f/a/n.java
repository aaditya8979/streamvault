package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f83940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f83942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83943d;

    public n(@NonNull String str) {
        this.f83943d = false;
        this.f83940a = true;
        this.f83941b = str;
    }

    public n(@NonNull String str, byte b10) {
        this(str);
        this.f83943d = true;
    }

    public String toString() {
        return "{\"Content\":\"" + this.f83941b + "\"}";
    }
}
