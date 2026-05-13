package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import android.os.Parcelable;
import ia.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MessageSnapshot implements ea.b, Parcelable {
    public static final Parcelable.Creator<MessageSnapshot> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34682c;

    public static class NoFieldException extends IllegalStateException {
        public NoFieldException(String str, MessageSnapshot messageSnapshot) {
            super(f.o("There isn't a field for '%s' in this message %d %d %s", str, Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus()), messageSnapshot.getClass().getName()));
        }
    }

    public static class StartedMessageSnapshot extends MessageSnapshot {
        public StartedMessageSnapshot(int i10) {
            super(i10);
        }

        public StartedMessageSnapshot(Parcel parcel) {
            super(parcel);
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) 6;
        }
    }

    public class a implements Parcelable.Creator<MessageSnapshot> {
        /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.liulishuo.filedownloader.message.MessageSnapshot createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                byte r0 = r5.readByte()
                r1 = 1
                if (r0 != r1) goto L9
                r0 = r1
                goto La
            L9:
                r0 = 0
            La:
                byte r2 = r5.readByte()
                r3 = -4
                if (r2 == r3) goto L84
                r3 = -3
                if (r2 == r3) goto L76
                r3 = -1
                if (r2 == r3) goto L68
                if (r2 == r1) goto L5a
                r1 = 2
                if (r2 == r1) goto L4c
                r1 = 3
                if (r2 == r1) goto L3e
                r1 = 5
                if (r2 == r1) goto L30
                r1 = 6
                if (r2 == r1) goto L28
                r5 = 0
                goto L92
            L28:
                com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot
                r1.<init>(r5)
            L2d:
                r5 = r1
                goto L92
            L30:
                if (r0 == 0) goto L38
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L38:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L3e:
                if (r0 == 0) goto L46
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L46:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L4c:
                if (r0 == 0) goto L54
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L54:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L5a:
                if (r0 == 0) goto L62
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L62:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L68:
                if (r0 == 0) goto L70
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L70:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L76:
                if (r0 == 0) goto L7e
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L2d
            L7e:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L2d
            L84:
                if (r0 == 0) goto L8c
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L8c:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L92:
                if (r5 == 0) goto L97
                r5.f34682c = r0
                return r5
            L97:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Can't restore the snapshot because unknown status: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.message.MessageSnapshot.a.createFromParcel(android.os.Parcel):com.liulishuo.filedownloader.message.MessageSnapshot");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageSnapshot[] newArray(int i10) {
            return new MessageSnapshot[i10];
        }
    }

    public interface b {
        MessageSnapshot c();
    }

    public MessageSnapshot(int i10) {
        this.f34681b = i10;
    }

    public MessageSnapshot(Parcel parcel) {
        this.f34681b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        throw new NoFieldException("getEtag", this);
    }

    public String f() {
        throw new NoFieldException("getFileName", this);
    }

    public int g() {
        return this.f34681b;
    }

    public long h() {
        throw new NoFieldException("getLargeSofarBytes", this);
    }

    public long i() {
        throw new NoFieldException("getLargeTotalBytes", this);
    }

    public int j() {
        throw new NoFieldException("getRetryingTimes", this);
    }

    public int k() {
        throw new NoFieldException("getSmallSofarBytes", this);
    }

    public int l() {
        throw new NoFieldException("getSmallTotalBytes", this);
    }

    public Throwable m() {
        throw new NoFieldException("getThrowable", this);
    }

    public boolean n() {
        return this.f34682c;
    }

    public boolean o() {
        throw new NoFieldException("isResuming", this);
    }

    public boolean p() {
        throw new NoFieldException("isReusedDownloadedFile", this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f34682c ? (byte) 1 : (byte) 0);
        parcel.writeByte(getStatus());
        parcel.writeInt(this.f34681b);
    }
}
