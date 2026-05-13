package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f23761f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.applovin.utils.f f23762a = new com.iab.omid.library.applovin.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f23763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f23765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23766e;

    private a(d dVar) {
        this.f23765d = dVar;
    }

    public static a a() {
        return f23761f;
    }

    private void c() {
        if (!this.f23764c || this.f23763b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f23764c) {
            return;
        }
        this.f23765d.a(context);
        this.f23765d.a(this);
        this.f23765d.e();
        this.f23766e = this.f23765d.c();
        this.f23764c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f23766e && z10) {
            d();
        }
        this.f23766e = z10;
    }

    public Date b() {
        Date date = this.f23763b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f23762a.a();
        Date date = this.f23763b;
        if (date == null || dateA.after(date)) {
            this.f23763b = dateA;
            c();
        }
    }
}
