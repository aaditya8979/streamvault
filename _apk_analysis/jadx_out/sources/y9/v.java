package y9;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* JADX INFO: compiled from: IFileDownloadServiceProxy.java */
/* JADX INFO: loaded from: classes10.dex */
public interface v {
    boolean isConnected();

    boolean m();

    void n(Context context, Runnable runnable);

    void o(Context context);

    boolean q(int i10);

    void r(boolean z10);

    byte s(int i10);

    boolean t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12);
}
