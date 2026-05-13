package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24693f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.mmadbridge.utils.f f24694a = new com.iab.omid.library.mmadbridge.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24698e;

    private a(d dVar) {
        this.f24697d = dVar;
    }

    public static a a() {
        return f24693f;
    }

    private void c() {
        if (!this.f24696c || this.f24695b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f24696c) {
            return;
        }
        this.f24697d.a(context);
        this.f24697d.a(this);
        this.f24697d.e();
        this.f24698e = this.f24697d.c();
        this.f24696c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (!this.f24698e && z10) {
            d();
        }
        this.f24698e = z10;
    }

    public Date b() {
        Date date = this.f24695b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24694a.a();
        Date date = this.f24695b;
        if (date == null || dateA.after(date)) {
            this.f24695b = dateA;
            c();
        }
    }
}
