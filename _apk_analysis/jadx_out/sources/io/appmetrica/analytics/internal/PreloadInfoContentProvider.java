package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC4814gj;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C4779fa;
import io.appmetrica.analytics.impl.C4836hf;
import io.appmetrica.analytics.impl.C5;
import io.appmetrica.analytics.impl.C5052q3;
import io.appmetrica.analytics.impl.C5076r3;
import io.appmetrica.analytics.impl.Cif;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f68100a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UriMatcher f68101b = new UriMatcher(-1);

    private void a(C5 c52, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = c52.f65092a.invoke(contentValues);
                if (objInvoke != null) {
                    c52.f65094c.b(applicationContext);
                    if (((Boolean) c52.f65093b.invoke(objInvoke)).booleanValue()) {
                        AbstractC4814gj.a("Successfully saved " + c52.f65095d, new Object[0]);
                    } else {
                        AbstractC4814gj.a("Did not save " + c52.f65095d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + "\n" + StringUtils.throwableToString(th2), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC4814gj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f68100a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            if (this.f68100a) {
                return null;
            }
            if (contentValues != null) {
                int iMatch = this.f68101b.match(uri);
                if (iMatch == 1) {
                    a(new C5(new C4836hf(), new Cif(), C4779fa.f66768d, "preload info"), contentValues);
                } else if (iMatch != 2) {
                    AbstractC4814gj.a("Bad content provider uri.", new Object[0]);
                } else {
                    a(new C5(new C5052q3(), new C5076r3(), C4779fa.f66768d, "clids"), contentValues);
                }
            }
            CountDownLatch countDownLatch = B5.f65017a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f68101b.addURI(str, "preloadinfo", 1);
        this.f68101b.addURI(str, "clids", 2);
        B5.f65017a = new CountDownLatch(1);
        B5.f65018b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        AbstractC4814gj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC4814gj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
