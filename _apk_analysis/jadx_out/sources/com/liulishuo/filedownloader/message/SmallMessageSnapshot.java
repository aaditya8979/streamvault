package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SmallMessageSnapshot extends MessageSnapshot {

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements ea.a {
        public CompletedFlowDirectlySnapshot(int i10, boolean z10, int i11) {
            super(i10, z10, i11);
        }
    }

    public static class CompletedSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f34683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f34684e;

        public CompletedSnapshot(int i10, boolean z10, int i11) {
            super(i10);
            this.f34683d = z10;
            this.f34684e = i11;
        }

        public CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f34683d = parcel.readByte() != 0;
            this.f34684e = parcel.readInt();
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
        public int l() {
            return this.f34684e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean p() {
            return this.f34683d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f34683d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f34684e);
        }
    }

    public static class ConnectedMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f34685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f34686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f34687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f34688g;

        public ConnectedMessageSnapshot(int i10, boolean z10, int i11, String str, String str2) {
            super(i10);
            this.f34685d = z10;
            this.f34686e = i11;
            this.f34687f = str;
            this.f34688g = str2;
        }

        public ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34685d = parcel.readByte() != 0;
            this.f34686e = parcel.readInt();
            this.f34687f = parcel.readString();
            this.f34688g = parcel.readString();
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String e() {
            return this.f34687f;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String f() {
            return this.f34688g;
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int l() {
            return this.f34686e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean o() {
            return this.f34685d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f34685d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f34686e);
            parcel.writeString(this.f34687f);
            parcel.writeString(this.f34688g);
        }
    }

    public static class ErrorMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Throwable f34690e;

        public ErrorMessageSnapshot(int i10, int i11, Throwable th2) {
            super(i10);
            this.f34689d = i11;
            this.f34690e = th2;
        }

        public ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34689d = parcel.readInt();
            this.f34690e = (Throwable) parcel.readSerializable();
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
        public int k() {
            return this.f34689d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public Throwable m() {
            return this.f34690e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f34689d);
            parcel.writeSerializable(this.f34690e);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, ea.b
        public byte getStatus() {
            return (byte) -2;
        }
    }

    public static class PendingMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f34692e;

        public PendingMessageSnapshot(int i10, int i11, int i12) {
            super(i10);
            this.f34691d = i11;
            this.f34692e = i12;
        }

        public PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34691d = parcel.readInt();
            this.f34692e = parcel.readInt();
        }

        public PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.g(), pendingMessageSnapshot.k(), pendingMessageSnapshot.l());
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) 1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int k() {
            return this.f34691d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int l() {
            return this.f34692e;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f34691d);
            parcel.writeInt(this.f34692e);
        }
    }

    public static class ProgressMessageSnapshot extends SmallMessageSnapshot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34693d;

        public ProgressMessageSnapshot(int i10, int i11) {
            super(i10);
            this.f34693d = i11;
        }

        public ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34693d = parcel.readInt();
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
        public int k() {
            return this.f34693d;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f34693d);
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f34694f;

        public RetryMessageSnapshot(int i10, int i11, Throwable th2, int i12) {
            super(i10, i11, th2);
            this.f34694f = i12;
        }

        public RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f34694f = parcel.readInt();
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, ea.b
        public byte getStatus() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int j() {
            return this.f34694f;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f34694f);
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements ea.a {
        public WarnFlowDirectlySnapshot(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.b {
        public WarnMessageSnapshot(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        public WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.b
        public MessageSnapshot c() {
            return new PendingMessageSnapshot(this);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, ea.b
        public byte getStatus() {
            return (byte) -4;
        }
    }

    public SmallMessageSnapshot(int i10) {
        super(i10);
        this.f34682c = false;
    }

    public SmallMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public long h() {
        return k();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public long i() {
        return l();
    }
}
