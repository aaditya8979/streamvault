package com.yandex.mobile.ads.core.initializer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import tn.i;
import yads.iu3;
import yads.xh;
import yads.yh;

/* JADX INFO: loaded from: classes12.dex */
public final class MobileAdsInitializeProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yh f59183a;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileAdsInitializeProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MobileAdsInitializeProvider(@NotNull yh yhVar) {
        this.f59183a = yhVar;
    }

    public /* synthetic */ MobileAdsInitializeProvider(yh yhVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? new yh() : yhVar);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        p000do.i.d(this.f59183a.f97138a, null, null, new xh(context, new iu3(context), null), 3, null);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
