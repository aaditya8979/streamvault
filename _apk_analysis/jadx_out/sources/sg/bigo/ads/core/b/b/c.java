package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83642d;

    public static c a() {
        c cVar = new c();
        for (boolean z10 = true; z10; z10 = false) {
            String strK = sg.bigo.ads.common.x.a.k();
            if (q.a((CharSequence) strK)) {
                break;
            }
            String[] strArrSplit = strK.split(StringUtils.COMMA);
            if (strArrSplit.length != 4) {
                break;
            }
            try {
                cVar.f83639a = Integer.parseInt(strArrSplit[0]);
                cVar.f83640b = Integer.parseInt(strArrSplit[1]);
                cVar.f83641c = Integer.parseInt(strArrSplit[2]);
                cVar.f83642d = Integer.parseInt(strArrSplit[3]);
            } catch (NumberFormatException unused) {
            }
        }
        return cVar;
    }

    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "filled":
                this.f83640b++;
                break;
            case "load":
                this.f83639a++;
                break;
            case "impression":
                this.f83641c++;
                break;
            case "clicked":
                this.f83642d++;
                break;
        }
        sg.bigo.ads.common.x.a.d(toString());
    }

    public final boolean b() {
        return ((this.f83639a + this.f83640b) + this.f83641c) + this.f83642d == 0;
    }

    public final void c() {
        this.f83639a = 0;
        this.f83640b = 0;
        this.f83641c = 0;
        this.f83642d = 0;
        sg.bigo.ads.common.x.a.d(toString());
    }

    @NonNull
    public final String toString() {
        return this.f83639a + StringUtils.COMMA + this.f83640b + StringUtils.COMMA + this.f83641c + StringUtils.COMMA + this.f83642d;
    }
}
