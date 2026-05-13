package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class Z extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f68422d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f68423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.a f68424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5307k f68425c;

    public Z(ClientContext clientContext, C5314s c5314s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f68423a = clientContext;
        this.f68424b = c5314s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        C5307k c5307k;
        super.onChange(z10, uri);
        if (!bo.a0.W(String.valueOf(uri), f68422d, false, 2, null) || (c5307k = this.f68425c) == null) {
            return;
        }
        try {
            String[] strArr = (String[]) cn.p.D(new String[]{"date_added"}, c5307k.f68453b);
            Cursor cursorQuery = this.f68423a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c5307k.f68454c)}, "date_added DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it = c5307k.f68453b.iterator();
                        while (it.hasNext()) {
                            if (bo.d0.c0(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow((String) it.next())).toLowerCase(Locale.ROOT), "screenshot", false, 2, null)) {
                                this.f68424b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            bn.r rVar = bn.r.f5635a;
            on.b.a(cursorQuery, null);
        } catch (Exception unused) {
        }
    }
}
