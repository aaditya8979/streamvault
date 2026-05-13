package sg.bigo.ads.common.h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.f;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f82144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f82145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f82146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f82150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f82151i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f82155m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f82158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f82159q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f82161s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f82152j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f82153k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f82154l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f82156n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f82157o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1017a f82160r = new C1017a();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.a$a, reason: collision with other inner class name */
    public static class C1017a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82162a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f82163b = false;

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.f82162a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z10, boolean z11, boolean z12, @Nullable c cVar) {
        this.f82144b = str;
        this.f82145c = str2;
        this.f82146d = str3;
        this.f82147e = z10 ? 1 : 0;
        this.f82148f = z12;
        this.f82159q = z11;
        String strA = a();
        long jA = f.a(strA, 1);
        this.f82149g = jA <= 0 ? f.a(f.d(strA), 1) : jA;
        String strValueOf = String.valueOf(str.hashCode());
        this.f82143a = strValueOf;
        this.f82161s = cVar;
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "newInstance mId = " + strValueOf + ", savedSize = " + this.f82149g + ", mIsSupportFillTime = " + c());
    }

    public final String a() {
        return this.f82145c + File.separator + this.f82146d;
    }

    public final boolean b() {
        return this.f82152j == 3;
    }

    public final boolean c() {
        c cVar = this.f82161s;
        return cVar != null && cVar.f82210a;
    }

    public final boolean d() {
        c cVar = this.f82161s;
        return cVar != null && cVar.f82211b;
    }

    public final int e() {
        c cVar = this.f82161s;
        if (cVar != null) {
            return cVar.f82212c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f82144b.equals(aVar.f82144b) && this.f82146d.equals(aVar.f82146d) && this.f82145c.equals(aVar.f82145c);
    }

    public final int f() {
        c cVar = this.f82161s;
        if (cVar != null) {
            return cVar.f82213d;
        }
        return 5;
    }

    public final int g() {
        c cVar = this.f82161s;
        if (cVar != null) {
            return cVar.f82214e;
        }
        return 20;
    }

    public final boolean h() {
        if (this.f82144b.endsWith(".mp4") && this.f82160r.f82162a == -1) {
            if (f.a(f.d(a()))) {
                this.f82160r.f82162a = 1;
            } else {
                this.f82160r.f82162a = 0;
            }
        }
        return this.f82160r.f82162a == 1;
    }

    @NonNull
    public String toString() {
        return " url = " + this.f82144b + StringUtils.COMMA + " fileName = " + this.f82146d + StringUtils.COMMA + " filePath = " + this.f82145c + StringUtils.COMMA + " downloadCount = " + this.f82153k + StringUtils.COMMA + " totalSize = " + this.f82151i + StringUtils.COMMA + " loadedSize = " + this.f82149g + StringUtils.COMMA + " mState = " + this.f82152j + StringUtils.COMMA + " mLastDownloadEndTime = " + this.f82154l + StringUtils.COMMA + " mExt = " + this.f82160r.a() + StringUtils.COMMA + " contentType = " + this.f82158p + " isSupportFillTime = " + c() + " adFillTime = " + e() + " adCheckProcessTime = " + f() + " adCheckMinProcess = " + g();
    }
}
