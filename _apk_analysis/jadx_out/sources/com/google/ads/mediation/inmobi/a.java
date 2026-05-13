package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.ArrayList;
import java.util.Iterator;
import n3.f;
import n3.g;
import n3.n;

/* JADX INFO: compiled from: InMobiInitializer.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements SdkInitializationListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f19848d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayList<InterfaceC0281a> f19850b = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public int f19849a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f19851c = new n();

    /* JADX INFO: renamed from: com.google.ads.mediation.inmobi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InMobiInitializer.java */
    public interface InterfaceC0281a {
        void onInitializeError(@NonNull AdError adError);

        void onInitializeSuccess();
    }

    public static a a() {
        if (f19848d == null) {
            f19848d = new a();
        }
        return f19848d;
    }

    public void b(@NonNull Context context, @NonNull @Size(max = 36, min = 32) String str, @NonNull InterfaceC0281a interfaceC0281a) {
        if (this.f19849a == 2) {
            interfaceC0281a.onInitializeSuccess();
            return;
        }
        this.f19850b.add(interfaceC0281a);
        if (this.f19849a == 1) {
            return;
        }
        this.f19849a = 1;
        this.f19851c.c(context, str, f.a(), this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(@Nullable Error error) {
        if (error == null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi SDK initialized.");
            this.f19849a = 2;
            Iterator<InterfaceC0281a> it = this.f19850b.iterator();
            while (it.hasNext()) {
                it.next().onInitializeSuccess();
            }
        } else {
            this.f19849a = 0;
            AdError adErrorA = g.a(101, error.getLocalizedMessage());
            Iterator<InterfaceC0281a> it2 = this.f19850b.iterator();
            while (it2.hasNext()) {
                it2.next().onInitializeError(adErrorA);
            }
        }
        this.f19850b.clear();
    }
}
