package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.I4;
import com.ironsource.Z7;

/* JADX INFO: loaded from: classes7.dex */
public class CrashProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f31611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I4 f31612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31613c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f31615e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f31619i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UriMatcher f31614d = new UriMatcher(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31616f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31617g = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f31620j = Z7.f30779c;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f31614d.match(uri);
        if (iMatch == 1) {
            return this.f31618h;
        }
        if (iMatch == 2) {
            return this.f31619i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f31611a = getContext();
        this.f31612b = new I4(this.f31611a);
        this.f31613c = this.f31611a.getPackageName();
        this.f31615e = Uri.parse("content://" + this.f31613c + "/" + Z7.f30779c);
        this.f31618h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f31619i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f31614d.match(uri);
        if (iMatch == 1) {
            return I4.c();
        }
        if (iMatch == 2) {
            return I4.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
