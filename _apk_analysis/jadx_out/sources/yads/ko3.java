package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ko3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f91687f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f91689h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f91696o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f91682a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f91683b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f91684c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f91685d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f91686e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91688g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f91690i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f91691j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f91692k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f91693l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f91694m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f91695n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f91697p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f91698q = false;

    public final int a(String str, String str2, Set set, String str3) {
        if (this.f91682a.isEmpty() && this.f91683b.isEmpty() && this.f91684c.isEmpty() && this.f91685d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f91682a;
        int i10 = !str4.isEmpty() ? str4.equals(str) ? 1073741824 : -1 : 0;
        String str5 = this.f91683b;
        if (!str5.isEmpty() && i10 != -1) {
            i10 = str5.equals(str2) ? i10 + 2 : -1;
        }
        String str6 = this.f91685d;
        if (!str6.isEmpty() && i10 != -1) {
            i10 = str6.equals(str3) ? i10 + 4 : -1;
        }
        if (i10 == -1 || !set.containsAll(this.f91684c)) {
            return 0;
        }
        return (this.f91684c.size() * 4) + i10;
    }
}
