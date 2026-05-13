package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.ad1;
import yads.ce;

/* JADX INFO: loaded from: classes3.dex */
public final class GmsServiceAdvertisingInfoReader implements ce, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f51010a;

    public GmsServiceAdvertisingInfoReader(@NotNull IBinder iBinder) {
        this.f51010a = iBinder;
    }

    @Override // android.os.IInterface
    @NotNull
    public IBinder asBinder() {
        return this.f51010a;
    }

    @Override // yads.ce
    @Nullable
    public Boolean readAdTrackingLimited() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f51010a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable unused) {
            boolean z11 = ad1.f87661a;
            return null;
        }
    }

    @Override // yads.ce
    @Nullable
    public String readAdvertisingId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f51010a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
