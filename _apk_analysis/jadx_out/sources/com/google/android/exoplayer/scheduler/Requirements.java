package com.google.android.exoplayer.scheduler;

import a6.k0;
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

/* JADX INFO: loaded from: classes6.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20387b;

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
        this.f20387b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    public static boolean i(ConnectivityManager connectivityManager) {
        if (k0.f3574a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }

    public boolean b(Context context) {
        return d(context) == 0;
    }

    public final int c(Context context) {
        if (!j()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) a6.a.e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && i(connectivityManager)) ? (k() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f20387b & 3;
    }

    public int d(Context context) {
        int iC = c(context);
        if (e() && !f(context)) {
            iC |= 8;
        }
        return (!h() || g(context)) ? iC : iC | 4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return (this.f20387b & 8) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f20387b == ((Requirements) obj).f20387b;
    }

    public final boolean f(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final boolean g(Context context) {
        PowerManager powerManager = (PowerManager) a6.a.e(context.getSystemService("power"));
        int i10 = k0.f3574a;
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

    public boolean h() {
        return (this.f20387b & 4) != 0;
    }

    public int hashCode() {
        return this.f20387b;
    }

    public boolean j() {
        return (this.f20387b & 1) != 0;
    }

    public boolean k() {
        return (this.f20387b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20387b);
    }
}
