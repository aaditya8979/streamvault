package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ob2 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93168c;

    public ob2(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f93167b = z10;
        this.f93168c = i10;
    }

    public static ob2 a(String str) {
        return new ob2(str, null, true, 1);
    }

    public static ob2 b(String str) {
        return new ob2(str, null, false, 1);
    }
}
