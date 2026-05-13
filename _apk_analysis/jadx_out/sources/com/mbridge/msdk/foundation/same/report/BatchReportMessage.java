package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37882c;

    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(Parcel parcel) {
        this.f37882c = parcel.readString();
        this.f37880a = parcel.readString();
        this.f37881b = parcel.readLong();
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f37882c = str;
        this.f37880a = str2;
        this.f37881b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f37880a;
    }

    public long getTimestamp() {
        return this.f37881b;
    }

    public String getUuid() {
        return this.f37882c;
    }

    public void setReportMessage(String str) {
        this.f37880a = str;
    }

    public void setTimestamp(long j10) {
        this.f37881b = j10;
    }

    public void setUuid(String str) {
        this.f37882c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f37882c);
        parcel.writeString(this.f37880a);
        parcel.writeLong(this.f37881b);
    }
}
