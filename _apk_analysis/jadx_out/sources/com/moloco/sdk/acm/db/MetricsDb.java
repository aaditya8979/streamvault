package com.moloco.sdk.acm.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
@TypeConverters({com.moloco.sdk.acm.db.a.class})
@Database(entities = {b.class}, version = 1)
public abstract class MetricsDb extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f45744a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile MetricsDb f45745b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final MetricsDb a(Context context) {
            try {
                Context applicationContext = context.getApplicationContext();
                p.j(applicationContext, "getApplicationContext(...)");
                return (MetricsDb) Room.databaseBuilder(applicationContext, MetricsDb.class, "metrics-db").build();
            } catch (Exception e10) {
                throw new IllegalStateException("Database creation failed", e10);
            }
        }

        @NotNull
        public final MetricsDb b(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            MetricsDb metricsDb = MetricsDb.f45745b;
            if (metricsDb == null) {
                synchronized (this) {
                    metricsDb = MetricsDb.f45745b;
                    if (metricsDb == null) {
                        MetricsDb metricsDbA = MetricsDb.f45744a.a(context);
                        MetricsDb.f45745b = metricsDbA;
                        metricsDb = metricsDbA;
                    }
                }
            }
            return metricsDb;
        }
    }

    @NotNull
    public abstract d c();
}
