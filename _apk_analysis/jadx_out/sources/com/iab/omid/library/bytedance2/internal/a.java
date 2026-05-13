package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24152f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.bytedance2.utils.f f24153a = new com.iab.omid.library.bytedance2.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24157e;

    private a(d dVar) {
        this.f24156d = dVar;
    }

    public static a a() {
        return f24152f;
    }

    private void c() {
        if (!this.f24155c || this.f24154b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f24155c) {
            return;
        }
        this.f24156d.a(context);
        this.f24156d.a(this);
        this.f24156d.e();
        this.f24157e = this.f24156d.c();
        this.f24155c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (!this.f24157e && z10) {
            d();
        }
        this.f24157e = z10;
    }

    public Date b() {
        Date date = this.f24154b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24153a.a();
        Date date = this.f24154b;
        if (date == null || dateA.after(date)) {
            this.f24154b = dateA;
            c();
        }
    }
}
