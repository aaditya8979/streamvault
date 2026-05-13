package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class CallableC5283za implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Aa f68061a;

    public CallableC5283za(Aa aa2) {
        this.f68061a = aa2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f68061a.f64972a.getContentResolver();
        Aa aa2 = this.f68061a;
        aa2.f64973b = contentResolver.query(uri, null, null, new String[]{aa2.f64972a.getPackageName()}, null);
        Cursor cursor = this.f68061a.f64973b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f68061a.f64973b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C5015og(string, this.f68061a.f64973b.getLong(1), this.f68061a.f64973b.getLong(2), EnumC4990ng.f67366d);
            }
        }
        return null;
    }
}
