package com.iab.omid.library.vungle.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24962f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.vungle.utils.f f24963a = new com.iab.omid.library.vungle.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24967e;

    private a(d dVar) {
        this.f24966d = dVar;
    }

    public static a a() {
        return f24962f;
    }

    private void c() {
        if (!this.f24965c || this.f24964b == null) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f24965c) {
            return;
        }
        this.f24966d.a(context);
        this.f24966d.a(this);
        this.f24966d.e();
        this.f24967e = this.f24966d.c();
        this.f24965c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (!this.f24967e && z10) {
            d();
        }
        this.f24967e = z10;
    }

    public Date b() {
        Date date = this.f24964b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24963a.a();
        Date date = this.f24964b;
        if (date == null || dateA.after(date)) {
            this.f24964b = dateA;
            c();
        }
    }
}
