package com.liulishuo.filedownloader.message;

import ba.b;
import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import ia.d;
import ia.f;
import java.io.File;

/* JADX INFO: compiled from: MessageSnapshotTaker.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static MessageSnapshot a(int i10, File file, boolean z10) {
        long length = file.length();
        return length > 2147483647L ? z10 ? new LargeMessageSnapshot.CompletedFlowDirectlySnapshot(i10, true, length) : new LargeMessageSnapshot.CompletedSnapshot(i10, true, length) : z10 ? new SmallMessageSnapshot.CompletedFlowDirectlySnapshot(i10, true, (int) length) : new SmallMessageSnapshot.CompletedSnapshot(i10, true, (int) length);
    }

    public static MessageSnapshot b(int i10, long j10, Throwable th2) {
        return j10 > 2147483647L ? new LargeMessageSnapshot.ErrorMessageSnapshot(i10, j10, th2) : new SmallMessageSnapshot.ErrorMessageSnapshot(i10, (int) j10, th2);
    }

    public static MessageSnapshot c(int i10, long j10, long j11, boolean z10) {
        return j11 > 2147483647L ? z10 ? new LargeMessageSnapshot.WarnFlowDirectlySnapshot(i10, j10, j11) : new LargeMessageSnapshot.WarnMessageSnapshot(i10, j10, j11) : z10 ? new SmallMessageSnapshot.WarnFlowDirectlySnapshot(i10, (int) j10, (int) j11) : new SmallMessageSnapshot.WarnMessageSnapshot(i10, (int) j10, (int) j11);
    }

    public static MessageSnapshot d(byte b10, FileDownloadModel fileDownloadModel, b.a aVar) {
        MessageSnapshot errorMessageSnapshot;
        int iG = fileDownloadModel.g();
        if (b10 == -4) {
            throw new IllegalStateException(f.o("please use #catchWarn instead %d", Integer.valueOf(iG)));
        }
        if (b10 == -3) {
            return fileDownloadModel.q() ? new LargeMessageSnapshot.CompletedSnapshot(iG, false, fileDownloadModel.m()) : new SmallMessageSnapshot.CompletedSnapshot(iG, false, (int) fileDownloadModel.m());
        }
        if (b10 == -1) {
            errorMessageSnapshot = fileDownloadModel.q() ? new LargeMessageSnapshot.ErrorMessageSnapshot(iG, fileDownloadModel.i(), aVar.a()) : new SmallMessageSnapshot.ErrorMessageSnapshot(iG, (int) fileDownloadModel.i(), aVar.a());
        } else {
            if (b10 == 1) {
                return fileDownloadModel.q() ? new LargeMessageSnapshot.PendingMessageSnapshot(iG, fileDownloadModel.i(), fileDownloadModel.m()) : new SmallMessageSnapshot.PendingMessageSnapshot(iG, (int) fileDownloadModel.i(), (int) fileDownloadModel.m());
            }
            if (b10 == 2) {
                String strF = fileDownloadModel.r() ? fileDownloadModel.f() : null;
                return fileDownloadModel.q() ? new LargeMessageSnapshot.ConnectedMessageSnapshot(iG, aVar.c(), fileDownloadModel.m(), fileDownloadModel.d(), strF) : new SmallMessageSnapshot.ConnectedMessageSnapshot(iG, aVar.c(), (int) fileDownloadModel.m(), fileDownloadModel.d(), strF);
            }
            if (b10 == 3) {
                return fileDownloadModel.q() ? new LargeMessageSnapshot.ProgressMessageSnapshot(iG, fileDownloadModel.i()) : new SmallMessageSnapshot.ProgressMessageSnapshot(iG, (int) fileDownloadModel.i());
            }
            if (b10 != 5) {
                if (b10 == 6) {
                    return new MessageSnapshot.StartedMessageSnapshot(iG);
                }
                String strO = f.o("it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b10));
                d.i(a.class, "it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b10));
                IllegalStateException illegalStateException = aVar.a() != null ? new IllegalStateException(strO, aVar.a()) : new IllegalStateException(strO);
                return fileDownloadModel.q() ? new LargeMessageSnapshot.ErrorMessageSnapshot(iG, fileDownloadModel.i(), illegalStateException) : new SmallMessageSnapshot.ErrorMessageSnapshot(iG, (int) fileDownloadModel.i(), illegalStateException);
            }
            errorMessageSnapshot = fileDownloadModel.q() ? new LargeMessageSnapshot.RetryMessageSnapshot(iG, fileDownloadModel.i(), aVar.a(), aVar.b()) : new SmallMessageSnapshot.RetryMessageSnapshot(iG, (int) fileDownloadModel.i(), aVar.a(), aVar.b());
        }
        return errorMessageSnapshot;
    }

    public static MessageSnapshot e(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.getStatus() == -3) {
            return new BlockCompleteMessage.BlockCompleteMessageImpl(messageSnapshot);
        }
        throw new IllegalStateException(f.o("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus())));
    }
}
