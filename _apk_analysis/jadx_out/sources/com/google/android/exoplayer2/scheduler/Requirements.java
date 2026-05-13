package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import s7.m0;

/* JADX INFO: loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22214b;

    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    public Requirements(int i10) {
        this.f22214b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    public static boolean h(ConnectivityManager connectivityManager) {
        if (m0.f79487a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    public final int b(Context context) {
        if (!i()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) s7.a.e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && h(connectivityManager)) ? (l() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f22214b & 3;
    }

    public int c(Context context) {
        int iB = b(context);
        if (d() && !e(context)) {
            iB |= 8;
        }
        if (g() && !f(context)) {
            iB |= 4;
        }
        return (!k() || j(context)) ? iB : iB | 16;
    }

    public boolean d() {
        return (this.f22214b & 8) != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e(Context context) {
        Intent intentE0 = m0.E0(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentE0 == null) {
            return false;
        }
        int intExtra = intentE0.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f22214b == ((Requirements) obj).f22214b;
    }

    public final boolean f(Context context) {
        PowerManager powerManager = (PowerManager) s7.a.e(context.getSystemService("power"));
        int i10 = m0.f79487a;
        if (i10 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i10 >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return (this.f22214b & 4) != 0;
    }

    public int hashCode() {
        return this.f22214b;
    }

    public boolean i() {
        return (this.f22214b & 1) != 0;
    }

    public final boolean j(Context context) {
        return m0.E0(context, null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean k() {
        return (this.f22214b & 16) != 0;
    }

    public boolean l() {
        return (this.f22214b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22214b);
    }
}
