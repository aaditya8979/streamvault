package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: loaded from: classes.dex */
public abstract class LargeMessageSnapshot extends MessageSnapshot {

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements ea.a {
        public CompletedFlowDirectlySnapshot(int i10, boolean z10, long j10) {
            super(i10, z10, j10);
        }
    }

    public static class CompletedSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f34669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f34670e;

        public CompletedSnapshot(int i10, boolean z10, long j10) {
            super(i10);
            this.f34669d = z10;
            this.f34670e = j10;
        }

        public CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f34669d = parcel.readByte() != 0;
            this.f34670e = parcel.readLong();
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) -3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long i() {
            return this.f34670e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean p() {
            return this.f34669d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f34669d ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f34670e);
        }
    }

    public static class ConnectedMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f34671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f34672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f34673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f34674g;

        public ConnectedMessageSnapshot(int i10, boolean z10, long j10, String str, String str2) {
            super(i10);
            this.f34671d = z10;
            this.f34672e = j10;
            this.f34673f = str;
            this.f34674g = str2;
        }

        public ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34671d = parcel.readByte() != 0;
            this.f34672e = parcel.readLong();
            this.f34673f = parcel.readString();
            this.f34674g = parcel.readString();
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String e() {
            return this.f34673f;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String f() {
            return this.f34674g;
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long i() {
            return this.f34672e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean o() {
            return this.f34671d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f34671d ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f34672e);
            parcel.writeString(this.f34673f);
            parcel.writeString(this.f34674g);
        }
    }

    public static class ErrorMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f34675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Throwable f34676e;

        public ErrorMessageSnapshot(int i10, long j10, Throwable th2) {
            super(i10);
            this.f34675d = j10;
            this.f34676e = th2;
        }

        public ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34675d = parcel.readLong();
            this.f34676e = (Throwable) parcel.readSerializable();
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) -1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long h() {
            return this.f34675d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public Throwable m() {
            return this.f34676e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeLong(this.f34675d);
            parcel.writeSerializable(this.f34676e);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, ea.b
        public byte getStatus() {
            return (byte) -2;
        }
    }

    public static class PendingMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f34677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f34678e;

        public PendingMessageSnapshot(int i10, long j10, long j11) {
            super(i10);
            this.f34677d = j10;
            this.f34678e = j11;
        }

        public PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34677d = parcel.readLong();
            this.f34678e = parcel.readLong();
        }

        public PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.g(), pendingMessageSnapshot.h(), pendingMessageSnapshot.i());
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) 1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long h() {
            return this.f34677d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long i() {
            return this.f34678e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeLong(this.f34677d);
            parcel.writeLong(this.f34678e);
        }
    }

    public static class ProgressMessageSnapshot extends LargeMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f34679d;

        public ProgressMessageSnapshot(int i10, long j10) {
            super(i10);
            this.f34679d = j10;
        }

        public ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34679d = parcel.readLong();
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) 3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long h() {
            return this.f34679d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeLong(this.f34679d);
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f34680f;

        public RetryMessageSnapshot(int i10, long j10, Throwable th2, int i11) {
            super(i10, j10, th2);
            this.f34680f = i11;
        }

        public RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34680f = parcel.readInt();
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, ea.b
        public byte getStatus() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int j() {
            return this.f34680f;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f34680f);
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements ea.a {
        public WarnFlowDirectlySnapshot(int i10, long j10, long j11) {
            super(i10, j10, j11);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.b {
        public WarnMessageSnapshot(int i10, long j10, long j11) {
            super(i10, j10, j11);
        }

        public WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.b
        public MessageSnapshot c() {
            return new PendingMessageSnapshot(this);
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, ea.b
        public byte getStatus() {
            return (byte) -4;
        }
    }

    public LargeMessageSnapshot(int i10) {
        super(i10);
        this.f34682c = true;
    }

    public LargeMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public int k() {
        if (h() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) h();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public int l() {
        if (i() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) i();
    }
}
