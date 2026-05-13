package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class pv3 implements pw3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final pv3 f93801f = new pv3(new rw3());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx3 f93802a = new bx3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f93803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f93804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rw3 f93805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f93806e;

    public pv3(rw3 rw3Var) {
        this.f93805d = rw3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.pw3
    public final void a(boolean z10) {
        if (!this.f93806e && z10) {
            this.f93802a.getClass();
            Date date = new Date();
            Date date2 = this.f93803b;
            if (date2 == null || date.after(date2)) {
                this.f93803b = date;
                if (this.f93804c) {
                    Iterator it = Collections.unmodifiableCollection(nw3.f93027c.f93029b).iterator();
                    while (it.hasNext()) {
                        ka kaVar = ((wv3) it.next()).f96536e;
                        Date date3 = this.f93803b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        kaVar.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            lw3.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            ix3.f91031a.a((WebView) kaVar.f91524b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.f93806e = z10;
    }
}
