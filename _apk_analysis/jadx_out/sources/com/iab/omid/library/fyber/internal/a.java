package com.iab.omid.library.fyber.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.fyber.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24282f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.fyber.utils.f f24283a = new com.iab.omid.library.fyber.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24287e;

    private a(d dVar) {
        this.f24286d = dVar;
    }

    public static a a() {
        return f24282f;
    }

    private void c() {
        if (!this.f24285c || this.f24284b == null) {
            return;
        }
        Iterator<com.iab.omid.library.fyber.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f24285c) {
            return;
        }
        this.f24286d.a(context);
        this.f24286d.a(this);
        this.f24286d.e();
        this.f24287e = this.f24286d.c();
        this.f24285c = true;
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (!this.f24287e && z10) {
            d();
        }
        this.f24287e = z10;
    }

    public Date b() {
        Date date = this.f24284b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24283a.a();
        Date date = this.f24284b;
        if (date == null || dateA.after(date)) {
            this.f24284b = dateA;
            c();
        }
    }
}
