package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.inmobi.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24423f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.inmobi.utils.f f24424a = new com.iab.omid.library.inmobi.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24428e;

    private a(d dVar) {
        this.f24427d = dVar;
    }

    public static a a() {
        return f24423f;
    }

    private void c() {
        if (!this.f24426c || this.f24425b == null) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f24426c) {
            return;
        }
        this.f24427d.a(context);
        this.f24427d.a(this);
        this.f24427d.e();
        this.f24428e = this.f24427d.c();
        this.f24426c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (!this.f24428e && z10) {
            d();
        }
        this.f24428e = z10;
    }

    public Date b() {
        Date date = this.f24425b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24424a.a();
        Date date = this.f24425b;
        if (date == null || dateA.after(date)) {
            this.f24425b = dateA;
            c();
        }
    }
}
