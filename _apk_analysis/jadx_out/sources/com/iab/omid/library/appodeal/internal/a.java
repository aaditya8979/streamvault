package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.appodeal.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f23896f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.appodeal.utils.f f23897a = new com.iab.omid.library.appodeal.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f23898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f23900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23901e;

    private a(d dVar) {
        this.f23900d = dVar;
    }

    public static a a() {
        return f23896f;
    }

    private void c() {
        if (!this.f23899c || this.f23898b == null) {
            return;
        }
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f23899c) {
            return;
        }
        this.f23900d.a(context);
        this.f23900d.a(this);
        this.f23900d.e();
        this.f23901e = this.f23900d.c();
        this.f23899c = true;
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) {
        if (!this.f23901e && z10) {
            d();
        }
        this.f23901e = z10;
    }

    public Date b() {
        Date date = this.f23898b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f23897a.a();
        Date date = this.f23898b;
        if (date == null || dateA.after(date)) {
            this.f23898b = dateA;
            c();
        }
    }
}
