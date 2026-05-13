package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24558f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.ironsrc.utils.f f24559a = new com.iab.omid.library.ironsrc.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24563e;

    private a(d dVar) {
        this.f24562d = dVar;
    }

    public static a a() {
        return f24558f;
    }

    private void c() {
        if (!this.f24561c || this.f24560b == null) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f24561c) {
            return;
        }
        this.f24562d.a(context);
        this.f24562d.a(this);
        this.f24562d.e();
        this.f24563e = this.f24562d.c();
        this.f24561c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (!this.f24563e && z10) {
            d();
        }
        this.f24563e = z10;
    }

    public Date b() {
        Date date = this.f24560b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24559a.a();
        Date date = this.f24560b;
        if (date == null || dateA.after(date)) {
            this.f24560b = dateA;
            c();
        }
    }
}
